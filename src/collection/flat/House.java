package collection.flat;

public class House {
    private String name; //Поле может быть null
    private int year; //Максимальное значение поля: 874, Значение поля должно быть больше 0
    private Integer numberOfLifts; //Значение поля должно быть больше 0


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }


    public Integer getNumberOfLifts() {
        return this.numberOfLifts;
    }
    public void setNumberOfLifts(Integer numberOfLifts) {
        this.numberOfLifts = numberOfLifts;
    }
}
