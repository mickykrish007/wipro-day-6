class Person1
{
   String name;
   int age;
 
}

class Employee extends Person1
{
double salary;
int startYear;
long insurancenum;

public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public double getSalary() {
        return salary;
    }

    public int getStartYear() {
        return startYear;
    }

    public long getInsurancenum() {
        return insurancenum;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public void setInsurancenum(long insurancenum) {
        this.insurancenum = insurancenum;
    }



}
class Program2
{
public static void main(String[] args)
{
Employee e =new Employee();
e.setName("dinesh");
e.setAge(20);
e.setSalary(10000);
e.setInsurancenum(1012);
e.setStartYear(2019);
System.out.println(e.getName());
System.out.println(e.getAge());
System.out.println(e.getSalary());
System.out.println(e.getInsurancenum());
System.out.println(e.getStartYear());


}
}

