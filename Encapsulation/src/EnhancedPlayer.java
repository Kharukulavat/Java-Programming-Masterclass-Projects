public class EnhancedPlayer {
    private String fullname;
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String fullname) {
        this(fullname, 100, "Sword");
    }
    public EnhancedPlayer(String fullname, int health, String weapon) {
        this.fullname = fullname;
        //using ternary operator
//        this.health = (health <= 0) ? 1 : (health >= 100) ? 100 : health;
        if (health <= 0) {
            this.healthPercentage = 1;
        } else if (health >= 100) {
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = health;
        }
        this.weapon = weapon;

    }
    public void loseHealth(int damage){
        healthPercentage = healthPercentage - damage;
        if (healthPercentage <= 0) {
            System.out.println("Player knocked out of game");
        }
    }
    public int healthRemaining() {
        return healthPercentage;
    }
    public void restoreHealth(int extraHealth){
        healthPercentage = healthPercentage + extraHealth;
        if (healthPercentage >= 100) {
            System.out.println("Player restored to 100%");
            healthPercentage = 100;
        }
    }

}
