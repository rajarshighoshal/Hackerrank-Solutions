    /**
    *    Method Name: printArray
    *    Print each element of the generic array on a new line. Do not return anything.
    *    @param A generic array
    **/
    
    public void printArray(T[] inputArray) {
        for(T element : inputArray){
            System.out.println(element);
        }
    }