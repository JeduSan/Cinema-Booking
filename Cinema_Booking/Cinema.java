import java.util.Arrays;
import java.util.Scanner;


public class Cinema {


    public Cinema (String display)
    {


    }

    public void movieList()
    {
        Scanner input = new Scanner(System.in);

        // System.out.println(" ░ ▒░   ░  ░░ ▒░▒░▒░    ░ ▐░  ░▓  ░░ ▒░ ░░ ▒░   ░  ░ ▒▒   ▓▒█░▒▒ ░ ░▓ ░     ▒ ░░    ▒ ░░▒░▒░░ ▒░ ░▒▒   ▓▒█░ ▒ ░░   ░░ ▒░ ░░ ▒▓ ░▒▓░");
        // System.out.println(" ░  ░      ░  ░ ▒ ▒░    ░ ░░   ▒ ░ ░ ░  ░░  ░      ░  ▒   ▒▒ ░░░   ░▒ ░       ░     ▒ ░▒░ ░ ░ ░  ░ ▒   ▒▒ ░   ░     ░ ░  ░  ░▒ ░ ▒░");
        // System.out.println(" ░      ░   ░ ░ ░ ▒       ░░   ▒ ░   ░   ░      ░     ░   ▒    ░    ░       ░       ░  ░░ ░   ░    ░   ▒    ░         ░     ░░   ░ ");
        // System.out.println("        ░       ░ ░        ░   ░     ░  ░       ░         ░  ░ ░    ░               ░  ░  ░   ░  ░     ░  ░           ░  ░   ░     ");

        // System.out.println("");
        // System.out.println("");

        // Prints the list of the available movies
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tMOVIE LIST");
        for (String s : Arrays.asList("1. Guardians of the Galaxy Vol. 3", "2. Transformers: Rise of the Beasts", "3. Elemental", "4. Shazam! Fury of the Gods ", "5. The Little Mermaid", "6. The Super Mario Bros.", "7. The Marvels", "8. Violent Night", "9. Ant-Man and The Wasp: Quantumania", "10.Spider-Man: Across the Spider-Verse")) System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t"+s);

        System.out.println("");
        System.out.println("");

        System.out.println("        ░       ░ ░        ░   ░     ░  ░       ░         ░  ░ ░    ░               ░  ░  ░   ░  ░     ░  ░           ░  ░   ░     ");
        System.out.println(" ░      ░   ░ ░ ░ ▒       ░░   ▒ ░   ░   ░      ░     ░   ▒    ░    ░       ░       ░  ░░ ░   ░    ░   ▒    ░         ░     ░░   ░ ");
        System.out.println(" ░  ░      ░  ░ ▒ ▒░    ░ ░░   ▒ ░ ░ ░  ░░  ░      ░  ▒   ▒▒ ░░░   ░▒ ░       ░     ▒ ░▒░ ░ ░ ░  ░ ▒   ▒▒ ░   ░     ░ ░  ░  ░▒ ░ ▒░");
        System.out.println(" ░ ▒░   ░  ░░ ▒░▒░▒░    ░ ▐░  ░▓  ░░ ▒░ ░░ ▒░   ░  ░ ▒▒   ▓▒█░▒▒ ░ ░▓ ░     ▒ ░░    ▒ ░░▒░▒░░ ▒░ ░▒▒   ▓▒█░ ▒ ░░   ░░ ▒░ ░░ ▒▓ ░▒▓░");
        
        input.close();
    }

    public void logoDisplay() {
        System.out.println(" ░ ▒░   ░  ░░ ▒░▒░▒░    ░ ▐░  ░▓  ░░ ▒░ ░░ ▒░   ░  ░ ▒▒   ▓▒█░▒▒ ░ ░▓ ░     ▒ ░░    ▒ ░░▒░▒░░ ▒░ ░▒▒   ▓▒█░ ▒ ░░   ░░ ▒░ ░░ ▒▓ ░▒▓░");
        System.out.println(" ░  ░      ░  ░ ▒ ▒░    ░ ░░   ▒ ░ ░ ░  ░░  ░      ░  ▒   ▒▒ ░░░   ░▒ ░       ░     ▒ ░▒░ ░ ░ ░  ░ ▒   ▒▒ ░   ░     ░ ░  ░  ░▒ ░ ▒░");
        System.out.println(" ░      ░   ░ ░ ░ ▒       ░░   ▒ ░   ░   ░      ░     ░   ▒    ░    ░       ░       ░  ░░ ░   ░    ░   ▒    ░         ░     ░░   ░ ");
        System.out.println("        ░       ░ ░        ░   ░     ░  ░       ░         ░  ░ ░    ░               ░  ░  ░   ░  ░     ░  ░           ░  ░   ░     ");

        System.out.println("");
        System.out.println("");



        System.out.println("███╗   ███╗ ██████╗ ██╗   ██╗██╗███████╗███╗   ███╗ █████╗ ██╗  ██╗    ████████╗██╗  ██╗███████╗ █████╗ ████████╗███████╗██████╗ ");
        System.out.println("████╗ ████║██╔═══██╗██║   ██║██║██╔════╝████╗ ████║██╔══██╗╚██╗██╔╝    ╚══██╔══╝██║  ██║██╔════╝██╔══██╗╚══██╔══╝██╔════╝██╔══██╗");
        System.out.println("██╔████╔██║██║   ██║██║   ██║██║█████╗  ██╔████╔██║███████║ ╚███╔╝        ██║   ███████║█████╗  ███████║   ██║   █████╗  ██████╔╝");
        System.out.println("██║╚██╔╝██║██║   ██║╚██╗ ██╔╝██║██╔══╝  ██║╚██╔╝██║██╔══██║ ██╔██╗        ██║   ██╔══██║██╔══╝  ██╔══██║   ██║   ██╔══╝  ██╔══██╗");
        System.out.println("██║ ╚═╝ ██║╚██████╔╝ ╚████╔╝ ██║███████╗██║ ╚═╝ ██║██║  ██║██╔╝ ██╗       ██║   ██║  ██║███████╗██║  ██║   ██║   ███████╗██║  ██║");
        System.out.println("╚═╝     ╚═╝ ╚═════╝   ╚═══╝  ╚═╝╚══════╝╚═╝     ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝       ╚═╝   ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝   ╚═╝   ╚══════╝╚═╝  ╚═╝");

        System.out.println("");
        System.out.println("");

        System.out.println("        ░       ░ ░        ░   ░     ░  ░       ░         ░  ░ ░    ░               ░  ░  ░   ░  ░     ░  ░           ░  ░   ░     ");
        System.out.println(" ░      ░   ░ ░ ░ ▒       ░░   ▒ ░   ░   ░      ░     ░   ▒    ░    ░       ░       ░  ░░ ░   ░    ░   ▒    ░         ░     ░░   ░ ");
        System.out.println(" ░  ░      ░  ░ ▒ ▒░    ░ ░░   ▒ ░ ░ ░  ░░  ░      ░  ▒   ▒▒ ░░░   ░▒ ░       ░     ▒ ░▒░ ░ ░ ░  ░ ▒   ▒▒ ░   ░     ░ ░  ░  ░▒ ░ ▒░");
        System.out.println(" ░ ▒░   ░  ░░ ▒░▒░▒░    ░ ▐░  ░▓  ░░ ▒░ ░░ ▒░   ░  ░ ▒▒   ▓▒█░▒▒ ░ ░▓ ░     ▒ ░░    ▒ ░░▒░▒░░ ▒░ ░▒▒   ▓▒█░ ▒ ░░   ░░ ▒░ ░░ ▒▓ ░▒▓░");


    }

    public void policy()
    {
        System.out.println(" ░ ▒░   ░  ░░ ▒░▒░▒░    ░ ▐░  ░▓  ░░ ▒░ ░░ ▒░   ░  ░ ▒▒   ▓▒█░▒▒ ░ ░▓ ░     ▒ ░░    ▒ ░░▒░▒░░ ▒░ ░▒▒   ▓▒█░ ▒ ░░   ░░ ▒░ ░░ ▒▓ ░▒▓░");
        System.out.println(" ░  ░      ░  ░ ▒ ▒░    ░ ░░   ▒ ░ ░ ░  ░░  ░      ░  ▒   ▒▒ ░░░   ░▒ ░       ░     ▒ ░▒░ ░ ░ ░  ░ ▒   ▒▒ ░   ░     ░ ░  ░  ░▒ ░ ▒░");
        System.out.println(" ░      ░   ░ ░ ░ ▒       ░░   ▒ ░   ░   ░      ░     ░   ▒    ░    ░       ░       ░  ░░ ░   ░    ░   ▒    ░         ░     ░░   ░ ");
        System.out.println("        ░       ░ ░        ░   ░     ░  ░       ░         ░  ░ ░    ░               ░  ░  ░   ░  ░     ░  ░           ░  ░   ░     ");

        System.out.println("");
        System.out.println("");


        System.out.println("\n\uD835\uDC75\uD835\uDC76 \uD835\uDC76\uD835\uDC7C\uD835\uDC7B\uD835\uDC7A\uD835\uDC70\uD835\uDC6B\uD835\uDC6C \uD835\uDC6D\uD835\uDC76\uD835\uDC76\uD835\uDC6B \uD835\uDC77\uD835\uDC76\uD835\uDC73\uD835\uDC70\uD835\uDC6A\uD835\uDC80 \nDirector's Club Cinema patrons will be served complimentary fresh popcorn.\nSnack Time offers fast and easy refreshments from sandwiches to beverages. You may purchase your food at any Snack Time counter.\nOutside food and drinks are not allowed inside Director's Club and IMAX Cinemas.\nBelow listed food items are NOT ALLOWED inside the theaters:\n\n● Rice meals and pasta meals\n● Alcoholic and Non-Alcoholic Beverages in glass, bottles and can\n● Food items with sauce and foul odor (such as vinegar, fish sauce and soy sauce)\n● Food on Stick");

        System.out.println("");
        System.out.println("");

        System.out.println("        ░       ░ ░        ░   ░     ░  ░       ░         ░  ░ ░    ░               ░  ░  ░   ░  ░     ░  ░           ░  ░   ░     ");
        System.out.println(" ░      ░   ░ ░ ░ ▒       ░░   ▒ ░   ░   ░      ░     ░   ▒    ░    ░       ░       ░  ░░ ░   ░    ░   ▒    ░         ░     ░░   ░ ");
        System.out.println(" ░  ░      ░  ░ ▒ ▒░    ░ ░░   ▒ ░ ░ ░  ░░  ░      ░  ▒   ▒▒ ░░░   ░▒ ░       ░     ▒ ░▒░ ░ ░ ░  ░ ▒   ▒▒ ░   ░     ░ ░  ░  ░▒ ░ ▒░");
        System.out.println(" ░ ▒░   ░  ░░ ▒░▒░▒░    ░ ▐░  ░▓  ░░ ▒░ ░░ ▒░   ░  ░ ▒▒   ▓▒█░▒▒ ░ ░▓ ░     ▒ ░░    ▒ ░░▒░▒░░ ▒░ ░▒▒   ▓▒█░ ▒ ░░   ░░ ▒░ ░░ ▒▓ ░▒▓░");

    }

    public void seat()
    {
        Scanner read = new Scanner(System.in);

        int ROWS = 10;
        int COLS = 21;

        char [][] seats = new char [ROWS][COLS];
        int i, j, seatNum, counter = 0;
        char seatLetter = 'A';
        int choice = 0;
        String seatEnter;
        boolean cont = true; // loops of running the program

        while( choice != 4 ){

            System.out.println( "1. View seats"      );

            System.out.print( "Press 1 to continue: " );

            choice = read.nextInt();
            read.nextLine();


            //Set the value.
            for (i=0; i < seats.length; i++) {

                for (j=0; j < seats[i].length; j++)
                    seats[i][j] = seatLetter++;

                seatLetter = 'A';
            }

            //display the list of seats
            System.out.println("__________________SCREEN__________________\n\n\n");

            for (i=0; i < seats.length; i++) {
                System.out.print((i+1)+" ");

                for (j=0; j < seats[i].length; j++)
                    System.out.print(seats[i][j]+" ");

                System.out.println();
            }

            //condition
            while (counter < 25 && cont) {
                do {

                    System.out.print(" \n\nChoose your desire seat \n\n Starts with row and column: EX.2A\n");
                    System.out.print(" Enter Seat number:" + "");

                    seatEnter = (read.nextLine()).toUpperCase();//accepts lower case
                    seatNum   = Integer.parseInt(seatEnter.charAt(0)+"");

                    if (seatNum != 0)
                        seatLetter = seatEnter.charAt(1);

                    i++;


                }//continue to loop until the condition true
                while (seatNum < 0 || seatNum > 7 || seatLetter < 'A' || seatLetter > 'E');

                if (seatNum == 0) {
                    cont = false;
                } else {
                    if (seats[seatNum-1][seatLetter-65] == 'X')
                        System.out.println("Seat have been taken.Please choose another seat:");
                    else {
                        seats[seatNum -1][seatLetter-65] = 'X';

                        // counter++;
                    }

                    // To display updated lists of seats
                    System.out.println(" ") ;
                    for (i=0; i < seats.length; i++) {
                        System.out.print((i+1)+" ");

                        for (j=0; j < seats[i].length; j++)
                            System.out.print(seats[i][j] + " ");

                        System.out.println();
                    }

                }
            }



        }
    }


    public void confirm_details()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Name:");
        String name= input.nextLine();


        System.out.println("E-mail:");
        String email= input.nextLine();


        System.out.println("Phone:");
        int phone_number=input.nextInt();

        input.close();
    }



}
