package practiceJava;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class SimonGame {

	    private static final String[] buttonColours = {"red", "blue", "green", "yellow"};

	    private List<String> gamePattern = new ArrayList<>();
	    private List<String> userClickedPattern = new ArrayList<>();

	    private boolean started = false;
	    private int level = 0;

	    public static void main(String[] args) {
	        SimonGame simonGame = new SimonGame();
	        simonGame.startGame();
	    }

	    private void startGame() {
	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            if (!started) {
	                System.out.println("Level " + level);
	                nextSequence();
	                started = true;
	            }
	            String input = scanner.nextLine();
	            if (input.isEmpty()) {
	                break;
	            }
	            String userChosenColour = input;
	            userClickedPattern.add(userChosenColour);
	            playSound(userChosenColour);
	            animatePress(userChosenColour);
	            checkAnswer(userClickedPattern.size() - 1);
	        }
	        scanner.close();
	    }

	    private void checkAnswer(int currentLevel) {
	        if (gamePattern.get(currentLevel).equals(userClickedPattern.get(currentLevel))) {
	            if (userClickedPattern.size() == gamePattern.size()) {
	                try {
	                    Thread.sleep(1000);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	                nextSequence();
	            }
	        } else {
	            playSound("wrong");
	            System.out.println("Game Over, Press Enter to Restart");
	            startOver();
	        }
	    }

	    private void nextSequence() {
	        userClickedPattern.clear();
	        level++;
	        System.out.println("Level " + level);
	        Random random = new Random();
	        int randomNumber = random.nextInt(4);
	        String randomChosenColour = buttonColours[randomNumber];
	        gamePattern.add(randomChosenColour);
	        System.out.println(randomChosenColour);
	        playSound(randomChosenColour);
	    }

	    private void animatePress(String currentColor) {
	        System.out.println(currentColor);
	    }

	    private void playSound(String name) {
	        // implementation for playing the sound
	    }

	    private void startOver() {
	        level = 0;
	        gamePattern.clear();
	        started = false;
	    }
}

