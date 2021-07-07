package EasyLevel;

public class LeapYear {
    public boolean isLeapYear(int years) {
        boolean isDivisibleBy4 = years % 4 == 0;
        boolean isDivisibleBy400 = years % 400 == 0;
        boolean isNotDivisibleBy100 = years % 100 != 0;

        return isDivisibleBy4 && isNotDivisibleBy100 || isDivisibleBy400;
    }
}
