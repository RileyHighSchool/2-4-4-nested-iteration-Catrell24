/*
 * Activity 2.4.4
 */
import java.util.Scanner;

public class LetterFrequencies
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a phrase and see how frequently each letter appears");
		String letters = "abcdefghijklmnopqrstuvwxyz"; 
		String phrase = sc.nextLine();
		phrase = phrase.toLowerCase();


		System.out.println("The following shows the letter frequencies for the phrase");

    /* your code here */
	for (int i = 0; i < 26; i++)
	{
		String let = letters.substring(i, i + 1);
		int count = 0;

		for (int inner = 0; inner < phrase.length(); inner ++)
		{
			String frase = phrase.substring(inner, inner + 1);

			if (let.equals(frase))
			{
				count ++;
			}
		}
		System.out.println("The letter " + let + " occurs " + count + " times");


	}
	}
}
