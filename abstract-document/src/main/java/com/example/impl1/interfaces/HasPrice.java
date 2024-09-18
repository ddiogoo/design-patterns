package com.example.impl1.interfaces;

import java.util.Optional;

import com.example.impl1.documents.Document;
import com.example.impl1.models.Property;

public interface HasPrice extends Document {
  default Optional<Number> getPrice() {
    return Optional.ofNullable((Number) get(Property.PRICE.toString()));
  }
}
