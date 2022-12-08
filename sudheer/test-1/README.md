# test-1
[Atlanta Clinical and Translational Science Institute (ACTSI)](http://www.actsi.org), [Emory University](http://www.emory.edu), Atlanta, GA

Write a description here

Latest release: [![Latest release](https://maven-badges.herokuapp.com/maven-central/test1/test-1/badge.svg)](https://maven-badges.herokuapp.com/maven-central/test1/test-1)

No final releases yet

* [Oracle Java JDK 8](http://www.oracle.com/technetwork/java/javase/overview/index.html)
* [Maven 3.2.5 or greater](https://maven.apache.org)

* [Oracle Java JRE 8](http://www.oracle.com/technetwork/java/javase/overview/index.html)
* [Tomcat 7](https://tomcat.apache.org)
* Also running
  * The [test 1](https://github.com/eurekaclinical/test 1) war
  * The [cas-server](https://github.com/eurekaclinical/cas) war

You can call all of [test 1](https://github.com/eurekaclinical/test 1)'s REST APIs through the proxy. Replace `/protected/api` with `/proxy-resource`. The point of doing this is for web clients -- you can deploy the webapp on the same server as web client, and deploy the service on a separate server.

The project uses the maven build tool. Typically, you build it by invoking `mvn clean install` at the command line. For simple file changes, not additions or deletions, you can usually use `mvn install`. See https://github.com/eurekaclinical/dev-wiki/wiki/Building-Eureka!-Clinical-projects for more details.

You can run this project in an embedded tomcat by executing `mvn tomcat7:run -Ptomcat` after you have built it. It will be accessible in your web browser at https://localhost:8443/test-1/. Your username will be `superuser`.

This webapp is configured using a properties file located at `/etc/tp/application.properties`. It supports the following properties:
* `test project.callbackserver` = https://hostname:port
* `test project.url` = https://hostname.of.service:port/test 1
* `test project.url` = https://hostname:port/test-1
* `cas.url`=https://hostname.of.casserver:port/cas-server

A Tomcat restart is required to detect any changes to the configuration file.

1) Stop Tomcat.
2) Remove any old copies of the unpacked war from Tomcat's webapps directory.
3) Copy the warfile into the tomcat webapps directory, renaming it to remove the version. For example, rename `test-1-1.0.war` to `test-1.war`.
4) Start Tomcat.

```
<dependency>
    <groupId>test1</groupId>
    <artifactId>test-1</artifactId>
    <version>1.0</version>
</dependency>
```

* [Javadoc for latest development release](http://javadoc.io/doc/test1/test-1) [![Javadocs](http://javadoc.io/badge/test1/test-1.svg)](http://javadoc.io/doc/test1/test-1)

Feel free to contact us at help@eurekaclinical.org.

