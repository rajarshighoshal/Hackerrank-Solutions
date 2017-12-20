class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName, String lastName, int identification, int[] scores){
        // calling super class constructor
        super(firstName, lastName, identification);
        this.testScores = scores;
    }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate(){
        int subNum = testScores.length;
        int sum = 0, avg = 0;
        for(int i = 0; i < subNum; i++){
            sum += testScores[i];
        } 
        
        avg = sum/subNum;
        
        if(90 <= avg && avg <= 100)
            return 'O';
        if(80 <= avg && avg < 90)
            return 'E';
        if(70 <= avg && avg < 80)
            return 'A';
        if(55 <= avg && avg < 70)
            return 'P';
        if(40 <= avg && avg < 55)
            return 'D';
        else
            return 'T';
    }
}