public class Person {
    private int age;	
  
	public Person(int initialAge) {
  		// checking initialAge
        if(initialAge < 0){
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        }
        else{
            this.age = initialAge;
        }
	}

	public void amIOld() {
  		// if <13 young
        if(this.age < 13){
            System.out.println("You are young.");
        }
        // if >=13 && < 18 teenager
        else if(this.age >= 13 && this.age < 18){
            System.out.println("You are a teenager.");
        }
        // else old
        else{
            System.out.println("You are old.");
        }
        
	}

	public void yearPasses() {
  		// Increment this person's age
        this.age++;
	}
