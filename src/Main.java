import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.nio.file.*;
import java.util.Scanner;

public class Main {
    public static GsonBuilder GSON_BUILDER = new GsonBuilder();
    public static Gson GSON = GSON_BUILDER.setPrettyPrinting().create();
    public static String URL = "./gson.car";

    public static void main(String[] args) {

        Car[] cars = {
                Car.creatCar("Honda", "Black", Type.SEDAN),
                Car.creatCar("BMW", "Blue", Type.SPORT),
                Car.creatCar("MERSEDES", "RED", Type.TRUCK),
        };
        String json = GSON.toJson(cars);
//        write(json);
//        System.out.println(json);
//        System.out.println(read(json));
//        readFiles(json);
        Car[]cars1=GSON.fromJson(json,Car[].class);
        for(Car car:cars1){
            System.out.println(car);
        }
    }


    public static void write(String car) {
        Path path = Paths.get(URL);
        try {
            Files.writeString(path, car, StandardOpenOption.WRITE, StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void readFiles(String car) {
        try {
            FileReader fileReader = new FileReader(URL);
            Scanner scanner=new Scanner(fileReader);
            while (scanner.hasNext()){
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String read(String car) {
        String json = "";
        try {
            FileReader reader = new FileReader(URL);
            int a;
            while ((a = reader.read()) != -1) {
                json += (char) a;
            }
            return json;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }
}