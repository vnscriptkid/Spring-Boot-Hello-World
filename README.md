1. SETUP

- Spring Initializr: https://start.spring.io/
- mvn spring-boot:run -> Run Tomcat server
- http://localhost:8080/hello

2. Observations

- @SpringBootApplication

  - @Configuration
  - @EnableAutoConfiguration
  - @EnableWebMvc -> DispatcherServlet
  - @ComponentScan

- .classpath ?
- pom.xml

  - dependencies
    > spring-boot-starter-web is needed to use @RequestMapping

- Controller vs RestController
  > @RestController = @Controller + @ResponseBody
  - When to use?
    > Controller: render template
    > Send data dirrectly to client
- Servlet
  - @ServletComponentScan
    > scan for @WebServlet
  - @Bean
    > Register Servlet, Fitler, Listener with @Bean
- Servlet vs Controlller ?
- Filter

  - pre-process || post-process requests (~middleware ?!?)
    > validate, encrypt/decrypt, log
  - @WebFilter(filterName="hello", urlPatterns="/hello")
  - implements Filter -> doFilter()
  - filterChain.doFilter() -> next()

- Listener

  - listen for events

- Why @Overwrite, what if it's not included?
- Spring IoC container

  - Dependency Injection
  - 2 types of containers:
    - BeanFactory
    - ApplicationContext

- Template engines:

  - Freemarker
  - Thymeleaf
    - 3 Scopes
      > request
      > request.getSession()
      > request.getSession().getServletContext()

- Error handling

  - resources/templates/error.html
  - @ExceptionHandler
    > Handle differently for different exceptions caught
    > Put inside controllers
  - @ControllerAdvice + @ExceptionHandler:
    > exceptions/GlobalExceptionHandler

- Web Socket

  - STOMP
  - In Spring Boot
    - WebSocketConfig
    - Message
    - Message Wrapper
    - Message Controller
    - Browser Client
  - Message Broker
  - Message Scheduler

- Form Validation
  - javax.validation.constraints
  - Set up a model for form with getters, setters
