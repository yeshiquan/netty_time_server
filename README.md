### Netty Example

### Build
mvn clean compile assembly:single

### Start Server
java -cp target/time-0.0.1-SNAPSHOT-jar-with-dependencies.jar com.baidu.zhixin.netty.server.TimeServer

### Run Client
java -cp target/time-0.0.1-SNAPSHOT-jar-with-dependencies.jar com.baidu.zhixin.netty.client.TimeClient 127.0.0.1 8081
