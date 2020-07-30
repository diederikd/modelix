package org.modelix.model;

import java.util.Map;

public interface IKeyValueStore {
  String get(String key);
  void put(String key, String value);
  Map<String, String> getAll(Iterable<String> keys);
  void putAll(Map<String, String> entries);

  void prefetch(String key);

  void listen(final String key, final IKeyListener listener);
  void removeListener(final String key, final IKeyListener listener);
}