class Cricket {
    String team1, team2;

    // Constructor
    Cricket(String t1, String t2) {
        team1 = t1;
        team2 = t2;
    }

    void showTeams() {
        System.out.println("Match Between: " + team1 + " vs " + team2);
    }
}

// Inherited class
class Match extends Cricket {
    int score1, score2;

    // Constructor
    Match(String t1, String t2, int s1, int s2) {
        super(t1, t2);
        score1 = s1;
        score2 = s2;
    }

    void result() {
        if (score1 > score2)
            System.out.println(team1 + " wins!");
        else if (score2 > score1)
            System.out.println(team2 + " wins!");
        else
            System.out.println("Match Draw!");
    }

    void display() {
        showTeams();
        System.out.println(team1 + " Score: " + score1);
        System.out.println(team2 + " Score: " + score2);
        result();
    }
}

class Program5 {
    public static void main(String[] args) {

        // Command line arguments
        String team1 = args[0];
        String team2 = args[1];
        int score1 = Integer.parseInt(args[2]);
        int score2 = Integer.parseInt(args[3]);

        Match m = new Match(team1, team2, score1, score2);
        m.display();
    }
}
