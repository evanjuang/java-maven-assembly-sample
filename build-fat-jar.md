## maven-jar-plugin + maven-dependency-plugin
**maven-jar-plugin**: set main class and class path to 'lib' <br>
**maven-dependency-plugin**: copy all dependency to 'lib'
pom.xml
```xml
<build>
  <plugins>
    <plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-jar-plugin</artifactId>
    <configuration>
      <archive>
        <manifest>
          <mainClass>com.test.your.Main</mainClass>
          <addClasspath>true</addClasspath>
          <classpathPrefix>lib/</classpathPrefix>
        </manifest>
      </archive>
    </configuration>
    </plugin>
    <plugin>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-dependency-plugin</artifactId>
      <executions>
        <execution>
          <id>copy-dependencies</id>
          <phase>package</phase>
          <goals>
            <goal>copy-dependencies</goal>
          </goals>
          <configuration>
            <outputDirectory>${project.build.directory}/lib</outputDirectory>
          </configuration>
        </execution>
     </executions>
    </plugin>
  </plugins>
</build>
```

## maven-assembly-plugin
pom.xml
```xml
<build>
<plugins>
  <plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-assembly-plugin</artifactId>
    <configuration>
      <archive>
        <manifest>
          <mainClass>com.test.your.Main</mainClass>
        </manifest>
      </archive>
      <descriptorRefs>
        <descriptorRef>jar-with-dependencies</descriptorRef>
      </descriptorRefs>
    </configuration>
    <!-- execute assembly:single in package phase -->
    <!-- use mvn package directly -->
    <executions>
      <execution>
        <id>make-assembly</id>
        <phase>package</phase>
        <goals>
          <goal>single</goal>
        </goals>
      </execution>
    </executions>
  </plugin>
</plugins>
</build>
```

## maven-shade-plugin
pom.xml
```xml
<build>
<plugins>
  <plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-shade-plugin</artifactId>
    <configuration>
      <transformers>
        <transformer implementation="org.apache.maven.plugins.shade.resource.ManifestResourceTransformer">
          <mainClass>com.test.your.Main</mainClass>
        </transformer>
      </transformers>
    </configuration>
    <executions>
      <execution>
        <phase>package</phase>
        <goals>
          <goal>shade</goal>
        </goals>
      </execution>
    </executions>
  </plugin>
</plugins>
</build>
```
