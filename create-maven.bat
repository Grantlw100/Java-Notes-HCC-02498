@echo off
set /p assignmentNumber="Enter assignment number: "
set projectName=assignment%assignmentNumber%
set groupId=com.assignment

echo Creating Maven project: %projectName%...
mvn archetype:generate -DgroupId=%groupId% -DartifactId=%projectName% -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
echo Maven project %projectName% created successfully!
