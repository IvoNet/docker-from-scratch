FROM ivonet/payara:5.194

ARG PWD
LABEL maintainer="IvoNet.nl"
ENV MARIADB_VERION="3.0.4"

USER root
ENV PASSWORD ${PWD:-secret}
RUN echo "AS_ADMIN_PASSWORD=${PASSWORD}">/opt/pwd.txt \
 && curl -s "https://repo1.maven.org/maven2/org/mariadb/jdbc/mariadb-java-client/$MARIADB_VERION/mariadb-java-client-$MARIADB_VERION.jar" -o "/opt/mariadb-java-client-$MARIADB_VERION.jar" \
 && /opt/payara/payara5/bin/asadmin start-domain domain1 \
 && /opt/payara/payara5/bin/asadmin --user admin --passwordfile /opt/pwd.txt add-library "/opt/mariadb-java-client-$MARIADB_VERION.jar" \
 && /opt/payara/payara5/bin/asadmin --user admin --passwordfile /opt/pwd.txt create-jdbc-connection-pool \
     --datasourceclassname org.mariadb.jdbc.MariaDbDataSource \
     --restype javax.sql.ConnectionPoolDataSource \
     --property portNumber=3306:password=secret:user=root:serverName=mariadb:databaseName=quote:useSSL=false quote_dbConnectionPool \
 && /opt/payara/payara5/bin/asadmin --user admin --passwordfile /opt/pwd.txt create-jdbc-resource \
    --connectionpoolid quote_dbConnectionPool jdbc/quote_db \
 && /opt/payara/payara5/bin/asadmin stop-domain domain1 \
 && rm -f "/opt/pwd.txt" "/opt/mariadb-java-client-$MARIADB_VERION.jar"
USER serveradmin
