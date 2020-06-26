![alt text](https://upload.wikimedia.org/wikipedia/commons/thumb/0/0b/Maven_logo.svg/1024px-Maven_logo.svg.png)

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

**Apache Maven** is a software project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project's build, reporting, and documentation from a central piece of information. Maven is typically used for Java projects.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

**The root pom.xml** (aggregate build) is provided to allow you to run all the example projects at once using a single invocation of Maven. It also drives the continuous integration (CI) build. The root pom.xml does not contain any shared build configuration so that each of the projects can be used independently. This makes the examples suitable as independent references and as a starting point for your own project.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

**The Apache Tomcat® software** is an open source implementation of the Java Servlet, JavaServer Pages, Java Expression Language and Java WebSocket technologies. The Java Servlet, JavaServer Pages, Java Expression Language and Java WebSocket specifications are developed under the Java Community Process.
The Apache Tomcat Project is proud to announce the release of version 9.0.36 of Apache Tomcat. The notable changes compared to 9.0.35 include:

* Add support for ALPN on recent OpenJDK 8 releases.
* Add support for the CATALINA_OUT_CMD environment variable that defines a command to which captured stdout and stderr will be redirected. For use with, for example, rotatelogs. * * Patch provided by Harald Dunkel.
* Be more flexible with respect to the ordering of groups, roles and users in the tomcat-users.xml file

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

**Quick Build**

f you want to bootstrap Maven, you'll need:

* Java 1.8+
* Maven 3.0.5 or later
* Run Maven, specifying a location into which the completed Maven distro should be installed:
* mvn -DdistributionTargetDir="$HOME/app/maven/apache-maven-3.7.x-SNAPSHOT" clean package
