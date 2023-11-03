# Part 1

* A failure-inducing input for the buggy program, as a JUnit test and any associated code:
```
@Test
public void reverseBasicArrayTest(){
  int[] input1 = {1,2,3,4};
  assertArrayEquals(new int[]{4,3,2,1}, ArrayExamples.reversed(input1));
}
```
* An input that doesn’t induce a failure, as a JUnit test and any associated code:
```
@Test
public void testReversed(){
  int[] input1 = {};
  ArrayExamples.reverseInPlace(input1);
  assertArrayEquals(new int[]{}, input1);
}
```
* The symptom, as the output of running the tests:
![image](https://github.com/JoshCaneday/cse15l-lab-reports/assets/146874169/43d0566e-d85e-48be-80e5-056fa5a905df)

The failure-inducing input is seen as one of the failures in JUnit. The input that doesn't induce a failure can only be seen as one of the tests run at the bottom of the image. However, since it didn't induce an error, it is not shown in detail like the tests that fail.
* The bug, as the before-and-after code change required to fix it;
```
static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = newArray[arr.length - i - 1];
    }
    return arr;
}
```

```
static int[] reversedFixed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      newArray[i] = arr[arr.length - i - 1];
    }
    return newArray;
}
```
* Briefly describe why the fix addresses the issue:
  The fixed method addresses the issue by switching which array gets returned and switching which array gets manipulated in the for loop. In the original method, the inputted array would be given values from the empty array. This would abviously cause issues because instead of reversing the array, it was just setting each index to 0. However, in the fixed method, I switched this around so that the empty array would be getting the elements from the original array but in reverse order. Then at the end, it would return that new, reversed array.

# Part 2

## Grep Command:

**grep -i:**

```
jcan2@JoshuaLaptop MINGW64 ~/docsearch/technical/plos (main)
$ grep -i "science" journal.pbio.0020001.txt
        the clear inequalities in science between developing and developed countries and to the
        importance of reducing the inequalities in science between developed and developing
        88% of all scientific and technical publications registered by the Science Citation Index
        It is rather obvious that richer countries are able to invest more resources in science
        contributions to science, despite the fact that the average proportion of gross domestic
        product (GDP) invested in science in Latin America throughout this 10-year period was only
        productivity is remarkable when we compare it with the relatively low investment in science
        rate as well as in financial investment in science and technology. Some countries have
        funding to the most productive scientists from the national science development programs
        and global change biology) between 1990 and 2002 in both the two top general science
        Science ; with impact factors of 27.96 and 23.33, respectively) and in
        Science and
        Science and
        American researchers are not shying away from the two top-ranked general science journals.
        Science and
        ecology and environmental sciences emphasizes the overwhelming contributions of authors
        conspiracy, but rather it implies that the perception of the most important science is
        science is most interesting to them. Another consideration is that more local journals from
        developing world (Goldemberg 1998; Annan 2003). One is that science, as a discipline, would
        Brazil (Goldemberg 1998) and biomedical sciences in Cuba (Castro Díaz-Balart 2002). These
        to the sciences will be an excellent investment by developing nations in terms of
```
```
jcan2@JoshuaLaptop MINGW64 ~/docsearch/technical/plos (main)
$ grep -i "journal" journal.pbio.0020010.txt
        important journal runs JSTOR has digitised. Paper holdings have not decreased dramatically,
        Likewise, the decision to digitise the back-runs of around 100—now 218—paper journals was a
        bold decision at the time, but the future for access to journal literature lies in
        readers. As the number of journal articles accessible over the networks increases, JSTOR
        JSTOR's public image is of quality in depth—long runs of core journals—and that image has
        realised through their ‘Big Deals’ in selling hundreds of journals to hundreds of libraries
        publishers do not have to sell their product to users of their journals, but local
        America and Western Europe to be published in peer-reviewed open-access journals more
        readily than in the traditional subscription-based journals.
```
The -i option works the same as the regular grep command except that it is no longer case sensitive. This is useful for times when you don't care if there are capital letters or not in the text.

**grep -c:**

```
jcan2@JoshuaLaptop MINGW64 ~/docsearch/technical/plos (main)
$ grep -c "science" journal.pbio.0020001.txt
16
```
```
jcan2@JoshuaLaptop MINGW64 ~/docsearch/technical/plos (main)
$ grep -c "journal" journal.pbio.0020010.txt
9
```
The -c option returns the number of lines that the file contains the text. This is useful as it can tell you exactly how many lines contain the text the text.

**grep -n:**

```
jcan2@JoshuaLaptop MINGW64 ~/docsearch/technical/plos (main)
$ grep -n "science" journal.pbio.0020001.txt
7:        the clear inequalities in science between developing and developed countries and to the
10:        importance of reducing the inequalities in science between developed and developing
29:        It is rather obvious that richer countries are able to invest more resources in science
75:        contributions to science, despite the fact that the average proportion of gross domestic
76:        product (GDP) invested in science in Latin America throughout this 10-year period was only
78:        productivity is remarkable when we compare it with the relatively low investment in science
85:        rate as well as in financial investment in science and technology. Some countries have
112:        funding to the most productive scientists from the national science development programs
125:        and global change biology) between 1990 and 2002 in both the two top general science
158:        American researchers are not shying away from the two top-ranked general science journals.
163:        ecology and environmental sciences emphasizes the overwhelming contributions of authors
178:        conspiracy, but rather it implies that the perception of the most important science is
181:        science is most interesting to them. Another consideration is that more local journals from
196:        developing world (Goldemberg 1998; Annan 2003). One is that science, as a discipline, would
207:        Brazil (Goldemberg 1998) and biomedical sciences in Cuba (Castro Díaz-Balart 2002). These
224:        to the sciences will be an excellent investment by developing nations in terms of
```
```
jcan2@JoshuaLaptop MINGW64 ~/docsearch/technical/plos (main)
$ grep -n "journal" journal.pbio.0020010.txt
11:        important journal runs JSTOR has digitised. Paper holdings have not decreased dramatically,
17:        Likewise, the decision to digitise the back-runs of around 100—now 218—paper journals was a
18:        bold decision at the time, but the future for access to journal literature lies in
24:        readers. As the number of journal articles accessible over the networks increases, JSTOR
35:        JSTOR's public image is of quality in depth—long runs of core journals—and that image has
42:        realised through their ‘Big Deals’ in selling hundreds of journals to hundreds of libraries
52:        publishers do not have to sell their product to users of their journals, but local
56:        America and Western Europe to be published in peer-reviewed open-access journals more
57:        readily than in the traditional subscription-based journals.
```
The -n command numbers each of the lines that contain the text. This is useful as it can show you exactly what line the text is.

**grep -o:**

```
jcan2@JoshuaLaptop MINGW64 ~/docsearch/technical/plos (main)
$ grep -o "science" journal.pbio.0020001.txt
science
science
science
science
science
science
science
science
science
science
science
science
science
science
science
science
```
```
jcan2@JoshuaLaptop MINGW64 ~/docsearch/technical/plos (main)
$ grep -o "journal" journal.pbio.0020010.txt
journal
journal
journal
journal
journal
journal
journal
journal
journal
```
The -o option does the same thing as the normal grep command however instead of printing out everything on the line that contains the text, it only prints out the text. This is useful for when you don't need to read each line that contains the text and only want to see how many times it shows up.

Each option was found on [https://www.geeksforgeeks.org/grep-command-in-unixlinux/](https://www.geeksforgeeks.org/grep-command-in-unixlinux/)
