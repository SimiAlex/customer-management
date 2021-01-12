# customer-management

#### Basic info
Simple Spring Boot webapp to track information about customers (CRUD). It includes the ability to search by the client's last name.

#### The app uses
- frontend: HTML, CSS, Thymeleaf template engine
- persistance: MySQL, Spring Data JPA, Hibernate
- build tool: Maven

#### Database

```sql
CREATE TABLE `customers` (
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
```
