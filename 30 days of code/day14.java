    // class constructor 
    Difference(int[] arr){
        this.elements = arr;
    }
    // compute difference
    public void computeDifference(){
        int[] arr = this.elements;
        this.maximumDifference = Integer.MIN_VALUE;
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                int diff = Math.abs(arr[i] - arr[j]);
                if(diff >= this.maximumDifference)
                    this.maximumDifference = diff;
            }
        }
    }
