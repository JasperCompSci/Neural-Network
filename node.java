import java.util.*;

class Node {

  float[] weights;
  public Node(int n) {
    weights = new float[n]; // n is number of nodes
    Random rand = new Random();
    for (int i = 0; i < weights.length; i++)
    {
      weights[i] = rand.nextInt(3)-1; // random weight to begin
    }
  }

  public void function(float[] inputs) {
    float total = 0;
    for (int i = 0; i < inputs.length; i++ )
    {
      int toAdd = inputs[i]*weights[i];
      total += toAdd;
    }
  }

  
}
