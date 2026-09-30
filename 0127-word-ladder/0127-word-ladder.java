class Solution {
    public int ladderLength(String bw, String ew, List<String> wl) {
        Set<String> s = new HashSet<>();
        boolean f = false;
        for(String p: wl){
            s.add(p);
            if(p.compareTo(ew)==0)
                f = true;
        }
        if(!f)   return 0;
        Queue<String> q = new LinkedList<>();
        q.add(bw);
        int l = 0;
        int lsize = 0;
        while(!q.isEmpty()){
            l++;
            lsize = q.size();
            while(lsize-->0){
                String curr = q.poll();
                for(int i=0;i<curr.length();i++){
                    StringBuilder temp = new StringBuilder(curr);
                    for(char c='a';c<='z';c++){
                        temp.setCharAt(i,c);
                        String temp1 = temp.toString();
                        if(temp1.compareTo(ew)==0)
                            return l+1;
                        if(temp1.compareTo(curr)==0)
                            continue;
                        if(s.contains(temp1)){
                            q.add(temp1);
                            s.remove(temp1);
                        }
                    }
                }
            }
        }
        return 0;
    }
}