package com.example.impl1;

import com.example.impl1.enums.Property;
import com.example.impl1.models.Car;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        var wheelProperties = Map.of(
                Property.TYPE.toString(), "wheel",
                Property.MODEL.toString(), "15C",
                Property.PRICE.toString(), 100L);
        var doorProperties = Map.of(
                Property.TYPE.toString(), "door",
                Property.MODEL.toString(), "Lambo",
                Property.PRICE.toString(), 300L);
        var carProperties = Map.of(
                Property.MODEL.toString(), "Lambo",
                Property.PRICE.toString(), 500L,
                Property.PARTS.toString(), List.of(wheelProperties, doorProperties));
        var car = new Car(carProperties);
        System.out.println(car.getModel().orElseThrow());
        System.out.println(car.getPrice().orElseThrow());
        car.getParts().forEach(p -> {
            System.out.println(p.getType().orElse(null));
            System.out.println(p.getPrice().orElse(null));
            System.out.println(p.getModel().orElse(null));
        });
    }
}
