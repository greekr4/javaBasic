package sec0;

public class SuitFactory {
	static public Suit getSuit(SuitAbtractFactory SuitAbtractFactory){
		return SuitAbtractFactory.createSuit();
	}
}
