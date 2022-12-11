
import java.util.Arrays;
import java.util.Scanner;

public class Movie {

    String title;
    String language;
    String plot;
    String genre;

    String date;
    int ticketPrice;


    public Movie(String title, String language, String plot , String genre, String date, int ticketPrice)
    {
        this.title=title;
        this.language=language;
        this.plot=plot;
        this.genre=genre;
        this.date=date;
        this.ticketPrice=ticketPrice;

    }

    public void movieInfo()
    {
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        System.out.println("\uD835\uDDE7\uD835\uDDF6\uD835\uDE01\uD835\uDDF9\uD835\uDDF2: "+title);//TITLE
        System.out.println("\uD835\uDDDF\uD835\uDDEE\uD835\uDDFB\uD835\uDDF4\uD835\uDE02\uD835\uDDEE\uD835\uDDF4\uD835\uDDF2: "+language);//LANGUANGE
        System.out.println("\uD835\uDDE3\uD835\uDDF9\uD835\uDDFC\uD835\uDE01: "+plot);//PLOT
        System.out.println("\uD835\uDDDA\uD835\uDDF2\uD835\uDDFB\uD835\uDDFF\uD835\uDDF2: "+genre);//GENRE
        System.out.println("\uD835\uDDE5\uD835\uDDF2\uD835\uDDF9\uD835\uDDF2\uD835\uDDEE\uD835\uDE00\uD835\uDDF2 \uD835\uDDD7\uD835\uDDEE\uD835\uDE01\uD835\uDDF2: "+date);//DATE
        System.out.println("\uD835\uDDE7\uD835\uDDF6\uD835\uDDF0\uD835\uDDF8\uD835\uDDF2\uD835\uDE01 \uD835\uDDE3\uD835\uDDFF\uD835\uDDF6\uD835\uDDF0\uD835\uDDF2: "+ ticketPrice);//TICKET PRICE
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

    }

    public void buyTicket()
    {


        Scanner input = new Scanner(System.in);

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\uD835\uDC13\uD835\uDC08\uD835\uDC02\uD835\uDC0A\uD835\uDC04\uD835\uDC13\uD835\uDC12");//TICKETS
        System.out.println("\tSelect the number and type of tickets you wish to buy. Please note seats are reserved on a best available basis.\nAll voucher tickets will require proof of identification when collecting tickets or having tickets checked by ushers.");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tEnter the quantity of ticket:");
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        int ticket_quantity=input.nextInt();
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        int total_cost=ticket_quantity*ticketPrice;

        System.out.println("Total Cost: "+ total_cost);

        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");

        System.out.println("\uD835\uDC79\uD835\uDC6C\uD835\uDC6A\uD835\uDC6C\uD835\uDC70\uD835\uDC77\uD835\uDC7B");//RECEIPT
        System.out.println("MOVIEMAX THEATER");
        System.out.println(""+title);
        System.out.println("Showing at SM City Lucena "+date);
        System.out.println("TOTAL COST: "+total_cost);
        System.out.println("\uD835\uDC7B\uD835\uDC6F\uD835\uDC68\uD835\uDC75\uD835\uDC72 \uD835\uDC80\uD835\uDC76\uD835\uDC7C \uD835\uDC6D\uD835\uDC76\uD835\uDC79 \uD835\uDC77\uD835\uDC7C\uD835\uDC79\uD835\uDC6A\uD835\uDC6F\uD835\uDC68\uD835\uDC7A\uD835\uDC70\uD835\uDC75\uD835\uDC6E");//THANK YOU FOR PURCHASING

        System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");



    }






}
