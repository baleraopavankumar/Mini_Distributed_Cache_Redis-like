Mini Distributed Cache System

<img src = "https://github.com/baleraopavankumar/Mini_Distributed_Cache_Redis-like/blob/main/GH.png"/>

---

Problem Statement

In high-traffic applications, repeated database queries significantly increase response time and system load. Directly fetching frequently accessed data from the database leads to performance bottlenecks and poor scalability.

The Mini Distributed Cache System is designed to reduce database load and improve application performance by storing frequently accessed data in a fast, in-memory cache that can be shared across multiple services.




---

Distributed Cache Architecture

The system follows a distributed caching architecture where application services first check the cache before querying the database. If the data is present in the cache (cache hit), it is returned immediately. Otherwise (cache miss), data is fetched from the database and stored in the cache for future access.

This architecture ensures low latency, high throughput, and reduced database dependency.


---

Cache Operations

The cache supports core operations such as GET, PUT, and DELETE. Each cached entry is stored with an optional Time-To-Live (TTL) value to ensure automatic expiration of stale data.

By using TTL-based eviction, the system maintains data freshness while minimizing manual cache invalidation.


---

Cache Consistency and Eviction Policy

To manage limited memory efficiently, eviction policies such as Least Recently Used (LRU) are implemented. When the cache reaches its capacity, the least frequently accessed data is removed to make space for new entries.

Cache consistency is maintained by invalidating or updating cache entries whenever the underlying database data changes.

<img src="https://github.com/baleraopavankumar/Mini_Distributed_Cache_Redis-like/blob/main/AB.png"/>
---

Fault Tolerance and Reliability

The distributed cache is designed to handle failures gracefully. If a cache node becomes unavailable, the system falls back to the database and repopulates the cache once the node recovers.

This ensures high availability and prevents complete service disruption during partial failures.


---

Database Integration

The database acts as the source of truth, while the cache serves as a performance optimization layer. All write operations update the database first and then refresh the cache accordingly.

This read-through and write-through caching strategy ensures data consistency across the system.

<img src="https://github.com/baleraopavankumar/Mini_Distributed_Cache_Redis-like/blob/main/CD.png"/>
---

Performance Optimization

By serving frequent requests from memory instead of disk-based databases, the system achieves significant improvements in response time and throughput.

The distributed nature of the cache allows horizontal scaling by adding more cache nodes as traffic increases.


---

Results

The Mini Distributed Cache System demonstrates reduced database load and faster response times for read-heavy workloads. The caching layer improves overall system efficiency while maintaining data consistency and reliability.

This project showcases practical implementation of caching strategies commonly used in large-scale systems.

<img src="https://github.com/baleraopavankumar/Mini_Distributed_Cache_Redis-like/blob/main/EF.png"/>
---

Directions to Download the Repository and Run the Project

1. Download and install Git from https://git-scm.com/downloads.


2. Right-click on the desired folder and select Git Bash Here.


3. Clone the repository:



git clone https://github.com/baleraopavankumar/mini-distributed-cache.git

4. Navigate to the project directory.


5. Start Redis and MySQL using Docker:



docker-compose up -d

6. Build and run the Spring Boot application:



mvn clean install
mvn spring-boot:run

7. Access the APIs to perform cache operations and observe cache hits and misses.



That’s it. You should now be able to explore and understand the distributed cache system.
