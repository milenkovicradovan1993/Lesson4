package exercises;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		int answer = 0;
		while (answer == 0) {
			int answerA = JOptionPane.showOptionDialog(null, "Which animal do you want to hear?", "Animal Farm", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Cow", "Cat", "Dog", "Duck", "Llama", "Pig" },
					null);
			if (answerA == 0)
				playMoo();
			else if (answerA == 1)
				playMeow();
			else if (answerA == 2)
				playWoof();
			else if (answerA == 3)
				playQuack();
			else if (answerA == 4)
				playLlama();
			else
				playOink();
			answer = JOptionPane.showConfirmDialog(null, "Do you want to hear another animal?", "",
					JOptionPane.YES_NO_OPTION);
		}

	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}
	void playMeow() {
		playNoise(meowFile);
	}

	void playLlama() {
		playNoise(llamaFile);
	}
	void playOink() {
		playNoise(oinkFIle);
	}

	String quackFile = "sound/quack.wav";
	String mooFile = "sound/moo.wav";
	String woofFile = "sound/woof.wav";
	String meowFile = "sound/meow.wav";
	String llamaFile = "sound/llama.wav";
	String oinkFIle = "sound/oink.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
