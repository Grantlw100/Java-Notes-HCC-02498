# Intro to Java Build Tool development

## Maven
Maven is yiddish for accumulator of knowledge. 

Maven is designed to 
- make the build process easier
- provide a uniform build system
- provide quality project information
- provide guidelines for best practices development


## What is Maven?
Maven is similar in some ways to JavaScripts Node Package Manager (NPM). It is a build automation tool that is used primarily for Java projects. Maven is used to manage the build process, reporting, and documentation from a central piece of information.

Maven, reportedly, is the industry standard for Java development and makes the process of building and managing Java projects easier.

## Downloading Maven for Windows 

### System requirements 
- Java Development Kit (JDK) version 1.7 or above
    - check what version of the jdk is installed using java -version
- Disk space: 10MB for the Maven archive, 10MB for the Maven installation, and 10MB for the local repository
- Memory: 64MB RAM for the Maven process

### Download and setup Maven from binary ZIP 

Pior to downloading the Maven zip file, make sure to [check the zip](https://www.apache.org/info/verification.html) files signature against the Apache Maven KEYS file.

Download the Maven zip file from the [Maven Download](https://maven.apache.org/download.cgi) page. The proper zip file to download is the `Binary zip archive`.

### Adding Maven to the PATH
Extract the recently downloaded ZIP file from the machines download directory to the program files directory.
- `C:\Program Files\Apache\Maven\apache-maven-*.*.*\bin`
    - In my case, the exact path had to be created to properly reference Maven in the PATH.

Check to see if Maven is properly installed by running the command `mvn -v` in the command prompt.

**Example Output**
```shell
Apache Maven 3.9.9 (8e8579a9e76f7d015ee5ec7bfcdc97d260186937)
Maven home: C:\Program Files\Apache\Maven\apache-maven-3.9.9
Java version: 22.0.1, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk-22
Default locale: en_US, platform encoding: UTF-8
OS name: "windows 11", version: "10.0", arch: "amd64", family: "windows"
```

## Maven Project Structure

### Creating a project 
Create a new project from the command line. Navigate to or create a project directory. Once there execute the command: 
```shell 
mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.5 -DinteractiveMode=false
```
- The archetype:generate command is used to create a new project from a template.

**Important Note** If this is the first time Maven has been ran on the machine it may take a while to download the most recent artifacts (plugins, dependencies, etc) into the local repository.
- The command may have to be repeated if the download is interrupted. The remote server may time out before the download is complete.

The command above will create a new directory called `my-app` in the current directory. The directory will contain the following files and directories:
my-app
|-- pom.xml
`-- src
    |-- main
    |   `-- java
    |       `-- com
    |           `-- mycompany
    |               `-- app
    |                   `-- App.java
    `-- test
        `-- java
            `-- com
                `-- mycompany
                    `-- app
                        `-- AppTest.java

- the src/main/java directory contains the project source code
- the src/test/java directory contains the test source code
- the pom.xml file is the projects Project Object Model file. It is the projects configuration file.

### Project Object Model (POM)
The core of a projects configuration in Maven. It is an XML file that contains information about the project and configuration details used by Maven to build the project.
-(similar to the package.json file in a Node.js project)

The POM file contains information about the project and various configuration details used by Maven to build the project. It contains configuration information about the project, the dependencies, plugins, goals, build profiles, and so on.

### Build the Project 
`mvn package` - This command will compile the source code, run the tests, package the compiled code into a JAR file, and install the JAR file in the local repository.

### Test the Compiled and Packaged Code
`java -cp target/my-app-1.0-SNAPSHOT.jar com.mycompany.app.App` - This command will run the compiled code in the JAR file.

### Running Maven Tools 

#### Maven phases 
Maven projects have a very common build lifecycle. The default lifecycle has the following phases:
- **validate** - validate the project is correct and all necessary information is available
- **compile** - compile the source code of the project
- **test** - test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
- **package** - take the compiled code and package it in its distributable format, such as a JAR.
- **verify** - run any checks on results of integration tests to ensure quality criteria are met
- **install** - install the package into the local repository, for use as a dependency in other projects locally
- **deploy** - done in an integration or release environment, copies the final package to the remote repository for sharing with other developers and projects.

Two other important Maven LifeCycles of note are the `clean` and `site` lifecycles. 
- The `clean` lifecycle is used to clean up the project and remove all files generated by the previous build. 
- The `site` lifecycle is used to create a project's documentation.

### Maven Project Initialization
`mvn archetype:generate` - This command is used to create a new project from a template.

The process of creating a new project from a template is interactive. The user will be prompted to enter information about the project. 

The archetype used in my README.md is dated and requires that the developer remove and update the JUnit dependency in the POM file.

### maven command line commands 

- `mvn archetype:generate` - create a new project from a template
- `mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.5 -DinteractiveMode=false` 
- create a new project from a template with the specified group ID, artifact ID, and archetype version. The `-DinteractiveMode=false` flag is used to skip the interactive prompts.
- `mvn clean` - clean up the project and remove all files generated by the previous build
- `mvn compile` - compile the source code of the project
- `mvn test` - test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
- `mvn package` - take the compiled code and package it in its distributable format, such as a JAR.
- `mvn verify` - run any checks on results of integration tests to ensure quality criteria are met
- `mvn install` - install the package into the local repository, for use as a dependency in other projects locally
- `mvn deploy` - done in an integration or release environment, copies the final package to the remote repository for sharing with other developers and projects.
- `mvn site` - create a project's documentation
- mvn run - run the project

## Java-Notes MVN Build 

### Standards in Phases

Phases include:
- []()
- ...

### PHASE I: Standard Maven Project Layout and Naming 
