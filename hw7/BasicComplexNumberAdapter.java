public class BasicComplexNumberAdapter implements ComplexNumberAdapter {
    @Override
    public ComplexNumber createComplexNumber(double realPart, double imaginaryPart) {
        return new BasicComplexNumber(realPart, imaginaryPart);
    }
}