Command (cat):
=============
[CD](https://joshcaneday.github.io/cse15l-lab-reports/cd)  &ensp;&ensp;&ensp;&ensp;&ensp;  [LS](https://joshcaneday.github.io/cse15l-lab-reports/ls)  &ensp;&ensp;&ensp;&ensp;&ensp; [CAT](https://joshcaneday.github.io/cse15l-lab-reports/cat)
## Using the cat Command Without an Argument
![image](https://github.com/JoshCaneday/cse15l-lab-reports/assets/146874169/ecddf3ab-02cf-4c92-b88e-b0c366bd0eb4)

In this example, the working directory was "/home/lecture1". This was the output because the cat command needs to print something out. Since no file was used alongside the command, it resorts to waiting for input from the user. After playing around with the command, you can see that it just outputs whatever the user inputs from that point onward. I was eventually able to find an escape from this endless loop by clicking "Ctrl-D" which brings you back to the working directory. You could call this output an error, but since it never exactly says so, it technically is not one.

## Using the cat Command With a Directory Argument
![image](https://github.com/JoshCaneday/cse15l-lab-reports/assets/146874169/103b1f0c-96ac-46a6-979c-aa7b7cf274b7)

In this example, the working directory was "/home".The output of this command created an error. This was an error because the cat command is not meant to be used with directories. It is meant to be used on files such as a ".txt" or ".java" file. Since a directory was used, the cat command could not print anything since a directory does not contain information like a file. Directories are folders so nothing can be printed out of them.


## Using the cat Command With a File Argument
![image](https://github.com/JoshCaneday/cse15l-lab-reports/assets/146874169/e998cc4b-a712-4639-bbaa-9aff7de7ae47)

In this example, the working directory was "/home/lecture1/messages". I got this output because the cat command, when used with either one or two files as an argument, prints all of the contents of those chosen files to the terminal. This allows you to easily see inside of files. This also works on other files such as ".java" files, not just text ones. This output was not an error.
