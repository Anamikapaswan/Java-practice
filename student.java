import java.util.Scanner;
class student{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter marks");
        int marks =sc.nextInt();
        if (marks>=90)
            System.out.println("Grade A");
        else if (marks>=75)
            System.out.println("grade B");
        else if(marks>=60)
            System.out.println("grade C");
        else
            System.out.println("Grade Fail");
    }
}
