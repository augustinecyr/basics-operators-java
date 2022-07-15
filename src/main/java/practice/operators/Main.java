package practice.operators;

public class Main {
    public static void main(String[] args) {
        // Basics of Operators in Java

        int maxScore = 100;
        // == means equals to
        if (maxScore == 100) {
            System.out.println("You got the max score!");
        }

        // != not equals to
        if (maxScore != 100) {

        }

        // >= means greater than or equal
        if (maxScore >= 100) {

        }

        // <= means lesser or equal
        if (maxScore <= 100) {

        }

        // && - AND operator - requires both conditions to be true
        int sampleScore = 60;
        if ((maxScore > sampleScore && maxScore < 100)) {
            System.out.println("Greater than sample score and less than 100");
        }

        // || - OR operator - requires either condition to be true
        if ((maxScore > 90 || sampleScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        // Ternary operator - a shortcut to if else       
        int ageOfStudent = 19;
        boolean isAboveEighteen = (ageOfStudent == 20) ? true : false;
        if (isAboveEighteen){
            System.out.println("Student is above 18.");
        }

    }
}
