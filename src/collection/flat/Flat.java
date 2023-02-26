package collection.flat;

import java.time.LocalDateTime;
import java.util.Objects;

public class Flat implements Comparable<Flat> {
    private Integer id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private float area; //Значение поля должно быть больше 0
    private long numberOfRooms; //Максимальное значение поля: 7, Значение поля должно быть больше 0
    private Furnish furnish; //Поле не может быть null
    private View view; //Поле может быть null
    private Transport transport; //Поле не может быть null
    private House house; //Поле не может быть null

    {
        coordinates = new Coordinates();
        house = new House();
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public void idGenerator(){ //  <-- Автоматическое генерирование id
        int id = Objects.hash(name, coordinates, creationDate, area, numberOfRooms, furnish, view, transport, house);
        if(id < 0){
            id *= (-1);
        }
        this.id = id;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public Coordinates getCoordinates(){
        return coordinates;
    }
    public Float getCoordinatesX() {
        return coordinates.getX();
    }
    public Float getCoordinatesY(){
        return coordinates.getY();
    }
    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }
    public void setCoordinatesX(Float x){
        coordinates.setX(x);
    }
    public void setCoordinatesY(Float y) {
        coordinates.setY(y);
    }


    public LocalDateTime getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
    public void creationDateGenerator(){ //  <-- Автоматическое генерирование creationDate
        this.creationDate = LocalDateTime.now();
    }


    public float getArea() {
        return area;
    }
    public void setArea(float area) {
        this.area = area;
    }


    public long getNumberOfRooms() {
        return numberOfRooms;
    }
    public void setNumberOfRooms(long numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }


    public Furnish getFurnish() {
        return furnish;
    }
    public void setFurnish(Furnish furnish) {
        this.furnish = furnish;
    }


    public View getView() {
        return view;
    }
    public void setView(View view) {
        this.view = view;
    }


    public Transport getTransport() {
        return transport;
    }
    public void setTransport(Transport transport) {
        this.transport = transport;
    }


    public House getHouse() {
        return house;
    }
    public void setHouse(House house) {
        this.house = house;
    }
    public void setHouseName(String name) {
        house.setName(name);
    }
    public void setHouseYear(int year) {
        house.setYear(year);
    }
    public void setHouseNumberOfLifts(Integer numberOfLifts){
        house.setNumberOfLifts(numberOfLifts);
    }

    @Override
    public String toString() {
        return "id = " + this.id + "\n" +
                "name = " + this.name + "\n" +
                "coordinatesX = " + this.coordinates.getX() + "\n" +
                "coordinatesY = " + this.coordinates.getY() + "\n" +
                "creationDate = " + this.creationDate.toString() + "\n" +
                "area = " + this.area + "\n" +
                "numberOfRooms = " + this.numberOfRooms + "\n" +
                "furnish = " + this.furnish.toString() + "\n" +
                "view = " + this.view.toString() + "\n" +
                "transport = " + this.transport.toString() + "\n" +
                "houseName = " + this.house.getName() + "\n" +
                "houseYear = " + this.house.getYear() + "\n" +
                "houseNumberOfLifts = " + this.house.getNumberOfLifts();
    }

    @Override
    public int compareTo(Flat o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flat flat)) return false;
        return Float.compare(flat.area, area) == 0 && numberOfRooms == flat.numberOfRooms && Objects.equals(id, flat.id) && Objects.equals(name, flat.name) && Objects.equals(coordinates, flat.coordinates) && Objects.equals(creationDate, flat.creationDate) && furnish == flat.furnish && view == flat.view && transport == flat.transport && Objects.equals(house, flat.house);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, coordinates, creationDate, area, numberOfRooms, furnish, view, transport, house);
    }
}
