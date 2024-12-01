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

Solution Overview
The solution uses:

Bitwise AND properties to efficiently determine whether elements in the array can form the target K.
Subset exploration using bitmasking to check all possible combinations of elements for the AND operation.
Optimizations to reduce unnecessary subset checks:
Skip elements that cannot contribute to forming K.
Stop exploring a subset once the intermediate AND result becomes less than K.
Project Files
Main.java: Contains the optimized Java implementation for solving the problem.

How to Run
Clone the repository:
bash
Copy code
git clone https://github.com/<your-username>/and-quest.git
cd and-quest

Compile and run the program:
bash
Copy code
javac Main.java
java Main
Provide the input in the specified format.
Example Run
Input:

2
5 10
11 12 13 14 15
4 1023
511 512 256 255
Command:

bash
Copy code
java Main
Output:

YES
3
1 4 5
NO

Optimizations
Early termination once a valid subset is found.
Bitwise pruning to reduce unnecessary checks.

RAHUL-V308
