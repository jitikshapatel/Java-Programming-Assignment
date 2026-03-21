import java.util.Scanner;

class Cricket {
    String team1, team2;

    Cricket(String t1, String t2) {
        team1 = t1;
        team2 = t2;
    }

    void showTeams() {
        System.out.println("Match Between: " + team1 + " vs " + team2);
    }
}

class Match extends Cricket {
    int score1, score2;

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
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Team 1: ");
        String t1 = sc.nextLine();

        System.out.print("Enter Team 2: ");
        String t2 = sc.nextLine();

        System.out.print("Enter Score of " + t1 + ": ");
        int s1 = sc.nextInt();

        System.out.print("Enter Score of " + t2 + ": ");
        int s2 = sc.nextInt();

        Match m = new Match(t1, t2, s1, s2);
        m.display();
    }
}
