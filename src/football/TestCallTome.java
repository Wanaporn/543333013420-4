package football;

import java.util.Arrays;

public class TestCallTome {

	public static void main(String[] args) {
 		TomasKalas tomasKalas = new TomasKalas();
 		System.out.println("Name : " + tomasKalas.getName());
 		System.out.println("Position :" + tomasKalas.getPosition());
 		System.out.println("Friend :" + Arrays.toString(tomasKalas.getFriend()));
 		tomasKalas = new TomasKalas(1);
 
 	}
 
}
