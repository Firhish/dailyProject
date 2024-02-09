package lessons.lesson5.javaSignature;

public class Calculator {

    public int add(int num1, int num2){
        return num1 + num2;
    }

    public float add(float num1, float num2){
        return num1 + num2;
    }

    public int square(int num){
        return num * num;
    }

    public float square(float num){
        return num * num;
    }

    public double average(int num1, int num2, int num3){
        return (num1 + num2 + num3)/3;
    }

    public double average(double num1, double num2, double num3){
        return (num1 + num2 + num3)/3;
    } 

}
