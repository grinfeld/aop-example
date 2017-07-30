AOP
----------------

Aspect Oriented Programming

see more at https://docs.spring.io/spring/docs/current/spring-framework-reference/html/aop.html

1. it works only for objects which come via Spring Context (i.e. @Autowired)
2. every Aspect class should be annotated witb @Aspect and @Component (or @Service and etc)
3. too common definition of method/class/package for @Before, @After and others will cause exception:
 Caused by: java.lang.IllegalArgumentException: Cannot subclass final class org.springframework.boot.autoconfigure.AutoConfigurationPackages$BasePackages
 
 Spring Aspect uses proxies and trying to create proxy for class with methods suitable to aspect expression. If aspect expression suitable to final method
 in class (and there are few such methods inherited from Object), it tries to "implement/generate" them and throws exception (I am not sure it's a real reason, 
 should search more about this, but exception is thrown during start-up for sure)
 
4. expressions could be combined, i.e. @annotation and execution
 
 
 