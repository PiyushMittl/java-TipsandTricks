
## Roadmap of Common Binary‐Tree Problem Categories

Below is a structured roadmap of 14 core binary‐tree problem categories. **Solve the one representative problem in each category** and you’ll have the pattern to tackle all its “sibling” questions.

1. **Basic Traversals**  
   - **Representative:** Inorder Traversal (recursive & iterative)  
   - **Others:**  
     - Preorder Traversal (recursive & iterative)  
     - Postorder Traversal (recursive & iterative)  
     - Morris Inorder Traversal  
     - Morris Preorder Traversal  

2. **Level-Order / BFS**  
   - **Representative:** Level Order Traversal (return a list of lists by depth)  
   - **Others:**  
     - Zigzag Level Order  
     - Level Order Bottom-Up  
     - Average of Levels in Binary Tree  
     - Maximum Width of Binary Tree  

3. **Shape & Value Checks**  
   - **Representative:** Symmetric Tree (check mirror)  
   - **Others:**  
     - Same Tree (are two trees identical)  
     - Balanced Binary Tree (height-balanced)  
     - Uni-Valued Binary Tree (all nodes same value)  
     - Perfect Binary Tree check  

4. **Construct from Traversals**  
   - **Representative:** Build Tree from Preorder & Inorder  
   - **Others:**  
     - Build Tree from Inorder & Postorder  
     - Build Tree from Preorder & Postorder (when unique)  
     - Construct Complete Tree from Level-Order Array  
     - Serialize/Deserialize to aid construction  

5. **Serialization / Deserialization**  
   - **Representative:** Serialize and Deserialize Binary Tree (encode ↔ string)  
   - **Others:**  
     - Encode/Decode N-ary Tree  
     - Serialize in Level Order vs. Preorder  
     - Design TinyURL (URL ↔ short code mapping)  

6. **Root-to-Leaf Paths & Sums**  
   - **Representative:** Path Sum (I: exists a root→leaf path = target?)  
   - **Others:**  
     - Path Sum II (list all root→leaf paths)  
     - Sum Root to Leaf Numbers (concatenate digits)  
     - Path Sum III (any-node→any-node sum)  
     - Binary Tree Paths (return path strings)  

7. **“View” Problems**  
   - **Representative:** Right Side View (first node at each level from right)  
   - **Others:**  
     - Left Side View  
     - Top View of Binary Tree  
     - Bottom View of Binary Tree  
     - Vertical Order Traversal  

8. **Tree Mutation**  
   - **Representative:** Invert (Mirror) Binary Tree  
   - **Others:**  
     - Flatten Binary Tree to Linked List  
     - Convert to Doubly Linked List  
     - Connect Next Right Pointers (perfect tree)  
     - Populate Next Right Pointers II (any tree)  

9. **Subtree & Matching**  
   - **Representative:** Subtree of Another Tree  
   - **Others:**  
     - Is Same Tree  
     - Substructure of Tree (LeetCode variant)  
     - Check if t is a subtree of s (boolean)  
     - Merge Two Binary Trees (sum overlapping nodes)  

10. **Ancestor & Distance**  
    - **Representative:** Lowest Common Ancestor  
    - **Others:**  
      - Distance Between Two Nodes  
      - Kth Ancestor of a Tree Node  
      - Sum of Distances in Tree  
      - Path Between Two Nodes  

11. **Tree Metrics**  
    - **Representative:** Diameter of Binary Tree (longest path in edges)  
    - **Others:**  
      - Maximum Depth (height)  
      - Minimum Depth  
      - Maximum Path Sum (any path)  
      - Maximum Width  

12. **Leaf-Based Metrics**  
    - **Representative:** Deepest Leaves Sum  
    - **Others:**  
      - Sum of Left Leaves  
      - Sum of Right Leaves  
      - Count Leaf Nodes  
      - Leaf-Similar Trees (compare leaf sequences)  

13. **Aggregate Differences**  
    - **Representative:** Binary Tree Tilt (sum of \|sum(left) – sum(right)\|)  
    - **Others:**  
      - Check if Balanced (uses similar subtree sums)  
      - Equal Tree Partition (split sums)  

14. **Tree Merging & Transformation**  
    - **Representative:** Merge Two Binary Trees  
    - **Others:**  
      - Trim a BST (remove out-of-range nodes)  
      - Tree to Greater Sum Tree  
      - Convert BST to Doubly Linked List  

---

**How to Use This Roadmap:**  
1. **Pick one** representative problem in each category.  
2. **Solve it deeply:** code it, dry-run edge cases, visualize the recursion/iteration.  
3. When you encounter any “Others” in that category, you’ll recognize it as a small twist on the same pattern.  

Happy tree-taming! 🌲
