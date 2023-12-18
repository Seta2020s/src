public class ComplexNumberAdapterFactory {
    public static ComplexNumberAdapter createAdapter(String type) {
        if ("basic".equalsIgnoreCase(type)) {
            return new BasicComplexNumberAdapter();
        }
        return null;
    }
}