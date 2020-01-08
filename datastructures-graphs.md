Spanning Tree vs Minimum Spanning Tree  
```
Spanning Tree:  
Spanning tree of a graph is the minimal connected subgraph of the graph which contains all the vertices of the given graph with minimum possible number of edges.  
Spanning tree doesn't contain cycles. It also must be connected.  
Disconnected graph cannot have spanning tree as it can't be spanned to all its vertices.  
Suppose the given graph is having n vertices then it's spanning tree consists of n-1 edges and n vertices.  
A graph can have more than one spanning trees.  
Spanning tree is minimally connected. It infers that on removing any edge from spanning tree, the graph will become disconnected.  
```
```
**Minimum Spanning Tree:**  
The concept of Minimum spanning tree comes in the case of weighted graphs (i.e., graphs in which different weights are assigned to the edges).  
Minimum spanning tree is a spanning tree that has minimum weight than all other spanning trees of the same graph.  
Weight of a spanning tree is calculated by adding all the weights of the edges of the spanning tree.  
A given graph has a unique mimimum spanning tree. So a given graph can have more than one spanning trees but has a unique minimum spanning tree.  
Two most important algorithms for calculating Minimum Spanning Tree are: Kruskal's Algorithm and Prim's Algorithm.  
```


Minimum Spanning Tree Algorithm

1. Dijksra Algorithm  
Dijkstra’s algorithm is a Greedy algorithm and time complexity is O(VLogV) (with the use of Fibonacci heap). Dijkstra doesn’t work for Graphs with negative weight edges, Bellman-Ford works for such graphs. Bellman-Ford is also simpler than Dijkstra and suites well for distributed systems. But time complexity of Bellman-Ford is O(VE), which is more than Dijkstra  



2. Prims Algorithm (minimum spanning tree)
3. Kruskal Algorithm (minimum spanning tree)


4. Bellman Ford Algorithm (failed if there is -ve weight with cycle)  
https://youtu.be/FtN3BYH2Zes  
https://youtu.be/2raV0H9KqY8

