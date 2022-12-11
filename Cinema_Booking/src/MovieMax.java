import java.util.Scanner;

public class MovieMax {
    static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Cinema cinema = new Cinema();
        boolean isVerified = false;

        // LOGIN -----------------------------------
        String username = ("user");
        String password = ("user");
        String ausername;
        String apassword;

        cinema.logoDisplay();

        System.out.println("[LOG-IN]\n");
        System.out.print("Username: ");
        ausername = input.nextLine();

        System.out.print("Password: ");
        apassword = input.nextLine();

        if (ausername.equals(username) && apassword.equals(password)) {
            System.out.println("You are logged in :)\n");
            isVerified = true;
        } else
            System.out.println("Invalid Username & Password!");

        if (!isVerified) // if wrong pass, exit program
            return;
        // !LOGIN -------------------------------------------

        while (true) {
            cinema.movieList();
            cinema.dottedBorder();
            System.out.println("[NOTE: Choose 0 to exit]");
            System.out.print("Choose a movie: ");
            int choice = input.nextInt();

            if (choice != 0) {
                cinema.movieInfo(choice - 1);
                System.out.print("[1] Buy Ticket\t\t[2] Back\n>> ");
                cinema.dottedBorder();
                int opt = input.nextInt();
                cinema.dottedBorder();

                if (opt == 1) {
                    cinema.buyTicket(choice - 1);
                    System.out.println("Press any key to continue...");
                    input.nextLine();
                    cinema.policy();
                    // cinema.seatSelection();
                    // SEAT SELECTION ------------------------------------------------ The function throws no lines found when using the seatSelection()
                    // SOLUTION: omit the function :)
                    final int ROWS = 10;
                    final int COLS = 21;

                    char[][] seats = new char[ROWS][COLS];
                    char seatLetter = 'A';
                    String tryAgain;
                    String seatChoice;
                    int seatNum, counter = 0;
                    while (true) {

                        System.out.println("[View Seats]\n");
                        if (counter == 0) { // don't reassign new letters to the matrix when it is the 2nd or more
                                            // attempt
                            for (int i = 0; i < seats.length; i++) { // Set the value.
                                for (int j = 0; j < seats[i].length; j++)
                                    seats[i][j] = seatLetter++;
                                seatLetter = 'A'; // reset seatLetter back to 'A'
                            }
                        }
                        // display the list of seats
                        System.out.println("__________________SCREEN__________________\n\n");

                        for (int i = 0; i < seats.length; i++) {
                            System.out.print((i + 1) + " ");

                            for (int j = 0; j < seats[i].length; j++)
                                System.out.print(seats[i][j] + " ");

                            System.out.println();
                        }

                        System.out.println("\n\nChoose your desired seat. \n\nStarts with row and column: Ex. 2A");
                        System.out.print("Enter Seat number: ");

                        seatChoice = (input.nextLine()).toUpperCase(); // accepts lower case
                        seatNum = Integer.parseInt(seatChoice.charAt(0) + ""); // extrcts index 0, the number

                        if (seatNum != 0) {
                            seatLetter = seatChoice.charAt(1); // extract seatChoice index 1, the letter

                            if (seats[seatNum - 1][seatLetter - 65] != 'X')
                                seats[seatNum - 1][seatLetter - 65] = 'X';
                            else {
                                System.out.println("Seat is already occupied!");
                                break; // break out of the loop for now while there is no other solution
                            }

                        }
                        // Updated seat list
                        for (int i = 0; i < seats.length; i++) {
                            System.out.print((i + 1) + " ");

                            for (int j = 0; j < seats[i].length; j++)
                                System.out.print(seats[i][j] + " ");

                            System.out.println();
                        }

                        System.out.println("\nAction Success!\nBook another seat? [Y/N]: ");
                        tryAgain = input.next().toUpperCase(); // removes case sensitivity
                        char tmp = tryAgain.charAt(0); // take only the first letter

                        if (tmp == 'N') // quit
                            break;

                        input.nextLine(); // skips whitespace
                        counter++;
                    }
                } else
                    continue;
                //! SEAT SELECTION ------------------------------------------------
            }
            System.out.println("Booking Success!");
            break;
        }
    }
}
