import java.util.Scanner;

public class Cinema extends Movie {
    Scanner input = new Scanner(System.in);
    // Ticket purchasing procedures
    public void buyTicket(int index) {
        

        System.out.println("[TICKETS]\n");// TICKETS
        System.out.println(
                "Select the number and type of tickets you wish to buy. Please note seats are reserved on a best available basis.\nAll voucher tickets will require proof of identification when collecting tickets or having tickets checked by ushers.");
        dottedBorder();
        System.out.print("Enter the quantity of ticket: ");
        int ticket_quantity = input.nextInt();
        dottedBorder();

        double total_cost = ticket_quantity * ticketPrices[index];

        System.out.println("Total Cost: " + total_cost);

        dottedBorder();

        System.out.println("[RECEIPT]\n");// RECEIPT
        System.out.println("MOVIEMAX THEATER");
        System.out.println(movies[index]);
        System.out.println("Showing at SM City Lucena " + dates[index]);
        System.out.println("TOTAL COST: " + total_cost);
        System.out.println("THANK YOU FOR PURCHASING!");// THANK YOU FOR PURCHASING

        dottedBorder();

        // input.close();
    }

    // Prints the cinema policies
    public void policy() {
        topSpikes();
        System.out.println(
                "[POLICIES]\n\nDirector's Club Cinema patrons will be served complimentary fresh popcorn.\nSnack Time offers fast and easy refreshments from sandwiches to beverages. You may purchase your food at any Snack Time counter.\nOutside food and drinks are not allowed inside Director's Club and IMAX Cinemas.\nBelow listed food items are NOT ALLOWED inside the theaters:\n\n- Rice meals and pasta meals\n- Alcoholic and Non-Alcoholic Beverages in glass, bottles and can\n- Food items with sauce and foul odor (such as vinegar, fish sauce and soy sauce)\n- Food on Stick");
        botSpikes();
    }

    // public void seatSelection() {
    //     // Scanner input = new Scanner(System.in);
    //     final int ROWS = 10;
    //     final int COLS = 21;

    //     char[][] seats = new char[ROWS][COLS];
    //     char seatLetter = 'A';
    //     String tryAgain;
    //     String seatChoice;
    //     int seatNum, counter = 0;
    //     while (true) {
            
    //         System.out.println("[View Seats]\n");
    //         if (counter == 0) { // don't reassign new letters to the matrix when it is the 2nd or more attempt
    //             for (int i = 0; i < seats.length; i++) { // Set the value.
    //                 for (int j = 0; j < seats[i].length; j++)
    //                     seats[i][j] = seatLetter++;
    //                 seatLetter = 'A'; // reset seatLetter back to 'A'
    //             }
    //         }
    //         // display the list of seats
    //         System.out.println("__________________SCREEN__________________\n\n");

    //         for (int i = 0; i < seats.length; i++) {
    //             System.out.print((i + 1) + " ");

    //             for (int j = 0; j < seats[i].length; j++)
    //                 System.out.print(seats[i][j] + " ");

    //             System.out.println();
    //         }

    //         System.out.println("\n\nChoose your desired seat. \n\nStarts with row and column: Ex. 2A");
    //         System.out.print("Enter Seat number: ");

    //         seatChoice = (input.nextLine()).toUpperCase(); // accepts lower case
    //         seatNum = Integer.parseInt(seatChoice.charAt(0) + ""); // extrcts index 0, the number

    //         if (seatNum != 0) {
    //             seatLetter = seatChoice.charAt(1); // extract seatChoice index 1, the letter

    //             if (seats[seatNum - 1][seatLetter - 65] != 'X')
    //                 seats[seatNum - 1][seatLetter - 65] = 'X';
    //             else {
    //                 System.out.println("Seat is already occupied!");
    //                 break; // break out of the loop for now while there is no other solution
    //             }
                    
    //         }
    //         // Updated seat list
    //         for (int i = 0; i < seats.length; i++) {
    //             System.out.print((i + 1) + " ");

    //             for (int j = 0; j < seats[i].length; j++)
    //                 System.out.print(seats[i][j] + " ");

    //             System.out.println();
    //         }

    //         System.out.println("\nAction Success!\nBook another seat? [Y/N]: ");
    //         tryAgain = input.next().toUpperCase(); // removes case sensitivity
    //         char tmp = tryAgain.charAt(0); // take only the first letter

    //         if (tmp == 'N') // quit
    //             break;

    //         input.nextLine(); // skips whitespace
    //         counter++;
    //     }
    //     // input.close();
    // }
}
