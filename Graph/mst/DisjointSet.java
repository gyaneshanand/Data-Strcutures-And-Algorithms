package Graph.mst;

import java.util.ArrayList;
import java.util.List;

public class DisjointSet {

    public List<Integer> rank;
    public List<Integer> size;
    public List<Integer> parent;

    public DisjointSet(int N){

        // Initilaize the lists
        rank = new ArrayList<>();
        size = new ArrayList<>();
        parent = new ArrayList<>();

        for(int it=0; it<=N; it++){
            // Initially rank of each component is 0
            rank.add(0);
            // Initially size of each component is 1
            size.add(1);
            // Initially ultimate Parent of each component is itself
            parent.add(it);
        }
    }

   public int findParent(int node){
        if(parent.get(node)==node){
            return node;
        }

        int ulp = findParent(parent.get(node));
        parent.set(node, ulp);
        return ulp;
   }

   public void unionBySize(int u, int v){
        int ulp_u = findParent(u);
        int ulp_v = findParent(v);

        if(u==v)
            return;

        int size_ulp_u = size.get(ulp_u);
        int size_ulp_v = size.get(ulp_v);

        if(size_ulp_u < size_ulp_v){
            parent.set(u, ulp_v);
            size.set(size_ulp_v, size_ulp_v+size_ulp_v);
        }
        else{
            parent.set(v, ulp_u);
            size.set(size_ulp_u, size_ulp_v+size_ulp_v);
        }
   }

   public void unionByRank(int u, int v){
        int ulp_u = findParent(u);
        int ulp_v = findParent(v);

        if(u == v)
            return;

        int rank_ulp_u = rank.get(ulp_u);
        int rank_ulp_v = rank.get(ulp_v);
        if(rank_ulp_u < rank_ulp_v){
            parent.set(ulp_u, ulp_v);
        } else if (rank_ulp_v < rank_ulp_u) {
            parent.set(ulp_v, ulp_u);
        } else {
            parent.set(ulp_v, ulp_u);
            rank.set(ulp_u, rank_ulp_u+1);
        }
   }
}

class Driver{
    public static void main(String[] args) {
        DisjointSet ds = new DisjointSet(4);

        // Union By Size
//        ds.unionBySize(0, 1);
//        ds.unionBySize(1, 2);
//        ds.unionBySize(1, 3);

        // Union By Rank
        ds.unionByRank(0, 1);
        ds.unionByRank(1, 2);
        ds.unionByRank(1, 3);

        if(ds.findParent(1) == ds.findParent(4)){
            System.out.println("Same Component");
        }
        else {
            System.out.println("Different Component");
        }

        ds.unionByRank(1, 4);
        if(ds.findParent(1) == ds.findParent(4)){
            System.out.println("Same Component");
        }
        else {
            System.out.println("Different Component");
        }
    }
}
