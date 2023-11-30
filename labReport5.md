**Student:**
I'm having some trouble with this lab because I keep getting an error whenever I run `bash test.sh`. I'm trying to run these tests, but I can't seem to figure out what's wrong. Here's an image of the error:
![image](https://github.com/JoshCaneday/cse15l-lab-reports/assets/146874169/d92b49b4-44ef-4b54-b0c5-653d474e3a4b)

I keep looking throughout the ListExamples.java but I can't seem to find anything.
**Teacher's Assistant:**
Okay so where does it say the failure is? Does the test perhaps tell you where the error is located?

Hint: Check line 44.

**Student:**
Oh okay that I didn't see that. I found that it was adding to the index1 variable instead of the index2 variable. I've now changed it and rerun `bash test.sh`:
![image](https://github.com/JoshCaneday/cse15l-lab-reports/assets/146874169/38ae0401-5f9a-4404-9b18-23d216aac075)

Now the tests pass too.
![image](https://github.com/JoshCaneday/cse15l-lab-reports/assets/146874169/660fdc75-3ec7-4580-9073-fbf4971286e6)

Thank you so much for your help!

**Information/Setup:**
File & Directory Structure:
-lab7
    -lib
        -hamcrest-core-1.3.jar
        -junit-4.13.2.jar
    -ListExamples.class
    -ListExamples.java
    -ListExamplesTests.class
    -ListExamplesTests.java
    -StringChecker.class
    -test.sh

Contents of Each File Before Fixing:
(The only files that were altered were test.sh and ListExamples.java so that is all that is needed to be shown)
![image](https://github.com/JoshCaneday/cse15l-lab-reports/assets/146874169/b2d0437a-4be0-4fa3-b400-770620c0c61e)


![image](https://github.com/JoshCaneday/cse15l-lab-reports/assets/146874169/5c5fe01c-3b0a-4b63-bec4-8df456794222)

The full command line (or lines) you ran to trigger the bug:
`bash test.sh`

Description of waht to edit to fix the bug:
In order to fix the bug, you need to use vim to get into ListExamples.java. Within this file there is a mistake on line 44 where the wrong variable is being used. You must change the variable from "index1" to "index2". This error is easily missed as it just slightly messes up the variable name.

**Reflection:**
Throughout my labs, I learned what vim was and how to use the git commands such as git add, git commit, and git push. When I first started using vim I didn't really like it because it was confusing and I would often find myself accidently pressing buttons and doing things that I didn't to do. I would also be unable to undo these mistakes as I couldn't figure out what keys to press. However, after practicing using vim in these labs, I not only learned how to use vim but what shortcuts to use to make things quicker and easier. As for the git commands, I learned that in order to update the edits I made to the files in a repository that I had opened in a terminal, I needed to use git add, git commit and git push. Prior to the labs I thought that the edits I made in the terminal were linked to the repository on GitHub and that they were saved automatically. Now I know that these git commands are essential.
