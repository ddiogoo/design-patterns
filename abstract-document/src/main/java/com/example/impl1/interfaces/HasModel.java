package com.example.impl1.interfaces;

import java.util.Optional;

import com.example.impl1.documents.Document;
import com.example.impl1.models.Property;

public interface HasModel extends Document {
  default Optional<String> getModel() {
    return Optional.ofNullable((String) get(Property.MODEL.toString()));
  }
}
