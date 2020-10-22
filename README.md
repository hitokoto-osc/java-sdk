HITOKOTO-JAVA-SDK ☕️
========

使用 java 语言实现的 hitokoto sdk，实现了 [一言开发者中心](https://developer.hitokoto.cn) 所有开放能力，本项目将会跟随一言主线开发进度进行持续开发于优化，欢迎 pr

## 开发计划

开发计划不分先后，仅提供列表

- [x] 单元测试
- [x] 钉钉 robot 推送
- [x] 实现语句接口
- [x] 实现核心接口
- [x] 发布为 Github Repo 允许使用 mvn 安装
- [x] CI/CD
- [ ] 增加 Log4j 日志
- [ ] 解决单元测试账户的问题
- [ ] 完善的 sdk 使用文档
- [ ] 发布到 mvnen 中央仓库

## 安装

### maven

目前仅支持使用 github 源，未推送至 maven 中央仓库 

```xml
<repositories>
    <repository>
        <id>hitokoto-sdk-repo</id>
        <name>The Maven Repository on Github</name>
        <url>https://hitokoto-osc.github.io/java-sdk/maven-repo/</url>
    </repository>
</repositories>
<dependencies>
    <dependency>
        <groupId>sdk</groupId>
        <artifactId>hitokoto</artifactId>
        <version>0.1.0</version>
    </dependency>
</dependencies>
```

### 手动编译

```shell
mvn clean package 
```

将会生成2个 .jar 文件 

`target/hitokoto-sdk-jar.jar` 未携带依赖，不支持 `java -jar` 调用

`target/hitokoto-sdk-jar-with-dependencies.jar` 携带了 maven 依赖，支持 `java -jar` 直接调用

## 调用指南

**java 最低版本要求为 11** 

### 示例

获取用户信息

```java 
package main;

import cn.hitokoto.Client;
import cn.hitokoto.Response;
import cn.hitokoto.Token;
import cn.hitokoto.sdk.UserInfo;

public class Main
{
    public static void main(String[] args)
    {
        Client   client = new Client(Token.use("you token"));
        UserInfo info   = new UserInfo();

        Response response = client.getObjectResponse(info);
        System.out.println(response.getBody());
    }
}
```


## SDK API

*请先参考 [`/src/tests`](/src/test) 中的示例进行调用，SDK API 文档正在努力完善中 ✍*

[查看详细文档](docs/documents.md)

## 参考

- 本项目的实现一定程度上参考了 [aliyun/aliyun-openapi-java-sdk](https://github.com/aliyun/aliyun-openapi-java-sdk) ，在此致谢

