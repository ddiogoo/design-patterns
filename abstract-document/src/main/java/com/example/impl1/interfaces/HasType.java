package com.example.impl1.interfaces;

import com.example.impl1.Document;
import com.example.impl1.enums.Property;
import java.util.Optional;

public interface HasType extends Document {
  default Optional<String> getType() {
    return Optional.ofNullable((String) get(Property.TYPE.toString()));
  }
}
