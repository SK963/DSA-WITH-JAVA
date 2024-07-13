 import java.util.*;
 import java.util.LinkedList;


 public class Graph{
    int vertices;
    LinkedList<Edge>[] adjlist ;

    @SuppressWarnings("unchecked")
    Graph(int vertices) {
        this.vertices = vertices;
        adjlist = new LinkedList[vertices];
        for(int i = 0 ; i < 5 ; i++ ){
            adjlist[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src ,  int dest , int wt){
        adjlist[src].add(new Edge(src, dest, wt));
    }

    class Edge{
        int src ; 
        int dest ;
        int wt;


        Edge(int s , int d , int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }

        public String toString(){
            return "[Node :"  + this.dest + "|wt : " + this.wt + "]";
        }
    }




    public void printGraph(Graph graph) {
        for(int i =  0 ; i< graph.vertices ; i++)
            {
                System.out.print("Node" + i + " : Connects : ");
                System.out.println(adjlist[i]);
            }
        
        
    }

    public void bfs(int StartEdge) {

        System.out.print("BFS traversal :");

        Queue<Integer> queue = new LinkedList<>();
        boolean visited[] =  new boolean[this.vertices];

        queue.add(StartEdge);
        visited[StartEdge] = true;


        while(!queue.isEmpty())
        {
            int currentNode = queue.poll();
            System.out.print(currentNode + " ");

            Iterator<Edge> it  = adjlist[currentNode].iterator();

            while(it.hasNext()){
                Edge e = it.next();
                int neighbour = e.dest;
                if(!visited[neighbour]){
                    queue.add(neighbour);
                    visited[neighbour] = true;
                }
                
            }

        }
        System.out.println();

    }

    public void dfs(int startEdge){
        System.out.print("DFS  travel from  node" + startEdge + " : ");
        
        Stack<Integer> stack = new Stack<>();
        boolean visited[] = new boolean[this.vertices];
        stack.push(startEdge);
        visited[startEdge] = true;


        while(!stack.isEmpty()){
            int currentNode = stack.pop();
            System.out.print(currentNode+" ");

            for(Edge e : adjlist[currentNode]){
                int neighbour = e.dest ;
                if(!visited[neighbour]){
                    stack.push(neighbour);
                    visited[neighbour] = true;
                }

                
            }
            
        }

        System.out.println();
        
    }


    public static void main(String[] args) {

        Graph graph = new Graph(5);

        graph.addEdge(0,1,5);

        graph.addEdge(1,0,5);
        graph.addEdge(1,2,1);
        graph.addEdge(1,3,3);

        graph.addEdge(2,1,1);
        graph.addEdge(2,3,1);
        graph.addEdge(2,4,4);

        graph.addEdge(3,1,3);
        graph.addEdge(3,2,1);

        graph.addEdge(4,2,4);

        /*
            0
           / 
          1
        / \
       2-->3
     /
    4

         */

        graph.printGraph(graph);

        graph.bfs(0);
        graph.dfs(0);
        
    }
 }