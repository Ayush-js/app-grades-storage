# Grade Submission Application

This is a simple Spring Boot web application for submitting and viewing student grades.

## Functionality

The application allows users to:

*   Submit a grade for a student, including their name, the subject, and their score.
*   View a list of all submitted grades.
*   Update an existing grade.

The application uses an in-memory `ArrayList` to store the grades, so the data will be lost when the application is restarted.

## Endpoints

*   `GET /`: Displays a form to submit or update a grade.
*   `POST /handleSubmit`: Processes the form submission and redirects to the grades list.
*   `GET /grades`: Displays a list of all submitted grades.

## Technologies Used

*   **Java 17**: The core programming language for the application.
*   **Spring Boot**: The framework used to create the stand-alone, production-grade Spring based Applications that you can "just run".
*   **Maven**: A powerful project management tool that is based on POM (project object model) and used for project build, dependency and documentation.
*   **Thymeleaf**: A modern server-side Java template engine for both web and standalone environments.

## Project Structure

```
.app-grades-storage/
├───.gitignore
├───mvnw
├───mvnw.cmd
├───pom.xml
├───README.md
├───.git\
├───.mvn\
│   └───wrapper\
│       ├───maven-wrapper.jar
│       └───maven-wrapper.properties
├───.vscode\
├───src\
│   ├───main\
│   │   ├───java\
│   │   │   └───com\
│   │   │       └───ltp\
│   │   │           ├───ScoreValidator.java
│   │   │           └───gradesubmission\
│   │   │               ├───Constants.java
│   │   │               ├───Grade.java
│   │   │               ├───GradeController.java
│   │   │               ├───GradeSubmissionApplication.java
│   │   │               └───Score.java
│   │   └───resources\
│   │       ├───application.properties
│   │       ├───static\
│   │       │   └───style.css
│   │       └───templates\
│   │           ├───form.html
│   │           └───grades.html
│   └───test\
│       └───java\
│           └───com\
│               └───ltp\
│                   └───gradesubmission\
│                       └───GradeSubmissionApplicationTests.java
└───target\
    ├───classes\
    ├───generated-sources\
    ├───generated-test-sources\
    ├───maven-status\
    └───test-classes\
```


## Maven Dependencies

This project uses the following dependencies:

*   **Spring Boot Starter Thymeleaf**: For creating web pages using the Thymeleaf template engine.
*   **Spring Boot Starter Web**: For building web applications, including RESTful applications, using Spring MVC.
*   **Spring Boot Starter Test**: For testing Spring Boot applications.
*   **Spring Boot DevTools**: Provides fast application restarts, LiveReload, and configurations for enhanced development experience.
*   **Spring Boot Starter Validation**: Provides support for the Java Bean Validation API.

## How to Run

1.  Clone the repository.
2.  Run the application using the Maven wrapper:
    ```bash
    ./mvnw spring-boot:run
    ```
3.  Open your web browser and navigate to `http://localhost:8080`.