// package 11JumpingSt;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Exit the loop when i is 5
            }
            System.out.println(i);
        }

        System.out.println("Loop exited.");

        for (int j = 0; j < 10; j++) {
            if (j % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.println(j);
        }

        System.out.println("Loop completed.");
    }
}
