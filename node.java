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

  public void function(double[] inputs) { // change from void to double
    double activation = 0;
    for (int i = 0; i < inputs.length; i++) 
    {
    	activation += inputs[i]*weight[i];
    }
  }

  /*
   * To implement:
   * The training proceeds in five stages. 
   * First, we create the network with random weights and random biases. 
   * Second, we set the activation of the two input nodes from the columns 'a' and 'b' in the table, 
   * and run the network forward. 
   * Third, we compare the output produced by the network 
   * to the desired output (in the third column of the truth table), 
   * and calculate the difference between the actual output and the desired output. 
   * This difference is the error signal. 
   * Fourth, we change the weights of the connections that connect to the output node,
   *  and the bias of the output node. Fifth, we pass the error back to the hidden layer, 
   *  and change the biases and weights of those connections. 
   *  Then the cycle repeats with new inputs and new outputs. 
   *  The network trains until the average error (calculated over all four rows in the truth table) 
   *  approaches zero.
   */
  
  
  public void learn(double[] inputs, double correct) {
    double attempt = function(inputs);
    double error = correct - attempt;
    for (int i = 0; i < inputs.length; i++ )
    {
      weights[i] += error*inputs[i];
    }
  }
}
