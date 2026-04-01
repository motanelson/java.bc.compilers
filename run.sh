printf "\ec\e[40;37m\n"

docker build -t hello-world-docker .
docker run --rm hello-world-docker

