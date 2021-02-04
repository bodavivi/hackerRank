package algorithm.solutions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FlatlandSpaceStationTest {

  @Test
  public void flatlandSpaceStations_should_return_3(){
    int result = FlatlandSpaceStation.flatlandSpaceStations(5, new int[]{0, 4});
    Assertions.assertEquals(2, result);
  }

  @Test
  public void flatlandSpaceStations_should_return_99(){
    int result = FlatlandSpaceStation.flatlandSpaceStations(100, new int[]{0});
    Assertions.assertEquals(99, result);
  }
}