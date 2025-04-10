param (
    [string]$assignmentNumber = $(Read-Host "Enter assignment number")
)

$projectName = "assignment$assignmentNumber"
$groupId = "com.assignment"

Write-Output "Creating Maven project: $projectName..."

# Step 1: Generate the project with the default archetype
mvn archetype:generate `
    "-DgroupId=$groupId" `
    "-DartifactId=$projectName" `
    "-DarchetypeArtifactId=maven-archetype-quickstart" `
    "-DinteractiveMode=false"

Write-Output "Maven project $projectName created successfully!"

# Step 2: Remove the default JUnit 3 test file (AppTest.java) 
# to avoid JUnit 3 imports
Remove-Item "$projectName\src\test\java\com\assignment\AppTest.java" -ErrorAction SilentlyContinue

# Step 3: Inject JUnit 5 dependencies into the pom.xml
Write-Output "Adding JUnit 5 dependencies to pom.xml"
# 3a. Read pom.xml
$pom = Get-Content "$projectName\pom.xml"

# 3b. Insert JUnit 5 dependencies right before the closing </project> tag
$junit5Dependencies = @'
    <dependencies>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-api</artifactId>
            <version>5.8.1</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-engine</artifactId>
            <version>5.8.1</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-params</artifactId>
            <version>5.8.1</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
'@

# 3c. Insert that block (naive approach: right before </project>)
$pomUpdated = $pom -replace "(?i)</project>","$junit5Dependencies`r`n</project>"

# 3d. Write the updated content back
$pomUpdated | Set-Content "$projectName\pom.xml"

# Step 4: Create a new JUnit 5 test file (optional).
$newTest = @'
package com.assignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void sampleTest() {
        assertEquals(2, 1+1, "1+1 should be 2");
    }
}
'@

# Create folder if not exists
New-Item -ItemType Directory "$projectName\src\test\java\com\assignment" -Force | Out-Null
$newTest | Out-File "$projectName\src\test\java\com\assignment\AppTest.java"

Write-Output "JUnit 5 setup complete!"
Write-Output "You can now 'cd $projectName' and run 'mvn test' to confirm."
Write-Output "DO NOT FORGET TO REMOVE JUNIT 3 DEPENDENCIES IF THEY EXIST!"