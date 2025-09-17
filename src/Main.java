/**
 * Entry point of the application.
 */
public class Main {
    public static void main(String[] args) {
        HumanBmi human = new HumanBmi(80, 1.52);
        System.out.println(human.getResult());
    }
}

/**
 * Represents a human with weight and height,
 * and provides methods to calculate BMI.
 */
class HumanBmi {

    private double weight; // in kilograms
    private double height; // in meters

    public HumanBmi(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Calculates and returns the Body Mass Index (BMI).
     */
    public double getBmi() {
        return weight / (height * height);
    }

    /**
     * Returns a classification based on BMI.
     */
    public String getResult() {
        double bmi = getBmi();

        if (bmi < 18.5) {
            return "Deficit";
        } else if (bmi < 25) {
            return "Norm";
        } else if (bmi < 30) {
            return "Warning!";
        } else {
            return "Fat";
        }
    }
}
