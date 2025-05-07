Qsn 1:  
Rat Maze Problem.  

Asn 2:  
Permutation of a string.  

Qsn 3:
Subset sum problem [sol1 abdulbari](https://youtu.be/kyLxTdsT8ws)  
Problem can also be solved using [DP](https://github.com/PiyushMittl/java-TipsandTricks/blob/master/problemsolving-dp.md)  



reference:  
https://betterprogramming.pub/the-technical-interview-guide-to-backtracking-e1a03ca4abad  
https://levelup.gitconnected.com/3-key-points-to-solving-backtracking-problems-c9159696ad0e  
my style trace  
https://geekstocode.com/rat-in-a-maze-problem-backtracking/  

# Backtracking Problem Classification

A taxonomy of common backtracking patterns, with one **representative** problem and several **siblings** in each category.

---

## 1. Permutations & Arrangements  
Generate all orderings of a set of items (no duplicates).

- **Representative:**  
  - Permutations (`LeetCode 46`)  
- **Siblings:**  
  - Next Permutation (`LeetCode 31`)  
  - Permutations II (with duplicates, `LeetCode 47`)  
  - Letter Case Permutation (`LeetCode 784`)  

---

## 2. Subsets & Combinations  
Build all subsets (or all k-sized subsets) of a set of items.

- **Representative:**  
  - Subsets (`LeetCode 78`)  
- **Siblings:**  
  - Combinations (`LeetCode 77`)  
  - Subsets II (with duplicates, `LeetCode 90`)  

---

## 3. Sum-Target Selections  
Pick numbers that sum to a target, optionally with reuse or limited counts.

- **Representative:**  
  - Combination Sum (`LeetCode 39`)  
- **Siblings:**  
  - Combination Sum II (`LeetCode 40`)  
  - Partition to K Equal Sum Subsets (`LeetCode 698`)  
  - Target Sum (choose +/– signs, `LeetCode 494`)  

---

## 4. Parentheses & String-Based Construction  
Generate all strings under well-formedness or formatting rules.

- **Representative:**  
  - Generate Parentheses (`LeetCode 22`)  
- **Siblings:**  
  - Palindrome Partitioning (`LeetCode 131`)  
  - Restore IP Addresses (`LeetCode 93`)  
  - Letter Combinations of a Phone Number (`LeetCode 17`)  

---

## 5. Grid/Matrix Pathfinding  
Explore paths in a 2D grid under movement and visitation constraints.

- **Representative:**  
  - Word Search (`LeetCode 79`)  
- **Siblings:**  
  - Rat in a Maze (classic)  
  - Unique Paths III (`LeetCode 980`)  
  - Number of Islands (`LeetCode 200`)  

---

## 6. Constraint-Satisfaction on Boards  
Place or assign items so that no constraints are violated.

- **Representative:**  
  - N-Queens (`LeetCode 51`)  
- **Siblings:**  
  - Sudoku Solver (`LeetCode 37`)  
  - Graph Coloring / M-Coloring (classic)  
  - Knight’s Tour (classic chess puzzle)  

---

## 7. “Touring” & Unique-Visit Puzzles  
Traverse all nodes or cells exactly once, often with special move rules.

- **Representative:**  
  - Knight’s Tour  
- **Siblings:**  
  - Hamiltonian Path/Circuit (graph-theory classic)  
  - Unique Paths III (`LeetCode 980`)  

---

### How to Use This Roadmap

1. **Identify the pattern** your problem fits (e.g. “Permutations”, “Grid paths”, “Board constraints”).  
2. **Select the representative template** and adapt its `isValid`, state, and undo logic.  
3. **Implement** the backtracking skeleton:
   ```text
   backtrack(level):
       if level == END:
           record solution
           return

       for each choice at this level:
           if isValid(choice, state):
               make(choice)
               backtrack(level + 1)
               undo(choice)
