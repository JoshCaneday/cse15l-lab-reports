# Part 1

* A failure-inducing input for the buggy program, as a JUnit test and any associated code:
```
@Test
public void reverseInPlaceBasicTest(){
  int[] input1 = {1,2,3,4};
  ArrayExamples.reverseInPlace(input1);
  assertArrayEquals(new int[]{4,3,2,1}, input1);
}
```
* An input that doesn’t induce a failure, as a JUnit test and any associated code:
```
@Test
public void testReverseInPlace(){
  int[] input1 = {3};
  ArrayExamples.reverseInPlace(input1);
  assertArrayEquals(new int[]{3}, input1);
}
```
* The symptom, as the output of running the tests:
![image](https://github.com/JoshCaneday/cse15l-lab-reports/assets/146874169/43d0566e-d85e-48be-80e5-056fa5a905df)

The failure-inducing input is seen as one of the failures in JUnit. The input that doesn't induce a failure can only be seen as one of the tests run at the bottom of the image. However, since it didn't induce an error, it is not shown in detail like the tests that fail.
* The bug, as the before-and-after code change required to fix it;

* Briefly describe why the fix addresses the issue:
  

