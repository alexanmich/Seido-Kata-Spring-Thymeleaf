package seido.kata;

import java.util.ArrayList;
import java.util.Random;

public class KataRepository {
	
	private final ArrayList<Kata> white = new ArrayList<Kata>();
	private final ArrayList<Kata> blue = new ArrayList<Kata>();
	private final ArrayList<Kata> yellow = new ArrayList<Kata>();
	private final ArrayList<Kata> green = new ArrayList<Kata>();
	private final ArrayList<Kata> brown = new ArrayList<Kata>();
	private final ArrayList<Kata> all = new ArrayList<Kata>();

	public KataRepository() {
		loadArrays();

	}
	
	public ArrayList<Kata> findAll() {
		return all;
	}
	
	public ArrayList<Kata> findAllByGrade(String grade){
		switch(grade) {
		case "white":
			return white;
		case "blue":
			return blue;
		case "yellow":
			return yellow;
		case "green":
			return green;
		case "brown":
			return brown;
		default:
			return all;
		}
	}
	
	public Kata findRandom() {
		Kata kata = all.get(new Random().nextInt(all.size()));
		return kata;
	}
	
	public Kata findRandomByGrade(String grade) {
		Kata kata;
		switch(grade) {
		case "white":
			kata = white.get(new Random().nextInt(white.size()));
			break;
		case "blue":
			kata = blue.get(new Random().nextInt(blue.size()));
			break;
		case "yellow":
			kata = yellow.get(new Random().nextInt(yellow.size()));
			break;
		case "green":
			kata = green.get(new Random().nextInt(green.size()));
			break;
		case "brown":
			kata = brown.get(new Random().nextInt(brown.size()));
			break;
		default:
			kata = all.get(new Random().nextInt(all.size()));
		}
		return kata;
	}
	
	

	/***
	 * Loads all array lists for each grade
	 * with the relevant katas. 
	 */
	public void loadArrays() {
		this.white.add(new Kata("Taikyoku Sono Ichi", "White"));
		this.white.add(new Kata("Taikyoku Sono Ni", "White"));
		this.white.add(new Kata("Taikyoku Sono San", "White"));
		this.blue.add(new Kata("Pinan Sono Ichi", "Blue"));
		this.blue.add(new Kata("Seido Sono Ichi", "Blue"));
		this.yellow.add(new Kata("Pinan Sono Ni", "Yellow"));
		this.yellow.add(new Kata("Pinan Sono San", "Yellow"));
		this.yellow.add(new Kata("Seido Sono Ni", "Yellow"));
		this.yellow.add(new Kata("Sanchin Kata", "Yellow"));
		this.green.add(new Kata("Pinan Sono Yon", "Green"));
		this.green.add(new Kata("Seido Sono San", "Green"));
		this.green.add(new Kata("Gekisai-Dai Kata", "Green"));
		this.green.add(new Kata("Yansu Kata", "Green"));
		this.brown.add(new Kata("Pinan Sono Go", "Brown"));
		this.brown.add(new Kata("Seido Sono Yon", "Brown"));
		this.brown.add(new Kata("Tzuki no", "Brown"));
		this.brown.add(new Kata("Saiha Kata", "Brown"));
		this.brown.add(new Kata("Tensho Kata", "Brown"));
		this.all.addAll(white);
		this.all.addAll(blue);
		this.all.addAll(yellow);
		this.all.addAll(green);
		this.all.addAll(brown);
	}

}

