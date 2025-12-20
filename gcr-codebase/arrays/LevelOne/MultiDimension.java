import java.util.*;

    public class MultiDimension{
        
        public static void main(String[]args){

            Scanner kb=new Scanner(System.in);

            int row=kb.nextInt();
            int column=kb.nextInt();

            int arr[][]=new int[row][column];

            int brr[]=new int[row*column];

            int index=0;

                // Taking Input in the 2D array
            System.out.println(" Enter the value Elements in 2D array  ");

                for(int i=0;i<row;i++){
                    for(int j=0;j<column;j++){
                    arr[i][j]=kb.nextInt();
                    
                    brr[index]=arr[i][j];
                    index++;
                    }
                }
            System.out.println(" The Elements of 2D array which is copied in the 1D array : ");

            for(int i=0;i<brr.length;i++){

              System.out.print( brr[i]+" ");               
            }

            kb.close();
        }

    } 