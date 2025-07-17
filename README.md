# Selenide and Guice Test Automation Framework Example

This project is a demonstration of how to build a robust and scalable UI test automation framework using Selenide and Google Guice for dependency injection.

## Core Concepts Demonstrated

This framework is designed to showcase several best practices for test automation:

1.  **Dependency Injection (DI) with Google Guice**: We use Guice to manage the lifecycle of our objects. Instead of manually creating page objects or drivers (`new MyPage()`), we "inject" them where needed. This makes the code cleaner, more modular, and easier to maintain.

2.  **Page Object Model (POM)**: The tests interact with Page Objects rather than directly with web elements. This separates test logic from UI implementation details.
    -   `pages/common/MainPage.java`: An `abstract` base page that defines common elements and actions.
    -   `pages/desktop/DesktopMainPage.java`: The implementation for the desktop view.
    -   `pages/viewport/ViewportMainPage.java`: The implementation for the mobile/viewport view.

3.  **Maven Build Profiles**: The project is configured with Maven profiles to easily switch between different test environments or configurations.
    -   **chrome**: The default profile, runs tests on a standard desktop Chrome browser.
    -   **viewport**: Runs tests using Chrome's device emulation for an "iPhone 15".

## Important Note on URL Configuration

In the `MainPage.java` class, you will find the following method:

```java
public MainPage openRegistrationPageByUrl(){
    open("https://"); // <<< NOTE: Hardcoded URL
    return this;
}
```

**This URL is intentionally hardcoded for demonstration purposes only.**

In a real-world project, the base URL should be managed through configuration files or environment variables. This framework is already set up to handle this correctly via the `baseUrl` property in the `pom.xml` profiles. The Selenide `open("/")` command would then automatically use the correct base URL for the selected environment.

## How to Run Tests

You can run the tests from the command line using Maven.

### Run with the default (desktop Chrome) profile:

```sh
mvn clean test
```

### Run with the mobile viewport (iPhone 15) profile:

This command activates the `viewport` profile defined in the `pom.xml`.

```sh
mvn clean test -P viewport
```