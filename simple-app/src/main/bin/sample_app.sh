#!/bin/sh

# Get home directory
APP_HOME=$(cd $(dirname $0); cd ..; pwd -P)

# Project Information
ARTIFACT_ID=sample-app
VERSION=0.1
MAIN_CLASS=com.evan.test.StartApp

# Set entry
MAIN_JAR_DIR=lib
MAIN_JAR=$ARTIFACT_ID-$VERSION.jar

# Set log directory for log4j
LOG_DIR=$APP_HOME/logs

# Set Java environment
JAVA_ENV="-Dlog-dir=$LOG_DIR"

# Run
java $JAVA_ENV -cp $APP_HOME/$MAIN_JAR_DIR/$MAIN_JAR $MAIN_CLASS
