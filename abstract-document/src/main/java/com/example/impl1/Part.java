package com.example.impl1;

import java.util.Map;

public class Part extends AbstractDocument implements HasType, HasPrice, HasModel {
  public Part(Map<String, Object> properties) {
    super(properties);
  }
}
