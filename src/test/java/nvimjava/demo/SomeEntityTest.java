package nvimjava.demo;

import org.junit.jupiter.api.Test;

class SomeEntityTest {

  @Test
  void test_something() {
    var someEntity = SomeEntity.builder().someData(42).build();

    someEntity.getSomeData();
  }
}
