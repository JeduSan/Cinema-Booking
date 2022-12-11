public class Movie extends UI {
    String language = "English";
    String[] movies = {
        "Guardians of the Galaxy Vol. 3",
        "Transformers: Rise of the Beasts",
        "Elemental", 
        "Shazam! Fury of the Gods ",
        "The Little Mermaid", 
        "The Super Mario Bros.",
        "The Marvels",
        "Violent Night",
        "Ant-Man and The Wasp: Quantumania",
        "Spider-Man: Across the Spider-Verse" };
    String[] plots = {
        "In Marvel Studios 'Guardians of the Galaxy Vol. 3' our beloved band of misfits are looking a bit different these days.\nPeter Quill, still reeling from the loss of Gamora, must rally his team around him to defend the universe along with protecting one of their own.\nA mission that, if not completed successfully, could quite possibly lead to the end of the Guardians as we know them.",
        "Returning to the action and spectacle that first captured moviegoers around the world 14 years ago with the original Transformers,\nTransformers: Rise of the Beasts will take audiences on a '90s globetrotting adventure and introduce the Maximals, \nPredacons, and Terrorcons to the existing battle on earth between Autobots and Decepticons.",
        "Follows an unlikely pair, Ember and Wade, in a city where fire, water, land and air residents live together.",
        "Continues the story of teenage Billy Batson who, upon reciting the magic word 'SHAZAM!', \nis transformed into his adult Super Hero alter ego, Shazam.",
        "The Little Mermaid is the beloved story of Ariel, a beautiful and spirited young mermaid with a thirst for adventure. \nThe youngest of King Triton's daughters, and the most defiant, Ariel longs to find out more about the world beyond the sea, \nand while visiting the surface, falls for the dashing Prince Eric. \nWhile mermaids are forbidden to interact with humans, Ariel must follow her heart. \nShe makes a deal with the evil sea witch, Ursula, which gives her a chance to experience life on land, \nbut ultimately places her life – and her father’s crown – in jeopardy.",
        "A plumber named Mario travels through an underground labyrinth with his brother, \nLuigi, trying to save a captured princess.",
        "Centers on Captain Marvel, aka Carol Danvers, an air force pilot whose DNA is fused with that of an alien, \ngiving her superhuman strength and the ability to fly.",
        "When a team of criminals breaks into a wealthy family's mansion on Christmas Eve,\n taking everyone inside hostage, the team isn't prepared for a surprise combatant: Santa Claus (David Harbour) is on the grounds. \nAnd he's about to show why this Nick is no saint.",
        "Ant-Man and the Wasp find themselves exploring the Quantum Realm, \ninteracting with strange new creatures and embarking on an adventure that pushes them beyond \nthe limits of what they thought was possible.",
        "Miles Morales returns for the next chapter of the Oscar®-winning Spider-Verse saga, \nan epic adventure that will transport Brooklyn's full-time, friendly neighborhood Spider-Man across \nthe Multiverse to join forces with Gwen Stacy and a new team of Spider-People to face off with a \nvillain more powerful than anything they have ever encountered."
    };
    String[] genres = {
        "Action, Adventure, Sci-Fi, Sequel, Superhero",
        "Action, Sci-Fi, IMAX, Sequel",
        "Family, Animation",
        "Action, Adventure, Superhero",
        "Adventure, Family Romance, Live-Action/CGI, Fairy Tale",
        "Adventure, Family, Animation, Based on Game",
        "Action, Adventure, Sci-Fi",
        "Crime, Thriller",
        "Adventure, Fantasy",
        "Action, Adventure, Comedy, Fantasy, Animation"
    };
    String[] dates = {
        "May 5, 2023",
        "June 9, 2023 ",
        "June 16, 2023 ",
        "March 17, 2023",
        "May 26, 2023 ",
        "April 7, 2023 ",
        "July 28, 2023 ",
        "December 2, 2022 ",
        "February 17, 2023",
        "June 2, 2023"
    };
    double[] ticketPrices = {
        399, 249, 349, 399, 199,
        429, 299, 349, 399, 399
    };

    public void movieInfo(int index) {
        dottedBorder();
        System.out.println("[TITLE]        : " + movies[index]);// TITLE
        System.out.println("[LANGUAGE]     : " + language);// LANGUANGE
        System.out.println("[PLOT]         : " + plots[index]);// PLOT
        System.out.println("[GENRE]        : " + genres[index]);// GENRE
        System.out.println("[DATE]         : " + dates[index]);// DATE
        System.out.println("[TICKET PRICE] : " + ticketPrices[index]);// TICKET PRICE
        dottedBorder();

    }

    public void movieList() {
        topSpikes();
        // Prints the list of the available movies
        System.out.println("[MOVIE LIST]\n");
        for (int i = 0; i < movies.length; i++) {
            System.out.println(i+1 + ". " + movies[i]);
        }
        botSpikes();
    }

}
