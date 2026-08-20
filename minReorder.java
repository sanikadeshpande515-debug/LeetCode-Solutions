class Solution {
    public int minReorder(int n, int[][] connections) {
     List<int[]>[] graph=new ArrayList[n];

     for(int i=0;i<n;i++){
        graph[i]=new ArrayList<>();
     }
     for(int [] connection:connections){
        int a=connection[0];
        int b=connection[1];

        graph[a].add(new int[]{b,1});
        graph[b].add(new int []{a,0});
     }
    boolean[] visited=new boolean[n];
    return dfs(0,graph,visited);
    }
    private int dfs(int city, List<int[]>[]graph,boolean[] visited){
        visited[city]=true;
        int count =0;

        for(int[] edge:graph[city]){
            int next=edge[0];
            int direction=edge[1];

            if(!visited[next]){
                count+=direction;
                count+=dfs(next,graph,visited);
            }
        }
        return count;
    }
}
