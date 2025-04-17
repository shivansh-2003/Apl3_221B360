# Dockers 

## Introduction
Docker is a platform that enables developers to automate the deployment of applications inside lightweight, portable containers. This README provides an overview of basic Docker commands to help you get started.

## Installation
To install Docker, follow the instructions for your operating system on the [official Docker installation page](https://docs.docker.com/get-docker/).

## Basic Commands

### 1. **docker --version**
Check the installed version of Docker.
```
docker --version
```

### 2. **docker pull**
Download a Docker image from Docker Hub.
```
docker pull <image_name>
```


### 3. **docker images**
List all downloaded Docker images.
```
docker images
```

### 4. **docker run**
Run a command in a new container.
```
docker run <options> <image_name> <command>
```
### 5. **docker ps**
List running containers.
```
docker ps
```

### 6.docker stop Stop a running container.
```
docker stop <container_id>
```

### 7 docker rm Remove a stopped container.
```
docker rm <container_id>
```
### 8. docker rmi Remove a Docker image
```
docker rmi <image_id>
```

### 9.docker exec Run a command inside a running container.
```
docker exec <container_id> <command>
```


