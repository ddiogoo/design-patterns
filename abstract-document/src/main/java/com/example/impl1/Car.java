package com.example.impl1;

import java.util.Map;

public class Car extends AbstractDocument implements HasModel, HasPrice, HasType, HasParts {
  public Car(Map<String, Object> properties) {
    super(properties);
  }
}
