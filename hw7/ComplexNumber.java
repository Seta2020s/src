public interface ComplexNumber {
    double getRealPart();
    double getImaginaryPart();
    ComplexNumber add(ComplexNumber number);
    ComplexNumber multiply(ComplexNumber number);
    ComplexNumber divide(ComplexNumber number);
    String toString();
}