package DSA.Graphs;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSandDFS {
    static class Edge{
        int src;
        int des;
        Edge(int src,int des){
            this.src = src;
            this.des = des;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6)); 

        graph[6].add(new Edge(6, 5)); 
    }
    public static void bfs(ArrayList<Edge> graph[], boolean visited[],int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            int current = q.remove();
            if(visited[current] == false){
                System.out.print(current+" ");
                visited[current] = true;
                for(int i=0;i<graph[current].size();i++){
                    Edge e = graph[current].get(i);
                    q.add(e.des);
                }
            }
            q.remove(current);
        }
    }
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean[] visited){
        System.out.print(curr + " ");
        visited[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(visited[e.des] == false){
                dfs(graph, e.des, visited);
            }
        }
    }
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        boolean[] visited = new boolean[v];
        // BFS
        for(int i=0;i<v;i++){
            if(visited[i] == false){
                bfs(graph, visited,i);
            }
        }

        //DFS
        // for(int i=0;i<v;i++){
        //     if(visited[i] == false){
        //         dfs(graph, i, visited);
        //     }
        // }
    }
}
