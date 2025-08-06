import javax.print.attribute.standard.Copies;

public class Maven {
    //
//1. Standardized Project Structure: Maven enforces a conventional directory layout.12 For example:
//            - `src/main/java`: For application source code.
//            - `src/main/resources`: For application resources (e.g., configuration files).
//            - `src/test/java`: For unit test source code.13
//            - `src/test/resources`: For test resources.
//    - target: Where compiled code, packaged JARs/WARs, and other build artifacts are placed.
    //
//2. Dependency Management: This is one of Maven's killer features.
// Instead of manually downloading JAR files and managing classpaths,
// you simply declare the dependencies in your `pom.xml`. Maven automatically:
//            - Downloads the required JARs from a central repository (like Maven Central).
//            - Resolves transitive dependencies (dependencies of your dependencies). For instance,
//            if your project uses Spring, and Spring relies on Log4j, Maven will automatically download
//            both Spring and Log4j.

    //
//    - `validate`: Validates the project structure.
//            - `compile`: Compiles the source code.
//            - `test`: Runs unit tests.
//    - `package`: Packages the compiled code into a distributable format (e.g., JAR, WAR, EAR).
//            - `install`: Installs the packaged artifact into your local Maven repository for use by other local projects.
//            - deploy: Copies the final package to a remote repository for sharing with other developers or for deployment to servers.
//            - You simply run commands like mvn clean install and Maven takes care of the sequential execution of these phases.

    // Manual Dependency Management ("JAR Hell"):

//    //
//    my-maven-app/
//            ├── pom.xml
//            └── src/
//              ├── main/
//            │   └── java/
//            │       └── com/
//            │           └── example/
//            │               └── App.java
//              └── test/
//                  └── java/
//                      └── com/
//                          └── example/
//                              └── AppTest.java


//    <?xml version="1.0" encoding="UTF-8"?>
//<project xmlns="http://maven.apache.org/POM/4.0.0"
//    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
//    <modelVersion>4.0.0</modelVersion>
//
//    <groupId>com.example</groupId>
//    <artifactId>my-maven-app</artifactId>
//    <version>1.0-SNAPSHOT</version>
//
//    <packaging>jar</packaging>
//
//    <name>My Simple Maven App</name>
//
//    <properties>
//        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
//        <maven.compiler.source>11</maven.compiler.source> <maven.compiler.target>11</maven.compiler.target> </properties>
//
//    <dependencies>
//        <dependency>
//            <groupId>org.junit.jupiter</groupId>
//            <artifactId>junit-jupiter-api</artifactId>
//            <version>5.10.0</version>
//            <scope>test</scope> </dependency>
//        <dependency>
//            <groupId>org.junit.jupiter</groupId>
//            <artifactId>junit-jupiter-engine</artifactId>
//            <version>5.10.0</version>
//            <scope>test</scope>
//        </dependency>
//    </dependencies>
//
//    <build>
//        <plugins>
//            <plugin>
//                <groupId>org.apache.maven.plugins</groupId>
//                <artifactId>maven-jar-plugin</artifactId>
//                <version>3.3.0</version>
//                <configuration>
//                    <archive>
//                        <manifest>
//                            <addClasspath>true</addClasspath>
//                            <mainClass>com.example.App</mainClass> </manifest>
//                    </archive>
//                </configuration>
//            </plugin>
//             <plugin>
//                <groupId>org.apache.maven.plugins</groupId>
//                <artifactId>maven-compiler-plugin</artifactId>
//                <version>3.11.0</version>
//                <configuration>
//    <source>${maven.compiler.source}</source>
//    <target>${maven.compiler.target}</target>
//                </configuration>
//            </plugin>
//        </plugins>
//    </build>
//
//</project>
}
// mvn clean
// mvn compile
// mvn test
// mvn package

// java -jar target/my-maven-app-1.0-SNAPSHOT.jar
// Your local repository is usually located at ~/.m2/repository/ (on Linux/macOS)
// or C:\Users\YourUser\.m2\repository\ (on Windows).