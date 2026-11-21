package ejercicio02;

import java.util.ArrayList;

public class DeckCards {
	// lo que hace es generar una baraja de cartas, intercambia las posiciones y muestra las 5 cartas
	public static void main(String[] args) {
//son Arrays con los palos y valores de la baraja
		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
//Es una lista dinamica para guardar  todas las cartas
		ArrayList<Card> deck = new ArrayList<Card>();
//rellena la baraja con todas las combinaciones de palo y valor que son 52 cartas
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < values.length; j++) {
				Card card = new Card(suits[i], values[j]);
				deck.add(card);
			}
		}
//recorre la baraja e intercambia la carta de posicion i con la de posicion j
		for (int i = 0; i < deck.size(); i++) {
			int j = (int) Math.floor(Math.random() * i);
			Card tmp = deck.get(i);
			deck.set(i, deck.get(j));
			deck.set(j, tmp);
		}
//Imprime las 5 primeras cartas de la baraja resultante
		for (int i = 0; i < 5; i++) {
			System.out.println(deck.get(i));
		}

	}

}

	


