package Host;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JokeHost {
    private List<String> jokes = new ArrayList<>();
    private Random random;

    public JokeHost() {
        jokes.add("Can a kangaroo jump higher than a house? \n" +
                "-\n" +
                "Of course, a house doesn’t jump at all.\n" +
                "\n" +
                "Check out this really funny jokes: https://short-funny.com/#ixzz5LJXIjmL8");
        jokes.add(" Anton, do you think I’m a bad mother?\n" +
                "\n" +
                "My name is Paul.\n" +
                "\n" +
                "Check out this really funny jokes: https://short-funny.com/#ixzz5LJXOjJQ1");
        jokes.add("My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.\n" +
                "\n" +
                "Check out this really funny jokes: https://short-funny.com/#ixzz5LJXRFx7T");
        jokes.add("What is the difference between a snowman and a snowwoman?\n" +
                "-\n" +
                "Snowballs.\n" +
                "\n" +
                "Check out this really funny jokes: https://short-funny.com/#ixzz5LJXVmHW3");
        random = new Random();
    }

    public List<String> getJokes() {
        return jokes;
    }

    public String getRandomJoke() {
        return jokes.get(random.nextInt(jokes.size()));
    }
}
