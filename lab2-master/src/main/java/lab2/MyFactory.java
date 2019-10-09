package lab2;

import org.uncommons.watchmaker.framework.factories.AbstractCandidateFactory;

import java.util.Random;

public class MyFactory extends AbstractCandidateFactory<double[]> {

    private int dimension;

    public MyFactory(int dimension) {
        this.dimension = dimension;
    }

    public double[] generateRandomCandidate(Random random) {
        double[] solution = new double[dimension];
        // x from -5.0 to 5.0

        for(int i = 0; i < dimension; i++) {
        	solution[i]  = -5.0 + Math.random() * (10.0);//generate a number between -5 and 5
        	//System.out.println(solution[i]); // min + Math.random()*(max - min)

        }
        
        return solution;
    }
}

