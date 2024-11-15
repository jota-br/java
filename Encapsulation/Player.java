public class Player {
    
    private String fullName;
    private int healthPercentage;
    private String weapon;

    

    public Player(String fullName) {
        this(fullName, 100, "Sword");
    }

    public Player(String fullName, int healthPercentage, String weapon) {
        this.fullName = fullName;
        this.healthPercentage = (healthPercentage <= 0) ? 1 : (healthPercentage > 100) ? 100 : healthPercentage;
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        healthPercentage = healthPercentage - damage;
        if (healthPercentage <= 0) {
            System.out.println("Player knocked out of game");
        }
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth) {

        healthPercentage = healthPercentage + extraHealth;
        if (healthPercentage > 100) {
            System.out.println("Player restored to 100%");
            healthPercentage = 100;
        }
    }
}
