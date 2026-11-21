package ejercicio02;

//Representa una carta individual con palo y valor
public class Card {
	// palo de la carta
	public String suit;
	// valor de la carta
	public String value;

	// constructor que asigna el palo y el valor a la carta
	public Card(String suit, String value) {
		this.suit = suit;
		this.value = value;
	}

	// devuelve la carta formateada como palo-valor
	public String toString() {
		return (this.suit + "-" + this.value);
	}

}
