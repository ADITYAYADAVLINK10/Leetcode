class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> Set=new HashSet<>(); 
        while(true){
            int sum =0;
            while(n>0){
            sum+=Math.pow(n%10,2.0);
            n=n/10;
            }
            if(sum==1){
                return  true;
            }else{
                n=sum;
            }
            if(Set.contains(n)){
                return false;
            }
            Set.add(n);

        }
    }
}