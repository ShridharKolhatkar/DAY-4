package Random;

public class SnakeladderUc5 {
public static void main(String[] args) {
		
		
		System.out.println("Snake And ladder Game using Single Player");
		
		//Random function to rolls the die to get a number
		double Rolling = Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println(Rolling);
	}

}


