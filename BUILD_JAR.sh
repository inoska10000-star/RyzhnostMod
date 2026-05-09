#!/usr/bin/env bash
set -e
echo "Building Ryzhnost mod..."
echo "Required: Java 21 and installed Gradle"
gradle build
echo "Done. Jar is in build/libs/"
