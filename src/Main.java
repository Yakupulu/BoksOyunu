public class Main {
    public static void main(String[] args) {

        Fighter f1=new Fighter("A",100,20,90,20,50);
        Fighter f2=new Fighter("B",100,20,90,20,50);

        Match match=new Match(f1,f2,80,120);

        match.run();
        match.printScore();
    }
}
