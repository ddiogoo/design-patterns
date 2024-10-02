package com.example.impl1.interfaces;

import com.example.impl1.Document;
import com.example.impl1.enums.Property;
import java.util.Optional;

public interface HasPrice extends Document {
  default Optional<Number> getPrice() {
    return Optional.ofNullable((Number) get(Property.PRICE.toString()));
  }
}
