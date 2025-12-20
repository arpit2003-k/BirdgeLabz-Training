import java.util.*;

  public class MeanHeight{

    public static void main(String[]args){

       Scanner kb=new Scanner(System.in);

       double height []=new double[11];
       double sum=0.0;

           System.out.println(" Enter the Height of the players ");

          for(int i=0;i<height.length;i++){
              height [i]=kb.nextDouble();
              sum+=height[i];
          }

        System.out.println(" The Mean Height of the players of the Football Team is : "+sum/height.length);
    }

  }