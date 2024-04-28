# work-sample-alphabetizer
Program that can read in a series of strings and output the strings with the characters in alphabetical order.

## Prerequisites
To run this project, you will need:
- Java 11 or higher
https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html
- Maven 3.6 or higher
https://maven.apache.org/install.html

Ensure that both Java and Maven are correctly installed on your system. You can verify this by running the following commands in your terminal:

```
java -version
mvn -version
```
If these commands do not return version information for Java and Maven, you will need to install them.


## Getting Started
These instructions will get your copy of the project up and running on your local machine for development and testing purposes.

### Cloning the Repository
First, clone the repository to your local machine using the following command:
```
git clone https://github.com/shrushithareddy/work-sample-alphabetizer.git
```

## Building the Project
To build the project, navigate to the directory where the pom.xml file is located and run:
```
mvn clean install
```
## Running the Application
To run the application, you can use the following command:
```
mvn exec:java -Dexec.args="'Your input string here'"
```

## Running the Tests

To execute the unit tests for the project, navigate to the directory where the pom.xml file is located and use:
```
mvn test
```
This will invoke all tests written for the project and provide a report of which tests passed and which failed.


## Using Java Compiler
If you prefer not to use Maven, you can compile the program manually:

1. Navigate to the src directory containing the `.java` files.
2. Compile the code using:
```
javac alphabetizer/Alphabetizer.java
```
3. Run the code using 
```
java -cp . alphabetizer.Alphabetizer "Your Input String here"
```

# Author

Shrushitha Bodanam

## License

This project is licensed under the MIT License - see the LICENSE.md file for details.










