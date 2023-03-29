# Booking App

[![CircleCI](https://circleci.com/gh/WalterClementsJr/booking-app-ec2023.svg?style=svg)](https://circleci.com/gh/WalterClementsJr/booking-app-ec2023)
[![GithubActions](https://github.com/walterclementsjr/booking-app-ec2023/actions/workflows/maven.yml/badge.svg)](https://github.com/walterclementsjr/booking-app-ec2023)

[![SonarCloud](https://sonarcloud.io/images/project_badges/sonarcloud-black.svg)](https://sonarcloud.io/dashboard?id=WalterClementsJr_booking-app-ec2023)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=WalterClementsJr_booking-app-ec2023&metric=bugs)](https://sonarcloud.io/dashboard?id=WalterClementsJr_booking-app-ec2023)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=WalterClementsJr_booking-app-ec2023&metric=coverage)](https://sonarcloud.io/dashboard?id=WalterClementsJr_booking-app-ec2023)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=WalterClementsJr_booking-app-ec2023&metric=ncloc)](https://sonarcloud.io/dashboard?id=WalterClementsJr_booking-app-ec2023)

# Requirements
- Java 11
- Docker

# Development
- run `docker/database.yml` to start databases
- run `docker/dev.yml` to start services necessary for developing
- run `docker/monitoring.yml` to start Prometheus and Grafana for monitoring

- use maven wrapper `./mvnw` if you are on FPT proxy

## Database
check `docker/database.yml` for db address

### pgadmin
local pgadmin instance on http://localhost:5050/

add Postgres server:
- `host`: host.docker.internal, `port`: 5432-5434

## Services
### Eureka Server
Service discovery server.
- port: 9876

### Zookeeper
- port 22181  
`Zookeeper` server is listening on port 2181 for the `kafka` service.
However, for any client running on the host, it will be exposed on port 22181.

### Kafka
- port: 29092  
  actually advertised on port 9009 within the container environment by setting `KAFKA_ADVERTISED_LISTENERS`

### Prometheus
- port: 6060

### Grafana
- port: 3000

### API Gateway
accept, transform and forward API calls to the required services.
Also do authentication/authorization in this app.

- port: 9090

### User service
User info, logins, security roles,...
- port: 9091
- SwaggerUI: http://localhost:9091/swagger-ui.html

### Room service
Room management, booking, payment.
- port: 9092
- SwaggerUI: http://localhost:9092/swagger-ui.html

### Financial service
Handle payment history, customer points, promotions,...
- port: 9093
- SwaggerUI: http://localhost:9093/swagger-ui.html

## Code quality
Analyse code quality using [Sonar Cloud](https://sonarcloud.io/project/overview?id=WalterClementsJr_booking-app-ec2023)

or run a local Sonar instance  
`docker-compose -f docker/sonar.yml up -d`  
then visit the local Sonar server on http://localhost:9001.

Change default password to `password`, create a new project with key (name) `WalterClementsJr_booking-app-ec2023`
then run `sonar-scan.cmd` to scan your code.

