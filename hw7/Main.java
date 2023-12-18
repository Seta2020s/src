public class Main {
    public static void main(String[] args) {
        RandomComplexNumberFactory<ComplexNumber> factory = new RandomComplexNumberFactory<>();

        ComplexNumber num1 = factory.createRandomComplexNumber();
        ComplexNumber num2 = factory.createRandomComplexNumber();

        ComplexNumber resultAdd = num1.add(num2);
        ComplexNumber resultMultiply = num1.multiply(num2);
        ComplexNumber resultDivide = num1.divide(num2);

        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Result Add: " + resultAdd);
        System.out.println("Result Multiply: " + resultMultiply);
        System.out.println("Result Divide: " + resultDivide);

        String additionResult = ((RandomComplexNumber) resultAdd).toStringWithOperation("+", num2);
        String multiplicationResult = ((RandomComplexNumber) resultMultiply).toStringWithOperation("*", num2);
        String divisionResult = ((RandomComplexNumber) resultDivide).toStringWithOperation("/", num2);

        System.out.println("Result Add: " + additionResult);
        System.out.println("Result Multiply: " + multiplicationResult);
        System.out.println("Result Divide: " + divisionResult);
    }
}