class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(true){
            n=square(n);
            if(n==1)break;
            if(set.contains(n))break;
            set.add(n);
        }
        return n==1 ? true : false;
    }
    
    public int square(int n){
        int sum=0;
        while(n>0){
            sum+=(n%10)*(n%10);
            n/=10;
        }
        return sum;
        }
    }
