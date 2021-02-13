package academy.learnprogramming;

public class ComplexNumber {
    private double real, imaginary;

    public ComplexNumber (double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public void add (double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }
    public void add (ComplexNumber number) {
        this.add(number.getReal(), number.getImaginary());
    }
    public void subtract (double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }
    public void subtract (ComplexNumber number) {
         this.subtract(number.getReal(), number.getImaginary());
    }
}
