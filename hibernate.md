***Question 1:***  
differenece between @Entity and @Table  
***Answer:***  

***Question 2:***   
Types of cache in Hibernate.  
***Answer:***   

topics:  
1. Saving object
    a. create an object of SessionFactory   
    b. open an Session  
    c. save an object  
    
1. Embeded objects(when entity is saving sub objects)    
2. Mapping (when entity is saving sub entities)   
    a. one to one  
    b. one to many  
    c. many to one  
3. Inheritance (when entity is inheriting an entity)
    a. single table strategy  
    b. table per class strategy  
    c. join table strategy  
4. Caching  
    a. level one  
    b. level two  
    
    
    
    
**have a look:**  
[blog](https://github.com/PiyushMittl/hibernate-framework-bloglinks)    

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



