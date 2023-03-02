#!/bin/sh
## Do your own config stuff here

## this copies our settings.xml to the default place where maven will look for it.
#rm -f /opt/maven/conf/settings.xml >/dev/null ||true
#cp /settings.xml /opt/maven/conf/settings.xml

# Always end with this line...
exec "$@"
