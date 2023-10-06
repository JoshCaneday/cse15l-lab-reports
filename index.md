#     &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;                                                  LAB REPORT 1:


&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;Command (cd):
=============
## Using the cd Command Without an Argument
![image](https://github.com/JoshCaneday/cse15l-lab-reports/assets/146874169/f91f1027-934e-4a78-b9e4-d52a10d4655f)

In this example, the working directory was "/home/lecture1/messages". The output of this command changed my working directory from "/home/lecture1/messages" to "/home". This happened because the cd command is usually used in conjunction with another directory. However, since no other directory was said, it went back to the original, that being "/home". The command did not output an error.

## Using the cd Command With a Directory Argument
![image](https://github.com/JoshCaneday/cse15l-lab-reports/assets/146874169/8534da13-f4c6-4cef-964b-f685a1e5924f)

In this example, the working directory was "/home". I got this output because when you use the cd command with a directory as an argument, the working directory will be changed to the directory that was written. This works so long as the directory that is stated exists and the command is written in the correct format. For example, if you were to change directories using the cd command from the "/home" directory to the "/home/lecture1/messages" directory, you have to use the absolute path since the "messages" folder/directory is not in "/home", it is in "/home/lecture1". The output was not an error.

## Using the cd Command With a File Argument
![image](https://github.com/JoshCaneday/cse15l-lab-reports/assets/146874169/28b3b820-f01f-43af-ab24-37845d971706)

In this example, the working directory was "/home/lecture1/messages". This was the output because you can not change directories to something that is not a directory. Directories are folders not files. The output was an error because it tried to accomplish an impossible task. Since "en-us.txt" is not a directory, it can't become the working directory and so an error is created.

&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;Command (ls):
=============
## Using the ls Command Without an Argument
![image](https://github.com/JoshCaneday/cse15l-lab-reports/assets/146874169/9d8fb183-aaa3-4e63-8fef-a18c64d3f729)

In this example, the working directory was "/home". I got this output because if you use the ls command without an argument, it just lists all the files and folders within the current working directory. In this case, the working directory was "/home". Since "lecture1" was the only thing within "/home", that was the only thing outputted. This command did not output an error.

## Using the ls Command With a Directory Argument
![image](https://github.com/JoshCaneday/cse15l-lab-reports/assets/146874169/5ed7788d-ed62-4fc5-8bb7-8afdf50e4f79)

In this example, the working directory was "/home". This was the output because when using the ls command with a directory as an argument, it lists all the files and folders within the directory that was written. However, it should be noted that the directory that was written alongside the command must actually exist and also be written in the correct format. For example, if the directory was not within the current working directory, the user must name the directory using its absolute path. The output was not an error.

## Using the ls Command With a File Argument
![image](https://github.com/JoshCaneday/cse15l-lab-reports/assets/146874169/094e2d73-d1bb-4855-b760-8bc0594d5e12)

In this example, the working directory was "/home/lecture1/messages". The output of this command was just itself because when you list the contents of a file, the only thing there is the file itself. A file is not a folder/directory and therefore does not contain any other files inside of it. The output was not an error.
   
&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;Command (cat):
=============
## Using the cat Command Without an Argument
![image](https://github.com/JoshCaneday/cse15l-lab-reports/assets/146874169/ecddf3ab-02cf-4c92-b88e-b0c366bd0eb4)

In this example, the working directory was "/home/lecture1". This was the output because the cat command needs to print something out. Since no file was used alongside the command, it resorts to waiting for input from the user. After playing around with the command, you can see that it just outputs whatever the user inputs from that point onward. I was eventually able to find an escape from this endless loop by clicking "Ctrl-D" which brings you back to the working directory. You could call this output an error, but since it never exactly says so, it technically is not one.

## Using the cat Command With a Directory Argument
![image](https://github.com/JoshCaneday/cse15l-lab-reports/assets/146874169/103b1f0c-96ac-46a6-979c-aa7b7cf274b7)

In this example, the working directory was "/home".The output of this command created an error. This was an error because the cat command is not meant to be used with directories. It is meant to be used on files such as a ".txt" or ".java" file. Since a directory was used, the cat command could not print anything since a directory does not contain information like a file. Directories are folders so nothing can be printed out of them.


## Using the cat Command With a File Argument
![image](https://github.com/JoshCaneday/cse15l-lab-reports/assets/146874169/e998cc4b-a712-4639-bbaa-9aff7de7ae47)

In this example, the working directory was "/home/lecture1/messages". I got this output because the cat command, when used with either one or two files as an argument, prints all of the contents of those chosen files to the terminal. This allows you to easily see inside of files. This also works on other files such as ".java" files, not just text ones. This output was not an error.
   
   
