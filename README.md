# Java CLI program converting text files into images

**The program accepts .txt files as arguments, processes each one in a separate thread,
reads .txt file, printing its contents in the terminal and saving them as images according 
to type and directory provided as arguments. The program has no external dependencies.**

## How to run the program:
1. Compile the java file into a .class file using the following terminal command in the file location:
   ```
   javac Main.java
   ```
2. Add the arguments and then run the program:
   ```
   java Main *arguments*
   ```
   The program accepts 3 arguments:
   1. Image type (png, jpg, etc.)
   2. Image save destination (e.g. D:\Games)
   3. Initial .txt files separated by space (e.g. D:\test.txt D:\test1.txt etc.)

   The full command could look like this:
   ```
   java Main "png" "D:\Games" "D:\test.txt" "D:\test1.txt" "D:\test2.txt"
   ```