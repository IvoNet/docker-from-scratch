FROM openjdk:17

RUN apt-get update \
 && apt-get install --no-install-recommends -y  maven \
 && apt-get clean  \
 && rm -rf /var/lib/apt/lists/* /tmp/* /var/tmp/*

COPY setup/ /
RUN chmod +x /entrypoint.sh

WORKDIR /project
VOLUME ["/project", "/repository"]

ENTRYPOINT ["/entrypoint.sh"]
CMD ["mvn", "verify"]

