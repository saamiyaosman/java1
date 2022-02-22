
public class Exersize1 {
	public static void main(String[] args) {
        //All I want you to do is just make a comment and explain what's going on in each line        
		//Fix the issue -- Create a Dog...        
		boolean amIHappy = false; // A boolean names amIHAppy is being declared and assigned false    
		int weight = 30; // define variable weight with data type of integer
        String name = "Billy Bob"; // define variable name with data type of string
        Dog goodBoy = new Dog(name, weight); // call class dog to run with variables name and weight
        int x = weight - 10; // new variable that subtracts 10 from weight variable and data type is integer
        if (x < 15) goodBoy.bark(); //for loop which runs method bark from class Dog as long as the x varable<15
        while (x < 3) {
            goodBoy.play();// while loop which runs method play from class Dog as long as the variable x is less than 3
        }// end of method            
        int[] numList = {1,2,3,4,5,6}; // creating a list with data type integer
        System.out.println("How are you"); // output `how are you`
        System.out.println("My " + name + " is doing great"                + " how's yours");
        // output `my Billy Bob is doing great how's yours`
        String num = "305"; // define variable num with data type of string
        int z =Integer.parseInt(num) ; // define variable z with data type integer
        System.out.println(num); // output contents of variable num
    }

}
