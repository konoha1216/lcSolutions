package oopCase;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Bear a1 = new Bear("Bob", 5);
        Lion a2 = new Lion("Leo", 7, "orange", "male");
        Monkey a3 = new Monkey("Mike", 10, "golden monkey");
        Parrot a4 = new Parrot("Pam", 3, "budgerigar");
        Clown c1 = new Clown("Andy", 23);
        playRound(a1,a2,a3,a4,c1);
    }

    public static void playRound(Bear a1, Lion a2, Monkey a3, Parrot a4, Clown c1){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        System.out.println("***welcome to the McT Circus***");
        while (flag){
            System.out.println("***please choose the performer***");
            System.out.println("*********1.bear*********");
            System.out.println("*********2.lion*********");
            System.out.println("*********3.monkey*******");
            System.out.println("*********4.parrot*******");
            System.out.println("*********5.clown********");
            int choice = scanner.nextInt();
            if (choice==1){
                a1.act();
            }else if (choice==2){
                a2.act();
            }else if (choice==3){
                a3.act();
            }else if (choice==4){
                a4.act();
            }else if (choice==5){
                c1.act();
            }else {
                System.out.println("sorry, we don't have such performer");
            }

            boolean nextFlag = true;
            while (nextFlag){
                System.out.println("do you wanna continue watching?(1/0)");
                int next = scanner.nextInt();
                if (next==0){
                    System.out.println("thanks for watching");
                    flag=false;
                    nextFlag=false;
                }else if(next==1){
                    nextFlag=false;
                } else {
                    System.out.println("this is a wrong info, please reenter");
                }
            }

        }
    }
}
