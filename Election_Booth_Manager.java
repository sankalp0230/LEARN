

import java.util.Scanner;

public class Election_Booth_Manager {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int[] votes = new int[3];
        String command;

        while (true) {
            System.out.print("Enter your age (or type 'exit' to stop): ");
            command = sc.next();
            if (command.equalsIgnoreCase("exit")){
            	break;
            }

            int age = Integer.parseInt(command);
            if (age < 18) {
                System.out.println("Not eligible to vote.");
                continue;
            }

            System.out.print("Vote for candidate [1, 2, or 3]: ");
            int vote = sc.nextInt();

            if (vote >= 1 && vote <= 3) {
                votes[vote - 1]++;
                System.out.println("Vote recorded!");
            } else {
                System.out.println("Invalid candidate number.");
            }
        }

        System.out.println("Voting Results:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Candidate " + (i + 1) + ": " + votes[i] + " votes");
        }
	}
}