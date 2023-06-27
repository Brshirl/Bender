import java.util.Scanner;

public class Robot
{
    private String name;
    private int xPosition;
    private int  yPosition;
    private char direction;
    int forward = 0;

    public void Robot(){
        name ="Robot";
        this.xPosition = 0;
        this.yPosition = 0;
        direction = 'n';
    }

    public void Robot(int xPosition, int yPosition){
        name = "Robot";
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        direction ='n';
    }

    public void Robot(String name){
        this.name = name;
        xPosition = 0;
        yPosition = 0;
        direction = 'n';
    }

    public int getxPosition(int xPosition){
        return this.xPosition;
    }

    public int getyPosition(int yPosition){
        return this.yPosition;
    }

    public String getName(){
        return name;
    }

    public char getdirection(){
        return direction;
    }

    public void setxPosition(int xPosition){
        this.xPosition = xPosition;

    }

    public  void setyPosition(int yPosition){
        this.yPosition = yPosition; 

    }

    public void  setName(String name){
        this.name = name;

    }

    public void setdirection(char direction){
        char n = direction;
        char e = direction;
        char s = direction;
        char w = direction;

    }

    public int distanceTo(int xPosition, int yPosition){
        return (this.xPosition - yPosition) + (this.yPosition - xPosition);
    }

    public void forward(int f){
        if(direction=='n'){
            this.yPosition += f;}

        else if(direction == 'e'){
            this.xPosition += f;}

        else if(direction =='s'){
            this.yPosition -= f;}

        else{
            this.xPosition -= f;
        }
    }

    public void turnRight(){
        if(direction == 'n'){
            direction = 'e';
        }

        else if(direction =='e'){
            direction ='s';
        }

        else if(direction =='s'){
            direction ='w';    }

        else
        {direction ='n';}
    }

    public String toString(){
        return(name + " is located at (" + this.xPosition + " ," + this.yPosition + ") facing " + direction);
        
    }

}
