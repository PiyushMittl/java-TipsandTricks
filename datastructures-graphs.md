**Spanning Tree vs Minimum Spanning Tree**  
```
Spanning Tree:  
1. Spanning tree of a graph is the minimal connected subgraph of the graph which contains all the vertices of the given graph with minimum possible number of edges.  
3. Spanning tree doesn't contain cycles. It also must be connected.  
4. Disconnected graph cannot have spanning tree as it can't be spanned to all its vertices.  
5. Suppose the given graph is having n vertices then it's spanning tree consists of n-1 edges and n vertices.  
6. A graph can have more than one spanning trees.  
7. Spanning tree is minimally connected. It infers that on removing any edge from spanning tree, the graph will become disconnected.  
```
```
Minimum Spanning Tree:  
1. The concept of Minimum spanning tree comes in the case of weighted graphs (i.e., graphs in which different weights are assigned to the edges).  
2. Minimum spanning tree is a spanning tree that has minimum weight than all other spanning trees of the same graph.  
3. Weight of a spanning tree is calculated by adding all the weights of the edges of the spanning tree.  
4. A given graph has a unique mimimum spanning tree. So a given graph can have more than one spanning trees but has a unique minimum spanning tree.  
5. Two most important algorithms for calculating Minimum Spanning Tree are: Kruskal's Algorithm and Prim's Algorithm.  
```


**Minimum Spanning Tree Algorithm**
Dijkstra vs Prims vs Kruskal  
`Dijkstras` algorithm is used only to find shortest path.  
In Minimum Spanning tree(`Prim's` or `Kruskal's` algorithm) you get minimum egdes with minimum edge value.  


1. Dijksra Algorithm(use greedy and sigle souce shortest path, workes with directed and undirected both but doesn't work with negetive weight)  
Dijkstra’s algorithm is a Greedy algorithm and time complexity is O(VLogV) (with the use of Fibonacci heap). Dijkstra doesn’t work for Graphs with negative weight edges, Bellman-Ford works for such graphs. Bellman-Ford is also simpler than Dijkstra and suites well for distributed systems. But time complexity of Bellman-Ford is O(VE), which is more than Dijkstra  

2. Prims Algorithm
* used to find minimum cost spanning tree  
* works for connected and undirected graph  
* algo starts with a node
3. Kruskal Algorithm  
* used to find minimum cost spanning tree  
* can work for un-connected and indirected graph
* algo start with an edge



4. Bellman Ford Algorithm(use DP and sibgle source shortest path also, failed if there is -ve weight with cycle)  
https://youtu.be/FtN3BYH2Zes  
https://youtu.be/2raV0H9KqY8  

5. Floyd-Warshall Algorithm(use DP and all pair shortest path)  
Dijkstra and Bellman is single source shortest path algo 
Floyd is all pair shortest path  
