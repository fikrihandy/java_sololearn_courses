import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ExceptionsListThreadsAndFiles {
    public static void main(String[] args) {
        Bowling game = new Bowling();
        System.out.print("Sample Input (3 player max):\nDave 42\n=======\n");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
        game.getWinner();
    }
}

class Bowling {
    HashMap<String, Integer> players;

    Bowling() {
        players = new HashMap<>();
    }

    public void addPlayer(String name, int p) {
        players.put(name, p);
    }

    public void getWinner() {
        int[] valueArr = new int[3];
        int start = 0;
        for (String i : players.keySet()) {
            valueArr[start] = players.get(i);
            start++;
        }
        int winner = Arrays.stream(valueArr).max().getAsInt();

        for (String i : players.keySet()) {
            if (players.get(i) == winner) {
                System.out.println("Winner => " + i);
            }
        }
    }
}

//You are creating a bowling game!
//The given code declares a Bowling class with its constructor and addPlayer() method.
//Each player of the game has a name and points, and are stored in the players HashMap.
//The code in main takes 3 players data as input and adds them to the game.
//You need to add a getWinner() method to the class, which calculates and outputs the name of the player with the maximum points.

//Sample Input:
//Dave 42
//Amy 103
//Rob 64

//Sample Output:
//Amy