public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isWeight()) {
            while (f1.healt > 0 && f2.healt > 0) {

                System.out.println("******** YENI ROUND********");
                if (f1.whoStart()) {
                    System.out.println("f1 basladi");
                    f2.healt = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    f1.healt = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                }
                    if (f2.whoStart()){
                        System.out.println("f2 basladi");
                        f2.healt = f1.hit(f2);
                        if (isWin()) {
                            break;
                        }
                        f1.healt = f2.hit(f1);
                        if (isWin()) {
                            break;
                    }

                }
                System.out.println(this.f2.name + "\tSaglik:\t" + f2.healt);
                System.out.println(this.f1.name + "\tSaglik:\t" + f1.healt);
            }
        } else {
            System.out.println("Sikletler uyusmamaktadir.");
        }
    }


    boolean isWeight() {
        return ((this.f1.weight > this.minWeight && this.f1.weight < maxWeight) && (this.f2.weight > this.minWeight && this.f2.weight < maxWeight));
    }

    boolean isWin() {
        if (f1.healt <= 0) {
            System.out.println("====================================");
            System.out.println(f2.name + "\tkazandi.");
            return true;
        } else if (f2.healt <= 0) {
            System.out.println("====================================");
            System.out.println(f1.name + "\tkazandi.");
            return true;
        }
        return false;
    }

    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.healt);
        System.out.println(f2.name + " Kalan Can \t:" + f2.healt);
    }

}
