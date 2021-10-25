package model.Enums;

public enum SalaryRange {
    ONE_FIVE("1_5"),
    FIVE_TEN("5_10"),
    UP_TEN("up_10");

    private String rangeNumber;

    SalaryRange(String rangeNumber) {
        this.rangeNumber = rangeNumber;
    }

    public String getRangeNumber() {
        return rangeNumber;
    }
}
