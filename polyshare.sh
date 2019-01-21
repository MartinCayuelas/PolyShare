#!/bin/bash
javac -cp src/persistent/mysql-connector-java-8.0.13.jar $(find . -name "*.java")
cd src
java -cp .:persistent/mysql-connector-java-8.0.13.jar application.Main

rm $(find . -name "*.class")
