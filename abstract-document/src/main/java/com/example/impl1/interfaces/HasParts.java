package com.example.impl1.interfaces;

import com.example.impl1.Document;
import com.example.impl1.enums.Property;
import com.example.impl1.models.Part;
import java.util.stream.Stream;

public interface HasParts extends Document {
  default Stream<Part> getParts() {
    return children(Property.PARTS.toString(), (part) -> {
      return new Part(part);
    });
  }
}
