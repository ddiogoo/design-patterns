package com.example.impl1;

import java.util.stream.Stream;

public interface HasParts extends Document {
  default Stream<Part> getParts() {
    return children(Property.PARTS.toString(), (part) -> {
      return new Part(part);
    });
  }
}
