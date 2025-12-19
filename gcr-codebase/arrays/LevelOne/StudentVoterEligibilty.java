// levelOne array practice problem 

 import java.util.*;
 
   public class StudentVoterEligibilty  {
    
        public static void main(String []args ) {

         Scanner kb=new Scanner(System.in);

         //Creating an array of size 10
         int studentAge []=new int[10];

         //taking the the input in the array of Integer which is the age of the student
         System.out.println("Enter the Age of the Student ");
            for(int i=0;i<studentAge.length;i++){
            	studentAge[i]=kb.nextInt();
             } 
             
             for(int i=0;i<studentAge.length;i++){
            	if(studentAge[i]<0){
            		System.out.println(" The invalid age Entered by user ");
            		System.exit(0);
            	}else{
            		if(studentAge[i]>=18){
            			System.out.println("Student with the age "+ studentAge[i]+" is Eligible for Vote." );

            		}else{
            			System.out.println("Student with the age "+ studentAge[i]+" is Not Eligible for Vote." );
            		}

            	}
             } 

           kb.close();

         }
   }
