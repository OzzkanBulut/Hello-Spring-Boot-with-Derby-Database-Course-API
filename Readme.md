This is a simple Spring-Boot project I`ve created just to learn the basics. In this project , there are 2 entities: Topic and Course. Topic is a subject about something
related to programming(Java,C# e.t.c) and Course is a course about that topic. A topic can have more than one course(One to many relationship).To learn the basic methods 
of Spring Boot, there is no external database in this project. I used derby database.

Definitions:
                                      

* What is JPA ? 


  ![Screenshot_1](https://user-images.githubusercontent.com/67637654/197266128-c8360a82-05b9-4ccd-8479-a08d8e99e6f4.png)
  
  JPA stands for Java Persistence API. It is a way to apply ORM. ORM is Object-Relational Mapping.Basically, JPA allows us to convert our entity classes to database 
  tables.Thanks to JPA, we can apply ORM and manage data between java classes/objects and relational database.
  
  
* What is Spring MVC ?



  MVC means Model-View-Controller. It is an architectural pattern that divides the developing logic to 3 parts.Basically, user uses controller, controller manipulates
  model(data),model updates view and user sees view.MVC's main purpose is to seperate a software's business logic and display.
  
  ![1200px-MVC-Process svg](https://user-images.githubusercontent.com/67637654/197272460-fad710ad-e030-4155-b73b-b6b1cb0fccb5.png)

  
* What is @AutoWired ?
  
  It is used for automatic dependency injection.When an object is annotated with @autowired in a class, whenever that class is insantiated, so will the object.
  
  
* What is @RestController ?

  When we annotate a class with @RestController, whatever we return will be converted to JSON format and sent back as HTTP RESPONSE.
  The generated JSON has key names corresponding to property names of the class.The JSON values are the values of those properties.
  
* What is @Entity ? 

  When @Entity is annotated to a class, JPA knows to create a table of that class.For example, if a Topic class with 3 variables is annotated with @Entity, JPA will 
  create a table called Topic and those 3 variables will be columns of that table.
  
* What is @Id ?

  We use @Id to declare a table`s primary key.
  
* What is @RequestMapping(method = RequestMethod.POST, value="/topics") ?

  @RequestMapping makes sure when we make a request to a certain url (in this example the url is "/topics", it maps to an annotated method.
  method = RequestMethod.POST means that we specified the method to work only in POST requests.

* What is @RequestBody ? (public void addTopic(@RequestBody Topic topic))

  Pick this instance from the request body. We passed that JSON as a request body. It tells Spring MVC that my request payload is gonna contain a JSON representation
  of this Topic instance.I am asking to take that request body and convert it into a topic instance and pass it into a addTopic when this url is mapped anyway.
  So I`m gonna get an instance of the topic that is already for me to add to the list.
  
* What is @PathVariable?

  It is used when we need to bound a method parameter to a url.
  
* What is @Service ?

  It is used to define business services.
  
* What is CrudRepository ? 

  It is an interface that handles CRUD(Create,Read,Update,Delete) operations in database. This interface is already in the Spring Data JPA, and whenever we need
  CRUD operations for an entity, all we need to do is create an interface and extend it to the CrudRepository interface.

  


  

  
  
