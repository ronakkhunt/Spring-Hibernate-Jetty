
Project containing basic configuration of Spring with Jetty and Hibernate.

* Spring's configuration of `DispatcherServlet` is defined in [web.xml]
* Hibernate configuration is specified in [dispatcher-servlet.xml]
* Example of creating `Controller` handler using **spring** can be found in [UserController.java]
* Example of creating `REST APIs` with **spring** can be found in [RestUserController.java].

[UserController.java]:<https://github.com/ronakkhunt/Spring-Hibernate-Jetty/blob/master/src/main/java/com/spring_jetty/controllers/UserController.java>
[RestUserController.java]: <https://github.com/ronakkhunt/Spring-Hibernate-Jetty/blob/master/src/main/java/com/spring_jetty/rest/controllers/RestUserController.java>
[dispatcher-servlet.xml]: <https://github.com/ronakkhunt/Spring-Hibernate-Jetty/blob/master/src/main/resources/webapp/WEB-INF/dispatcher-servlet.xml>
[web.xml]: <https://github.com/ronakkhunt/Spring-Hibernate-Jetty/blob/master/src/main/resources/webapp/WEB-INF/web.xml>