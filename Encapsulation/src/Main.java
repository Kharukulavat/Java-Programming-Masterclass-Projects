public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        //We don't have constructor to pass player data when we create a new player
        player.name = "Tim"; //Even though we're not in the Player class, we can access those fields directly,
        //because we set access of those fields to be public
        player.health = 20;
        player.weapon = "Sword";
        //So we need to manually set the data in these fields

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        player.loseHealth(11);
        System.out.println("Remaining health = " + player.healthRemaining());
        //Print "Player knocked out of game" because after the call, the remaining health is < 0

        EnhancedPlayer tim = new EnhancedPlayer("Tim",200,"Sword");
        System.out.println("Initial health is " + tim.healthRemaining());
    }
}
