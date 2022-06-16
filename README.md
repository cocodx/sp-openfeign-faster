# sp-openfeign-faster

```yml
feign:
  client:
    config: 
      default:
        connectionTimeout: 10000 #设置超时时间
        readTimeout: 10000 #设置连接建立，返回响应时间过长
        loggerLevel: basic
``` 

openfeign 官方文档：https://docs.spring.io/spring-cloud-openfeign/docs/current/reference/html/  

