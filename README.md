# Java Learnings

This repository contains Java practice programs and notes covering core language concepts, data structures, file handling, streams, OOP, regular expressions, and multithreading.

## Topics Covered

- Collections and sets
- Java streams
- Arrays, sorting, hash maps, and string problems
- Object-oriented programming concepts
- Generics, enums, records, annotations, optionals, and sealed classes
- File handling and NIO basics
- Regular expressions
- Thread creation, synchronization, interrupts, executor service, and inter-thread communication

## Project Structure

```text
src/
  collection/
  collections/streams/
  com/learnings/
  filehandling/
  oops/
  regex/
  threads/
```

## How to Run

Compile a Java file:

```bash
javac src/path/to/FileName.java
```

Run a compiled class:

```bash
java -cp src package.name.ClassName
```

Example:

```bash
javac src/com/learnings/Anagram.java
java -cp src com.learnings.Anagram
```

## Notes

Only source code and learning notes should be committed. IDE settings, compiled classes, and build output are ignored through `.gitignore`.
