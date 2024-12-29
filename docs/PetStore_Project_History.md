# PetStore Project

## Intended Audience
This project is intended for **Java developers, Full Stack Web App developers, Team leads, and IT managers** of evolving enterprise applications. It serves as a practical example for staying current on modern technologies, application design, and development techniques.

## Project History
The PetStore project is not just a simple application but one with a real-life-like history, evolving through several iterations:
- **Version 0:** A quick-hack using ASP VBScript during the .NET boom, which was not scalable and required a complete rewrite.
- **First Java Version:** Implemented using Java BluePrints by Sun Microsystems, utilizing JavaServer Pages (JSP), Java Servlets, Enterprise JavaBeans (EJB), and Java Message Service (JMS). This version was deployed on a cluster of BEA Weblogic servers for fault tolerance.
- **Refactoring to J2EE 1.3:** Following the dot-com bust, the application was refactored to J2EE 1.3, improving design patterns, scalability, modularity, and component reusability. The Struts framework was used for MVC design.
- **Java EE 5 Refactor:** In 2006, the application was again refactored with Java EE 5, utilizing JSF, EJB Lite, JPA, Annotations, and Dependency Injection.
- **Java EE 6 Update:** Java EE 6 brought CDI, JPA 2.0, Bean Validation, and RESTful web services in 2009.
- **Java EE 7 Update:** The last backend update was 11 years ago with JPA 2.1, CDI 1.1, Bean Validation 1.1, EJB Lite 3.2, JSF 2.2, and JAX-RS 2.0. The UI was updated with Twitter Bootstrap, JQuery, and PrimeFaces. The application was also deployed to an open-source JBoss server.
- **Cloud and Mobile:** The application was deployed to cloud providers, with Docker adoption for easy deployment. The Web UI was modernized with a rewrite to Angular, while the backend remained the same.

## Move to SaaS
After years of cost-cutting and strong revenue growth, PetStore was acquired by BigCompany. The plan is to turn PetStore into a SaaS solution. However, simply adding TenantID columns won't work for the existing 10-20-year-old codebase. The current database design, while ensuring data integrity, has become a liability with high-volume customers pushing vertical scalability limits.

## SaaS PetStore Rewrite
The need to host hundreds of clients on a SaaS solution requires a complete redesign:
- **Microservices Architecture:** Decoupling domains and building independent, scalable microservices.
- **Observability:** Implementing observability, traceability, and monitoring is crucial for a complex distributed system.
- **Retiring Legacy Components:** Some legacy components, like SignOn, can be replaced by 3rd-party products.
- **New Features:** New features like click-stream integration are required by the business.

The rewrite started with an MVP (Minimum Viable Product) implementing basic PetStore functionality on a new platform, with first sprints focusing on the following services:
- **Product Service**
- **Order Service**
- **Inventory Service**
- **Notification Service**

Users should be able to browse the product catalog, place orders, and receive notifications. The legacy system will be replaced gradually using the strangler fig pattern.

### Database Change
A key change involves the database for the Product Catalog. The strict relational schema doesn't fit well with the multitude of product types. The project moved to using a **document database, MongoDB**, to provide flexibility and scalability, while supporting schema validation.

## Java PetStore on Microservices Architecture

### Services Overview
- Product Service
- Order Service
- Inventory Service
- Notification Service
- API Gateway using Spring Cloud Gateway MVC
- Shop Frontend using Angular 18

### Tech Stack
The project utilizes the following technologies:
- **Spring Boot**
- **Angular**
- **Mongo DB**
- **MySQL**
- **Kafka**
- **Keycloak**
- **Test Containers with Wiremock**
- **Grafana Stack** (Prometheus, Grafana, Loki, and Tempo)
- **API Gateway** using Spring Cloud Gateway MVC
- **Kubernetes**

### Application Architecture
The application architecture is depicted in the provided image.
