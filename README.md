### Netty Example

### Build
```bash
mvn clean compile assembly:single
```

### Start Server
```bash
java -cp target/time-0.0.1-SNAPSHOT-jar-with-dependencies.jar com.baidu.zhixin.netty.server.TimeServer
```

### Run Client
```bash
java -cp target/time-0.0.1-SNAPSHOT-jar-with-dependencies.jar com.baidu.zhixin.netty.client.TimeClient 127.0.0.1 8081
```
