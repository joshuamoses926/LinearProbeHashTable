package LPHT;

import java.util.*;

//Create generic class
public class LinearProbingHashTable {

    //Create Hash Table 
    public static Hashtable<String, Integer> comedy = new Hashtable<>();

    //Insert Entries    
    public static boolean insert(String key, int value) {
        if(key != null)
        {
            comedy.put(key, value);
            return true;
        }    
        else
            return false;
    }

    //Finds the Value based on Key
    public static int find(String key) {
        int age = 0;
        if(key == null)
        {
            return 0;
        }
        else{
            age = comedy.get(key);
            return age;
        }
    }

    //Marks the entry as deleted.
    public static boolean delete(String key) {

        if(key != null)
        {
            comedy.remove(key);
            return true;
        }    
        else
            return false;
    }

    //doubles table size 
    public static void rehash() {
        Hashtable<String, Integer> rehashComedy = new Hashtable<>(comedy);
        System.out.println("Display rehashed HashTable: ");
        System.out.println(rehashComedy + " ");
    }

    //returns the hashed index
    public static int getHashIndex(String key) {
        if(key != null)
        {
            return 1;
        }
        else{
            return 0;
        }
    }

    //returns the hashed position
    public static int getHashPosition(String key) {

        return (int) key.hashCode();
    }

    public static void ToString()
    {
        comedy.forEach((name, age) -> System.out.print(" " +name + " " + age + " \n"));
    }

    //Main method to demonstrate the other methods.
    public static void main(String args[]) {
        //Initial Inserts.
        //(Comdian Name, Comdian age)
        comedy.put("Joe Rogan", 53);
        comedy.put("Nikki Glaser", 37);
        comedy.put("Eddie Murphy", 60);
        comedy.put("Tom Segura", 42);
        comedy.put("Bruce Bruce", 56);
        comedy.put("Whitney Cummings", 38);
        comedy.put("Damon Waynes", 60);
        comedy.put("Joey Diaz", 58);
        
        //Display Initial HashTable
        System.out.println("Display Initial HashTable: ");
        System.out.println(comedy + "  \n");

        //Testing the insert methods.
        System.out.println("Inserting new comdian...");        
        boolean insertResult = insert("Theo Von", 41);
        System.out.println("Return Type: " + insertResult);
        //Display Updated HashTable
        System.out.println("Display Updated HashTable: ");
        System.out.println(comedy + "  \n");

        //Testing the find method
        System.out.println("Finding value for key 'Joe Rogan'...");
        int findResult = find("Joe Rogan");
        System.out.println("Joe Rogan's age: " + findResult + "\n");

        //Testing the delete method
        System.out.println("Deleting Nikki Glaser...");
        boolean deleteResult = delete("Nikki Glaser");
        System.out.println("Return Type: " + deleteResult);
        //Display Updated HashTable
        System.out.println("Display Updated HashTable: ");
        System.out.println(comedy + "  \n");

        //Testing rehash function
        System.out.println("Calling rehashed method: "); 
        rehash();  
        System.out.println(comedy + "  \n");    

        //Get Hash Index
        System.out.println("Get Hash Index of Joe Rogan...");
        int hashIndex = getHashIndex("Joe Rogan");
        System.out.println("Hash Index: " + hashIndex + "\n");

        //Get Hash Position
        System.out.println("Get Hash Position of Joe Rogan...");
        int position = getHashPosition("Joe Rogan");
        System.out.println("Hash Position: " + position + "\n");

        //Displaying ToString
        System.out.println("Displaying the ToString Method...");
        ToString();

    }
}