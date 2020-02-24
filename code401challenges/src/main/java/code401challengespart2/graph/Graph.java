package code401challengespart2.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Graph {
    private Map<Integer, ArrayList<Integer>> adjListMap;
    public Graph(int vertex){
        adjListMap=new HashMap<Integer, ArrayList<Integer>>();
        for(int i=0;i<=vertex;i++){
            ArrayList<Integer>neighbours= new ArrayList<Integer>();
            adjListMap.put(i,neighbours);

        }
    }




}
