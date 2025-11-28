import java.util.Scanner;

/**
 * Write a description of class ticket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ticket
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String ageGroup, language;
        String student, festival;
        double price = 0;

        System.out.println("Enter age group (child / adult / senior): ");
        ageGroup = sc.next().toLowerCase();

        // Base price according to age
        if(ageGroup.equals("child")) {
            price = 150;
        }
        else if(ageGroup.equals("adult")) {
            price = 250;
        }
        else if(ageGroup.equals("senior")) {
            price = 200;
        }
        else {
            System.out.println("Invalid age group!");
            return;
        }

        System.out.println("Enter movie language (nepali / hindi / english): ");
        language = sc.next().toLowerCase();

        // Adding language surcharge
        if(language.equals("hindi")) {
            price = price + 50;
        }
        else if(language.equals("english")) {
            price = price + 100;
        }
        else if(language.equals("nepali")) {
            // no extra charge
        }
        else {
            System.out.println("Invalid language!");
            return;
        }

        // Student discount
        System.out.println("Are you a student? (yes/no): ");
        student = sc.next().toLowerCase();

        if(student.equals("yes")) {
            price = price - (price * 0.20);
        }

        // Festival discount
        System.out.println("Is it a festival day? (yes/no): ");
        festival = sc.next().toLowerCase();

        if(festival.equals("yes")) {
            price = price - (price * 0.15);
        }

        System.out.println("Final Ticket Price: Rs. " + price);
        
    }
}

