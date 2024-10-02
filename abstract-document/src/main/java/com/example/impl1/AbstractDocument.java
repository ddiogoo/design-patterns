package com.example.impl1;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class AbstractDocument implements Document {
  private final Map<String, Object> properties;

  public AbstractDocument(Map<String, Object> properties) {
    Objects.requireNonNull(properties, "properties map is required");
    this.properties = properties;
  }

  @Override
  public void put(String key, Object value) {
    properties.put(key, value);
  }

  @Override
  public Object get(String key) {
    return properties.get(key);
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor) {
    return Stream.ofNullable(get(key))
        .filter(Objects::nonNull)
        .map(i -> (List<Map<String, Object>>) i)
        .findAny()
        .stream()
        .flatMap(Collection::stream)
        .map(constructor);
  }
}
