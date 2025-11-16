# ProductionReadyMicroservices
A production-ready microservices architecture

1.OverView
This project implements a production-ready microservices architecture with:
 -Eureka Cluster (Active + Passive nodes) for service discovery and high availability.
 -Spring Cloud Gateway (Active + Passive) for routing, load balancing, and request filtering.
 -Microservices (Auth Service, User Service, etc.) registered with Eureka.
 -Client-side load balancing via Spring Cloud LoadBalancer.
 -Optional JWT authentication at the Gateway layer.
This setup ensures scalability, failover, and dynamic service discovery for all microservices.

2. Architecture
         +---------------------+
         |      Client App     |
         +---------------------+
                   |
                   v
          +-----------------+
          | Load Balancer /  |
          | DNS (Optional)  |
          +-----------------+
             |           |
             v           v
    +----------------+  +----------------+
    | Gateway Active |  | Gateway Passive|
    | (8080)         |  | (8081)         |
    +----------------+  +----------------+
             |
             v
        +----------------+
        |  Eureka Cluster|
        |  8761, 8762    |
        +----------------+
             |
             v
      +----------------------+
      | Microservices        |
      | Auth, User, etc.     |
      | (Multiple instances) |
      +----------------------+
             |
             v
          Database

3. How To Run Running Locally (Development)

## Start Eureka cluster
java -jar eureka-server.jar --spring.profiles.active=8761
java -jar eureka-server.jar --spring.profiles.active=8762

## Start Gateway
java -jar gateway.jar --server.port=8080
java -jar gateway.jar --server.port=8081  # passive

## Start microservices
java -jar auth-service.jar --server.port=9001
java -jar user-service.jar --server.port=9002


