package graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Intro {
    
    public static void main(String[] args){
        AdjacentMatrixRep();
    }

    public static void AdjacentMatrixRep(){

        //Adjacent matrix representation of graph

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  //no of nodes
        int m = sc.nextInt();  //no of edges

        int[][] arr = new int[m][n];

        for(int i = 0;i<n;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();

            arr[u][v] = 1;
            arr[v][u] = 1;
        }
    }

    public static void AdjacentListRep(){
  
        //Adjacent list representation of graph

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  //no of nodes
        int m = sc.nextInt();  //no of edges

        List<List<Integer>> graph = new ArrayList<>();

        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0;i<m;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u).add(1);
            graph.get(v).add(1);
        }

    }

}
