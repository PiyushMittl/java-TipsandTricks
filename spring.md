[blog](https://github.com/PiyushMittl/spring-framework-bloglinks)  

***Question 1:***  
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
 * Bean life cycle in Spring Bean Factory Container is as follows:

 * The Spring container instantiates the bean from the bean’s definition in the XML file.  

 * Spring populates all of the properties using the dependency injection, as specified in the bean definition (getters and seters).  

 * The factory calls setBeanName() by passing the bean’s ID if the bean implements the BeanNameAware interface.  

 * The factory calls setBeanFactory() by passing an instance of itself if the bean implements the BeanFactoryAware interface.  

 * preProcessBeforeInitialization() methods are called if there are any BeanPostProcessors associated with the bean.  

 * If an init-method is specified for the bean, then it will be called.  

 * Finally, postProcessAfterInitialization() methods will be called if there are any BeanPostProcessors associated with the bean.  

Ref: 
https://www.concretepage.com/spring/spring-bean-life-cycle-tutorial


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

***Question 19:***  
What is the Bean life cycle in Spring Bean Factory Container?  
***Answer***  
Bean life cycle in Spring Bean Factory Container is as follows:
  
The Spring container instantiates the bean from the bean’s definition in the XML file.  
Spring populates all of the properties using the dependency injection, as specified in the bean definition.  
The factory calls setBeanName() by passing the bean’s ID, if the bean implements the BeanNameAware interface.  
The factory calls setBeanFactory() by passing an instance of itself, if the bean implements the BeanFactoryAware interface.  
preProcessBeforeInitialization() methods are called if there are any BeanPostProcessors associated with the bean.    
If an init-method is specified for the bean, then it will be called.  
Finally, postProcessAfterInitialization() methods will be called if there are any BeanPostProcessors associated with the bean.   

  
***Question***  
Explain inner beans in Spring.  
***Answer***  
A bean can be declared as an inner bean only when it is used as a property of another bean. For defining a bean, the Spring’s XML based configuration metadata provides the use of <bean> element inside the <property> or <constructor-arg>. Inner beans are always anonymous and they are always scoped as prototypes. For example, let’s say we have one Student class having reference of Person class. Here we will be creating only one instance of Person class and use it inside Student.  
  
Here’s a Student class followed by bean configuration file:

Student.java
``` java
public class Student
{
private Person person;
//Setters and Getters
}
public class Person
{
private String name;
private String address;
//Setters and Getters
}
```

studentbean.xml  

```
<bean id=“StudentBean" class="com.edureka.Student">
<property name="person">
<!--This is inner bean -->
<bean class="com.edureka.Person">
<property name="name" value=“Scott"></property>
<property name="address" value=“Bangalore"></property>
</bean>
</property>
</bean>  
```

***Question 8:***  
List out the different scopes of Bean  
***Answer:***  
```
(i) Singleton: throughout the spring context only one instance is created.
(ii) Prototype: a new bean is created whenever requested.
(iii) Request: Every HTTP Request creates a bean.
(iv) Session: A bean for every HTTP Session.  
() Global Session: 
```

***Question 9:***  
List out the types of Dependency Injection  
***Answer:***  


***Question 10:***  
Types of Spring context and difference between them.   
***Answer***  
**BeanFactory:** BeanFactory is like a factory class that contains a collection of beans. It instantiates the bean whenever asked for by clients.  
**ApplicationContext:** The ApplicationContext interface is built on top of the BeanFactory interface. It provides some extra functionality on top BeanFactory.   

***Question11:*** 
What do you understand by auto wiring and name the different modes of it?  
***Answer:***
The Spring container is able to autowire relationships between the collaborating beans. That is, it is possible to let Spring resolve collaborators for your bean automatically by inspecting the contents of the BeanFactory.  
Different modes of bean auto-wiring are:  
no: This is default setting which means no autowiring. Explicit bean reference should be used for wiring.  
byName: It injects the object dependency according to name of the bean. It matches and wires its properties with the beans defined by the same names in the XML file.  
byType: It injects the object dependency according to type. It matches and wires a property if its type matches with exactly one of the beans name in XML file.  
constructor: It injects the dependency by calling the constructor of the class. It has a large number of parameters.  
autodetect: First the container tries to wire using autowire by constructor, if it can’t then it tries to autowire by byType.  



[Spring interview question](https://www.edureka.co/blog/interview-questions/spring-interview-questions/)






# Spring Boot #
***Question 1:***  
what is @Springbootapplication annotation.  
***Answer:***   
(Enable ACC)  
A single @SpringBootApplication annotation can be used to enable those three features, that is:  
  
@EnableAutoConfiguration: enable Spring Boot’s auto-configuration mechanism  
@ComponentScan: enable @Component scan on the package where the application is located (see the best practices)  
@Configuration: allow to register extra beans in the context or import additional configuration classes   
  
