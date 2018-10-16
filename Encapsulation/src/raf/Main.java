package raf;

public class Main {

    public static void main(String[] args) {

        Player player = new Player();
        player.name = "Player1";
        player.health = 10;
        player.weapon = "knife";

        int dmg = 5;
        player.loseHealth(dmg);
        System.out.println("Remaining health = " + player.healthRemaining());

        dmg = 7;
        player.loseHealth(dmg);
        System.out.println("Remaining health = " + player.healthRemaining());


        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Raf", 200, "knife");
        System.out.println("Initial health is " + enhancedPlayer.getHealth());
    }
}
