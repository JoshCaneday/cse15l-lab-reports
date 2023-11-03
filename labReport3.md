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

* The bug, as the before-and-after code change required to fix it;

* Briefly describe why the fix addresses the issue:
  

