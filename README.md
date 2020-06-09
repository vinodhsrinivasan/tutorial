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

### Mysql deployment
```
http://192.168.64.2:31779
minikube service webserver --url

MySQL can be accessed via port 3306 on the following DNS name from within your cluster:
demo-mysql.default.svc.cluster.local
To get your root password run:
    MYSQL_ROOT_PASSWORD=$(kubectl get secret --namespace default demo-mysql -o jsonpath="{.data.mysql-root-password}" | base64 --decode; echo)
```

### Dotnet core:
```
https://stackoverflow.com/questions/39966898/dotnet-build-cli-works-in-terminal-but-not-in-docker-build
dotnet restore
dotnet publish
docker build . -t vinodhsrini/mycore
kubectl apply -f deployment_core.yaml
```
 
## Docker
```
docker save mycore >mycore.tar
docker save mcr.microsoft.com/dotnet/core/aspnet > aspnet_3.1.tar
mcr.microsoft.com/dotnet/core/aspnet       3.1                 bc877ac43e02        2 weeks ago         207MB
```
## Large files
```
mcr.microsoft.com/dotnet/core/aspnet       3.1                 bc877ac43e02        2 weeks ago         207MB
brew install git-lfs
git init
git remote add origin https://github.com/vinodhsrinivasan/k8ssample.git
git pull https://github.com/vinodhsrinivasan/k8ssample.git
git config --global user.email kumarsvinodh@gmail.com
git config --global user.name "Vinodh Srinivasan"
git lfs install
git lfs track '*.tar'
git pull
git add .
git commit -m "default commit"
git lfs push --all origin master
git push -u origin master
```


