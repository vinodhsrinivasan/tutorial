# tutorial
```
all tutorial information
```
## Kube
```
vinodhsrini -docker
Docker / Kube 192.168.64.2
hyperkit driver - start Minikube with this driver
Https://github.com/nigelpoulton/psweb/blob/master/Dockerfile
kubectl run discovery –image=myib-spring-boot-app –image-pull-policy=Never –port=8761
kubectl run discovery –-image=mycore –image-pull-policy=Never –port=8762
```

### Dotnet core:
```
https://stackoverflow.com/questions/39966898/dotnet-build-cli-works-in-terminal-but-not-in-docker-build
dotnet restore
dotnet publish
docker build . -t vinodhsrini/mycore
kubectl apply -f deployment_core.yaml
```
