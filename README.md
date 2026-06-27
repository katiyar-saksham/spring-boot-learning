# 🚀 Spring Boot Learning Journey

Welcome to my daily progress repository where I track my learning journey in Spring Boot! This repository contains my daily practice code, notes, demos, and reference projects.

---

## 📅 Daily Progress Tracker

| Day | Topic | Key Concepts / Highlights | Project / Code Link | Status |
| :--- | :--- | :--- | :--- | :---: |
| **Day 1** | Spring Core & Dependency Injection | IOC Container, ApplicationContext, Dependency Injection, Beans definition. | 📂 [CoreDemo](./CoreDemo) |  |
| **Day 2** | Maven & Project Structuring | Understanding `pom.xml`, dependency management, Maven plugins, build lifecycle. | 📂 [MavenDemo](./MavenDemo) |  |
| **Day 3** | Spring Boot Starters & Web | Spring Boot autoconfiguration, creating a simple REST controller, starting Tomcat. | 📂 [demo](./demo) |  |
| **Day 4** | *Incoming...* | Learn Controller mapping, Request parameters, Path variables, JSON responses. | - | ⏳ |

---

## 🛠️ Project Catalog

### 1. ☕ [CoreDemo](./CoreDemo)
- **Description**: A basic Java project showcasing Spring Framework's core concepts.
- **Focus**: Bean configuration, ApplicationContext initialization, Dependency Injection using XML and Java Configuration.

### 2. 📦 [MavenDemo](./MavenDemo)
- **Description**: Explores Maven-based project builds.
- **Focus**: Managing third-party library dependency trees, packaging JARs/WARs, and clean/build/test Maven lifecycles.

### 3. 🕸️ [demo](./demo)
- **Description**: A fully functional Spring Boot Starter web application.
- **Focus**: Auto-configuration, basic REST APIs, and embedded Tomcat execution.

---

## 🗺️ Learning Roadmap

- [x] **Phase 1: Foundations**
  - [x] Java Core review
  - [x] Spring IOC & Dependency Injection (DI)
  - [x] Maven/Gradle build tool configuration
- [ ] **Phase 2: Spring Boot Web MVC**
  - [ ] REST API design (`@RestController`, `@GetMapping`, etc.)
  - [ ] Request parameters, Headers, Path Variables
  - [ ] Custom response bodies, JSON binding, Exception Handling (`@ControllerAdvice`)
- [ ] **Phase 3: Database & Persistence (Spring Data JPA)**
  - [ ] H2 / MySQL Database setup
  - [ ] Entity mappings (`@Entity`, `@Table`, `@Id`)
  - [ ] Relationship mappings (`@OneToMany`, `@ManyToOne`, `@ManyToMany`)
  - [ ] JPA Repository interface (CRUD, custom query methods)
- [ ] **Phase 4: Security & Authentication**
  - [ ] Spring Security defaults
  - [ ] In-memory authentication vs. Database authentication
  - [ ] JWT (JSON Web Token) integration
- [ ] **Phase 5: Advanced & Deployment**
  - [ ] Writing Unit/Integration Tests (`@SpringBootTest`, MockMvc)
  - [ ] Actuator (metrics, health checks)
  - [ ] Dockerizing Spring Boot apps
  - [ ] Deploying to AWS/Render

---

## ⚡ How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/katiyar-saksham/spring-boot-learning.git
   cd spring-boot-learning
   ```
2. Run any project using Maven:
   ```bash
   cd demo # Replace with CoreDemo or MavenDemo
   ./mvnw spring-boot:run # For spring-boot project
   # OR for standard maven projects:
   mvn clean install
   ```

---

*Keep coding every day! 💻✨*

# spring-boot-learning
