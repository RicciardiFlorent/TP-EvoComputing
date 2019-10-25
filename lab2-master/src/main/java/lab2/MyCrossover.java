package lab2;

import org.uncommons.watchmaker.framework.operators.AbstractCrossover;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyCrossover extends AbstractCrossover<double[]> {
    protected MyCrossover() {
        super(1);
    }

	protected List<double[]> mate(double[] p1, double[] p2, int i, Random random) {
        ArrayList children = new ArrayList();
        
        int size = p1.length;
        double [] new_solution1 = new double[size];
        double [] new_solution2 = new double[size];
        
        
        	for(int j = 0; j < p1.length; j++  ) {
        		int indice = random.nextInt(p1.length - 1);
        		double p1Temp = p1[indice];
        		new_solution1[indice] = p2[indice];
        		new_solution2[indice] = p1Temp;
        	}
      
        children.add(new_solution1);
        children.add(new_solution2);
        return children;
    }
}
