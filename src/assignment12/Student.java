package assignment12;


class Student{
    int id,age,yearOfEnroll;
    String name,gender,engDepartment;
    double perTillDate;
    public Student(int id, String name, int age,String gender, String engDepartment,int yearOfEnroll,  double perTillDate) {
        this.id = id;
        this.age = age;
        this.yearOfEnroll = yearOfEnroll;
        this.name = name;
        this.gender = gender;
        this.engDepartment = engDepartment;
        this.perTillDate = perTillDate;
    }
    public String toString(){
        return id+" : "+name;
    }

}