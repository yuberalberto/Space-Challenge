import java.util.Random;

/**
 * Created by ralphemerson on 11/23/2017.
 */
public class U1 extends Rocket {
    private static int rocketU1Counter;
    private static final int cost = 100000000;

    U1() {
        this(0);
    }

    private U1(int lastWeight) {
        int maxCargo = 8000;
        setMaxCargo(maxCargo);
        setCost(cost);
        int weight = 10000;
        setWeight(weight);
        setCurrentWeight(lastWeight);

        rocketU1Counter++;
        System.out.println("------------------------------------");
    }

    static int getRocketU1Counter() {
        return rocketU1Counter;
    }

    static void setRocketU1Counter(int rocketU1Counter) {
        U1.rocketU1Counter = rocketU1Counter;
    }

    @Override
    public boolean launch() {
        System.out.println("\nLAUNCHING...");
        Random randomNumber = new Random();
        double rand = randomNumber.nextDouble();
        double chanceLaunched = 0.05 * getTotalWeight() / getMaxCargo();

        System.out.println("Cargo: " + getCurrentWeight());
        if (chanceLaunched >= rand) {
            System.out.println("U1 EXPLODED!!!");
            System.out.println("...Sending another rocket because it exploded...");
            return false;
        } else {
            System.out.println("U1 launched successfully!");
            return true;
        }
    }

    @Override
    public boolean land() {
        System.out.println("\nLANDING...");
        Random randomNumber = new Random();
        double rand = randomNumber.nextDouble();
        double chanceLanded = 0.01 * getTotalWeight() / getMaxCargo();

        if (chanceLanded >= rand) {
            System.out.println("U1 CRASHED!!!");
            System.out.println("...Sending another rocket because it crashed...");
            return false;
        } else {
            System.out.println("U1 landed successfully!");
            return true;
        }
    }

    static long getTotalCost() {
        return (long) getRocketU1Counter() * cost;
    }

}
