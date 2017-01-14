package snpselection;

import java.util.*;

/**
 *
 * @author Jay Khurana
 */
public abstract class SNPSelectionAlgo {

    protected double runtime; //TODO, make thread safe
    protected List<List<Integer>> data;
    protected HashMap<String, Object> metadata;
    protected int numSNPs, numHaps;
    protected HashMap<String, Object> results;
    protected boolean running; //TODO, make thread safe
    
    public SNPSelectionAlgo(List<List<Integer>> data, HashMap<String, Object> metadata,
            int numSNPs, int numHaps){
        runtime = 0;   
        running = true;
        this.data = data;
        this.numSNPs = numSNPs;
        this.numHaps = numHaps;
        this.metadata = metadata;        
    }
    
    /**
     * 
     * @return runtime, can be profiled multiple times during execution
     * TODO: make runtime thread safe
     */
    public double getRuntime(){
        return runtime;
    }
    
    /**
     * 
     * @return the results in a HashMap object
     */
    public HashMap<String, Object> getResults(){
        return results;
    }
    
    /**
     * Runs the given SNP selection algorithm.
     * Uses values for instance variables that were set using get/set methods
     * Returns nothing but sets several instance variables with results.
     * Multithreading is done at this level
     * Also keeps track of runtime and updates the runtime variable when finished
     * Sets running to false when finished
     * @throws java.lang.Exception if an error occurs while running the algorithm
     */
    public abstract void runAlgo() throws Exception;
    
}
