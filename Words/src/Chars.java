abstract public class Chars {

	static boolean charCompare(char a, char b) {

		if (Character.isLetter(a) && Character.isLetter(b)) {

			if ((a - b) == 32)
				return true;

			if (a == b)
				return true;

			if ((a - b) == (-32))
				return true;
		}

		if ((a == '\'') && (b == '\''))
			return true;

		return false;
	}

}