class Pair {
    int pos;
    boolean canGoBack;

    Pair(int pos, boolean canGoBack) {
        this.pos = pos;
        this.canGoBack = canGoBack;
    }
}

class Solution {
    public int minimumJumps(int[] forbidden, int a, int b, int x) {
        
        HashSet<Integer> forwardVisited = new HashSet<>();
        HashSet<Integer> backwardVisited = new HashSet<>();
        int steps = 0;
        HashSet<Integer> forbid = new HashSet<>();

        for(int f : forbidden) {
            forbid.add(f);
        }

        Queue<Pair> bfs = new LinkedList<>();

        bfs.add(new Pair(0, false));
        forwardVisited.add(0);
        backwardVisited.add(0);

        int max = a +b +x + Collections.max(forbid);


        while(!bfs.isEmpty()) {

            int size = bfs.size();

            while(size -- > 0) {
                Pair curr = bfs.poll();

                if (curr.pos == x) {
                    return steps;
                }

                int next_a = curr.pos + a;

                

                if (next_a >=0 && next_a < max && !forbid.contains(next_a) && !forwardVisited.contains(next_a)) {
                    forwardVisited.add(next_a);
                    bfs.offer(new Pair(next_a, true));
                }


                int next_b = curr.pos - b;

                if (curr.canGoBack && next_b >=0 && next_b < max && !forbid.contains(next_b) && !backwardVisited.contains(next_b)) {
                    backwardVisited.add(next_b);
                    bfs.offer(new Pair(next_b, false));
                }

            }
            steps++;
        }

        return -1;
    }
}