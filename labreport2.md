# PART 1:

## ScreenShots:

![Image](https://github.com/JoshCaneday/cse15l-lab-reports/assets/146874169/ba11fb42-815c-4103-8258-8faf6ccd75ff)
![Image](https://github.com/JoshCaneday/cse15l-lab-reports/assets/146874169/f19cde9d-9f84-49be-84db-215dcec70ec5)
Q: Which methods in your code are called?

A: When the handleRequest method is called with the URL as a parameter, many other methods are used in the body of handleRequest. First, getPath is used on the URL that was input as well as the equals method to see if the "/add-message" keyword is used. If so, then the getQuery method is used along with the split method which splits the query into two pieces at the "=" sign since there would only be one "=" sign. The equals method is then used again to see if the first part of the query (the left side of that "=" sign), is equal to "s". If this is true, then it does some lines that basically set up what will be outputted to the page/server that the URL leads to, including using the replace method in the case that any inputs have spaces. When spaces are used, + signs are used instead. However, to make it so the user does not see this on their end, the replace method is used to put the spaces back in there on the viewable page/server. Finally, the format method is used which in simple terms, just prints out what the user will see on the page/server after using the URL. Earlier lines had set up a lot of what was going to be printed and this method just executes it. Of course, this is a simplified explanation.

Q: What are the relevant arguments to those methods, and the values of any relevant fields of the class?

A: The relevant arguments of these methods are the URL that was inputted, the path that was found using the getPath method, the query that was found using the getQuery method, the parameters in the String array that were found using the split method on the query, and some extra values such as the previous and count variables which help with formatting and keeping track of what should be printed to the page/server which the URL leads to. The URL contains all the information needed to get to the page/server, including the query and path. It should be noted that the URL has the variable name "url", in lowercase. The path is what helps with finding how to get to the server and as stated before is found within the URL. The query contains very important data that can change what is shown on the page. Without the query, the same thing would be printed on the page each time, in this case, I chose for it to say "Use /add-message keyword!". The parameters are just the query split into two pieces. Like I said in a previous answer, it is split at the "=" sign. The left side should be equal to "s" while the right side accepts a variety of choices such as "hello" or "How's it going" and is then listed in a particular format which will be explained soon. Next up is the previous string variable. This variable just keeps track of what was outputted to the page the last time the handleRequest method was used. The reason we need this is so we can create a list, numbering each output. The count variable keeps track of what number in that list I just talked about the current print is at. Going back to that "hello" and "How's it going" example, the count is at 1 when the "hello" is printed and then changes to 2 by the time "How's it going" is printed.

Q: How do the values of any relevant fields of the class change from this specific request? If no values got changed, explain why.

A: After this specific request, the count variable increments by 1, and the previous variable is set to what was just displayed. The count variable keeps track of the number in the sequence. The previous variable is used to keep track of and display what happened on the previous request.

## Code:
![image](https://github.com/JoshCaneday/cse15l-lab-reports/assets/146874169/3b8d934a-e691-4aa0-b33a-7586446dc0fd)

# Part 2:

**Private Key**

![image](https://github.com/JoshCaneday/cse15l-lab-reports/assets/146874169/1829e296-6ef7-4591-ad21-6ce5005fdc23)

There is more below the line ("-----BEGIN OPENSSH PRIVATE KEY-----"). However, I will not show it for privacy reasons, and because the task says to only show the path not the actual key. I assume that was the intent. So, the path for the private key would be from the home directory into the /.ssh directory and into id_rsa. It should be noted that this was done on my own computer.

**Public Key**

![image](https://github.com/JoshCaneday/cse15l-lab-reports/assets/146874169/716e14f2-6273-4c7c-b46a-0eb32e770c9d)

The path would once again be from the home directory into the .ssh directory. However, in this case we would go into id_rsa.pub. It should be noted that this was done in my account on ieng6.

**ieng6 Log-in Without Using A Password**

![image](https://github.com/JoshCaneday/cse15l-lab-reports/assets/146874169/e10efe7e-9180-4988-8e66-c584f701a621)

Above is the screenshot of me logging into ieng6 with my course-specific account without the need of using my password.

# Part 3:

Q: In a couple of sentences, describe something you learned from lab in week 2 or 3 that you didn’t know before.

A: One of the most interesting things that I had learned in week 2 was how to not only build but also run a server. I never knew how easy it was to do this. I find it really cool how people can connect if they go to the same port and server.
