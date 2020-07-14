import java.util.Scanner;


public class If {


    public static void main (String []args){
        int N;
        Scanner index=new Scanner(System.in);
        N = index.nextInt();
        if(N%2==1)
        {
            System.out.println("Weird");
        }
           else if (N%2==0 && (N>=2 && N<=5) || N>=20  ) {
            System.out.println("Not Weird");
        }
            else if (N%2==0 && (N>=6 && N<=20) )
        {
            System.out.println("Weird");
        }
            else {
            System.out.println("");
        }
    }


}
