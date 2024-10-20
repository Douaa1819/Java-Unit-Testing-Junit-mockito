# 📚 Java Unit Testing with JUnit & Mockito 🚀

Welcome to the **Ultimate Java Testing Guide**! 🎉 In this project, we're mastering **JUnit** for unit testing and **Mockito** for mocking dependencies. Whether you're a beginner or want to refine your skills, this repository will help you write clean, maintainable, and well-tested Java code. 🧑‍💻🧪

---

## 🗂️ Table of Contents

- [Introduction](#introduction)
- [What You'll Learn](#-what-youll-learn)
- [Setup & Installation](#-setup--installation)
- [Understanding Unit Testing](#-understanding-unit-testing)
- [Writing Your First Test](#-writing-your-first-test)
- [Mocking with Mockito](#-mocking-with-mockito)
- [Best Practices](#-best-practices)
- [Running the Tests](#-how-to-run-the-tests)
- [Screenshots](#-screenshots)
- [More Learning Resources](#-more-learning-resources)
- [Contributors](#-contributors)
- [License](#-license)

---

## 💡 Introduction

Unit testing is the backbone of high-quality software development. With **JUnit**, we can create repeatable and automated tests to ensure our code behaves as expected. **Mockito** takes it a step further by allowing us to mock dependencies, which means we can isolate components and test them in controlled environments.

---

## 🌟 What You'll Learn

This project is designed to give you hands-on experience with:

- 🧪 **JUnit 5** – The modern unit testing framework for Java.
- 🧙 **Mockito** – The most popular mocking framework in the Java ecosystem.
- 🚀 **Test-driven development (TDD)** – Writing tests before implementing functionality.
- ✅ **Assertion techniques** – Making sure your tests are robust and reliable.
- 📉 **Mocking strategies** – Simulating complex interactions with external dependencies.

---

## ⚙️ Setup & Installation

### Prerequisites

Before diving into testing, make sure you have the following installed on your machine:

1. **Java** 17 or higher 🟢
   - Download from the [Oracle website](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html).
2. **Maven** or **Gradle** for dependency management 🛠️
   - [Maven installation guide](https://maven.apache.org/install.html)
   - [Gradle installation guide](https://gradle.org/install/)
3. **JUnit 5** and **Mockito** libraries.

### Installing JUnit 5 and Mockito

If you're using **Maven**, add these dependencies to your `pom.xml`:

```xml
<dependencies>
    <!-- JUnit 5 -->
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <version>5.9.0</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-engine</artifactId>
        <version>5.9.0</version>
        <scope>test</scope>
    </dependency>

    <!-- Mockito -->
    <dependency>
        <groupId>org.mockito</groupId>
        <artifactId>mockito-core</artifactId>
        <version>3.12.4</version>
        <scope>test</scope>
    </dependency>
</dependencies>


Here’s the full README file with the updated sections for More Learning Resources, Contributions, License, and Contributors:

md
Copier le code
# 📚 Java Unit Testing with JUnit & Mockito 🚀

Welcome to the **Ultimate Java Testing Guide**! 🎉 In this project, we're mastering **JUnit** for unit testing and **Mockito** for mocking dependencies. Whether you're a beginner or want to refine your skills, this repository will help you write clean, maintainable, and well-tested Java code. 🧑‍💻🧪

---

## 🗂️ Table of Contents

- [Introduction](#introduction)
- [What You'll Learn](#-what-youll-learn)
- [Setup & Installation](#-setup--installation)
- [Understanding Unit Testing](#-understanding-unit-testing)
- [Writing Your First Test](#-writing-your-first-test)
- [Mocking with Mockito](#-mocking-with-mockito)
- [Best Practices](#-best-practices)
- [Running the Tests](#-how-to-run-the-tests)
- [Screenshots](#-screenshots)
- [More Learning Resources](#-more-learning-resources)
- [Contributors](#-contributors)
- [License](#-license)

---

## 💡 Introduction

Unit testing is the backbone of high-quality software development. With **JUnit**, we can create repeatable and automated tests to ensure our code behaves as expected. **Mockito** takes it a step further by allowing us to mock dependencies, which means we can isolate components and test them in controlled environments.

---

## 🌟 What You'll Learn

This project is designed to give you hands-on experience with:

- 🧪 **JUnit 5** – The modern unit testing framework for Java.
- 🧙 **Mockito** – The most popular mocking framework in the Java ecosystem.
- 🚀 **Test-driven development (TDD)** – Writing tests before implementing functionality.
- ✅ **Assertion techniques** – Making sure your tests are robust and reliable.
- 📉 **Mocking strategies** – Simulating complex interactions with external dependencies.

---

## ⚙️ Setup & Installation

### Prerequisites

Before diving into testing, make sure you have the following installed on your machine:

1. **Java** 17 or higher 🟢
   - Download from the [Oracle website](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html).
2. **Maven** or **Gradle** for dependency management 🛠️
   - [Maven installation guide](https://maven.apache.org/install.html)
   - [Gradle installation guide](https://gradle.org/install/)
3. **JUnit 5** and **Mockito** libraries.

### Installing JUnit 5 and Mockito

If you're using **Maven**, add these dependencies to your `pom.xml`:

```xml
<dependencies>
    <!-- JUnit 5 -->
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <version>5.9.0</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-engine</artifactId>
        <version>5.9.0</version>
        <scope>test</scope>
    </dependency>

    <!-- Mockito -->
    <dependency>
        <groupId>org.mockito</groupId>
        <artifactId>mockito-core</artifactId>
        <version>3.12.4</version>
        <scope>test</scope>
    </dependency>
</dependencies>

If you're using Gradle, add the following to your build.gradle:


dependencies {
    testImplementation 'org.junit.jupiter:junit-jupiter-api:5.9.0'
    testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.9.0'
    testImplementation 'org.mockito:mockito-core:3.12.4'
}
````
## 🧪 Understanding Unit Testing
Unit tests focus on individual pieces of functionality in your application, typically a method or class. The goal is to ensure that these small units work as expected. A typical unit test:

1-Sets up necessary data or dependencies.
2-Executes the method to be tested.
3-Asserts that the result matches the expected outcome.

Unit tests should be:

Fast – Run in milliseconds.
Isolated – No reliance on external systems like databases or network services.
Repeatable – Produce the same result every time.

## 📝 Writing Your First Test
Let's start simple! Imagine you have a Calculator class that adds two numbers. Here's how you'd test it using JUnit.
Unit tests focus on individual pieces of functionality in your application, typically a method or class. The goal is to ensure that these small units work as expected. A typical unit test:

Sets up necessary data or dependencies.
Executes the method to be tested.
Asserts that the result matches the expected outcome.
Unit tests should be:

Fast – Run in milliseconds.
Isolated – No reliance on external systems like databases or network services.
Repeatable – Produce the same result every time.

# Writing Your First Test

## Simple Unit Test with JUnit

Let's start with a straightforward example! Suppose you have a `Calculator` class that adds two numbers. Here's how you would test it using JUnit.

### Step 1: Create the Calculator Class

```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}
```
### Step 2:Write the Unit Test
```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result, "The addition result should be 5");
    }
}
```
Explanation:

@Test: Marks the method as a unit test.
assertEquals(expected, actual): Checks if the actual result matches the expected result.

## Mocking with Mockito
Unit tests should focus on the class itself, but sometimes our classes depend on external systems (e.g., databases, web services). This is where Mockito helps by mocking those dependencies.

Example: OrderProcessor Class
### Step 1: Create the OrderProcessor Class
```java
public class OrderProcessor {
    private PaymentService paymentService;

    public OrderProcessor(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public boolean processOrder() {
        return paymentService.processPayment();
    }
}
````
### Step 2: Mock PaymentService in the Unit Test
```java
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderProcessorTest {

    @Test
    public void testProcessOrder() {
        // Mock the PaymentService
        PaymentService paymentService = Mockito.mock(PaymentService.class);
        Mockito.when(paymentService.processPayment()).thenReturn(true);

        // Test the OrderProcessor with the mock
        OrderProcessor processor = new OrderProcessor(paymentService);
        boolean result = processor.processOrder();

        assertTrue(result, "The order should be processed successfully");
    }
}
````
Explanation:

Mockito.mock(): Creates a mock object.
Mockito.when().thenReturn(): Specifies the behavior of the mock.
assertTrue(result): Ensures that the order processing was successful.
## 🏆 Best Practices

To write effective unit tests:

- **Test One Thing**: Each test should verify one behavior or result.
- **Keep It Short**: Your test methods should be concise and to the point.
- **Use Meaningful Names**: Test names should describe the behavior being tested.
- **Mock Only What You Need**: Don’t mock everything—only mock external dependencies or slow operations.
- **Use Setup Methods**: If tests require repeated setup, use `@BeforeEach` to avoid redundancy.

### Example of using `@BeforeEach`:

```java
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        assertEquals(5, calculator.add(2, 3));
    }
}

## 🏃‍♂️ How to Run the Tests

### Running Tests in IDE

1. Clone the repo:

    ```bash
    git clone https://github.com/yourusername/junit-mockito-example.git
    ```

2. Open the project in your IDE (IntelliJ, Eclipse, etc.).
3. Navigate to the test folder.
4. Right-click and select **Run All Tests**.

### Running Tests via Maven

If you're using Maven, you can run the tests from the command line:

```bash
mvn test
````

## 🎓 More Learning Resources

- 📖 [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)
- 🎓 [Mockito Documentation](https://site.mockito.org/)
- 🎥 [JUnit and Mockito Crash Course - YouTube](https://www.youtube.com/watch?v=d0m3B5F3k8s)

## 🙌 Contributions

Feel free to open issues or pull requests if you'd like to contribute! Let's make this project better together 🌱✨.

## 📝 License

This project is licensed under the MIT License. See the LICENSE file for details.


## 👥 Contributors

A big thank you to everyone who has contributed to this project:

- **Douaa Chemnané** – Initial work and documentation.
- GitHub: [Douaa19819](https://github.com/Douaa1819)
