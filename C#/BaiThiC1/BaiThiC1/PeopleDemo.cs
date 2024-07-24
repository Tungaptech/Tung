namespace BaiThiC1;

public class PeopleDemo
{
    public void DemonstrateProperties()
    {
        // Create an instance of the People class
        People person = new People();

        // Initialize properties
        person.Name = "Marry";
        person.Gender = true; // true for male
        person.Age = 25;

        // Display the initial values of the properties
        Console.WriteLine("Simple Properties Demo");
        Console.WriteLine($"Person details: Name = {person.Name}, Gender = {(person.Gender ? "Male" : "Female")}, Age = {person.Age}");

        // Increment the Age property
        person.Age++;

        // Display the updated value of the Age property
        Console.WriteLine($"Person details (after incrementing age): Name = {person.Name}, Gender = {(person.Gender ? "Male" : "Female")}, Age = {person.Age}");
    }
}