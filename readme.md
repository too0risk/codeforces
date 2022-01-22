## List of my accepted CF problems
- Wrong Subtraction
- In Search of an Easy Problem
- Anton and Letters
- Stones on the Table
- Sasha and Sticks
- Nearly Lucky Number
- Bus to Udayland

## IDE
I use **Far Manager** to create, compile and run my java code.

### Far manager configuration
Far Manager have a **file associations** feature to simplify you to compile and run source code (just press enter and it will automatically compile and run your program file).

Step by step to create file associations in Far Manager:
1. Go to top bar (click your current directory at the top of your Far Manager)
2. Choose `Commands` tab
3. Click `File associations` option
4. Create a new file associations by pressing an `Insert` button in your keyboard (if you use laptop, press `fn` + `delete` button)
5. In the first line (one / several mask files), type `*.java` to select all java files in your directory to be compiled and run.
6. In the second line (description), you can leave it empty
7. And in the third line (execute command -> used for enter), use the command below to compile and run java file.
```batch
javac -Werror -deprecation -d ../out !.java && java -cp ../out !
```
The command above will compile java file into `.out` directory and execute java program with classpath from that directory.