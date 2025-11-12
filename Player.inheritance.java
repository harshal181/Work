class Player {
    String name;
    int age;
    String country;
    int matchesPlayed;

    void setName(String n) {
        this.name = n;
    }

    void setAge(int a) {
        this.age = a;
    }

    void setCountry(String c) {
        this.country = c;
    }

    void setMatchesPlayed(int m) {
        this.matchesPlayed = m;
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    String getCountry() {
        return this.country;
    }

    int getMatchesPlayed() {
        return this.matchesPlayed;
    }

    Player() {
        this.name = "unknown";
        this.age = 0;
        this.country = "unknown";
        this.matchesPlayed = 0;
    }

    Player(String n, int a, String c, int m) {
        this.name = n;
        this.age = a;
        this.country = c;
        this.matchesPlayed = m;
    }

    void display() {
        System.out.println("Player Display:");
        System.out.println("Name=" + this.name);
        System.out.println("Age=" + this.age);
        System.out.println("Country=" + this.country);
        System.out.println("Matches Played=" + this.matchesPlayed);
    }
}

class TennisPlayer extends Player {
    int ranking;
    boolean isLeftHanded;

    void setRanking(int r) {
        this.ranking = r;
    }

    void setIsLeftHanded(boolean l) {
        this.isLeftHanded = l;
    }

    int getRanking() {
        return this.ranking;
    }

    boolean getIsLeftHanded() {
        return this.isLeftHanded;
    }

    TennisPlayer() {
        super();
        this.ranking = 100;
        this.isLeftHanded = false;
    }

    TennisPlayer(String n, int a, String c, int m, int r, boolean l) {
        super(n, a, c, m);
        this.ranking = r;
        this.isLeftHanded = l;
    }

    void display() {
        System.out.println("Tennis Player Display:");
        super.display();
        System.out.println("Ranking=" + this.ranking);
        System.out.println("Left Handed=" + this.isLeftHanded);
    }
}

class CricketPlayer extends Player {
    int runsScored;
    int wicketsTaken;

    void setRunsScored(int r) {
        this.runsScored = r;
    }

    void setWicketsTaken(int w) {
        this.wicketsTaken = w;
    }

    int getRunsScored() {
        return this.runsScored;
    }

    int getWicketsTaken() {
        return this.wicketsTaken;
    }

    CricketPlayer() {
        super();
        this.runsScored = 0;
        this.wicketsTaken = 0;
    }

    CricketPlayer(String n, int a, String c, int m, int r, int w) {
        super(n, a, c, m);
        this.runsScored = r;
        this.wicketsTaken = w;
    }

    void display() {
        System.out.println("Cricket Player Display:");
        super.display();
        System.out.println("Runs Scored=" + this.runsScored);
        System.out.println("Wickets Taken=" + this.wicketsTaken);
    }
}

 class TestPlayer {
    public static void main(String[] args) {
       
        TennisPlayer t1 = new TennisPlayer("Roger Federer", 37, "Switzerland", 1500, 1, false);


        CricketPlayer c1 = new CricketPlayer("Virat Kohli", 35, "India", 500, 12000, 250);

        t1.display();
        System.out.println();
        c1.display();
       
    }
}