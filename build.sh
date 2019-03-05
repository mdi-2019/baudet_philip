#!/usr/bin/env bash

mvn clean
mvn install
mvn test
mvn package

# mvn clean jacoco:prepare-agent install jacoco:report site