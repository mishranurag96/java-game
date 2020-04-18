package javaapplication2;
import java.util.Scanner;

class JavaApplication2{
    public static void main(String args[]){
        String re_run;
        re_run = "n";
        String choiceStack[]= {"rock","paper","scissors"};
        int randomNum = (int)Math.floor(Math.random()*3);
        String computerChoice = choiceStack[randomNum];
        do{
        System.out.println("Welcome to the game Rock,Paper and Scissors");
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in rock,paper or scissors");
        String userChoice;
//        userChoice = userChoice.toLowerCase();
        userChoice = sc.nextLine();
        
        if(computerChoice.equals(userChoice)){
            System.out.println("Tie!");
        }
        else if(userChoice.equals("paper") && computerChoice.equals("rock")){
            System.out.println("You win!");
        }
        else if(userChoice.equals("rock") && computerChoice.equals("scissors")){
            System.out.println("You win!");
        }
        else if(userChoice.equals("scissors") && computerChoice.equals("rock")){
            System.out.println("You loose!");
        }
        else if(userChoice.equals("rock") && computerChoice.equals("paper")){
            System.out.println("You loose!");
        }
        else if(userChoice.equals("paper") && computerChoice.equals("scissors")){
            System.out.println("You loose!");
        }
        else if(userChoice.equals("scissors") && computerChoice.equals("paper")){
            System.out.println("You win!");
        }
        else{
            System.out.println("Provide a valid input");
        } 
        System.out.println("Do you want to re run ? Type y for YES");
        re_run = sc.nextLine();
        }while(re_run.equals("y") || re_run.equals("Y"));        
    }
}


