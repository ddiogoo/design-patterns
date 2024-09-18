package com.example.impl1.models;

import java.util.Map;

import com.example.impl1.documents.AbstractDocument;
import com.example.impl1.interfaces.HasModel;
import com.example.impl1.interfaces.HasParts;
import com.example.impl1.interfaces.HasPrice;
import com.example.impl1.interfaces.HasType;

public class Car extends AbstractDocument implements HasModel, HasPrice, HasType, HasParts {
  public Car(Map<String, Object> properties) {
    super(properties);
  }
}
