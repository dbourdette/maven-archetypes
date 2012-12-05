h1. Maven archetypes

Fast project bootstrap with some maven archetypes.
See all archetypes below for details. 

Archetypes are built using online doc about "maven archtype plugin":http://maven.apache.org/archetype/maven-archetype-plugin/
See doc about "archetype descriptor":http://maven.apache.org/archetype/archetype-models/archetype-descriptor/archetype-descriptor.html

h2. installing

This will install all artefacts in local repository.

```
$ git clone git@github.com:dbourdette/maven-archetypes.git
$ cd maven-archetypes
$ mvn install
```

h2. archetype : spring-mvc

This will create a web app based on spring mvc 3.x

h3. usage

```
$ mvn archetype:generate -DarchetypeGroupId=com.github.dbourdette.maven-archetypes -DarchetypeArtifactId=spring-mvc -DarchetypeVersion=1.0.0-SNAPSHOT
```

h3. contents

```
acme/
├── pom.xml
└── src
    └── main
        ├── java
        │   └── acme
        │       └── web
        │           └── IndexController.java
        └── webapp
            └── WEB-INF
                ├── jsp
                │   └── index.jsp
                ├── spring-context.xml
                ├── spring-servlet.xml
                └── web.xml
```

h3. testing generated project

simply run 

<pre>mvn tomcat:run```

h2. archetype : spring-gwt

This will create a web app with gwt using spring for rpc services

h3. usage

```
$ mvn archetype:generate -DarchetypeGroupId=com.github.dbourdette.maven-archetypes -DarchetypeArtifactId=spring-gwt -DarchetypeVersion=1.0.0-SNAPSHOT
```

h3. contents

```
acme
├── pom.xml
└── src
    └── main
        ├── java
        │   └── acme
        │       └── gwt
        │           ├── Application.gwt.xml
        │           ├── client
        │           │   ├── Application.java
        │           │   └── service
        │           │       ├── ApplicationService.java
        │           │       └── ApplicationServiceAsync.java
        │           └── server
        │               └── service
        │                   └── ApplicationServiceImpl.java
        └── webapp
            ├── WEB-INF
            │   ├── spring-context.xml
            │   └── web.xml
            └── index.html
```

It's pretty easy to add new services by adding correct classes in client and server packages.

We are using "gwtrpc-spring":http://code.google.com/p/gwtrpc-spring/ but probably "spring4gwt":http://code.google.com/p/spring4gwt/ can be used too.

h3. testing generated project

simply run ```mvn gwt:run```

gwt plugin uses a jetty server running on 8080.
Index page should be available with hosted mode on http://127.0.0.1:8888/index.html?gwt.codesvr=127.0.0.1:9997

Gwt hosted mode uses a plugin for web browser (use "missing plugin page":http://gwt.google.com/samples/MissingPlugin/MissingPlugin.html)

h3. more info

see "gwt doc":https://developers.google.com/web-toolkit/ and "maven gwt plugin doc":http://mojo.codehaus.org/gwt-maven-plugin/