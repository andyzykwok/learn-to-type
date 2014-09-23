/*
*********************************************************************************************
LEARN TO TYPE - Random Words
By: Andy Kwok
*********************************************************************************************
*/

// The "Words" class.

public class Words
{

	public String[] words = new String [53];
	{
		words [0] = "word";
		words [1] = "remote";
		words [2] = "lego";
		words [3] = "however";
		words [4] = "number";
		words [5] = "electronics";
		words [6] = "computer";
		words [7] = "contracting";
		words [8] = "backpack";
		words [9] = "airplane";
		words [10] = "barbecue";
		words [11] = "bathroom";
		words [12] = "cappuccino";
		words [13] = "chocolate";
		words [14] = "compact";
		words [15] = "electricity";
		words [16] = "earthquake";
		words [17] = "gemstone";
		words [18] = "horoscope";
		words [19] = "restaurant";
		words [20] = "pendulum";
		words [21] = "sandpaper";
		words [22] = "signature";
		words [23] = "software";
		words [24] = "sunglasses";
		words [25] = "elements";
		words [26] = "typewriter";
		words [27] = "umbrella";
		words [28] = "videotape";
		words [29] = "wheelchair";
		words [30] = "torpedo";
		words [31] = "microwave";
		words [32] = "elephant";
		words [33] = "heroes";
		words [34] = "fireplace";
		words [35] = "waterfall";
		words [36] = "racecar";
		words [37] = "keyboard";
		words [38] = "gummybears";
		words [39] = "translation";
		words [40] = "spiderman";
		words [41] = "mixing";
		words [42] = "headphones";
		words [43] = "calculator";
		words [44] = "feelings";
		words [45] = "asthma";
		words [46] = "running";
		words [47] = "binder";
		words [48] = "sharpner";
		words [49] = "company";
		words [50] = "screen";
		words [51] = "definition";
		words [52] = "spelling";
		
	}

	public static void main (String[] args)
	{

	} // main method

	public String randomword ()
	{
		return words [(int) (Math.random () * 53)];
	}
} // Words class
