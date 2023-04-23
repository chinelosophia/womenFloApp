package dtos.request;

public class FloInformationRequest {
    private int numberOfDays;
    private int monthlyRange;
    private int previousFirstDay;



    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public int getMonthlyRange() {
        return monthlyRange;
    }

    public void setMonthlyRange(int monthlyRange) {
        this.monthlyRange = monthlyRange;
    }

    public int getPreviousFirstDay() {
        return previousFirstDay;
    }

    public void setPreviousFirstDay(int previousFirstDay) {
        this.previousFirstDay = previousFirstDay;
    }
public String toString(){
    return """
            Welcome!!
            """;
}

}
