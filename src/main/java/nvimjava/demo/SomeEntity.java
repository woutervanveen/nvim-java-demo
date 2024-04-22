package nvimjava.demo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SomeEntity {
  private int someData;
}
