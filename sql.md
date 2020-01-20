***Question:***  
Single server vs Sharding/partitioning vs clustring vs replication vs (redis)sentinel.  
  
<details>
  <summary>Answer</summary>

***Replication:***  
The strategy of duplicating data across more than one node. There are many varieties, simplest being Master-Slave(s) or Leader-Follower and can either be synchronous or asynchronous.  
1. To have high availability of data. Even if a node goes down, the data is still available from other nodes in the cluster.  
2. Separate nodes for write and read. Data is replicated from the write cluster to all read clusters. This ensures that under high transaction volumes, the read operations are not getting delayed by write operations and vice-versa.  
3. Multiple nodes for read operations and for write operations. This ensures that the read and the write operations are load balanced across multiple nodes resulting in higher scalability and data throughput.  

***Sharding/Partitioning:***    
Sharding, also often called partitioning, involves splitting data up based on keys. This increases performance because it reduces the hit on each of the individual resources, allowing them to share the burden rather than having it all in one place.  
For example, you can use a hash function on your Redis keys to turn them into numbers. Then, if you want two shards, you can send all the even-numbered keys to one instance while placing all of the odd-numbered keys to the second instance. This could be done using other algorithms for different numbers of shards.  

Redis sharding can be implemented in several ways:  

*Client side partitioning:* Clients select the proper Redis instance to read or write a particular key.  
*Proxy-assisted partitioning:* A proxy is used to handle requests and send the requests to the proper Redis instance.  
*Query routing:* The query is sent to a random instance, which then takes on the responsibility of redirecting the client to the proper Redis instance.  

***clustring***  
Database clustering is a bit of an ambiguous term, some vendors consider a cluster having two or more servers share the same storage, some others call a cluster a set of replicated servers.  

Replication defines the method by which a set of servers remain synchronized without having to share the storage being able to be geographically disperse, there are two main ways of going about it:  

master-master (or multi-master) replication: Any server can update the database. It is usually taken care of by a different module within the database (or a whole different software running on top of them in some cases).  

Downside is that it is very hard to do well, and some systems lose ACID properties when in this mode of replication.  

Upside is that it is flexible and you can support the failure of any server while still having the database updated.  

master-slave replication: There is only a single copy of authoritative data, which is the pushed to the slave servers.  
 
Downside is that it is less fault tolerant, if the master dies, there are no further changes in the slaves.  

Upside is that it is easier to do than multi-master and it usually preserve ACID properties.  

Load balancing is a different concept, it consists distributing the queries sent to those servers so the load is as evenly distributed as possible. It is usually done at the application layer (or with a connection pool). The only direct relation between replication and load balancing is that you need some replication to be able to load balance, else you'd have a single server.  


*How does cluster architecture work?*  
In cluster architecture, all requests are split with many computers so that an individual user request is executed and produced by a number of computer systems. The clustering is serviceable definitely by the ability of load balancing and high-availability. If one node collapses, the request is handled by another node. Consequently, there are few or no possibilities of absolute system failures.  

*Types of Database Clusters*  

Database Cluster is highly comprehensive. It covers multiple tiers and arrangements depending on the requirement of the system. Here, we will brief three types of cluster computing architectures. Failover clusters, high-performance clusters, and load balancing clusters.  

*1. Failover/High Availability clusters:* A machine can go wrong or stop working anytime. System administrators manage such failovers and fix issues efficiently. Here, the clusters come to the rescue. Cluster prepares the service availability by replicating servers and by redundant software and hardware reconfiguration. So, every system is controlling the other and works on requests if any one node fails. These types of clusters are profitable for those users who depend on their computer systems completely. For example, e-commerce, websites, etc.  

The system should be capable enough to know which all systems are running, from which IP is running, which request and what would be the progression of action in case of a crash. The important thing is that the servers should not stop working anyway.  

*2. High-Performance Clusters:* The purpose of developing high-performance database clusters is to produce high performing computer systems. They operate co-extending programs that are needed for time-exhaustive computations. Such variety of clusters are commonly preferred by the scientific industries. The basic aim is intelligently sharing the workload.  

*3. Load Balancing Clusters:* These database clusters serve for distributing loads between different servers. They strive to provide an increased network capacity, finally increasing the performance. Systems in this network integrate their nodes, with the help of which user requests are equally divided across the participating nodes. The system is not working together, rather it redirects requests individually as they occur.  


reference:  
http://www.ndimensionz.com/kb/what-is-database-clustering-introduction-and-brief-explanation/

</details>

***Question:***  
what is master and slave replica-set.  
<details>
  <summary>Answer</summary>
</details>



***Group by:***  
www.geeksforgeeks.org/sql-group-by/amp/

***Keys:***  

***Joins:***  
https://www.guru99.com/sql-server-joins.html  


***Qustion***  
Difference between where and having  

***Question***  
what is view  

***Question***  
what is indexing  


***Interview Qiestion:***  
https://artoftesting.com/interviewSection/sql-queries-for-interview.html  
  
https://softwaretestinghelp.com/50-popular-sql-interview-questions-for-testers/amp/
