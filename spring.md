Haan***Question 1:***  
what is `@Qualifier` annotation.  
***Answer:***  

***Question 2:***  
what is propogation in Spring.  
***Answer:***  

***Question 3:***  
It happens when a bean A depends on another bean B, and the bean B depends on the bean A as well:  
`Bean A → Bean B → Bean A`
Of course, we could have more beans implied:  
`Bean A → Bean B → Bean C → Bean D → Bean E → Bean A`
***Answer:***  
https://stackoverflow.com/questions/3485347/circular-dependency-in-spring
https://www.baeldung.com/circular-dependencies-in-spring


***Question 4:***  
what is proxy in Spring.  
***Answer:***  
spring


***Question 5:***  
Types of bean scopes in Spring.  
***Answer:***  



***Question 6:***  
bean lifecycle.  
***Answer:***  

***Question 7:***
How many modules are there in Spring Framework and what are they?  
***Answer:***  
There are around 20 modules which are generalized into Core Container, Data Access/Integration, Web, AOP (Aspect Oriented Programming), Instrumentation and Test.

Spring Core Container – This layer is basically the core of Spring Framework. It contains the following modules :
Spring Core
Spring Bean
SpEL (Spring Expression Language)
Spring Context 

Data Access/Integration – This layer provides support to interact with the database. It contains the following modules :
JDBC (Java DataBase Connectivity)
ORM (Object Relational Mapping)
OXM (Object XML Mappers)
JMS (Java Messaging Service)

Transaction
Web – This layer provides support to create web application. It contains the following modules :
Web
Web – MVC
Web – Socket
Web – Portlet

Aspect Oriented Programming (AOP) – In this layer you can use Advices, Pointcuts etc., to decouple the code.

Instrumentation – This layer provides support to class instrumentation and classloader implementations.

Test – This layer provides support to testing with JUnit and TestNG.

Few Miscellaneous modules are given below:

Messaging – This module provides support for STOMP. It also supports an annotation programming model that is used for routing and processing STOMP messages from WebSocket clients.
Aspects – This module provides support to integration with AspectJ.

# Spring Boot #
***Question 1:***  
what is @Springbootapplication annotation.  
***Answer:***   
A single @SpringBootApplication annotation can be used to enable those three features, that is:

@EnableAutoConfiguration: enable Spring Boot’s auto-configuration mechanism
@ComponentScan: enable @Component scan on the package where the application is located (see the best practices)
@Configuration: allow to register extra beans in the context or import additional configuration classes
