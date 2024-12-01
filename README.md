AND Quest

Problem Description
This repository contains the solution to the AND Quest problem. The task is to determine whether there exists a non-empty subset of an array such that the bitwise AND of its elements equals a given integer K.

Input Format
The first line contains an integer T — the number of test cases.
For each test case:
The first line contains two integers N and K — the size of the array and the target bitwise AND value.
The second line contains N space-separated integers representing the array elements.

Output Format
For each test case:
If there exists a non-empty subset whose bitwise AND equals K, output:

YES
<size_of_subset>
<1-based indices of the subset elements>
If no such subset exists, output:

NO

Constraints:
1
≤
𝑇
≤
10
1≤T≤10
1
≤
𝑁
≤
42
1≤N≤42
0
≤
𝐾
<
2
30
0≤K<2 
30
 
0
≤
𝑎
𝑖
<
2
30
0≤a 
i
​
 <2 
30
 
The sum of N over all test cases does not exceed 42.
Example
Input

2
5 10
11 12 13 14 15
4 1023
511 512 256 255

Output

YES
3
1 4 5
NO

Optimizations
Early termination once a valid subset is found.
Bitwise pruning to reduce unnecessary checks.

RAHUL-V308
