import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    double costOne;
    double costTwo;
    double costThree;
    double costFour;
    double yearlyCost;

    Scanner scan = new Scanner (System.in);

        System.out.println("What is the maintenance cost for season one?");
        costOne = scan.nextDouble();

        System.out.println("What is the maintenance cost for season two?");
        costTwo = scan.nextDouble();

        System.out.println("What is the maintenance cost for season three?");
        costThree = scan.nextDouble();

        System.out.println("What is the maintenance cost for season one?");
        costFour = scan.nextDouble();

        yearlyCost = costOne + costTwo + costThree + costFour;

        System.out.println("The total annual cost is" + yearlyCost);

    }
}