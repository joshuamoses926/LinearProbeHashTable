# LinearProbeHashTable

Project #3

Due Dates:  Tuesday, June 29 at 11:59pm 

Submit:    eLearning

Late Policy:  24-hour late period, then zero

Instructions: This is an individual assignment.  All work should be your own.



Objective:

     Work with hash tables by creating a hash table using linear probing.


Description:

     Create a generic class called LinearProbingHashTable<K,V>.
     (Note that this is similar to Java's HashMap class).

     It should contain a private static class, Entry<K,V>.

     Because Java cannot create an array of a generic class, create the
     array for the table like this:  

       Entry<K,V> table[];      // declare generic
       table = new Entry[size]; // create as non-generic

     Note that this will generate a warning message when compiled.
 
     Your class should have the following methods.  The methods should 
     all operate on the object making the call (none are static).  

     You may use code from the textbook, but all other code must be
     your own.


   15 points
   a) public boolean insert(K key, V value)
         inserts entry, rehashes if half full,
         can re-use deleted entries, throws
         exception if key is null, returns
         true if inserted, false if duplicate.

   15 points
   b) public V find(K key)
          returns value for key, or null if not found

   15 points
   c) public boolean delete(K key)
          marks the entry deleted but leaves it there,
          returns true if deleted, false if not found

   15 points
   d) private void rehash( )
          doubles the table size, hashes everything to
          the new table, omitting items marked deleted

   10 points
   e) public int getHashIndex(K key)
          returns the hashed index for the given key.
          (this is the index before probing occurs)

   10 points
   f) public int getHashPosition(K key)
          returns the index position for the given key,
          or -1 if not found.
          (this is the index after probing occurs)

   10 points
   g) public String toString()
          returns a formatted string of the hash table,
          where k, v is the key and value at this location:
               0  k, v
               1  
               2  k, v   deleted
               ...
  

   10 points
   h) public static void main(String args[])
          demonstrate each of your methods


Submit to eLearning:
     LinearProbingHashTable.java
