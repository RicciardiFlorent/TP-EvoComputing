package lab2;

import org.uncommons.watchmaker.framework.EvolutionaryOperator;

import java.util.List;
import java.util.Random;

public class MyMutation implements EvolutionaryOperator<double[]> {
	private int counter = 0;
	private int converge;
	
	public MyMutation(int converge) {
		this.converge = converge;
	}
    public List<double[]> apply(List<double[]> population, Random random) {
    	counter++;
    	double rate = 0.4;
        int size = population.size();
        double mut_probability = 0.2;
        double mut_strenght=0.15 * (1.0 - (double)counter  / (double)converge) + 0.01;// (0.1*dimension);
        double sigma = 0.5*(1.0 - (double)counter / (double)converge) + 0.01; //can be decreased with iterations
        for (double[] individual : population) {
            if (random.nextDouble() < mut_probability) {
                for (int i = 0; i < individual.length; i++) { // all dimension
                    if (random.nextDouble() < mut_strenght)
                        individual[i] += random.nextGaussian()*sigma;
                }
            }
        }
        return population;
    }
}