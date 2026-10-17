# 🎯 Project 82 – Config Server - Central Config | Spring Cloud Config | Port 8888 | Tier 8 LAST Advanced Backend

<p align="left">
<img src="https://img.shields.io/badge/Tier-8%20LAST%20Advanced%20Backend-0A1931?style=for-the-badge" alt="Tier 8 LAST">
<img src="https://img.shields.io/badge/Java-21-E76F00?logo=openjdk&logoColor=white" alt="Java 21">
<img src="https://img.shields.io/badge/Spring%20Boot-3.2.5-6DB33F?logo=springboot&logoColor=white" alt="Spring Boot 3.2.5">
<img src="https://img.shields.io/badge/Spring%20Cloud%20Config-4.1.3-6DB33F?logo=spring&logoColor=white" alt="Spring Cloud Config 4.1.3">
<img src="https://img.shields.io/badge/Kafka-3.6.2-231F20?logo=apachekafka&logoColor=white" alt="Kafka 3.6.2">
<img src="https://img.shields.io/badge/Port-8888-00BFFF" alt="8888">
<img src="https://img.shields.io/badge/Group-config--group--RAVI--FINAL-FF6F00" alt="Group">
<img src="https://img.shields.io/badge/Status-Completed%20Tier%208%20LAST-20B000" alt="Completed">
</p>

## 📖 Project Overview - Tier 8 Interlinked with 78 + 79 + 80 + 81 - Tier 8 LAST!

Project 82 is **Tier 8 – Advanced Backend – Microservices – Architecture diagram in README, each service = repo** - GitHub Goal Achieved - **Smooth process without errors!** - **TIER 8 LAST 73-82 COMPLETE!**

This project is **interlinked with Project 78 + 79 + 80 + 81 - Tier 8 Complete Chain - 12 Demos + Architecture - TIER 8 LAST**:

- **Tier 8 Roadmap:** 73 Auth completed, 74 Product completed, 75 Order completed, 76 API Gateway completed, 77 Service Discovery completed, **78 Event-Driven Order completed Port 8087 Producer**, **79 Notification Service completed Port 8088 Consumer NOTIFICATION SENT**, **80 Payment Service completed Port 8089 Consumer+Producer PAYMENT PROCESSED PaymentId=79598d19, af0eaf1d, 91d23b05**, **81 Logging Service completed Port 8090 DUAL TOPIC LOGGER LOG SAVED ORDER + LOG SAVED PAYMENT PaymentId=79598d19 + af0eaf1d + 91d23b05**, **82 Config Server – THIS REPO – Port 8888 – CENTRAL CONFIG - @EnableConfigServer - Native file:../config-repo - Serving configs for 78 8087, 79 8088, 80 8089, 81 8090 - TIER 8 LAST 73-82 COMPLETE**
- **Interlink Flow:** Client curl POST /api/orders {"id":"9999","product":"LAPTOP","qty":2} -> 78 Order Service (8087) Producer -> Kafka Topic: orders (Partition 0) Cluster ID f4AItejLSsCPDs7m9CixtA -> 79 Notification Service (8088) Consumer + 80 Payment Service (8089) Consumer+Producer -> PAYMENT PROCESSED PaymentId=79598d19 + af0eaf1d + 91d23b05 + PRODUCE payments topic -> 81 Logging Service (8090) Consumer Dual Topic orders + payments -> LOG SAVED ORDER + LOG SAVED PAYMENT PaymentId=79598d19 + af0eaf1d + 91d23b05 -> 82 Config Server (8888) Central Config @EnableConfigServer Native file:../config-repo Serving 78+79+80+81 configs -> 82 RUNNING Port 8888 Central Config!
- **This Repo:** Config Server runs on port 8888 – http://localhost:8888/78-event-driven-order/default – RUNNING - Port 8888 - Central Config Serving 78 8087, 79 8088, 80 8089, 81 8090! – demo1.png – **Only Port 8888 – No 9092 badge – Same style as Project 81 - TIER 8 LAST**
- **Linked Repo 78:** Order Service – https://github.com/raviteja-dev950/78-event-driven-order – Producer – PRODUCED Event 4x – demo8.png – Source for 79+80+81+82 config
- **Linked Repo 79:** Notification Service – https://github.com/raviteja-dev950/79-notification-service – Consumer – NOTIFICATION SENT 4x – demo9.png
- **Linked Repo 80:** Payment Service – https://github.com/raviteja-dev950/80-payment-service – Consumer+Producer – PAYMENT PROCESSED PaymentId=79598d19 + af0eaf1d + 91d23b05 + 79598d19 – demo10.png – Config from 82
- **Linked Repo 81:** Logging Service – https://github.com/raviteja-dev950/81-logging-service – Consumer Dual Topic – LOG SAVED ORDER + LOG SAVED PAYMENT PaymentId=79598d19 + af0eaf1d + 91d23b05 – demo11.png – Config from 82
- **Tech:** Spring Cloud, Eureka, Gateway, Config, Kafka, Redis, RabbitMQ – Tier 8 Focus – Spring Cloud Config Server Pattern @EnableConfigServer Native – **Central Config for all Tier 8 - Final service of Tier 8 - 12 Demos + Architecture**

Backend flow interlinked - SMOOTH NO ERRORS - 4 Orders - TIER 8 LAST 73-82 COMPLETE:
- **78:** POST /api/orders {"id":"9999","product":"LAPTOP","qty":2} + {"id":"8888","product":"MOUSE","qty":1} + {"id":"7777","product":"KEYBOARD","qty":5} + {"id":"8888","product":"MOUSE","qty":1} -> OrderController 8087 -> OrderProducer.send -> KafkaTemplate StringSerializer ObjectMapper -> topic orders – demo8.png PRODUCED Event 4x – Config from 82 file [../config-repo/78-event-driven-order.yml]
- **Kafka:** Topic orders (Partition 0) + payments – Group logging-group-RAVI-FINAL + payment-group-RAVI-FINAL + notification-group-RAVI-FINAL – partitions assigned: [orders-0, payments-0] + [orders-0] – Cluster ID f4AItejLSsCPDs7m9CixtA – demo11.png + demo12.png – Successfully joined group generation 3 + generation 4
- **79:** NotificationConsumer 8088 @KafkaListener topics="orders" group notification-group-RAVI-FINAL -> RAW MESSAGE 9999 + 8888 + 7777 + 8888 -> NOTIFICATION SENT Order ID 9999 + 8888 + 7777 + 8888 – demo9.png – Config from 82
- **80:** PaymentConsumer 8089 @KafkaListener topics="orders" group payment-group-RAVI-FINAL -> RAW MESSAGE 9999 + 8888 + 7777 + 8888 -> PAYMENT PROCESSED Payment ID 79598d19 + af0eaf1d + 91d23b05 + 79598d19 – demo10.png – Config from 82
- **81:** LogConsumer 8090 @KafkaListener topics="orders" + topics="payments" group logging-group-RAVI-FINAL -> RAW MESSAGE (orders) 9999 + 8888 + 7777 + 8888 + RAW MESSAGE (payments) 79598d19 + af0eaf1d + 91d23b05 + 79598d19 -> LOG SAVED ORDER + LOG SAVED PAYMENT – demo11.png – Config from 82
- **82:** ConfigServer 8888 @EnableConfigServer Native file:../config-repo -> Adding property source file [../config-repo/78-event-driven-order.yml] + file [../config-repo/79-notification-service.yml] + file [../config-repo/80-payment-service.yml] + file [../config-repo/81-logging-service.yml] -> Serving configs http://localhost:8888/78-event-driven-order/default -> 82 RUNNING Port 8888 Central Config! – demo12.png – **CENTRAL CONFIG - MAIN DEMO**

## 🏗 Architecture Diagram – Tier 8 Goal – Architecture diagram in README, each service = repo – Interlinked 78+79+80+81+82 – demo13.jpg – TIER 8 LAST 73-82 COMPLETE

[architecture](screenshots/demo13.jpg)

```text
TIER 8 – ADVANCED BACKEND – MICROSERVICES – INTERLINKED – 78+79+80+81+82 – CENTRAL CONFIG – 12 Demos + Architecture – SMOOTH NO ERRORS – TIER 8 LAST 73-82 COMPLETE

Client curl -X POST /api/orders {"id":"9999","product":"LAPTOP","qty":2} + {"id":"8888","product":"MOUSE","qty":1} + {"id":"7777","product":"KEYBOARD","qty":5} + {"id":"8888","product":"MOUSE","qty":1} – demo7.png – 4x Order placed
 -> 78 Order Service (Port 8087) REST API POST /api/orders -> OrderProducer KafkaTemplate StringSerializer ObjectMapper JSON – demo8.png PRODUCED Event 4x – Source – Config file [../config-repo/78-event-driven-order.yml] from 82
 -> Apache Kafka Central Event Broker Port 9092 Cluster ID f4AItejLSsCPDs7m9CixtA Topic: orders (Partition 0) + Topic: payments – Central broker – demo6.png docker-compose up -d – 3/3 Created + Started
 -> 79 Notification Service (Port 8088) @KafkaListener topics="orders" group-id notification-group-RAVI-FINAL – demo9.png NOTIFICATION SENT Order ID 9999 + 8888 + 7777 + 8888 – Parallel – Config file [../config-repo/79-notification-service.yml] from 82
 -> 80 Payment Service (Port 8089) Consumer @KafkaListener topics="orders" group-id payment-group-RAVI-FINAL + Producer -> PAYMENT PROCESSED PaymentId=79598d19 + af0eaf1d + 91d23b05 + 79598d19 – demo10.png – Interlinked 78->80 – Config file [../config-repo/80-payment-service.yml] from 82
 -> 81 Logging Service (Port 8090) Consumer Dual Topic @KafkaListener topics="orders" + topics="payments" group-id logging-group-RAVI-FINAL – demo11.png LOG SAVED ORDER + LOG SAVED PAYMENT – Config file [../config-repo/81-logging-service.yml] from 82
 -> 82 Config Server (Port 8888) @EnableConfigServer Native Profile file:../config-repo – Config files: 78-event-driven-order.yml (8087) + 79-notification-service.yml (8088) + 80-payment-service.yml (8089) + 81-logging-service.yml (8090) – demo12.png Adding property source 4 files -> Serving configs http://localhost:8888/{app}/default – CENTRAL CONFIG – FINAL – TIER 8 LAST 73-82 COMPLETE
```

## ✨ Features – Tier 8 – Interlinked 78+79+80+81+82 – CENTRAL CONFIG – 12 Demos + Architecture – TIER 8 LAST

### 🌐 REST API Layer – 8888 – Tier 8 Microservices – Only Port 8888 – Same style Project 81 – TIER 8 LAST
- ConfigServerApplication – Port 8888 – @EnableConfigServer @SpringBootApplication – Each service = repo – GitHub Goal Tier 8
- GET /{application}/{profile} -> http://localhost:8888/78-event-driven-order/default + http://localhost:8888/79-notification-service/default + http://localhost:8888/80-payment-service/default + http://localhost:8888/81-logging-service/default – demo1.png + demo2.png + demo3.png + demo4.png + demo5.png – Only Port 8888 – No 9092

### 🏛 Spring Cloud Config Server – Central Configuration – MAIN FEATURE – demo12.png + demo1-5.png – CENTRAL CONFIG – MAIN PROOF – 12 Demos + Architecture – TIER 8 LAST
- ConfigServer – @EnableConfigServer – Native Profile – spring.profiles.active=native – spring.cloud.config.server.native.search-locations=file:../config-repo – **Central config for all Tier 8** – demo12.png – 4 Services 78+79+80+81
- Logs >>> Adding property source: Config resource file [../config-repo/78-event-driven-order.yml] via location file:../config-repo – server.port 8087
- Logs >>> Adding property source: Config resource file [../config-repo/79-notification-service.yml] – server.port 8088
- Logs >>> Adding property source: Config resource file [../config-repo/80-payment-service.yml] – server.port 8089
- Logs >>> Adding property source: Config resource file [../config-repo/81-logging-service.yml] – server.port 8090
- Logs Tomcat started on port 8888 + Started ConfigServerApplication – 82-config-server RUNNING - Port 8888 Central Config Serving 78 8087, 79 8088, 80 8089, 81 8090! – demo12.png main proof interlinked 82->78+79+80+81!
- Browser >>> http://localhost:8888/78-event-driven-order/default -> {"name":"78-event-driven-order","propertySources":[{"source":{"server.port":8087...}}]} – demo2.png
- Browser >>> http://localhost:8888/79-notification-service/default – demo3.png
- Browser >>> http://localhost:8888/80-payment-service/default – demo4.png
- Browser >>> http://localhost:8888/81-logging-service/default – demo5.png – **CENTRAL CONFIG - 4 SERVICES - MAIN DEMO**

### 📥 Kafka Consumer Dual Topic – Event Listening – demo11.png – DUAL TOPIC – 4 Orders + 4 Payments – Config from 82
- LogConsumer 8090 – @KafkaListener topics="orders" + topics="payments" group logging-group-RAVI-FINAL – demo11.png – 4 Orders 9999 + 8888 + 7777 + 8888 – Config from 82 file [../config-repo/81-logging-service.yml]
- Logs >>> [81-LOGGING] RAW MESSAGE (orders): {"id":"8888"...} + RAW MESSAGE (payments): {"paymentId":"af0eaf1d"...} -> LOG SAVED ORDER + LOG SAVED PAYMENT PaymentId=79598d19 + af0eaf1d + 91d23b05 + 79598d19 – demo11.png

### 📤 Kafka Producer Proof – 78 Side – Interlinked – demo8.png + demo7.png – Source for 79+80+81 – Trigger - 4 Orders – Config from 82 – TIER 8 LAST
- OrderProducer 78 – KafkaTemplate<String, String> – StringSerializer – ObjectMapper JSON – https://github.com/raviteja-dev950/78-event-driven-order – Config from 82 file [../config-repo/78-event-driven-order.yml]
- Logs >>> PRODUCED Event: Order{id='9999'...} + Order{id='8888'...} + Order{id='7777'...} + Order{id='8888'...} – demo8.png

### 📡 Kafka Configuration + Config Server Configuration – Fixed Issues – demo11.png + demo6.png + demo12.png – Tier 8 Learning – CENTRAL CONFIG + DUAL TOPIC – TIER 8 LAST
- Consumer group-id logging-group-RAVI-FINAL + payment-group-RAVI-FINAL + notification-group-RAVI-FINAL – auto-offset-reset earliest – partitions assigned: [orders-0, payments-0] – Successfully joined group generation 4 – Cluster ID f4AItejLSsCPDs7m9CixtA – demo11.png + demo12.png
- Tier 8 Goal: Architecture diagram in README – demo13.jpg – Achieved – Same style as Project 81 demo7.jpg but TIER 8 LAST 73-82 COMPLETE

## 🛠 Technologies Used – Tier 8 – Advanced Backend – SMOOTH NO ERRORS - 12 Demos + Architecture – TIER 8 LAST

| Technology | Version | Purpose – Tier 8 Focus – Smooth Process – TIER 8 LAST |
|---|---|---|
| Java | 21 | Backend – 21.0.10 – Core – No errors – 4 Orders 9999 + 8888 + 7777 + 8888 – TIER 8 LAST |
| Spring Boot | 3.2.5 | 82-config-server – Port 8888 – Microservices – Central Config @EnableConfigServer – RUNNING – Smooth – 12 Demos + Architecture – TIER 8 LAST 73-82 COMPLETE |
| Spring Cloud Config | 4.1.3 | Config Server @EnableConfigServer Native file:../config-repo – Serving 78+79+80+81 – Spring Cloud, Config – Tier 8 – demo12.png + demo1-5.png – Smooth – 4 Configs 78+79+80+81 – TIER 8 LAST |
| Spring Kafka | 3.1.5 | Consumer @KafkaListener Dual Topic orders + payments – Spring Cloud, Kafka – Tier 8 – demo11.png – Smooth – PaymentIds 79598d19 + af0eaf1d + 91d23b05 + 79598d19 – Config from 82 – TIER 8 LAST |
| Kafka | 3.6.2 | Topic orders + payments – Group RAVI-FINAL – Event-Driven – demo6+demo7+demo8+demo9+demo10+demo11+demo12 interlinked – Dual topic + Central Config – Cluster ID f4AItejLSsCPDs7m9CixtA – Smooth no errors – 12 Demos + Architecture – TIER 8 LAST |
| Jackson Databind | - | ObjectMapper JSON -> Order + Payment + Config JSON – Fixed ClassNotFound – demo11.png + demo2-5.png PaymentIds 79598d19 + af0eaf1d + 91d23b05 OrderIds 9999 + 8888 + 7777 + 8888 – Smooth – 4 Orders – TIER 8 LAST |
| Maven | - | Build – mvnw.cmd – Dependency mgmt – Tier 4 goal – Smooth – TIER 8 LAST |
| Docker | 29.8.2 | kafka-docker docker-compose up -d – zookeeper + kafka – 3/3 Created + Started – Network + Volume + 2 Containers – Cluster ID f4AItejLSsCPDs7m9CixtA – Tier 9 DevOps – Smooth no LEADER_NOT_AVAILABLE – demo6.png – TIER 8 LAST |

## 📂 Project Structure – Tier 8 – Each service = repo – Interlinked 78+79+80+81+82 – 12 Demos + Architecture – Smooth – TIER 8 LAST

```text
100 Projects Java Full Stack – Tier 8 – Advanced Backend – Microservices – 82/100 – TIER 8 LAST 73-82 COMPLETE
├── 73-auth-service/ – completed – Port 8081 – Auth Service
├── 74-product-service/ – completed – Port 8082 – Product Service
├── 75-order-service/ – completed – Port 8083 – Order Service
├── 76-api-gateway/ – completed – Port 8080 – API Gateway
├── 77-service-discovery/ – completed – Port 8761 – Eureka
├── 78-event-driven-order/ – completed – Port 8087 – Producer – demo8.png – Config from 82 file [../config-repo/78-event-driven-order.yml]
├── 79-notification-service/ – completed – Port 8088 – Consumer – demo9.png – Config from 82 file [../config-repo/79-notification-service.yml]
├── 80-payment-service/ – completed – Port 8089 – Consumer+Producer – demo10.png – PaymentId=79598d19 + af0eaf1d + 91d23b05 + 79598d19 – Config from 82 file [../config-repo/80-payment-service.yml]
├── 81-logging-service/ – completed – Port 8090 – Consumer Dual Topic – demo11.png – LOG SAVED – Config from 82 file [../config-repo/81-logging-service.yml]
├── 82-config-server/ – THIS REPO – Port 8888 – Config Server Central Config @EnableConfigServer Native file:../config-repo – Serving configs 78 8087 + 79 8088 + 80 8089 + 81 8090 – 12 Demos + Architecture – TIER 8 LAST 73-82 COMPLETE
│   ├── src/main/java/com/config/
│   │   ├── ConfigServerApplication.java – Port 8888 – @EnableConfigServer – 82-config-server RUNNING – demo12.png + demo1.png – Only Port 8888
│   │   └── controller/ – Optional health – GET RUNNING - Port 8888 - Central Config Serving 78 8087, 79 8088, 80 8089, 81 8090!
│   ├── src/main/resources/
│   │   ├── application.yml – server.port 8888, spring.profiles.active=native, spring.cloud.config.server.native.search-locations=file:../config-repo
│   │   └── README.md – Architecture diagram in README – demo13.jpg – Only Port 8888 badge – 12 Demos + Architecture – TIER 8 LAST 73-82 COMPLETE
│   ├── ../config-repo/ – External Native Repo – file:../config-repo – Central configs for 78+79+80+81 – Native
│   │   ├── 78-event-driven-order.yml – server.port 8087, kafka bootstrap-servers localhost:9092, group-id order-group-RAVI-FINAL – demo2.png
│   │   ├── 79-notification-service.yml – server.port 8088, group-id notification-group-RAVI-FINAL – demo3.png
│   │   ├── 80-payment-service.yml – server.port 8089, group-id payment-group-RAVI-FINAL – demo4.png
│   │   └── 81-logging-service.yml – server.port 8090, group-id logging-group-RAVI-FINAL – demo5.png
│   ├── screenshots/
│   │   ├── demo1.png – Browser GET localhost:8888/78-event-driven-order/default – RUNNING - Port 8888 Central Config – Only 8888
│   │   ├── demo2.png – Browser localhost:8888/78-event-driven-order/default – Config JSON 8087 – file [../config-repo/78-event-driven-order.yml]
│   │   ├── demo3.png – Browser localhost:8888/79-notification-service/default – Config JSON 8088 – file [../config-repo/79-notification-service.yml]
│   │   ├── demo4.png – Browser localhost:8888/80-payment-service/default – Config JSON 8089 – file [../config-repo/80-payment-service.yml]
│   │   ├── demo5.png – Browser localhost:8888/81-logging-service/default – Config JSON 8090 – file [../config-repo/81-logging-service.yml]
│   │   ├── demo6.png – Docker – docker-compose up -d – 3/3 Created + Started – Tier 9 DevOps
│   │   ├── demo7.png – CMD curl - 4 Orders – curl POST 9999 + 8888 + 7777 + 8888 Order placed 4x – E2E Trigger
│   │   ├── demo8.png – Console 78 – PRODUCED Event 4x – Producer proof – Source for 79+80+81 – Config from 82
│   │   ├── demo9.png – Console 79 – RAW MESSAGE 4x + NOTIFICATION SENT Order ID 9999 + 8888 + 7777 + 8888 – Parallel proof – Config from 82
│   │   ├── demo10.png – Console 80 – RAW MESSAGE 4x + PAYMENT PROCESSED PaymentId=79598d19 + af0eaf1d + 91d23b05 + 79598d19 + PRODUCED Payment – Config from 82
│   │   ├── demo11.png – Console 81 – RAW MESSAGE (orders) 4x + RAW MESSAGE (payments) 4x + LOG SAVED ORDER + LOG SAVED PAYMENT – Config from 82
│   │   ├── demo12.png – Console 82 – Adding property source Config resource file [../config-repo/78-event-driven-order.yml] + 79 + 80 + 81 + Tomcat started on port 8888 – CENTRAL CONFIG – MAIN DEMO – TIER 8 LAST
│   │   └── demo13.jpg – Architecture – Tier 8 LAST – Client -> 78 -> Kafka -> 79+80+81 + 82 Config Server 8888 Central Config Native file:../config-repo Serving 78+79+80+81 dotted lines
│   ├── pom.xml – spring-cloud-config-server + jackson-databind – Central Config – 12 Demos + Architecture – TIER 8 LAST
│   └── target/
└── config-repo/ – External Native – file:../config-repo – Central configs – 78+79+80+81 yml – TIER 8 LAST
```

## ▶ How to Run – Tier 8 – Interlinked 78+79+80+81+82 – 12 Demos + Architecture – Smooth No Errors – TIER 8 LAST

### 1. Clone Interlinked Repos – TIER 8 LAST 73-82 COMPLETE
```bash
git clone https://github.com/raviteja-dev950/82-config-server.git
cd 82-config-server
```

### 2. Application YML – FINAL – WORKING – demo12.png + demo1-5.png proof – Tier 8 Config Server pattern – Only Port 8888 – TIER 8 LAST

**application.yml – 8888 + Config Server Native file:../config-repo @EnableConfigServer – Only Port 8888**
```yaml
server:
  port: 8888

spring:
  application:
    name: 82-config-server
  profiles:
    active: native
  cloud:
    config:
      server:
        native:
          search-locations: file:../config-repo
```

**config-repo/78-event-driven-order.yml – Config for 78 – Port 8087 – demo2.png**
```yaml
server:
  port: 8087
spring:
  kafka:
    bootstrap-servers: localhost:9092
    consumer:
      group-id: order-group-RAVI-FINAL
```

**config-repo/79-notification-service.yml – Config for 79 – Port 8088 – demo3.png**
```yaml
server:
  port: 8088
spring:
  kafka:
    bootstrap-servers: localhost:9092
    consumer:
      group-id: notification-group-RAVI-FINAL
```

**config-repo/80-payment-service.yml – Config for 80 – Port 8089 – demo4.png**
```yaml
server:
  port: 8089
spring:
  kafka:
    bootstrap-servers: localhost:9092
    consumer:
      group-id: payment-group-RAVI-FINAL
```

**config-repo/81-logging-service.yml – Config for 81 – Port 8090 – demo5.png**
```yaml
server:
  port: 8090
spring:
  kafka:
    bootstrap-servers: localhost:9092
    consumer:
      group-id: logging-group-RAVI-FINAL
      auto-offset-reset: earliest
```

### 3. Run – Tier 8 – Interlinked Proof – Order: Config Server First! – 12 Demos + Architecture – TIER 8 LAST

```bash
# Start Kafka Docker – 3/3 Created + Started – Cluster ID f4AItejLSsCPDs7m9CixtA – demo6.png
E:\kafka-docker> docker-compose up -d

# 1. Start 82-config-server Port 8888 – Must start FIRST – demo12.png + demo1.png – CENTRAL CONFIG – TIER 8 LAST
mvn clean package -DskipTests
java -jar target/82-config-server-0.0.1-SNAPSHOT.jar
# Wait: Tomcat started on port 8888 – Adding property source Config resource file [../config-repo/78-event-driven-order.yml] + 79 + 80 + 81 – Started ConfigServerApplication – 82-config-server RUNNING - Port 8888 Central Config Serving 78 8087, 79 8088, 80 8089, 81 8090! – demo12.png

# 2. Start 81-logging-service Port 8090 – demo11.png – DUAL TOPIC LOGGER – Config from 82
# 3. Start 80-payment-service Port 8089 – demo10.png – Config from 82
# 4. Start 79-notification-service Port 8088 – demo9.png – Config from 82
# 5. Start 78-event-driven-order Port 8087 – demo8.png – Config from 82

# 6. Test E2E – demo7.png – Trigger – 4 Orders – TIER 8 LAST
curl -X POST http://localhost:8087/api/orders -H "Content-Type: application/json" -d "{"id":"9999","product":"LAPTOP","qty":2}"
curl -X POST http://localhost:8087/api/orders -H "Content-Type: application/json" -d "{"id":"8888","product":"MOUSE","qty":1}"
curl -X POST http://localhost:8087/api/orders -H "Content-Type: application/json" -d "{"id":"7777","product":"KEYBOARD","qty":5}"
curl -X POST http://localhost:8087/api/orders -H "Content-Type: application/json" -d "{"id":"8888","product":"MOUSE","qty":1}"
```

## 🧪 API Testing – 12 Demos + Architecture – Interlinked 78+79+80+81+82 – CENTRAL CONFIG – TIER 8 LAST

```bash
# Health – GET – demo1.png – Only Port 8888
http://localhost:8888/78-event-driven-order/default
http://localhost:8888/79-notification-service/default
http://localhost:8888/80-payment-service/default
http://localhost:8888/81-logging-service/default

# Trigger event from 78 – Main flow interlinked – demo7+demo8+demo9+demo10+demo11+demo12+demo13 – E2E Tier 8 – 4 Orders – TIER 8 LAST
curl -X POST http://localhost:8087/api/orders -H "Content-Type: application/json" -d "{"id":"9999","product":"LAPTOP","qty":2}"
# Response: Order placed: Order{id='9999', product='LAPTOP', qty=2} + Order{id='8888'...} + Order{id='7777'...} + Order{id='8888'...} – demo7.png
# Then check 78 console -> PRODUCED Event + JSON – demo8.png – Config from 82
# Then check 79 console -> NOTIFICATION SENT – demo9.png – Config from 82
# Then check 80 console -> PAYMENT PROCESSED + PRODUCED Payment PaymentId=79598d19 + af0eaf1d + 91d23b05 + 79598d19 – demo10.png – Config from 82
# Then check 81 console -> LOG SAVED - ORDER + LOG SAVED - PAYMENT PaymentId=79598d19 + af0eaf1d + 91d23b05 + 79598d19 – demo11.png – Config from 82
# Then check 82 console -> Adding property source 4 files + Tomcat started on port 8888 – demo12.png – CENTRAL CONFIG – Main proof interlinked 82->78+79+80+81
```

## 📸 Screenshots – 12 Demos + Architecture – Completed – Tier 8 Interlinked Proof 78+79+80+81+82 – CENTRAL CONFIG – Only Port 8888 – TIER 8 LAST

### 1. Health Check – Browser – localhost:8888/78-event-driven-order/default – RUNNING - Port 8888 - Central Config Serving 78 8087, 79 8088, 80 8089, 81 8090! – Only Port 8888

[demo1](screenshots/demo1.png)

### 2. Config Serving 78 – Browser – localhost:8888/78-event-driven-order/default – Config JSON 8087 – file [../config-repo/78-event-driven-order.yml]

[demo2](screenshots/demo2.png)

### 3. Config Serving 79 – Browser – localhost:8888/79-notification-service/default – Config JSON 8088

[demo3](screenshots/demo3.png)

### 4. Config Serving 80 – Browser – localhost:8888/80-payment-service/default – Config JSON 8089

[demo4](screenshots/demo4.png)

### 5. Config Serving 81 – Browser – localhost:8888/81-logging-service/default – Config JSON 8090

[demo5](screenshots/demo5.png)

### 6. Docker - Kafka Docker - docker-compose up -d - 3/3 Created + Started

[demo6](screenshots/demo6.png)

### 7. CMD Curl - 4 Orders - curl POST 9999 LAPTOP + 8888 MOUSE + 7777 KEYBOARD + 8888 MOUSE - Order placed 4x

[demo7](screenshots/demo7.png)

### 8. Event Produced – Console 78 – PRODUCED Event 9999 + 8888 + 7777 + 8888 – Producer proof! – 4 Orders – Config from 82

[demo8](screenshots/demo8.png)

### 9. Event Consumed – Console 79 – NOTIFICATION SENT 9999 + 8888 + 7777 + 8888 – Parallel proof! – 4 Orders – Config from 82

[demo9](screenshots/demo9.png)

### 10. Event Consumed+Produced – Console 80 – PAYMENT PROCESSED + PRODUCED Payment 79598d19 + af0eaf1d + 91d23b05 + 79598d19 – 4 Payments – Config from 82

[demo10](screenshots/demo10.png)

### 11. Event Consumed Dual Topic – Console 81 – LOG SAVED ORDER + LOG SAVED PAYMENT 79598d19 + af0eaf1d + 91d23b05 + 79598d19

[demo11](screenshots/demo11.png)

### 12. Config Server Central – Console 82 – Adding property source Config resource file [../config-repo/78-event-driven-order.yml] + file [../config-repo/79-notification-service.yml] + file [../config-repo/80-payment-service.yml] + file [../config-repo/81-logging-service.yml] – CENTRAL CONFIG

[demo12](screenshots/demo12.png)

### 13. Architecture - Tier 8 LAST Advanced Backend Project 82 Config Server - Event-Driven Kafka-Based + Central Config Architecture

[architecture](screenshots/demo13.jpg)

## 🎯 Learning Outcomes – Tier 8 – Advanced Backend – Interlinked 78+79+80+81+82 – CENTRAL CONFIG – 12 Demos + Architecture – TIER 8 LAST 73-82 COMPLETE

- **Tier 8 Roadmap LAST:** 73 Auth 8081, 74 Product 8082, 75 Order 8083, 76 Gateway 8080, 77 Discovery 8761, 78 Event-Driven Order 8087, 79 Notification 8088, 80 Payment 8089, 81 Logging 8090, 82 Config Server 8888 – THIS REPO – 12 Demos + Architecture – CENTRAL CONFIG – TIER 8 LAST – GitHub Goal Architecture diagram in README – Achieved
- **Interlinked LAST:** 82 Config Server (Port 8888) Native file:../config-repo Serving configs http://localhost:8888/78-event-driven-order/default + 79 + 80 + 81 -> 78 Producer (Port 8087) Config from 82 -> Kafka Topic orders -> 79 Consumer (Port 8088) Config from 82 -> NOTIFICATION SENT + 80 Consumer+Producer (Port 8089) Config from 82 -> PAYMENT PROCESSED PaymentId=79598d19 + af0eaf1d + 91d23b05 + 79598d19 -> Kafka Topic payments -> 81 Consumer Dual Topic (Port 8090) Config from 82 -> LOG SAVED ORDER + LOG SAVED PAYMENT -> 82 CENTRAL CONFIG FINAL – **Triple parallel + Dual topic + Central Config – 4 Orders 9999 + 8888 + 7777 + 8888 – PaymentIds 79598d19 + af0eaf1d + 91d23b05 + 79598d19 – TIER 8 LAST**
- **Spring Cloud Config Server – MAIN FEATURE – 12 Demos + Architecture – TIER 8 LAST:** @EnableConfigServer + spring.profiles.active=native + spring.cloud.config.server.native.search-locations=file:../config-repo – Port 8888 Only – No 9092 badge – Only 8888 badge – demo12.png Adding property source 4 files + Tomcat started on port 8888 + demo1-5.png Config JSON serving 78+79+80+81 – **Main feature central config – Final config server of Tier 8 – Cluster ID f4AItejLSsCPDs7m9CixtA – 4 Orders + 4 Payments + 4 Configs – 12 Demos + Architecture – TIER 8 LAST 73-82 COMPLETE**

## 🚀 Future Enhancements – Tier 8 -> Tier 9 DevOps + Cloud – CENTRAL CONFIG – 12 Demos + Architecture – TIER 8 LAST

- **Tier 8 LAST – 73-82 COMPLETE:** Central config for 78+79+80+81 – Config Server pattern @EnableConfigServer Native file:../config-repo – Tier 8 Complete – All microservices 73-82 done
- **Tier 9 DevOps + Cloud – Dockerize – 12 Demos + Architecture + Docker:** 83 Dockerize App – Dockerfile – Docker Compose 78 + 79 + 80 + 81 + 82 + Kafka + Zookeeper – 7 services – 84 K8s Deploy – 85 GitHub Actions CI – Badges build passing, coverage, deployed link – **Docker Compose with 7 services + orders + payments topics + config server 8888 + Native file:../config-repo – Smooth no errors – demo6.png 3/3 Created + Started + demo12.png Adding property source 4 files – 12 Demos + Architecture – TIER 8 LAST**
- **Add DB – Save logs + Configs – JPA MySQL:** Log table id, timestamp, topic, message, source, level + Config table app, profile, key, value – demo11.png LOG SAVED + demo12.png Adding property source 4 files
- **Config Server Enhancements – Git Backend + Refresh + Bus:** Git repo for configs instead of file:../config-repo – Spring Cloud Bus + RabbitMQ + @RefreshScope + /actuator/refresh – Auto refresh configs without restart – Encrypt/Decrypt secrets

## 👨💻 Author – 100 Projects Java Full Stack Development and GitHub Profile Roadmap – TIER 8 LAST 73-82 COMPLETE

### Vemula Leela Venkata Ravi Teja
Java Full Stack Developer
100 Java Full Stack Projects Challenge – 82/100 – Tier 8 Advanced Backend – Microservices Track – Config Server - Central Configuration @EnableConfigServer Native file:../config-repo – Interlinked with 78 Event-Driven Order + 79 Notification Service + 80 Payment Service + 81 Logging Service – TIER 8 LAST 73-82 COMPLETE

**Roadmap Progress – Tier 8 – Advanced Backend – Microservices – Architecture diagram in README, each service = repo – Same style as Project 81 – TIER 8 LAST:**
- Tier 1 Foundations Core Java + Git Clean repos, great READMEs, commit history – 1-12 completed
- Tier 8 Advanced Backend Microservices Spring Cloud Eureka Gateway Config Kafka Redis RabbitMQ Architecture diagram in README each service = repo – 73 Auth completed Port 8081, 74 Product completed Port 8082, 75 Order completed Port 8083, 76 Gateway completed Port 8080, 77 Discovery completed Port 8761, 78 Event-Driven Order completed Port 8087 – https://github.com/raviteja-dev950/78-event-driven-order – 79 Notification Service completed Port 8088 – https://github.com/raviteja-dev950/79-notification-service – 80 Payment Service completed Port 8089 – https://github.com/raviteja-dev950/80-payment-service – 81 Logging Service completed Port 8090 – https://github.com/raviteja-dev950/81-logging-service – 82 Config Server – THIS REPO – Port 8888 – demo1+demo2+demo3+demo4+demo5+demo6+demo7+demo8+demo9+demo10+demo11+demo12+demo13 – 12 Demos + Architecture – CENTRAL CONFIG – Triple parallel consumers + Dual topic + Central config – Only Port 8888 badge – Same style as Project 81 but TIER 8 LAST – Smooth process – 82/100 – PaymentIds 79598d19 + af0eaf1d + 91d23b05 + 79598d19 – 4 Orders 9999 + 8888 + 7777 + 8888 – TIER 8 LAST 73-82 COMPLETE

## ⭐ Support – Tier 8 – CENTRAL CONFIG – 12 Demos + Architecture – TIER 8 LAST

If you found this project helpful learning Spring Cloud Config Server / @EnableConfigServer / Native file:../config-repo / Adding property source Config resource file [../config-repo/78-event-driven-order.yml] / Tomcat started on port 8888 / 82-config-server RUNNING - Port 8888 Central Config Serving 78 8087, 79 8088, 80 8089, 81 8090 / Kafka Consumer Dual Topic / CENTRAL CONFIG / Triple Parallel Consumers + Dual Topic + Central Config / LOG SAVED ORDER + LOG SAVED PAYMENT PaymentIds 79598d19 + af0eaf1d + 91d23b05 + 79598d19 / 4 Orders 9999 + 8888 + 7777 + 8888 / 4 Configs / 12 Demos + Architecture / 100 Projects Roadmap / Same style as Project 81 / Smooth process without errors / TIER 8 LAST 73-82 COMPLETE, give it a ⭐ Star!

### Repo – Interlinked – Tier 8 Each service = repo – CENTRAL CONFIG – Triple Parallel + Dual Topic + Central Config – 12 Demos + Architecture – TIER 8 LAST

- **78 Event-Driven Order – Producer – Port 8087 – Config from 82 file:../config-repo/78-event-driven-order.yml – demo8.png + demo7.png – Smooth – 4 Orders – TIER 8 LAST:** https://github.com/raviteja-dev950/78-event-driven-order – PRODUCED Event – demo8.png – Source for 79+80+81 – Trigger Order placed – demo7.png – 4 Orders 9999 + 8888 + 7777 + 8888 – Config from 82 – http://localhost:8888/78-event-driven-order/default – demo2.png
- **79 Notification Service – Consumer – Port 8088 – Config from 82 file:../config-repo/79-notification-service.yml – demo9.png – Smooth – 4 Orders – TIER 8 LAST:** https://github.com/raviteja-dev950/79-notification-service – NOTIFICATION SENT – demo9.png – Config from 82 – http://localhost:8888/79-notification-service/default – demo3.png
- **80 Payment Service – Consumer+Producer – Port 8089 – Config from 82 file:../config-repo/80-payment-service.yml – demo10.png – Smooth – 4 Payments – TIER 8 LAST:** https://github.com/raviteja-dev950/80-payment-service – PAYMENT PROCESSED + PRODUCED Payment PaymentId=79598d19 + af0eaf1d + 91d23b05 + 79598d19 – demo10.png – Config from 82 – http://localhost:8888/80-payment-service/default – demo4.png
- **81 Logging Service – Consumer Dual Topic – Port 8090 – Config from 82 file:../config-repo/81-logging-service.yml – demo11.png – Smooth no errors – TIER 8 LAST:** https://github.com/raviteja-dev950/81-logging-service – LOG SAVED ORDER + LOG SAVED PAYMENT – demo11.png – Config from 82 – http://localhost:8888/81-logging-service/default – demo5.png
- **82 Config Server – Central Config – Port 8888 – THIS REPO – CENTRAL CONFIG – demo1.png + demo2.png + demo3.png + demo4.png + demo5.png + demo6.png + demo12.png + demo13.jpg – 12 Demos + Architecture – TIER 8 LAST 73-82 COMPLETE:** https://github.com/raviteja-dev950/82-config-server – Adding property source Config resource file [../config-repo/78-event-driven-order.yml] + file [../config-repo/79-notification-service.yml] + file [../config-repo/80-payment-service.yml] + file [../config-repo/81-logging-service.yml] + Tomcat started on port 8888 + 82-config-server RUNNING - Port 8888 Central Config Serving 78 8087, 79 8088, 80 8089, 81 8090! – demo12.png + demo1-5.png – **Only Port 8888 badge – Same style as Project 81 but TIER 8 LAST – 12 Demos + Architecture – Smooth process – 4 Configs + 4 Orders + 4 Payments – TIER 8 LAST**
