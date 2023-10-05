&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;Command (cd):
=============
&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;[CD](https://joshcaneday.github.io/cse15l-lab-reports/cd)  &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;  [LS](https://joshcaneday.github.io/cse15l-lab-reports/ls)  &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp; [CAT](https://joshcaneday.github.io/cse15l-lab-reports/cat)

## Using the cd Command Without an Argument
![image](https://github.com/JoshCaneday/cse15l-lab-reports/assets/146874169/f91f1027-934e-4a78-b9e4-d52a10d4655f)

In this example, the working directory was "/home/lecture1/messages". The output of this command changed my working directory from "/home/lecture1/messages" to "/home". This happened because the cd command is usually used in conjunction with another directory. However, since no other directory was said, it went back to the original, that being "/home". The command did not output an error.

## Using the cd Command With a Directory Argument
![image](https://github.com/JoshCaneday/cse15l-lab-reports/assets/146874169/8534da13-f4c6-4cef-964b-f685a1e5924f)

In this example, the working directory was "/home". I got this output because when you use the cd command with a directory as an argument, the working directory will be changed to the directory that was written. This works so long as the directory that is stated exists and the command is written in the correct format. For example, if you were to change directories using the cd command from the "/home" directory to the "/home/lecture1/messages" directory, you have to use the absolute path since the "messages" folder/directory is not in "/home", it is in "/home/lecture1". The output was not an error.

## Using the cd Command With a File Argument
![image](https://github.com/JoshCaneday/cse15l-lab-reports/assets/146874169/28b3b820-f01f-43af-ab24-37845d971706)

In this example, the working directory was "/home/lecture1/messages". This was the output because you can not change directories to something that is not a directory. Directories are folders not files. The output was an error because it tried to accomplish an impossible task. Since "en-us.txt" is not a directory, it can't become the working directory and so an error is created.
