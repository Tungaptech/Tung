package Demo6;

// Lớp User
class User {
    private String name;
    private int age;

    public User(String name, int age) throws InvalidAgeException {
        this.name = name;
        setAge(age); // Gọi phương thức setAge
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18.");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

