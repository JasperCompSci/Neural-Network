import java.util.*;

class Node {

  double[] weights;
  public Node(int n) {
    weights = new double[n]; // n is number of nodes
    Random rand = new Random();
    for (int i = 0; i < weights.length; i++)
    {
      weights[i] = rand.nextInt(3)-1; // random weight to begin
    }
  }

  public double function(double[] inputs) {
    // TODO
  }

  public void learn(double[] inputs, double correct) {
    double attempt = function(inputs);
    double error = correct - attempt;
    for (int i = 0; i < inputs.length; i++ )
    {
      weights[i] += error*inputs[i];
    }
  }
}
