namespace BaiThiC2;

using System;

class Program
{
    static void Main()
    {
        // Accepting input string from user
        Console.Write("Enter a string: ");
        string inputString = Console.ReadLine();

        // Accepting word to search from user
        Console.Write("Enter a word to search: ");
        string wordToSearch = Console.ReadLine();

        // Calling CountOccurrences method to find and count occurrences
        int count = CountOccurrences(inputString, wordToSearch);

        // Displaying the result
        Console.WriteLine($"The word '{wordToSearch}' appears {count} times in the string.");

        Console.ReadLine(); // To keep console window open
    }

    // Method to count occurrences of a word in a string
    static int CountOccurrences(string inputString, string wordToSearch)
    {
        int count = 0;
        int position = inputString.IndexOf(wordToSearch, StringComparison.OrdinalIgnoreCase);

        while (position != -1)
        {
            count++;
            position = inputString.IndexOf(wordToSearch, position + 1, StringComparison.OrdinalIgnoreCase);
        }

        return count;
    }
}