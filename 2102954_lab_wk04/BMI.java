public class BMI {
    private double weight;
    private double height;
    private double BMI;
    public BMI(){

    }
    public BMI(double weight, double height){
        this.weight=weight;
        this.height=height;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getBMI(){
        double weightinKG = this.weight*0.45359237;
        double heightinMeters=this.height*0.0254;
        this.BMI = weightinKG/(Math.pow(heightinMeters, 2));
        return BMI;
    }
    public String getInterpretation(){
        if(this.BMI<18.5)
        {
            return "Underweight";
        }
        else if(this.BMI>=18.5 && this.BMI<25.0)
        {
            return "Normal";
        }
        else if(this.BMI>=25.0 && this.BMI<30.0)
        {
            return "Overweight";
        }
        else
            return "Obese";
    }
}
