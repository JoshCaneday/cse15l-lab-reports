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

