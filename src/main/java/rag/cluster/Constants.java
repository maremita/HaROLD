package rag.cluster;

public class Constants {
    public static final double DEFAULT_ALPHA_0 = 100.0;
    public static final double DEFAULT_ALPHA_1 = 0.2;

    // Maximum number of different bases
    public static final int MAX_BASES = 4;

    // What fraction of sites to use for global parameters (chosen randomly);
    // First number is for first iteration, second is for later iterations}
    public static final double[] USE_FRAC = {1.0, 1.0}; //{0.01, 0.1};
}

