
import java.util.Scanner;

    public class CheckNum{

             public static void main(String [] args){

                Scanner kb=new Scanner(System.in);

                    int number[] = new int[5];

                        // Taking the input from user of the Number to be checked 
                    System.out.println(" Enter the Number ");
                          for(int i=0;i<number.length;i++){
                            number[i]=kb.nextInt();
                          }

                          for(int i=0;i<number.length;i++){

                            if(number[i]>0){
                              if(number[i]%2==0){
                                System.out.println(" The Number "+ number[i]+" is Postive and even ");
                              }else{
                                System.out.println(" The Number "+ number[i]+" is Postive and odd ");
                              }
                            }
                            else if(number[i]<0){
                              System.out.println(" The Number "+ number[i]+" is Negative ");
                            }
                            else{
                              System.out.println(" The Number is Zero ");
                            }

                          }

                        if(number[0]>number[number.length-1]){
                          System.out.println(" The first Number "+ number[0]+" is Greater than last Number "+ number[number.length-1]);
                        }
                        else if(number[0]<number[number.length-1]){
                           System.out.println(" The first Number "+ number[0]+" is lesser than last Number "+ number[number.length-1]);
                        }
                        else{
                           System.out.println(" The first Number is Equal to last Number in the array");
                        }

                kb.close();
                
             }

     }