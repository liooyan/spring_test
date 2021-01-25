#!/usr/bin/env bash


# 获取当前版本号
MVN_VERSION=$(mvn -q -N -Dexec.executable="echo"  -Dexec.args='${project.version}'  org.codehaus.mojo:exec-maven-plugin:1.3.1:exec)
# 获取项目名称
MVN_NAME=$(mvn -q -N -Dexec.executable="echo"  -Dexec.args='${project.artifactId}'  org.codehaus.mojo:exec-maven-plugin:1.3.1:exec)
echo 历史版本号:$MVN_VERSION
echo 项目名称:$MVN_NAME
# 小版本号+1
MVN_VERSION_LIST=(${MVN_VERSION//./ })
MVN_VERSION_1=${MVN_VERSION_LIST[0]/v/} #第一个版本号
MVN_VERSION_2=${MVN_VERSION_LIST[1]} #第二个版本号
MVN_VERSION_3=${MVN_VERSION_LIST[2]} #第三个版本号
# 目前只考虑小版本号改变情况， 其他版本号后续补充
MVN_VERSION_3=$(($MVN_VERSION_3+1))
MVN_VERSION=v${MVN_VERSION_1}.${MVN_VERSION_2}.${MVN_VERSION_3}
echo 新的版本号:$MVN_VERSION

# 提交 git 并生成tag
mvn clean versions:set -DnewVersion=${MVN_VERSION} scm:checkin -Dmessage="$1" scm:tag -Dtag=${MVN_VERSION}
echo maven打包成功


