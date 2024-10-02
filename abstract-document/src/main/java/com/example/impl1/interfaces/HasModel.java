package com.example.impl1.interfaces;

import com.example.impl1.Document;
import com.example.impl1.enums.Property;
import java.util.Optional;

public interface HasModel extends Document {
  default Optional<String> getModel() {
    return Optional.ofNullable((String) get(Property.MODEL.toString()));
  }
}
