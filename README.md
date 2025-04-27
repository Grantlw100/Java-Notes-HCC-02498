# Java Programming Notes 
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)

## Create a new Maven Project For assignment with tests 
```shell
./create-maven.ps1
```
## Description
This repository encapsulates the collection of notes and projects from Professor Fiskey's 02498 HCC Java Programming Course. This public repository may include MarkDown files with widely used sentences and copyrighted material due to my personal note taking tactics. 
## Table of Contents
* [Installation](#installation)
* [Usage](#usage)
* [Credits](#credits)
* [License](#license)
* [Contributing](#contributing)
* [Questions](#questions)

## Installation
To review material stored within this GitHub repoistory or to copy it down to your local machine: utlize GitHubs built in repository downloading feature placed within the green [CODE] box with a downward arrow. Use the copy element from the dropdown to copy to your local machine an unlinked repository. 

## Usage
The use of this repository and any informaiton held within is for my personal development. 

## Credits
Credit goes to Professor Francis Fiskey, Hillsborough Community College, Veterans Affairs (for providing the funding for my education), CodeAcademy for supplementary information and consistent daily guided practice/ information, and the course textbook for the vast majority of source material.

## License
This project is licensed under the MIT license.
<https://opensource.org/licenses/MIT>

## Contributing
To contribute to this repository, for whatever reason you may want to contribute, reach out to me personally using the email located on my main profile page. 

## Questions
If you have any questions, please feel free to reach out to me at my email <Grant.L.Williams@outlook.com>.<br>You can also check out my GitHub profile at [GrantLW100](GrantLW100).


## TODO

- turn java-notes/ into a multi-module Maven project
- make each module folder a maven folder
- assignmentUtils as shared dependency

java-notes/
├── pom.xml                   <-- Parent POM
├── utils/        <-- Shared utility library
│   └── pom.xml
│   └── ErrorHandling/
│       └── Main/ErrorHandling.java
│       └── Test/TestErrorHandling.java
│   └── Prompts/
│       └── Main/Prompts.java
│       └── Test/TestPrompts.java
├── module-1-basic-syntax/
│   └── assignment1_2/
│       └── Main/Assignment1_2.java
│       └── Test/TestAssignment1_2.java
│   └── assignment1_3/
│       └── Main/Assignment1_3.java
│       └── Test/TestAssignment1_3.java
│   └── pom.xml
│   └── moduleNotes.md/
├── module-2-collections/
│   └── assignment2_1/
│       └── Main/Assignment2_1.java
│       └── Test/TestAssignment2_1.java
│   └── assignment2_4/
│       └── Main/Assignment2_4.java
│       └── Test/TestAssignment2_4.java
│   └── pom.xml
│   └── assets/
├── module-3-oop/
│   └── assignment3_1/
│       └── Main/Assignment3_1.java
│       └── Test/TestAssignment3_1.java
│   └── pom.xml
│   └── Notes.md
├── Notes.md

...


java-notes/
├── (current Java-Notes directory)     
│   └── pom.xml
│   └── ...
├── Advanced     
│   └── pom.xml
│   └── ...
├── Management     
│   └── pom.xml
│   └── ...
├── ...

