package lab2;

import org.uncommons.watchmaker.framework.EvolutionaryOperator;

import java.util.List;
import java.util.Random;

public class MyMutation implements EvolutionaryOperator<double[]> {
	

    public List<double[]> apply(List<double[]> population, Random random) {
        // initial population
        // need to change individuals, but not their number!
    	for(int i = 0; i < population.size(); i++) {
    		double [] newIndiv = population.get(i); 
    		newIndiv[0] = random.nextGaussian(); //change the value x of an individual
    		population.set(i, newIndiv);
    	}

    	
        //result population
        return population;
    }
}
