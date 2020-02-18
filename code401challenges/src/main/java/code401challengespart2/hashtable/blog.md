# Hashtables
This class implements a hash table, which maps keys to values. Any non-null object can be used as a key or as a value.


## Challenge
Implement a Hashtable capable of adding, getting, and checking if a key exists in the hashtable.


## Approach & Efficiency
My approach is using Node class

add: Big O is O(n)
get:O(1)
contains:O(1)

## API
add: takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
get: takes in the key and returns the value from the table.
contains: takes in the key and returns a boolean, indicating if the key exists in the table already.
hash: takes in an arbitrary key and returns an index in the collection.
