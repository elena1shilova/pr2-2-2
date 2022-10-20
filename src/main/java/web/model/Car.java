package web.model;

public class Car {

    private int id;
    private String name;
    private String series;

    public Car() {
    }

    public Car(int number, String name, String series) {
        this.name = name;
        this.series = series;
        this.id = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getId() {
        return id;
    }

    public void setId(int number) {
        this.id = number;
    }
}
