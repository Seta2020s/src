public class BasicComplexNumber implements ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public BasicComplexNumber() {
        this.realPart = 0.0;
        this.imaginaryPart = 0.0;
    }

    public BasicComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public double getRealPart() {
        return realPart;
    }

    @Override
    public double getImaginaryPart() {
        return imaginaryPart;
    }

    @Override
    public ComplexNumber add(ComplexNumber number) {
        return new BasicComplexNumber(
                realPart + number.getRealPart(),
                imaginaryPart + number.getImaginaryPart()
        );
    }

    @Override
    public ComplexNumber multiply(ComplexNumber number) {
        double resultReal = realPart * number.getRealPart() - imaginaryPart * number.getImaginaryPart();
        double resultImaginary = realPart * number.getImaginaryPart() + imaginaryPart * number.getRealPart();
        return new BasicComplexNumber(resultReal, resultImaginary);
    }

    @Override
    public ComplexNumber divide(ComplexNumber number) {
        double denominator = number.getRealPart() * number.getRealPart() + number.getImaginaryPart() * number.getImaginaryPart();

        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is undefined");
        }

        double resultReal = (realPart * number.getRealPart() + imaginaryPart * number.getImaginaryPart()) / denominator;
        double resultImaginary = (imaginaryPart * number.getRealPart() - realPart * number.getImaginaryPart()) / denominator;
        return new BasicComplexNumber(resultReal, resultImaginary);
    }

    @Override
    public String toString() {
        return realPart + " + " + imaginaryPart + "i";
    }
}