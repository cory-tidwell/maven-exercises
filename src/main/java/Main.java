import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter something: ");
        String input = scanner.nextLine();
        System.out.println("You Entered: "+StringUtils.isNumeric(input));
        System.out.println("You Entered: "+StringUtils.swapCase(input));
        System.out.println("You Entered: "+StringUtils.reverse(input));
    }


}
