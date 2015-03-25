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

  public double function(double[] inputs) { // change from void to double
    double activation = 0;
    for (int i = 0; i < inputs.length; i++) 
    {
    	activation += inputs[i]*weights[i];
    }
    return 1/(1+Math.exp(-activation)); // sigma function
  }

  
  
  public void learn(double[] inputs, double correct) {
    double attempt = function(inputs);
    double error = correct - attempt;
    for (int i = 0; i < inputs.length; i++ )
    {
      weights[i] += .01*error*inputs[i]*(1-attempt)*inputs[i];
    }
  }
}
