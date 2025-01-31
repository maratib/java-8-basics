## Getting Started

### Verify Installation

```bash
mvn -v
```

## Create a New Maven Project

### Create a Simple Project

```bash
mvn archetype:generate -DgroupId=com.example -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

### Generate from Archetype Catalog

```bash
mvn archetype:generate
```

## Build Lifecycle Commands

### Compile Source Code

```bash
mvn compile
```

### Package Project

```bash
mvn package
```

### Run Unit Tests

```bash
mvn test
```

### Clean Build Artifacts

```bash
mvn clean
```

### Execute a Full Build (Clean, Compile, Test, Package)

```bash
mvn clean package
```

### Install Package to Local Repository

```bash
mvn install
```

### Deploy to Remote Repository

```bash
mvn deploy
```

## Dependency Management

### Add a Dependency

Edit `pom.xml` and add:

```xml
<dependency>
    <groupId>group.id</groupId>
    <artifactId>artifact-id</artifactId>
    <version>1.0</version>
</dependency>
```

### Download Dependencies

```bash
mvn dependency:resolve
```

### Display Dependency Tree

```bash
mvn dependency:tree
```

### Analyze Dependency Conflicts

```bash
mvn dependency:analyze
```

## Running Applications

### Run a Java Application

```bash
mvn exec:java -Dexec.mainClass="com.example.Main"
```

### Run Spring Boot Application

```bash
mvn spring-boot:run
```

## Plugin Management

### List Plugins

```bash
mvn help:effective-pom
```

### Add a Plugin

Edit `pom.xml` and add:

```xml
<plugin>
    <groupId>group.id</groupId>
    <artifactId>artifact-id</artifactId>
    <version>1.0</version>
</plugin>
```

## Profiles

### List Available Profiles

```bash
mvn help:active-profiles
```

### Use a Specific Profile

```bash
mvn clean install -Pprofile-name
```

## Maven Goals and Phases

### List Lifecycle Phases

```bash
mvn help:describe -Dcmd=validate
```

### Skip Tests

```bash
mvn clean install -DskipTests
```

### Run Only Specific Test

```bash
mvn test -Dtest=TestClassName
```

## Debugging and Help

### Debug Maven Commands

```bash
mvn -X <goal>
```

### Show Help for a Command

```bash
mvn help:describe -Dcmd=<command>
```

## Common Maven Flags

| Flag               | Description                        |
| ------------------ | ---------------------------------- |
| `-Dproperty=value` | Set a system property              |
| `-Pprofile`        | Activate a specific profile        |
| `-T threadCount`   | Run in parallel with threadCount   |
| `-X`               | Enable debug output                |
| `-U`               | Force update of snapshots/releases |

## Repository Management

### Force Update of Snapshots and Releases

```bash
mvn clean install -U
```

### View Effective POM

```bash
mvn help:effective-pom
```

### View Effective Settings

```bash
mvn help:effective-settings
```

## Working with Multi-Module Projects

### Build Parent and All Modules

```bash
mvn clean install
```

### Build a Specific Module

```bash
mvn clean install -pl module-name
```

### Build Specific Modules Only

```bash
mvn clean install -pl module1,module2 -am
```

### Exclude Specific Modules

```bash
mvn clean install -pl !module-name
```

## Advanced Testing

### Run a Specific Method in a Test Class

```bash
mvn test -Dtest=TestClassName#methodName
```

### Run Tests by Tags (Surefire or Failsafe)

```bash
mvn test -Dgroups="tagName"
```

### Skip Integration Tests

```bash
mvn install -DskipITs
```

## Cleaning Up Local Repository

### Remove Unused Dependencies

```bash
mvn dependency:purge-local-repository
```

## Code Quality and Reporting

### Generate Javadoc

```bash
mvn javadoc:javadoc
```

### Check for Dependency Updates

```bash
mvn versions:display-dependency-updates
```

### Analyze and Report Code Quality

```bash
mvn site
```

### Generate Code Coverage Report

(Add Jacoco plugin to your `pom.xml` first)

```bash
mvn test jacoco:report
```

## Integration with IDEs

### Generate Eclipse Project Files

```bash
mvn eclipse:eclipse
```

### Generate IntelliJ IDEA Project Files

```bash
mvn idea:idea
```

## Debugging and Optimization

### Debug Maven Build Process

```bash
mvnDebug <goal>
```

### Optimize Build with Parallel Execution

```bash
mvn clean install -T 4
```

## Running Custom Goals

### Run a Custom Lifecycle Phase

```bash
mvn lifecycle-phase
```

### Run a Specific Plugin Goal

```bash
mvn plugin:goal
```

## Useful Profiles Examples

### Define a Profile in `pom.xml`

```xml
<profiles>
    <profile>
        <id>dev</id>
        <properties>
            <env>development</env>
        </properties>
    </profile>
</profiles>
```

### Activate a Profile

```bash
mvn clean install -Pdev
```

## Continuous Integration

### Run Without Interruption for CI

```bash
mvn clean install -B
```

### Log Build Output to File

```bash
mvn clean install | tee build.log
```
