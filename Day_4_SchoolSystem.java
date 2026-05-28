class Person{
    String name;
    int age;
    Person(String a, int b){
        name = a;
        age = b;
    }
    void introduce(){
        System.out.println( "Hi I am " + name + " and I am " + age + " year old");

    }

}
class Student extends Person{
    String studentId;
    Student(String a, int b, String c){
        super(a,b);
        studentId = c;
    }
    @Override
    void introduce(){
        super.introduce();
        System.out.println("My student ID is " + studentId);}
        void study(String subject){
            System.out.println(name + " is studying " + subject);
        }
    
    
}
class Teacher extends Person{
    String subject;
    Teacher(String a, int b, String c){
        super(a, b);
        subject = c;
    }
    @Override
    void introduce(){
        super.introduce();
        System.out.println("I teach " + subject);
    }
    void teach(){
        System.out.println(name + " is teaching " + subject);
    }
}

class SchoolSystem{
    public static void main(String[] args){
        Student s = new Student("Nyan", 18, "S12345");
Teacher t = new Teacher("Tanaka", 35, "Java");

s.introduce();
s.study("Java");

System.out.println("---");

t.introduce();
t.teach();

System.out.println("---");

// instanceof test
Person[] people = {s, t};
for(Person p : people){
    if(p instanceof Student){
        System.out.println(p.name + " is a Student");
    } else if(p instanceof Teacher){
        System.out.println(p.name + " is a Teacher");
    }
}
    }
}
