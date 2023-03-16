import java.util.PropertyResourceBundle;

public class Car {
    private String name;
    private String colour;
    private  Type type;

    public static Car creatCar(String name,String colour,Type type) {
       Car car=new Car();
       car.colour=colour;
       car.name=name;
       car.type=type;
       return car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", type=" + type +
                '}';
    }
}
