package Animal;

public class cat extends animal {
private double weight;
public cat(){}

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void run(){
    System.out.println(this.getName()+"在跑动");
    }
}
