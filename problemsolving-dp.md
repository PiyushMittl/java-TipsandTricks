Question:  
Find the minimum number fo jump to reach till end.  
Answer:  
(Tushar Roy)  


Question:  
Longest palindromic subsequence.  
Answer:  
https://youtu.be/Fi5INvcmDos  

Question:  
Subset Sub Problem & Coin Changing Minimum Numbers of Coin.  
Answer:  
[sol1](https://youtu.be/s6FhG--P7z0),[sol2](https://youtu.be/zKwwjAkaXLI)  
Problem can also be solved using [backtrack](https://github.com/PiyushMittl/java-TipsandTricks/blob/master/problemsolving-backtracking.md)     
[Coin Changing Minimum Numbers of Coin](https://youtu.be/Y0ZqKpToTic)  

Question:  
Coin changing number of ways to get total.  
Answer:  
https://youtu.be/_fgjrs570YE  

Question:
Longest Common Subsequence & Longest Common Substring  
Answer:  
Longest Common Subsequence  
Ex.  
String1: **abc**da**f**  
String2: **a**c**bcf**  
Common Sub String: abcf  

Longest Common Substring  
Ex.  
String1: a**bcd**af  
String2: z**bcd**f  
Common Sub String: bcd  

Question:  
Longest Increasing Subsequence  
```
Input  : arr[] = {3, 10, 2, 1, 20}
Output : Length of LIS = 3
The longest increasing subsequence is 3, 10, 20

Input  : arr[] = {3, 2}
Output : Length of LIS = 1
The longest increasing subsequences are {3} and {2}
```

Question:  
Minimum Edit Distance  
Answer:  
Ex.
```
Input:   str1 = "geek", str2 = "gesek"
Output:  1
We can convert str1 into str2 by inserting a 's'.

Input:   str1 = "cat", str2 = "cut"
Output:  1
We can convert str1 into str2 by replacing 'a' with 'u'.

Input:   str1 = "sunday", str2 = "saturday"
Output:  3
Last three and first characters are same.  We basically
need to convert "un" to "atur".  This can be done using
below three operations. 
Replace 'n' with 'r', insert t, insert a
```

Question:  
Cutting rod maximum profit & Cutting rod minimum profit.  

Question:  
Maximum size rectangle of all 1's.  
Answer:
https://youtu.be/g8bSdXCG-lA  

Question:  
Minimum Cost Path.  
Answer:  
https://youtu.be/lBRtnuxg-gU  

ref:  
https://leetcode.com/discuss/general-discussion/458695/dynamic-programming-patterns  
https://emre.me/coding-patterns/longest-common-substring-subsequence/  



## Basic Foundation Questions for DP  

1. 0/1 Knapsack (6 problems)  
2. Unbounded Knapsack (5 problems)  
3. Fibonacci (7 problems)  
4. LCS (Longest Common Substring) (15 problems)  
5. LIS (Longest Increasing Subsequence) (10 problems)  
6. Kadane's Algorithm (6 problems)  
7. MCM (Matrix Chain Multiplication) (7 problems)  
8. DP on Trees (4 problems)  
9. DP on Grid (14 problems)  
10. Catalan Numbers (10 problems)  
11. Others  

Questions/reference Links for recursive, topdown and bottom-up approach  
1. 0/1 Knapsack (6 problems)  
    1.1. 0/1 Knapsack  
    3.2. Subset Sum  
    3.2. Subset Sum  
    3.3. Equal Sum Partition  
    4.4. Count the Subset Sum with a given sum  
    5.5. Minimum Subset Sum difference  
    7.6. Count the no of Subset with given Sum  
    8.7. Target Sum  
2. Unbounded Knapsack (5 problems)  
    2.1. Rod Cutting Problem  
    2.2. Coin Change-1 (max ways)  
    4.3. Coin Change-2 (min no of coins required)   
    ``note: fractional knapsack is not included here since it uses Greedy approach to solve the problems``  
3. Fibonacci (7 problems)  
4. LCS (Longest Common Substring) (15 problems)  
    4.1. Longest Common Substring  
    4.2. Longest Common Subsequence  
    4.3. Longest Super Subsequence  
    4.4. Longest Palindropmic Subsequence
    4.5. Minimum no of insertion and deletion required to convert String A to Atring B  
    4.6. Print Shortest Common Supersequence  
    4.7. Longest Repeating Subsequence  
    4.8. Sequence Pattern Matching    
    4.9. Minimum no of insertion in a String to make it a palindrom  
5. LIS (Longest Increasing Subsequence) (10 problems)  
6. Kadane's Algorithm (6 problems)  
7. MCM (Matrix Chain Multiplication) (7 problems)  
    7.1. Matrix Chain Multiplication  
    7.2. Evaluate Expression to true boolean prenthesization  
    7.3. Scrambled String  
8. DP on Trees (4 problems)  
    8.1. Diameter on Trees  
    8.2. Maximum path sum | from any node to any node  
    8.3. Maximum path sum | from leaf node to leaf node    
9. DP on Grid (14 problems)  
10. Catalan Numbers (10 problems)  
    10.1. Number of BST  
    11.2. Unbalanced Trees  
    11.3. N. Parantheses (with and without letter)  
    11.4. Dyck words  
    11.5. Mountain Ranges  
    11.6. Path on Grids  
    11.7. Convex Polygon  
    11.8. Connect Disjoint Chords  
    11.9. Ways of Triangulation  
11. Others  

referece:  
https://docs.google.com/spreadsheets/d/1S8ukVXMAArl1_nTQRKSSuBvhzlq2MdQjrw0U_tdpK_Q/edit#gid=0



# Classic Dynamic Programming Interview Questions

Below is a curated list of dynamic programming problems, organized by theme:

## 1D Sequence & Subsequence
- **Longest Increasing Subsequence**
- **Longest Common Subsequence**
- **Longest Palindromic Subsequence**
- **Longest Palindromic Substring**
- **Maximum Product Subarray**
- **Maximum Sum Circular Subarray**

## String DP
- **Edit Distance** (Levenshtein)
- **Regular Expression Matching** (`.` & `*`)
- **Wildcard Matching** (`?` & `*`)
- **Word Break / Word Break II**
- **Distinct Subsequences** (count how many ways `t` appears in `s`)
- **Minimum Palindrome Partitioning** (min cuts to split into palindromes)

## Knapsack & Partition
- **0/1 Knapsack**
- **Unbounded Knapsack** (rod cutting, coin change variants)
- **Coin Change I** (count ways)
- **Coin Change II** (min coins)
- **Partition Equal Subset Sum**
- **Target Sum** (count subsets that sum to S)

## Grid / Matrix Paths
- **Minimum Path Sum** in a grid
- **Unique Paths / Unique Paths II** (with obstacles)
- **Maximal Square**
- **Number of Ways to Paint Fence / Paint House**
- **Triangle** (min path sum from top to bottom)

## Interval & Range DP
- **Burst Balloons**
- **Matrix Chain Multiplication**
- **Palindrome Partitioning**
- **Optimal BST / Optimal Matrix Chain**

## Game & Stock Markets
- **House Robber I / II / III**
- **Best Time to Buy/Sell Stock I–IV** (unlimited, cooldown, fee, at most 2 trades)

## Other
- **Egg Dropping Puzzle**
- **Word Wrap (Text Justification)**
- **Dice Roll Sum Combinations**
- **Jump Game II** (min jumps to reach end)
- **Decode Ways** (count how many decodings of a digit string)




