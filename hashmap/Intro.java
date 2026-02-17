package hashmap;

import java.util.HashMap;

public class Intro{

    public static void main(String[] args) {

        HashMap<String, Integer> population = new HashMap<>();

        //add - O(1)
        population.put("India",138);
        population.put("Pakistan", 22);
        population.put("Nepal",2);
        population.put("USA",33);
        population.put("Australia",4);

        //get - O(1)
        System.out.println(population.get("India"));
        System.out.println(population.get("USA"));

        //to check whether key value is present or not 
        // Time complexity - O(1)
        System.out.println(population.containsKey("India"));

        //traversing on keys - O(n)
        for(String s: population.keySet()){
            System.out.println(s);
        }

        //size of hashmap - O(!)
        System.out.println(population.size());

        //remove from hashmap - O(1)
        population.remove("India");
        System.out.println(population.containsKey("India"));

    }
}