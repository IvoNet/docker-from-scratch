FROM ivonet/payara:5.194

ARG PWD
LABEL maintainer="IvoNet.nl"
ENV MYSQL_VERION="5.1.48"

USER root
ENV PASSWORD ${PWD:-secret}
RUN echo "AS_ADMIN_PASSWORD=${PASSWORD}">/opt/pwd.txt \
 && curl -s "https://repo1.maven.org/maven2/mysql/mysql-connector-java/$MYSQL_VERION/mysql-connector-java-$MYSQL_VERION.jar" -o "/opt/mysql-connector-java-$MYSQL_VERION.jar" \
 && /opt/payara/payara5/bin/asadmin start-domain domain1 \
 && /opt/payara/payara5/bin/asadmin --user admin --passwordfile /opt/pwd.txt add-library "/opt/mysql-connector-java-$MYSQL_VERION.jar" \
 && /opt/payara/payara5/bin/asadmin --user admin --passwordfile /opt/pwd.txt create-jdbc-connection-pool \
     --datasourceclassname com.mysql.jdbc.jdbc2.optional.MysqlDataSource \
     --restype javax.sql.ConnectionPoolDataSource \
     --property portNumber=3306:password=secret:user=root:serverName=mysql:databaseName=quote:useSSL=false quote_dbConnectionPool \
 && /opt/payara/payara5/bin/asadmin --user admin --passwordfile /opt/pwd.txt create-jdbc-resource \
    --connectionpoolid quote_dbConnectionPool jdbc/quote_db \
 && /opt/payara/payara5/bin/asadmin stop-domain domain1 \
 && rm -f "/opt/pwd.txt" "/opt/mysql-connector-java-$MYSQL_VERION.jar"
USER serveradmin
