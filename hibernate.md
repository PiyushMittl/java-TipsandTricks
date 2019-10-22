
***Question 6:***   
what is **"CascadeType.ALL"** in mapping.  
***Answer:***   
***Question 1:***  
differenece between @Entity and @Table  
***Answer:***  

***Question 2:***   
Types of cache in Hibernate.  
***Answer:***   

***Question 3:***   
what is **Discriminator** in inheritance in hibernate  
***Answer:***   

***Question 5:***   
what is **"FetchType.LAZY"** in mapping.  
***Answer:***   

***Question 7:***   
Difference between **@ Embedded** annotation technique and **@OneToOne** annotation Technique  
***Answer:***   
There are two types of objects in Hibernate  
1. Value Object  
2. Entities  
  
**Value Objects** are the objects which can not stand alone. Take `Address`, for example. If you say address, people will ask whose address is this. So it can not stand alone.
**Entity Objects** are those who can stand alone like `College` and `Student`.   
So in case of value objects preferred way is to Embed them into an entity object.   
To answer why we are creating two different classes: first of all, it's a OOPS concept that you should have loose coupling and high cohesion among classes. That means you should create classes for specialized purpose only. For example, your `Student` class should only have the info related to `Student`.  
Second point is that by creating different classes you promote re-usability.  
**When we define the value object for the entity class we use @Embeddable.**  
**When we use value type object in entity class we use @Embedded**  

So, a thumb rule is,   
If reuse -> @OneToOne,  
If no reuse -> @Embeddable  

-----------------------
topics:  
1. Saving object
    a. create an object of SessionFactory   
    b. open an Session  
    c. save an object  
    
1. Embeded objects(when entity is saving(having data member as) sub objects)    
2. Mapping (when entity is saving(having data member as) sub entities)   
    a. one to one  
    b. one to many  
    c. many to one  
3. Inheritance (when entity is inheriting an entity)
    a. single table strategy  
    b. table per class strategy  
    c. join table strategy  
4. [Caching](https://github.com/PiyushMittl/hibernate-framework-bloglinks/blob/master/Caching.pdf)  
    a. level one  
    b. level two  
    
    
    
    
**have a look:**  
[blog](https://github.com/PiyushMittl/hibernate-framework-bloglinks)    
[mapping](https://dzone.com/articles/hibernate-mapping)  

**Embedded objects class User with data member:**
1. ArrayList<String>  
2. ArrayList<Address> - called embedded objects iff Address is not an Entity  
3. Address (Address is not an Entity) - called embedded object  
4. Address home, Address office (where address is not ant Entity. its an Embedded object and we have two such objects then how would a table structure be) - called embedded object  
5. Vehicle (its an Entity one object only) - often called one to one mapping  
6. ArrayList<Vehicle> - called one to many mapping  

----
1. @Embedded  
2. @Embeddeble  
3. @Entity  
4. @ElementCollection  
5. @CollectionId  
----  
1. @Entity  
2. @Table(name="parent")   
3. @Id  
4. @GenericGenerator(name="increment",strategy="org.hibernate.id.IncrementGenerator")  
5. @GeneratedValue(generator="inrement")  
4. @Iheritance(strategy=Inheritance.JOINED) OR @Iheritance(strategy=Inheritance.SINGLE_TABLE) OR Iheritance(strategy=Inheritance.TABLE_PER_CLASS)  
6. @DiscriminatorValue("child1")
----
1. 

