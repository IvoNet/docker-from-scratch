docker run -it \
           --rm  \
           -v $(pwd):/project \
           -v "$HOME/.m2/repository:/repository" \
           ivonet/maven


docker run -it --rm  -v "$(pwd):/project" -v "$HOME/.m2/repository:/repository" ivonet/maven mvn clean package
docker run -it --rm  -v "$(pwd):/project" ivonet/maven
