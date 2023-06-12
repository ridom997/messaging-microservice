<br />
<div align="center">
<h3 align="center">PRAGMA POWER-UP</h3>
  <p align="center">
    In this challenge you are going to design the backend of a system that centralizes the services and orders of a restaurant chain that has different branches in the city.
  </p>
</div>

### Built With

* ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
* ![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
* ![Gradle](https://img.shields.io/badge/Gradle-02303A.svg?style=for-the-badge&logo=Gradle&logoColor=white)
* ![MySQL](https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white)


<!-- GETTING STARTED -->
## Getting Started

To get a local copy up and running follow these steps.

### Prerequisites

* JDK 17 [https://jdk.java.net/java-se-ri/17](https://jdk.java.net/java-se-ri/17)
* Gradle [https://gradle.org/install/](https://gradle.org/install/)
* Account in twilio.

### Recommended Tools
* IntelliJ Community [https://www.jetbrains.com/idea/download/](https://www.jetbrains.com/idea/download/)
* Postman [https://www.postman.com/downloads/](https://www.postman.com/downloads/)

### Installation

1. Clone the repository
3. Create the follow environment variables (with the values of your twilio)
   1. twilioAccountSID
   2. twilioAuthToken
   3. twilioMessagingServiceSID
   4. twilioRegisteredPhone

<!-- USAGE -->
## Usage

1. Right-click the class MessagingMicroserviceApplication and choose Run
3. start ["foodcourt-microservice"](https://github.com/ridom997/foodcourt-microservice) if the user history indicates it.
4.  Open [http://localhost:8093/swagger-ui/index.html](http://localhost:8093/swagger-ui/index.html) in your web browser
5. Test the endpoints (view guide)

<!-- GUIDE -->
## GUIDE (SPANISH)

### HU14:
+ Se hizo un endpoint "/sms" el cual debe ser consumido estando autenticado como empleado (employee).

## Tests

- Right-click the test folder and choose Run tests with coverage
