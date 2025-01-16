import java.util.Random;

public class CardGame {

    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public static void main(String[] args) {
        int numOfCards = SUITS.length * RANKS.length;
        String[] deck = initializeDeck(numOfCards);
        shuffleDeck(deck);
        int n = 5; // number of cards to distribute to each player
        int x = 4; // number of players
        String[][] players = distributeCards(deck, n, x);
        printPlayersAndCards(players);
    }

    // Method to initialize the deck of cards
    public static String[] initializeDeck(int numOfCards) {
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }
        return deck;
    }

    // Method to shuffle the deck of cards
    public static void shuffleDeck(String[] deck) {
        Random random = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + random.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute the deck of n cards to x players
    public static String[][] distributeCards(String[] deck, int n, int x) {
        if (n * x > deck.length) {
            throw new IllegalArgumentException("Not enough cards in the deck to distribute to all players.");
        }
        String[][] players = new String[x][n];
        int cardIndex = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < n; j++) {
                players[i][j] = deck[cardIndex];
                cardIndex++;
            }
        }
        return players;
    }

    // Method to print the players and their cards
    public static void printPlayersAndCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : players[i]) {
                System.out.println(card);
            }
            System.out.println();
        }
    }
}
