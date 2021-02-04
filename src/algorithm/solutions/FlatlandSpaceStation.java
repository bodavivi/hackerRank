package algorithm.solutions;

import java.util.Arrays;

public class FlatlandSpaceStation {
  static int flatlandSpaceStations(int n, int[] c) {
    int maxDistance = 0;
    int minDistance;
    Arrays.sort(c);
    for (int i = 0; i < n; i++) {
      minDistance = n;
      for (int j = 0; j < c.length; j++) {
        int actualDistance = Math.abs(i - c[j]);
        if (actualDistance < minDistance) minDistance = actualDistance;
      }
      if (minDistance > maxDistance) maxDistance = minDistance;
    }

    return maxDistance;
  }
}
