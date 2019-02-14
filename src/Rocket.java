/**
 * Created by ralphemerson on 11/23/2017.
 */
public class Rocket implements SpaceShip {
    private int currentWeight;
    private int weight;
    private int maxCargo;

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        if (maxCargo >= (currentWeight + item.getWeight())) {

            return true;
        } else {
            System.out.println("Can't carry item: " + item.getName() + "\tWeight: " + item.getWeight());
            return false;
        }
    }

    @Override
    public void carry(Item item) {
        System.out.println("Carrying item: " + item.getName() + "\tWeight: " + item.getWeight());
        currentWeight += item.getWeight();
    }

    double getMaxCargo() {
        return maxCargo;
    }

    void setMaxCargo(int maxCargo) {
        this.maxCargo = maxCargo;
    }

    void setCost(int cost) {
        int cost1 = cost;
    }

    private double getWeight() {
        return weight;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

    double getTotalWeight() {
        double totalWeight = getCurrentWeight() + getWeight();
        return totalWeight;
    }

    int getCurrentWeight() {
        return currentWeight;
    }

    void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }
}
