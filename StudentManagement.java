import java.util.Scanner;
import java.util.ArrayList;
public class StudentManagement{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        ArrayList<String>name=new ArrayList<>();
        ArrayList<Integer>roll=new ArrayList<>();
            int choice;
            do {
                System.out.println("\n===STUDENT MANAGEMENT SYSTEM===");
                System.out.println("1.Add Student");
                System.out.println("2.Search Student");
                System.out.println("3.Delete Student");
                System.out.println("4.Update Student");
                System.out.println("5.Display Student");
                System.out.println("6.Exit");
                System.out.println("Enter your choice");
                choice=sc.nextInt();
                switch(choice){
                    case 1:
                System.out.println("Enter Roll Number");
                int r=sc.nextInt();
                if(roll.contains(r)){
                System.out.println("Roll Number Already Exists");
                break;
                }
                sc.nextLine();
                System.out.println("Enter Student Name");
                String n=sc.nextLine();
                roll.add(r);
                name.add(n);
                System.out.println("Student Added Successfully");
                break;
                case 2:
                System.out.println("Enter Roll Number");
                int search=sc.nextInt();
                int index=roll.indexOf(search);
                if(index!=-1){
                System.out.println("Student Found");
                System.out.println("Name:"+name.get(index));
                }
                else{
                System.out.println("Student Not Found");
                }
                break;
                case 3:
                System.out.println("Enter Roll Number");
                int del=sc.nextInt();
                int i=roll.indexOf(del);
                if(i!=-1){
                    roll.remove(i);
                    name.remove(i);
                System.out.println("Student Deleted");
                }
                else{
                System.out.println("Student Not Found");
                }
                break;
                case 4:
                System.out.println("Enter Roll Number");
                int update=sc.nextInt();
                int pos=roll.indexOf(update);
                if(pos!=-1){
                    sc.nextLine();
                System.out.println("Enter New Name");
                String newName=sc.nextLine();
                name.set(pos,newName);
                System.out.println("Student Updated");
                }
                else{
                System.out.println("Student Not Found");
                }
                break;
                case 5:
                System.out.println("All Student Records:");
                for(int j = 0; j<roll.size(); j++){
                System.out.println(roll.get(j)+""+name.get(j));
                }
                break;
                case 6:
                System.out.println("Thank You");
                break;
                default:
                System.out.println("Invalid Choice");

                }
            }
            while(choice!=6);
            sc.close();
            
            }
        }
