public class Person {
    // Main method should be separate and properly structured
    public static void main(String[] args) {
        // 创建 Person 对象并打印一些信息
        Person person = new Person("John Doe", 30, "Male");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
    }

    // 字段声明应该在 main 方法之外
    private String name;
    private int age;
    private String gender;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.gender = "Unknown";
    }

    // Constructor with parameters
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
