//Rock Paper Scissor game by Jishu
import java.util.Scanner;
import java.util.Random;

public class rps {
   static  int comp=0,human=0,comp_move,human_move;
    static void compwin()
    {
        System.out.println("Computer +1");
        System.out.println("***********************");
        comp++;
    }

    static void humanwin()
    {
        System.out.println("Human +1");
        System.out.println("***********************");
        human++;
    }
    public static void main(String[] args) {
        System.out.println("=================");
        System.out.println("1.Rock\n2.Paper\n3.Sciccor\n");
        
        for(int i=0;i<5;i++)
        {
            Scanner sc =new Scanner(System.in);
            Random random = new Random();
            System.out.print("Enter move: ");
            human_move=sc.nextInt();
            comp_move=random.nextInt(1,4);
            
            if(comp_move==human_move)
            {
                System.out.println("Same moves noicee :))");
                System.out.println("***********************");
            }
            else if(comp_move==1 && human_move==2 || comp_move==2 && human_move==3 || comp_move==3 && human_move==1)
            {
               compwin();
            }
            
            else if(comp_move==2 && human_move==1 || comp_move==3 && human_move==2 || comp_move==1 && human_move==3)
            {
                humanwin();
            }
           
            else
            {
                System.out.println("DumbPhuck can't even input properly...");
                System.out.println("Computer +1");
                System.out.println("***********************");
                comp++;
            }

            
            
        }
       
        System.out.println("\n\n====================");

        if(comp>human)
        {
            System.out.println("Computer Won!");
            System.out.println("Result:\nComputer: "+comp+"\nHuman: "+human);
        }
        else if(comp==human)
        {
            System.out.println("DRAW!");
            System.out.println("Result:\nComputer: "+comp+"\nHuman: "+human);

        }
        else
        {
            System.out.println("Human Won!");
            System.out.println("Result:\nComputer: "+comp+"\nHuman: "+human);
        }
    
    }
}
