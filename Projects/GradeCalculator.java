package JavaProgram.Projects;

/*
 *  Grade Calculator using java
 */
import java.util.*;
public class GradeCalculator {
	
	public static void calculator(float [] marks) {
		
		int n=marks.length;
	      float sum=0, avg;
	      int i;
	      
	      for(i=0; i<n; i++)
	         sum = sum + marks[i];
	      
	      // Average of marks 
	      avg = sum/n;
	      
	      System.out.print("\nGrade = ");
		  
	      if(avg>=94)
	         System.out.println("A");
	      else if(avg>=90 && avg<94)
	         System.out.println("A-");
	      else if(avg>=87 && avg<90)
	         System.out.println("B+");
	      else if(avg>=83 && avg<87)
	         System.out.println("B");
	      else if(avg>=80 && avg<83)
	         System.out.println("B-");
	      else if(avg>=77 && avg<80)
	         System.out.println("C+");
	      else if(avg>=73 && avg<77)
	         System.out.println("C");
	      else if(avg>=70 && avg<73)
	         System.out.println("C-");
	      else if(avg>=67 && avg<70)
	         System.out.println("D+");
	      else if(avg>=63 && avg<67)
	         System.out.println("D");
	      else if(avg>=60 && avg<63)
	         System.out.println("D-");
	      else
	         System.out.println("F");
	   }

	public static void main(String[] args) {
		
		System.out.println("Enter your numbers of subjects :- ");
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		float[] marks = new float[n];
		
		System.out.println("Enter Marks Obtained in Subjects :-  ");
		
	    for(int i=0; i<marks.length; i++)
	    	marks[i] = scan.nextFloat();
	    
	    // calling the function
	    calculator(marks);
		

	}

}
