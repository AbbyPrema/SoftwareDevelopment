package personlist;

import java.util.Scanner;


public class PersonList {

   
    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);
        
        Person[] p=new Person[3];
        for (int i=0;i>p.length;i++){
           System.out.println("insert person");
           p[i].setPersonName(input.nextLine());
          
           System.out.println("insert person lastname");
           p[i].setLastName(input.nextLine());
    }
    }
    }

