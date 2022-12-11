import java.util.Scanner;

public class Moviemax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username = ("user");
        String password = ("user");

        Cinema cinema = new Cinema("");
        cinema.logoDisplay();

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   LOG-IN");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  Username: ");
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        username = input.next();

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  Password: ");
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        password = input.next();

        // users check = new users(username, password);

        if (username.equals("user") && password.equals("user")) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  You are logged in");
        }

        else {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tInvalid Username & Password!");

            return;
        }

        cinema.movieList();

        Movie movie1 = new Movie("Guardians of the Galaxy Vol. 3 Movie", "English",
                "In Marvel Studios 'Guardians of the Galaxy Vol. 3' our beloved band of misfits are looking a bit different these days.\nPeter Quill, still reeling from the loss of Gamora, must rally his team around him to defend the universe along with protecting one of their own.\nA mission that, if not completed successfully, could quite possibly lead to the end of the Guardians as we know them.",
                "Action, Adventure, Sci-Fi, Sequel, Superhero", "May 5, 2023", 399);
        Movie movie2 = new Movie("Transformers: Rise of the Beasts Movie", "English",
                "Returning to the action and spectacle that first captured moviegoers around the world 14 years ago with the original Transformers,\nTransformers: Rise of the Beasts will take audiences on a ‘90s globetrotting adventure and introduce the Maximals, \nPredacons, and Terrorcons to the existing battle on earth between Autobots and Decepticons.",
                "Action, Sci-Fi, IMAX, Sequel", "June 9, 2023 ", 249);
        Movie movie3 = new Movie("Elemental", "English",
                "Follows an unlikely pair, Ember and Wade, in a city where fire, water, land and air residents live together.",
                "Family, Animation", "June 16, 2023 ", 349);
        Movie movie4 = new Movie("Shazam! Fury of the Gods ", "English",
                "Continues the story of teenage Billy Batson who, upon reciting the magic word 'SHAZAM!', \nis transformed into his adult Super Hero alter ego, Shazam.",
                "Action, Adventure, Superhero", "March 17, 2023", 399);
        Movie movie5 = new Movie("The Little Mermaid", "English",
                "The Little Mermaid is the beloved story of Ariel, a beautiful and spirited young mermaid with a thirst for adventure. \nThe youngest of King Triton’s daughters, and the most defiant, Ariel longs to find out more about the world beyond the sea, \nand while visiting the surface, falls for the dashing Prince Eric. \nWhile mermaids are forbidden to interact with humans, Ariel must follow her heart. \nShe makes a deal with the evil sea witch, Ursula, which gives her a chance to experience life on land, \nbut ultimately places her life – and her father’s crown – in jeopardy.",
                "Adventure, Family Romance, Live-Action/CGI, Fairy Tale", "May 26, 2023 ", 199);
        Movie movie6 = new Movie("The Super Mario Bros.", "English",
                "A plumber named Mario travels through an underground labyrinth with his brother, \nLuigi, trying to save a captured princess.",
                "Adventure, Family, Animation, Based on Game", "April 7, 2023 ", 429);
        Movie movie7 = new Movie("The Marvels", "English",
                "Centers on Captain Marvel, aka Carol Danvers, an air force pilot whose DNA is fused with that of an alien, \ngiving her superhuman strength and the ability to fly.",
                "Action, Adventure, Sci-Fi", "July 28, 2023 ", 299);
        Movie movie8 = new Movie("Violent Night", "English",
                "When a team of criminals breaks into a wealthy family’s mansion on Christmas Eve,\n taking everyone inside hostage, the team isn’t prepared for a surprise combatant: Santa Claus (David Harbour) is on the grounds. \nAnd he’s about to show why this Nick is no saint.",
                "Crime, Thriller", "December 2, 2022 ", 349);
        Movie movie9 = new Movie("Ant-Man and The Wasp: Quantumania ", "English",
                "Ant-Man and the Wasp find themselves exploring the Quantum Realm, \ninteracting with strange new creatures and embarking on an adventure that pushes them beyond \nthe limits of what they thought was possible.",
                "Adventure, Fantasy", "February 17, 2023", 399);
        Movie movie10 = new Movie("Spider-Man: Across the Spider-Verse ", "English",
                "Miles Morales returns for the next chapter of the Oscar®-winning Spider-Verse saga, \nan epic adventure that will transport Brooklyn's full-time, friendly neighborhood Spider-Man across \nthe Multiverse to join forces with Gwen Stacy and a new team of Spider-People to face off with a \nvillain more powerful than anything they have ever encountered.",
                "Action, Adventure, Comedy, Fantasy, Animation", "June 2, 2023", 399);

        System.out.println(
                ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tEnter a movie:");
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        int movienumber = input.nextInt();

        if (movienumber == 1) {
            movie1.movieInfo();

            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1.Buy Ticket\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2.Back");
            System.out.println(
                    ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
            int choice = input.nextInt();
            System.out.println(
                    ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

            if (choice == 1) {
                movie1.buyTicket();
                System.out.println("");
                cinema.policy();

                System.out.println("");
                cinema.seat();
            } else
                cinema.movieList();

        }

        if (movienumber == 2) {
            movie2.movieInfo();

            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1.Buy Ticket\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2.Back");
            System.out.println(
                    ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
            int choice = input.nextInt();
            System.out.println(
                    ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

            if (choice == 1) {
                movie1.buyTicket();
                System.out.println("");
                cinema.policy();

                System.out.println("");
                cinema.seat();
            } else
                cinema.movieList();

        }

        if (movienumber == 3) {
            movie3.movieInfo();

            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1.Buy Ticket\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2.Back");
            System.out.println(
                    ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
            int choice = input.nextInt();
            System.out.println(
                    ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

            if (choice == 1) {
                movie1.buyTicket();
                System.out.println("");
                cinema.policy();

                System.out.println("");
                cinema.seat();
            } else
                cinema.movieList();

        }

        if (movienumber == 4) {
            movie4.movieInfo();
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1.Buy Ticket\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2.Back");
            System.out.println(
                    ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
            int choice = input.nextInt();
            System.out.println(
                    ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

            if (choice == 1) {
                movie1.buyTicket();
                System.out.println("");
                cinema.policy();

                System.out.println("");
                cinema.seat();
            } else
                cinema.movieList();

        }

        if (movienumber == 5) {
            movie5.movieInfo();

            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1.Buy Ticket\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2.Back");
            System.out.println(
                    ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
            int choice = input.nextInt();
            System.out.println(
                    ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

            if (choice == 1) {
                movie1.buyTicket();
                System.out.println("");
                cinema.policy();

                System.out.println("");
                cinema.seat();
            } else
                cinema.movieList();

        }
        if (movienumber == 6) {
            movie6.movieInfo();

            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1.Buy Ticket\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2.Back");
            System.out.println(
                    ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
            int choice = input.nextInt();
            System.out.println(
                    ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

            if (choice == 1) {
                movie1.buyTicket();
                System.out.println("");
                cinema.policy();

                System.out.println("");
                cinema.seat();
            } else
                cinema.movieList();

        }

        if (movienumber == 7) {
            movie7.movieInfo();

            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1.Buy Ticket\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2.Back");
            System.out.println(
                    ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
            int choice = input.nextInt();
            System.out.println(
                    ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

            if (choice == 1) {
                movie1.buyTicket();
                System.out.println("");
                cinema.policy();

                System.out.println("");
                cinema.seat();
            } else
                cinema.movieList();

        }

        if (movienumber == 8) {
            movie8.movieInfo();

            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1.Buy Ticket\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2.Back");
            System.out.println(
                    ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
            int choice = input.nextInt();
            System.out.println(
                    ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

            if (choice == 1) {
                movie1.buyTicket();
                System.out.println("");
                cinema.policy();

                System.out.println("");
                cinema.seat();
            } else
                cinema.movieList();

        }

        if (movienumber == 9) {
            movie9.movieInfo();

            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1.Buy Ticket\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2.Back");
            System.out.println(
                    ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
            int choice = input.nextInt();
            System.out.println(
                    ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

            if (choice == 1) {
                movie1.buyTicket();
                System.out.println("");
                cinema.policy();

                System.out.println("");
                cinema.seat();
            } else
                cinema.movieList();

        }

        if (movienumber == 10) {
            movie10.movieInfo();

            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1.Buy Ticket\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2.Back");
            System.out.println(
                    ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
            int choice = input.nextInt();
            System.out.println(
                    ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

            if (choice == 1) {
                movie1.buyTicket();
                System.out.println("");
                cinema.policy();

                System.out.println("");
                cinema.seat();
                cinema.cat();
            } else
                cinema.movieList();

        }

    }
}
