package com.example.impl1.models;

import java.util.Map;

import com.example.impl1.abs.AbstractDocument;
import com.example.impl1.interfaces.HasModel;
import com.example.impl1.interfaces.HasPrice;
import com.example.impl1.interfaces.HasType;

public class Part extends AbstractDocument implements HasType, HasPrice, HasModel {
  public Part(Map<String, Object> properties) {
    super(properties);
  }
}
