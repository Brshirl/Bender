import java.util.Scanner;

public class RobotController
{
    public static void main(String []args){
        Robot robot = new Robot();
        Scanner myObj = new Scanner(System.in);
        char command;
        System.out.println("Command Prompt for Robot");
        System.out.println("Press r to know where your Robot is located");
        System.out.println("Press t and then a compass direction to turn your robot");
        System.out.println("Press n and then type a name to name your robot");
        System.out.println("Press 3 to end the program");
        command = myObj.nextLine().charAt(0);

        
        while(command !='3'){
            if(command =='f'){
                int move = 0;
                move = myObj.nextInt();
                robot.forward(move);
                System.out.println(robot.getName()+ " has walked  " + move);
            }

            else if(command =='n'){
                String name = myObj.next();
                robot.setName(name);
                System.out.println("You have changed my name to " + name);
            }

            else if(command == 't'){
                command = myObj.next().charAt(0);
                robot.setdirection(command);
                System.out.println(robot.getName() + " is now facing " + command);
            }

            else if(command =='r'){
                System.out.println(robot.toString());
            }

            else{
                System.out.println("That is not a command");
            }

            command = myObj.next().charAt(0);

        }

    }
}
