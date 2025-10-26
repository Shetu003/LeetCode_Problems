class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        int indegree[] = new int[numCourses]; //counts how many prerequisites course has
        for(int i=0; i<numCourses; i++){
            graph.add(new ArrayList<>());
        }
        for(int pair[] : prerequisites){
            int course = pair[0];
            int prereq = pair[1];
            graph.get(prereq).add(course); //get the prereq of course and increment indegree
            indegree[course]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<numCourses; i++){
            if(indegree[i] == 0){ //courses witb indegree 0 taken 1st
                q.add(i);
            }
        }
        int count = 0;

        //bfs traversal
        while(!q.isEmpty()){
            int curr = q.poll();
            count++;
            for(int neighbour : graph.get(curr)){
                indegree[neighbour]--;
                if(indegree[neighbour] == 0){
                    q.add(neighbour);
                }
            }
        }
        return count == numCourses; //Check if All Courses Finished
    }
}