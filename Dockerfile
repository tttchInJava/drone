# 该镜像需要依赖的基础镜像
FROM java:8
# 将当前目录下的jar包复制到docker容器的/目录下
ADD testdrone-1.0.0.jar /testdrone-1.0.0.jar
# 指定docker容器启动时运行jar包
#在容器启动的时候运行命令，来启动我们的项目
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/testdrone-1.0.0.jar","-Xms128m","-Xmx128m","-c"]
# 指定维护者的名字
MAINTAINER testdrone1