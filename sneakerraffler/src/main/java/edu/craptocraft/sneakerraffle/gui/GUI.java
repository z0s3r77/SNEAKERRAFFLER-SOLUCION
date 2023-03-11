package edu.craptocraft.sneakerraffle.gui;

import edu.craptocraft.sneakerraffle.entries.Entry;
import edu.craptocraft.sneakerraffle.raffles.Raffle;

public class GUI {
    
    public static void drawSneaker(Raffle sneaker) {
        System.out.println(
        "\t\t" + " _    _" + "\n" +
        "\t\t" + "(_\\__/(,_" + "\n" +
        "\t\t" + "| \\ `_////-._" + "\n" +
        "\t\t" + "J_/___\"=> __/`\\" + "\n" +
        "\t\t" + "|=====;__/___./" + "\n" +
        "\t\t" + "\'-\'-\'-\"\"\"\"\"\"\"`" + "\n" +
        "\t\t" + sneaker.toString());
    }


    public static void drawEntry(Entry entry){
        System.out.println(entry.toString());
    }


    public static void drawWinner(Entry entry){

        System.out.println("\n\t\t¡¡ You are a Winner !!:\n "+ entry.toString());
    }

}
