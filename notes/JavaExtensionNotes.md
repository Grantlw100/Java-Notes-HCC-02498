# Notes on the Java Project Extension 

Designed to help manage Java projects and their dependencies, the Java Project Extension is a powerful tool that can be used to create, build, and run Java projects. 

The extension provides a number of features that make it easy to work with Java projects, including the ability to create new projects, add dependencies, and run tests. In this guide, we'll take a look at some of the key features of the Java Project Extension and how you can use them to manage your Java projects.

## Java Project Extension
Java project view is displayed below the explorer vieew. 

### Creating a New Java Project
Create a new project by uding the `+` symbol in the Java project task bar. 

Alternatively use the Java: Create Java Project command from the command palette.

### Importing an Existing Java Project
Import an existing project by using the Java: Import Java Project command from the command palette.

Alterntaviely,find the source file and directory (must include the build tool scripts like the `pom.xml` or `build.gradle` file) and open the directory in VS Code.

### Adding Dependencies
Add dependencies to your project by using the Java: Add Library command from the command palette.

Alternatively, open the `pom.xml` or `build.gradle` file and add the dependencies manually.

### Dependency Management 
For unmanaged projects without any build tools, manage the dependencies by clicking the + icon or the - icon on the referenced libraries node or the items under it and drag dependencies to the `referenced libraries` node.
- important for the `JUnit 5` stand alone jar file.

By default, vs code will reference all JAR files in workspaces lib diretory using the glob pattern `lib/**/*.jar`.

**EXCLUDE** libraries by expanding the `java.project.referencedLibraries` setting in the settings.json file.
- use the include/exclude fields and add an exclude glob or field pattern to exclude the libraries.

**Example** 
```json
"java.project.referencedLibraries": {
    "include": [
        "lib/**/*.jar"
    ],
    "exclude": [
        "**/junit-4.12.jar"
    ]
}
```

### Attach Source Jars 
Default a referenced {binary}.jar file will try looking for a {binary}-sources.jar file in the same directory and attach it as a source jar if found. 

Manually specify a JAR file as a source attachement by providing a key-value map in the source fields 

## VSCode Settings.json 
There is a setting java.project.referencedLibraries that can be used to configure the referenced libraries in vscode settings.json. 

### Include libraries 
The libraries to reference are described using a set of glob patterns. 
**glob patterns** are a way to specify sets of files and directories.


## Configure classpath for unmanaged folders 
Add unmanaged folders to the classpath by using the Java: Configure Classpath command from the command palette.

**classpath** is a parameter in the Java Virtual Machine or the Java compiler that specifies the location of user-defined classes and packages.

configuring the classpath allows a developer to specify the location of user-defined classes and packages, which are not part of the Java standard library.


