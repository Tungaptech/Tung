namespace BaiThiC1;

using System;

class People
{
    // Các trường riêng để lưu trữ các thuộc tính
    private string name;
    private bool gender;
    private int age;

    // Các thuộc tính
    public string Name
    {
        get { return name; }
        set { name = value; }
    }

    public bool Gender
    {
        get { return gender; }
        set { gender = value; }
    }

    public int Age
    {
        get { return age; }
        set { age = value; }
    }

    // Constructor
    public People(string name, bool gender, int age)
    {
        Name = name;
        Gender = gender;
        Age = age;
    }

    // Phương thức để hiển thị các giá trị hiện tại của các thuộc tính
    public void Display()
    {
        Console.WriteLine($"Tên: {Name}");
        Console.WriteLine($"Giới tính: {(Gender ? "Nam" : "Nữ")}");
        Console.WriteLine($"Tuổi: {Age}");
    }

    // Phương thức để tăng giá trị của thuộc tính Age
    public void IncrementAge()
    {
        Age++;
    }
}

