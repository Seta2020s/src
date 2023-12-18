import java.util.Random;

public class RandomComplexNumberFactory<T extends ComplexNumber> implements ComplexNumberAdapter {

    private Random random = new Random();

    @Override
    public ComplexNumber createComplexNumber(double realPart, double imaginaryPart) {
        return new RandomComplexNumber(realPart, imaginaryPart);
    }

    public ComplexNumber createRandomComplexNumber() {
        double realPart = random.nextDouble() * 10;
        double imaginaryPart = random.nextDouble() * 10;
        return createComplexNumber(realPart, imaginaryPart);
    }
}