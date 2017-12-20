class Calculator {
    private long number = 0;
    int n, p;
    
    int power(int n, int p) throws Exception {
        this.n = n;
        this.p = p;
        
        if(n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }
        
        if(p == 0) {
            return 1;
        }
        else {
            return n * power(n, p - 1);
        }
    }
}