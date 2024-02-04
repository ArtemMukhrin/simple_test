package src.service;

import java.util.UUID;

/**
 * SimpleServiceImpl.
 *
 * @author art
 */
public class SimpleServiceImpl implements SimpleService{

  @Override
  public String getPage(UUID userId) {
    return String.valueOf("Hello World");
  }
}
