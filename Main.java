import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String inputs = scan.nextLine();

       
        String[] ints = inputs.split(" ");

        

        boolean if1 = false;
        boolean if2 = false;
        boolean if3 = false;
        boolean if4 = false;
        boolean if5 = false;
        boolean if6 = false;
        boolean if7 = false;
        boolean if8 = false;
        boolean if9 = false;

        for( int i = 0; i < 9; i++)
        {
            if(ints[i].equals("1"))
            {

                if1 = true;
            }
            if(ints[i].equals("2"))
            {
                if2 = true;
            }
            if(ints[i].equals("3"))
            {
                if3 = true;
            }
            if(ints[i].equals("4"))
            {
                if4 = true;
            }
            if(ints[i].equals("5"))
            {
                if5 = true;
            }
            if(ints[i].equals("6"))
            {
                if6 = true;
            }
            if(ints[i].equals("7"))
            {
                if7 = true;
            }
            if(ints[i].equals("8"))
            {
                if8 = true;
            }
            if(ints[i].equals("9"))
            {
                if9 = true;
            }
        }

        

       if((if1 == true) && (if2 == true) && (if3 == true) && (if4 == true) &&(if5 == true) && (if6 == true) &&  (if7 == true) && (if8 == true) && (if9 == true))
      {
        System.out.println("YES");
      }
      else{
        System.out.println("NO");
      }
    }
}

