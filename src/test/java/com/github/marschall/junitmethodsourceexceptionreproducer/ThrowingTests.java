package com.github.marschall.junitmethodsourceexceptionreproducer;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class ThrowingTests {

  static List<String> getValues() {
    throw new RuntimeException("reproducer");
//     return List.of("a"); // works
  }

  @ParameterizedTest
  @MethodSource("getValues")
  void testValue(String value) {
    assertNotNull(value);
  }

}
