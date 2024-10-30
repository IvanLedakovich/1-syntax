# Java CLI program converting text files into images

**The program accepts .txt files as arguments, processes each one in a separate thread,
reads .txt files, printing their contents in the terminal and saving them as images according 
to type and directory provided as arguments. The program has no external dependencies.**

## How to run the program:
1. Compile the java files into .class files using the following terminal command in the file location:
   ```
   javac Main.java
   ```
2. Add the arguments and then run the program:
   ```
   java Main *arguments*
   ```
   The program accepts 3 arguments in any order:
   1. "--file-type" + Image type ("png", "jpg", etc.)
   2. "--save-location" + Image save destination (e.g. "D:\Games")
   3. "--file-path" + Initial .txt files separated by space (e.g. "D:\test.txt" "D:\test1.txt" etc.)

   The full command could look like this:
   ```
   java Main "--file-type" "png" "--save-location" "D:\\Games" "--file-path" "D:\\test.txt" "D:\\test1.txt" "D:\\test2.txt"
   ```