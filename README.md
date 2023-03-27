# Booking API

# Requirements
- Java 11
- Docker

# Development
- run docker/database.yml to start dbs
- run docker/dev.yml to start services necessary for developing
- run docker/monitoring.yml to start services necessary for monitoring

- use maven wrapper `./mvnw` if you are on FPT proxy


## Database
check docker/database.yml for db address

### pgadmin
local pgadmin instance on http://localhost:5050/

add Postgres server:
- `host`: host.docker.internal, `port`: 5432-5434

## Services
### Eureka Server
port: 9876

### API Gateway
port: 9090

### User service
port: 9091

### Room service
port: 9092

### Financial service
Handle booking, payment, promotion,...
port: 9093


## Code quality
Analyse code quality using Sonar.

Run  
`docker-compose -f docker/sonar.yml up -d`  
then visit the local Sonar server on http://localhost:9001.
