package com.example.impl1.interfaces;

import java.util.Optional;

import com.example.impl1.documents.Document;
import com.example.impl1.models.Property;

public interface HasType extends Document {
  default Optional<String> getType() {
    return Optional.ofNullable((String) get(Property.TYPE.toString()));
  }
}
