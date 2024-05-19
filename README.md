# Vacation Booking Application

## Overview

This project is a modernized back-end system for a travel agency's vacation bookings application. The legacy system, built in the early 1990s, has been migrated to the modern Spring framework. This new system interacts seamlessly with the Angular front-end, providing a robust and scalable solution.

## Technologies Used

- **Java**: Programming language
- **Spring Boot**: Framework for building the application
  - Spring Data JPA
  - Spring Data REST
- **MySQL**: Database
- **Lombok**: Java library for boilerplate code reduction
- **GitLab**: Version control and repository hosting

### A. GitLab Repository Setup
- The project is hosted on GitLab. [here](https://gitlab.com/wgu-gitlab-environment/student-repos/yma14/d288-back-end-programming.git) 
- working_branch's branch history and commit messages are available upon request.

## Project Structure

The project is structured into several packages:

- **controllers**: Contains REST controllers for handling HTTP requests.
- **entities**: Contains entity classes representing the database schema.
- **dao**: Contains repository interfaces for data access.
- **services**: Contains service classes for business logic.
- **config**: Contains configuration classes.

## Setup Instructions

### Prerequisites

- JDK 22 or higher
- Maven
- MySQL
- Git

### Initial Setup

1. **Clone the repository:**

    ```bash
    git clone <GitLab_Repo_URL>
    cd vacation-booking
    ```

2. **Configure the database:**

    Update the `src/main/resources/application.properties` file with your MySQL database details:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/vacation_booking
    spring.datasource.username=<your_db_username>
    spring.datasource.password=<your_db_password>
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    ```

3. **Run the application:**

    ```bash
    mvn spring-boot:run
    ```

4. **Access the application:**

    The back-end services will be available at `http://localhost:8080`.

Note that the Angular FE is not included in this project.


Demo pictures from Angular Frontend that is not included in this BE project:
![Screenshot 2024-05-15 at 3 43 05 PM](https://github.com/Yma-Van2020/Java-Back-end-programming/assets/74885386/f7406478-f37f-49e2-8335-3d68f57e1b84)
![Screenshot 2024-05-15 at 3 43 13 PM](https://github.com/Yma-Van2020/Java-Back-end-programming/assets/74885386/4bcb4cf2-9455-4614-aec8-5fbaebb832e8)
![Screenshot 2024-05-15 at 3 43 22 PM](https://github.com/Yma-Van2020/Java-Back-end-programming/assets/74885386/24249960-b92a-477a-9d32-13189dd71a1b)
![Screenshot 2024-05-15 at 3 43 28 PM](https://github.com/Yma-Van2020/Java-Back-end-programming/assets/74885386/f808fe7d-bed0-43ab-b438-5f8902bdad44)
![Screenshot 2024-05-15 at 3 43 39 PM](https://github.com/Yma-Van2020/Java-Back-end-programming/assets/74885386/4ba34ab7-a7a7-4d06-91ad-a17dc71f3e57)
![Screenshot 2024-05-15 at 3 43 47 PM](https://github.com/Yma-Van2020/Java-Back-end-programming/assets/74885386/ffe4a12a-2368-45bd-8e84-8f0789ac0bee)
![Screenshot 2024-05-15 at 3 42 56 PM](https://github.com/Yma-Van2020/Java-Back-end-programming/assets/74885386/ee362551-eabd-4bf3-8db7-c0045121efe2)
![Screenshot 2024-05-15 at 3 44 54 PM](https://github.com/Yma-Van2020/Java-Back-end-programming/assets/74885386/8f9a168e-d300-48ee-b870-ec147edba82f)
