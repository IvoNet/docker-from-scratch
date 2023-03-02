FROM openjdk:17-jdk-buster

ENV  MAVEN_VERSION=3.9.0 \
     MAVEN_HOME=/usr/share/maven \
     MAVEN_CONFIG=/root/.m2

RUN apt-get update \
 && apt-get install -y \
    curl \
    wget \
 && rm -rf /var/lib/apt/lists/* \
 && wget -O /tmp/apache-maven.tar.gz https://downloads.apache.org/maven/maven-3/${MAVEN_VERSION}/binaries/apache-maven-${MAVEN_VERSION}-bin.tar.gz \
 && tar -xvzf /tmp/apache-maven.tar.gz -C /opt \
 && ln -s /opt/apache-maven-${MAVEN_VERSION} /opt/maven \
 && ln -s /opt/maven/bin/mvn /usr/local/bin \
 && rm -f /tmp/apache-maven*.tar.gz


COPY setup/entrypoint.sh /entrypoint.sh
COPY setup/settings.xml /opt/maven/conf/settings.xml
RUN chmod +x /entrypoint.sh

WORKDIR /project
VOLUME ["/project", "/repository"]

ENTRYPOINT ["/entrypoint.sh"]
CMD ["mvn", "verify"]

