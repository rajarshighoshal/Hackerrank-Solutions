class Calculator implements AdvancedArithmetic{
    int n;
    
    public int divisorSum(int n){
        this.n = n;
        
        int num = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                num += i;
            }
        }
        
        return num;
    }
}