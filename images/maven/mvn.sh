#!/usr/bin/env bash
docker run -it \
           --rm  \
           -v $(pwd):/project \
           -v $(echo "$HOME/.m2/repository"):/repository \
           ivonet/maven


docker run -it --rm  -v $(pwd):/project -v $(echo "$HOME/.m2/repository"):/repository ivonet/maven
docker run -it --rm  -v $(pwd):/project ivonet/maven
docker run -it --rm  -v %CD%:/project -v $(echo "$HOME/.m2/repository"):/repository ivonet/maven clean package
