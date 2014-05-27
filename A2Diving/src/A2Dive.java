import java.util.Arrays;
import java.util.Scanner;


public class A2Dive {
	private final static int JUDGES_SIZE = 7;
	static Scanner keyboard = new Scanner(System.in);
	
	public static float inputValidScores() {
		float validScore=0.0f;
		//1. prompt user input
		System.out.println("Enter valid score between 0-10");
		validScore = keyboard.nextFloat();
		System.out.println(validScore);
		//2. validate between 0 -10
	
		return validScore; 
	}
	
	public static float inputDegreeOfDifficult() {
		float degreeOfDifficulty=0.0f;
		System.out.println("Enter degree of difficulty 1.2-3.8");
		degreeOfDifficulty = keyboard.nextFloat();
		System.out.println(degreeOfDifficulty);
		
		return degreeOfDifficulty;
	}
	
	public static float [] inputAllScores() {
		float [] scores = new float[JUDGES_SIZE];
		//float [] scores = {5.0f,0.4f,0.2f,0.8f,8.5f,10.0f,9.2f};
		//3. construct an array of scores
		scores[0] = inputValidScores();
		
		
		return scores;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputValidScores();
		inputDegreeOfDifficult();
		
		/*float [] temp = inputAllScores();
		Arrays.sort(temp);
		for (int i=0; i<JUDGES_SIZE;i++)
			System.out.println("TEMP\n" + temp[i]);
		for (int i=0; i<JUDGES_SIZE;i++)
			System.out.println("ORIGINAL\n" +inputAllScores()[i]);*/
	}

}
