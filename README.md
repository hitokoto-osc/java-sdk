hitokoto-java-sdk
========

使用 java 语言实现的 hitokoto sdk，预计将会实现 [一言开发者中心](https://developer.hitokoto.cn) 所有开放能力，本项目将会跟随一言主线开发进度进行持续开发于优化，欢迎 pr

## 依赖管理

使用 apache maven 进行依赖管理，未来将加入 [maven repo](http://mvnrepository.com/)

## 开发计划

开发计划不分先后，仅提供列表

- [x] 单元测试
- [x] 钉钉 robot 推送
- [x] 实现语句接口
- [x] 实现核心接口
- [ ] 持续集成
- [ ] 完善的sdk文档

## 调用指南

目前实现了 /auth 和部分 /user 接口，具体使用方法，参考 /src/tests 中的文件

具体示例待补充

## 编译运行

编译
```shell
mvn clean package 
```

默认打包所有依赖，默认运行入口方法

```shell
java -jar target/hitokoto-java-sdk-jar-with-dependencies.jar
```

为打包依赖，可导入其它项目使用

```shell
java -jar target/hitokoto-java-sdk.jar
```
