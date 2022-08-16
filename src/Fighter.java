public class Fighter {
    String name;
    int healt;
    int damage;
    int weight;
    int shield;
    int who;

    Fighter(String name, int healt, int damage, int weight, int shield,int who) {
        this.name = name;
        this.healt = healt;
        this.damage = damage;
        this.weight = weight;
        this.shield = shield;
        this.who=who;

    }

    int hit(Fighter foe) {
        System.out.println(this.name + " =>" + foe.name + "\tye  " + this.damage + "\tzarar verdi.");
        if (foe.Shield()) {
            System.out.println(foe.name + "=>" + this.damage + " savurdu.");
            return foe.healt;
        }
        if (foe.healt - this.damage < 0)
            return 0;

        return foe.healt - this.damage;
    }

    boolean Shield() {
        double valueShield = Math.random() * 100;
        return (valueShield < this.shield);
    }

    boolean whoStart(){
        double valuewhoStart=Math.random()*100;
        return (valuewhoStart<this.who);
    }
}
