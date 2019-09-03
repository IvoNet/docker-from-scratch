docker run -it \
           --rm  \
           -v $(pwd):/project \
           -v $(echo "$HOME/.m2/repository"):/repository \
           ivonet/maven


docker run -it --rm  -v $(pwd):/project -v $(echo "$HOME/.m2/repository"):/repository ivonet/maven
