import java.util.Scanner;

public class Cinema extends Movie {
    Scanner input = new Scanner(System.in);
    // Ticket purchasing procedures
    public void buyTicket(int index) {
        topSpikes();
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
    }

    // Prints the cinema policies
    public void policy() {
        topSpikes();
        System.out.println(
                "[POLICIES]\n\nDirector's Club Cinema patrons will be served complimentary fresh popcorn.\nSnack Time offers fast and easy refreshments from sandwiches to beverages. You may purchase your food at any Snack Time counter.\nOutside food and drinks are not allowed inside Director's Club and IMAX Cinemas.\nBelow listed food items are NOT ALLOWED inside the theaters:\n\n- Rice meals and pasta meals\n- Alcoholic and Non-Alcoholic Beverages in glass, bottles and can\n- Food items with sauce and foul odor (such as vinegar, fish sauce and soy sauce)\n- Food on Stick");
        botSpikes();
    }
}
