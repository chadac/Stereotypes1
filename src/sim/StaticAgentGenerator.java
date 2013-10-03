
import java.util.Random;

abstract class StaticAgentGenerator {
    public final int tagSize;
    public static final Random rand = new Random();
    public StaticAgentGenerator(int tagSize) { this.tagSize = tagSize; }

    public StaticAgent[] generate(int amount);

    public static int[] randStr(int size, int rng) {
	int[] ret = new int[size];
	for(int i = 0; i < size; i++) ret[i] = rand.nextInt(rng);
    }

    public static class SAG1 {
	// Random tag, random match.
	@Override
	public StaticAgent[] generate(int amount) {
	    agents = StaticAgent[amount];
	    for (int i = 0; i < amount; i++) {
		Tag t = new Tag(randStr(tagSize),2);
		Match m = new Match(randStr(tagSize),3);
		agents[i] = new StaticAgent(t,m);
	    }
	    return agents;
	}
    }
}