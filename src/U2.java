import java.util.Random;

/**
 * Created by ralphemerson on 11/23/2017.
 */
public class U2 extends Rocket {
    private static int rocketU2Counter;
    private final int maxCargo = 11000;
    private static final int cost = 120000000;

    U2() {
        this(0);
    }

    private U2(int lastWeight) {
        setMaxCargo(maxCargo);
        setCost(cost);
        int weight = 18000;
        setWeight(weight);
        setCurrentWeight(lastWeight);

        rocketU2Counter++;
        System.out.println("------------------------------------");
    }


    static int getRocketU2Counter() {
        return rocketU2Counter;
    }

    static void setRocketU2Counter(int rocketU2Counter) {
        U2.rocketU2Counter = rocketU2Counter;
    }

    @Override
    public boolean launch() {
        System.out.println("\nLAUNCHING...");
        Random randomNumber = new Random();
        double rand = randomNumber.nextDouble();
        double chanceLaunched = 0.04 * (getTotalWeight() / getMaxCargo());

        System.out.println("Cargo: " + getCurrentWeight());
        if (chanceLaunched >= rand) {
            System.out.println("U2 Exploded!");
            System.out.println("...Sending another rocket because it exploded...");
            return false;
        } else {
            System.out.println("U2 launched successfully!");
            return true;
        }
    }

    @Override
    public boolean land() {
        System.out.println("\nLANDING...");
        Random randomNumber = new Random();
        double rand = randomNumber.nextDouble();
        double chanceLanded = 0.08 * (getTotalWeight() / maxCargo);

        if (chanceLanded >= rand) {
            System.out.println("U2 Crashed!!");
            System.out.println("...Sending another rocket because it crashed...");
            return false;
        } else {
            System.out.println("U2 landed successfully!");
            return true;
        }
    }

    static long getTotalCost() {
        return (long) getRocketU2Counter() * cost;
    }
}
