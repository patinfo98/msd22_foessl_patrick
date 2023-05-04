# Hangmen

Hangmen is a small Java-based project, that allows the user to play the well known game [Hangmen][hm] directly in their console. There are at least two players needed, since one has to choose the words for the other to guess.

### Installation 

###### Prerequisites
1. To execute the program, first install the Java Development Kit (JDK) on your Operating System.
 [Click here][jdk] for a detailed guide on how to install it.

2. To choose the words for your opponent go to the project folder and open the words.txt file. Each line has to be one word for the file to be valid:
    ```shell
    word1
    word2
    word3
   ```
   
###### Start the game
Once the prerequisites are fullfilled the project can be executed via the command line interface of your OS, this should work for Windows, Linux & MacOS:

1. Type terminal in the search field of your OS and open the program displayed
</br>

2. Go to the path where you saved the project folder, for me its the "Programmieren1" folder and type the following command: 
    ```shell
    C:\Users\Patrick\Programmieren1> cd Hangmen/src
   ```
   
3. Then type the following commands to compile and execute the program:
    ```shell
    C:\Users\Patrick\Programmieren1/Hangmen/src> javac *.java
    C:\Users\Patrick\Programmieren1/Hangmen/src> java Hangmen ../words.txt
   ```
   
4. If the program loaded successfully it should look like this:
    ```shell
    C:\Users\Patrick\Programmieren1/Hangmen/src> java Hangmen ../words.txt
    =====================
    HANGMEN (2 Word(s))
    ---------------------
    Word #1:
    
    Word: _ _ _
    Misses (0/11)
    Next guess: _
    ```
    
### How its played
The player has 11 letters he can guess for each word, for each wrong choice a part of the hangmen is drawn. After 11 wrong inputs the round is lost and a full hangmen is drawn. Invalid inputs are not counted to the misses. 

### License
The program can be used and edited by anyone without a need to refer to the author.

> __Feel free to contact the author for more information or if any issues arise via email to: patrick.foessl11@gmail.com__

### Exercises
- [exercise1][ue1]




[hm]: <https://dictionary.cambridge.org/dictionary/english/hangman>
[jdk]: <https://www3.ntu.edu.sg/home/ehchua/programming/howto/jdk_howto.html>
[ue1]: exercise1.md