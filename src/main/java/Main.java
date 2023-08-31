public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long expected = 30; // ожидаемый результат
        long actial = service.calculate(1000, true); // фактический результат
        System.out.println("1. " + expected + " == ? == " + actial); //"1. " номер тест-кейса

        expected = 500; // ожидаемый результат
        actial = service.calculate(1_000_000, true); // фактический результат
        System.out.println("2. " + expected + " == ? == " + actial); //"2. " номер тест-кейса

        expected = 10; // ожидаемый результат
        actial = service.calculate(1000, false); // фактический результат
        System.out.println("3. " + expected + " == ? == " + actial); //"1. " номер тест-кейса

        expected = 500; // ожидаемый результат
        actial = service.calculate(1_000_000, false); // фактический результат
        System.out.println("4. " + expected + " == ? == " + actial); //"1. " номер тест-кейса

    }
}