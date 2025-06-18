1. Write a file using OutputStream/sub classes and verify the same using test cases
2. Create a directory called "source" and create three files  called "test.txt", "input.txt", "output.txt"
3. Write a program to make a file readonly
4. Write a program to append a string to and existing file
5. Write a program to copy the content from one file to another file. Multiple ways there. try all possible ways.
6. Write a program to move a file from one directory to another directory
7. Write a program to list the file names starting with "s"
8. Write a program to rename a given file



Realtime use cases of file handling
1. Configuration management
2. Logging
3. Data storage & retrieval
4. Backup & restore
5. File Upload & Download
6. Text Processing & Report Generation


Handling large files  - FileChannel, Streams

File Reader 
    Reads one character at a time
    Small files
    Simple character file
    less efficient compared to BufferedReader

BufferedReader
    Reads a full buffer(Default 8192 bytes) at a time
    Suites for large files
    highly efficient compared to FileReader

IO
    Stream Oriented
    Blocking IO
NIO
    Buffer Oriented
    Non blocking IO
    Selectors
