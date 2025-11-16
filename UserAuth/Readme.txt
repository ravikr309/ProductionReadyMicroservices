++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Redis : In Memory, Fast : Single Threaded, Fault tolorant (Divide into multiple cluster)
        used as  : Persistent Db, Caching, Message Broker
        Key value therefor Lookup O(1)

  Note Redis can act as a primary or secondary database for storing data persistently, using features like RDB snapshots or AOF (Append Only File) for durability.
  
Datatypes :Set Sorted Set String 

Need to Serialise and DeSerialize : 
    Reason : Redis Only understand the String byte array.it doest not understand the java object so
    so need to serialize and deserialize it if not then it will store data as to String 


++++++++++++++++++++++++++++++++++++++++++++++++++++
POJO : Plain Old Java object : Used in Serializable No Dependency of the framework here
Enity : POJO that designed to interact with database mapping
DTO : DEsign Pattern to acheive encapsulation while transfering the data b\w multiple layers.


+++++++++++++++++++++++++++++++++++++++++++++++++++++