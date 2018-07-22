#!/bin/bash

ANTLR_JAR="antlr4.jar"

GRAMMAR="Vyper"
START_RULE="sourceUnit"
# TEST_FILE="crowdfund.vy"
TEST_FILES_DIR="./samples"
ERROR_PATTERN="mismatched|extraneous|error"

if [ ! -e "$ANTLR_JAR" ]; then
  curl http://www.antlr.org/download/antlr-4.7-complete.jar -o "$ANTLR_JAR"
fi

mkdir -p target/

# Generates some build files; *.tokens and *.java in /src/ dir
java -jar $ANTLR_JAR $GRAMMAR.g4 -o src/
# Generates a lot of files with names like `SolidityParser$PragmaValueContext.class` in /target dir
javac -classpath $ANTLR_JAR src/*.java -d target/

for TEST_FILE in ${TEST_FILES_DIR}/*.vy; do
  java -classpath "$ANTLR_JAR":target/ org.antlr.v4.gui.TestRig "$GRAMMAR" "$START_RULE" < $TEST_FILE 2>&1 |
    # Only print the first error
    grep -m 1 -E "$ERROR_PATTERN" && echo "TESTS FAIL!" || echo "$TEST_FILE: TESTS PASS!"
done
