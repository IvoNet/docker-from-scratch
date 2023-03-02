# Maven docker image

This project defines a maven docker image

## Build

```bash
docker build -t <your_account_name_here>/maven . 
```

## Usage:

```shell

docker run -it \
           --rm  \
           -v $(pwd):/project \
           -v "$HOME/.m2/repository:/repository" \
           ivonet/maven

```
- The `-it` option will make the container interactive. This is optional but will allow you to use the container as a shell.x
- The `--rm` option will remove the container after the build is done. This is optional but will keep your machine clean.
- The first "mount" is the project you want to build and should be mounted to the `/project` directory as that is the exposed folder in the image (MANDATORY).
- The second "mount" is the maven repository. This is optional but will speed up the build process as the maven repository will be cached on your local machine.
