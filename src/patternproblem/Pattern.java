package patternproblem;
/*Created by : Dhondip Basumatary*/

//Program to print the pyramid pattern of odd numbers starting from 1 in each row
public class Pattern {
    public void patternSolve(){
        int row = 4;
        int col = 7;
        int temp = 1;    //first to print

        //iterate through each row
        for (int i = 0; i < row; i++){

            //printing the space between numbers
            for (int j = 0; j < col-(i * 2 + 1)/2; j++){
                System.out.print("   ");
            }

            //print odd numbers
            //(i * 2 + 1) means the number of values needed to print
            for (int k = 0; k < i * 2 + 1; k++){
                System.out.print(temp + "  ");
                temp += 2;
            }
            System.out.println();

            //set starting value to 1 for next row
            temp = 1;
        }
    }
    public static void main(String[] args) {
        Pattern pattern = new Pattern();
        pattern.patternSolve();
    }
}
