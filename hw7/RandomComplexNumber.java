public class RandomComplexNumber implements ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public RandomComplexNumber(double realPart, double imaginaryPart) {
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
        double resultReal = realPart + number.getRealPart();
        double resultImaginary = imaginaryPart + number.getImaginaryPart();
        log("Addition", number, new RandomComplexNumber(resultReal, resultImaginary));
        return new RandomComplexNumber(resultReal, resultImaginary);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber number) {
        double resultReal = realPart * number.getRealPart() - imaginaryPart * number.getImaginaryPart();
        double resultImaginary = realPart * number.getImaginaryPart() + imaginaryPart * number.getRealPart();
        log("Multiplication", number, new RandomComplexNumber(resultReal, resultImaginary));
        return new RandomComplexNumber(resultReal, resultImaginary);
    }

    @Override
    public ComplexNumber divide(ComplexNumber number) {
        double denominator = Math.pow(number.getRealPart(), 2) + Math.pow(number.getImaginaryPart(), 2);
        double resultReal = (realPart * number.getRealPart() + imaginaryPart * number.getImaginaryPart()) / denominator;
        double resultImaginary = (imaginaryPart * number.getRealPart() - realPart * number.getImaginaryPart()) / denominator;
        log("Division", number, new RandomComplexNumber(resultReal, resultImaginary));
        return new RandomComplexNumber(resultReal, resultImaginary);
    }

    @Override
    public String toString() {
        return String.format("(%f %c %fi)", realPart, (imaginaryPart >= 0) ? '+' : '-', Math.abs(imaginaryPart));
    }

    public String toStringWithOperation(String operation, ComplexNumber operand) {
        return String.format("(%f %c %fi) %s (%f %c %fi) = (%f %c %fi)",
                realPart, (imaginaryPart >= 0) ? '+' : '-', Math.abs(imaginaryPart),
                operation,
                operand.getRealPart(), (operand.getImaginaryPart() >= 0) ? '+' : '-', Math.abs(operand.getImaginaryPart()),
                getRealPart(), (getImaginaryPart() >= 0) ? '+' : '-', Math.abs(getImaginaryPart())
        );
    }

    private void log(String operation, ComplexNumber operand, ComplexNumber result) {
        System.out.println(String.format("%s: %s %s %s = %s",
                operation,
                this.toString(),
                operation,
                operand.toString(),
                result.toString()));
    }
}