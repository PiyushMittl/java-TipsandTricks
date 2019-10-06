***Question 1:***  
differenece between @Entity and @Table  
***Answer:***  

***Question 2:***   
Types of cache in Hibernate.  
***Answer:***   
 

1. Embedded Object (when data member is not an Entity, have some idea to save simple object and Collection(List) of such objects)  
2. Mapping (When data member is of type Entity, have some idea to save simple object and (Collection)List of such objects)  
    a. one to one  
    b. one to many  
    c. many to one  
3. Inheritance  
    a. single table strategy  
    b. table per class strategy  
    c. join table strategy  
  
Embedded object  
1. Address object (address is not an Entity)
2. List<Address> (when address is not an Entity and we have to save list of Address)
  




