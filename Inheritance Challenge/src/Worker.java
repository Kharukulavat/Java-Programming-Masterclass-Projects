public class Worker {
    private String name;
    private String birthDate; //mm/dd/yyyy
    protected String endDate;
    public Worker() {}
    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    public int getAge() {
        int currentYear = 2025;
        int birthYear = Integer.parseInt(birthDate.substring(6)); //mm/dd/yyyy to get birthYear
        return (currentYear - birthYear);
    }
    public double collectPay() {
        return 0.0;
    }
    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
