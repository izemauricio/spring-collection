# spring-practice
Small j2ee/spring projects for practice using Java SDK 8, Spring 5 framework and Tomcat 9
## spring-one

### inversion of control
- inversion of control and dependency injection
  - spring object factory through xml config file
    - constructor dependency injection
    - setter method dependency injection
    - static value injection
    - value from file injection
### bean life cycle
- scope
  - default singleton scope
    - return the same bean memory reference each time getBean is called
  - prototype
    - alocate new memory for a new bean for each getBean call
    - spring do not call destroy-method when using prototype scope
  - request
  - session
  - global-session
- init and destroy
  - init-method
  - destroy-method

## spring-annotation
- @component("beanId")
- @component for auto id from class name
