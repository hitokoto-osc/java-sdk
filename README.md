hitokoto-java-sdk
========

使用 java 语言实现的 hitokoto sdk，预计将会实现 [一言开发者中心](https://developer.hitokoto.cn) 所有开放能力，本项目将会跟随一言主线开发进度进行持续开发于优化，欢迎 pr

## 依赖管理

使用 apache maven 进行依赖管理，未来将加入 [maven repo](http://mvnrepository.com/)

## 开发计划

开发计划不分先后，仅提供列表

- [x] 钉钉 robot 推送
- [ ] 实现语句接口
- [ ] 实现核心接口
- [ ] 使用配置文件进行配置管理
- [ ] 接受命令行参数
- [ ] 单元测试
- [ ] 持续集成

## 配置

目前仅实现了钉钉通知，暂时使用类属性进行配置，未来会改为 yaml

钉钉机器人具体功能可参考 [hitokoto-dingtalk-client](https://github.com/hitokoto-osc/hitokoto-dingtalk-client)
```java 
// 一言网的API或其镜像地址
private static final String mirrorLink    = "https://v1.hitokoto.cn";
// 钉钉机器人 Token
private static final String dingTalkToken = "";
```

## 编译运行

编译
```shell
mvn clean package 
```

默认打包所有依赖，默认运行入口方法

```shell
java -jar target/hitokoto-client-jar-with-dependencies.jar 
```

为打包依赖，可导入其它项目使用

```shell
hitokoto-client.jar 
```
