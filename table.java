import java.util.Scanner;
class table{
    public static void main(String[]args)
    {
       Scanner sc=new Scanner(System.in);
       int num;
       int i;
       System.out.println("Enter Number to get table");
        num=sc.nextInt();
        for(i=1;i<10;i++){
            System.out.println("table is"+(num*i));
        }
    }
}