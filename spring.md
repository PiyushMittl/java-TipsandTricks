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



# Spring Boot #
***Question 1:***  
what is @Springbootapplication annotation.  
***Answer:***   
A single @SpringBootApplication annotation can be used to enable those three features, that is:

@EnableAutoConfiguration: enable Spring Boot’s auto-configuration mechanism
@ComponentScan: enable @Component scan on the package where the application is located (see the best practices)
@Configuration: allow to register extra beans in the context or import additional configuration classes
