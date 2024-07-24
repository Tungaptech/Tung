namespace BaiThiC1;

class Program
{
    static void Main()
    {
        // Tạo một đối tượng của lớp People
        People person = new People("Marry", false, 35);

        // Hiển thị các giá trị ban đầu
        Console.WriteLine("Các giá trị ban đầu:");
        person.Display();
        Console.WriteLine();

        // Tăng tuổi
        person.IncrementAge();

        // Hiển thị các giá trị sau khi tăng tuổi
        Console.WriteLine("Sau khi tăng tuổi:");
        person.Display();

        Console.ReadLine(); // Để giữ cửa sổ console mở
    }
    
}