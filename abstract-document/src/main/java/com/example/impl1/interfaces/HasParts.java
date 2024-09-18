package com.example.impl1.interfaces;

import java.util.stream.Stream;

import com.example.impl1.documents.Document;
import com.example.impl1.models.Part;
import com.example.impl1.models.Property;

public interface HasParts extends Document {
  default Stream<Part> getParts() {
    return children(Property.PARTS.toString(), (part) -> {
      return new Part(part);
    });
  }
}
