# Getting Started
# http://161.118.208.245:8080/quote

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/3.5.7/gradle-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.5.7/gradle-plugin/packaging-oci-image.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.5.7/reference/web/servlet.html)
* [Thymeleaf](https://docs.spring.io/spring-boot/3.5.7/reference/web/servlet.html#web.servlet.spring-mvc.template-engines)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/3.5.7/reference/actuator/index.html)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

### Additional Commands
* ssh -i "/Users/nishita/IdeaProjects/CDSAssignment/workshop01/ssh-key-2025-10-26.key" opc@161.118.208.245

* sudo firewall-cmd --list-all
* sudo firewall-cmd --add-port=8080/tcp --permanent
* sudo firewall-cmd --reload

#### To check if your application is running 
* sudo netstat -tulnp | grep 8080
* ping 161.118.208.245

#### OCP Commands
* ssh -i "/Users/nishita/IdeaProjects/CDSAssignment/workshop01/ssh-key-2025-10-26.key" opc@161.118.208.245

* scp -i "/Users/nishita/IdeaProjects/CDSAssignment/workshop01/ssh-key-2025-10-26.key" "/Users/nishita/IdeaProjects/CDSAssignment/workshop01/api/build/libs/workshop-0.0.1-SNAPSHOT.jar" opc@161.118.208.245:/home/opc/
