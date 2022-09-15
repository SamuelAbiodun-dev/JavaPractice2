package ChapterSeven;
import java.util.Scanner;
public class MobilePhone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. Phone book");
        System.out.println("2. Messages");
        System.out.println("3. Call Register");
        System.out.println("4. Tones");
        System.out.println("5. Settings");

        System.out.println("Please enter 1-5 to select Phone menu: ");
        int phoneMenu = input.nextInt();
        switch (phoneMenu) {
            case 1:
                System.out.println("1. Search");
                System.out.println("2. Service No");
                System.out.println("3. Add name");
                System.out.println("4. Erase");
                System.out.println("5. Edit");
                System.out.println("6. Assign tone");
                System.out.println("7. Options");
                break;

        }


    }
}
