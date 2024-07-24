namespace BaiThiC1;

public class WordSearch
{
    public void SearchWordInString()
    {
        // Accept a string from the user
        Console.Write("\nEnter a String: ");
        string inputString = Console.ReadLine();

        // Accept a word to search from the user
        Console.Write("Enter a word to search: ");
        string searchWord = Console.ReadLine();

        // Count the occurrences of the word in the string
        int wordCount = CountOccurrences(inputString, searchWord);

        // Display the result
        Console.WriteLine($"Word found {wordCount} times in the string");
    }

    private int CountOccurrences(string str, string word)
    {
        int count = 0;
        int index = str.IndexOf(word, 0);

        while (index != -1)
        {
            count++;
            index = str.IndexOf(word, index + word.Length);
        }

        return count;
    }
}