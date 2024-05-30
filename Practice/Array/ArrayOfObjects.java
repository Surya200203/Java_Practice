package Array;


class Student{
    int rollNo;
    String name;
    int Standard;
    char section;
}

class ArrayOfObjects{
    public static void main(String[] args) {

        Student obj = new Student();
        obj.rollNo = 1;
        obj.name = "Rohan";
        obj.section = 'A';
        obj.Standard = 8;

        Student obj1 = new Student();
        obj1.rollNo = 2;
        obj1.name = "Sahil";
        obj1.section = 'A';
        obj1.Standard = 8;

        Student obj2 = new Student();
        obj2.rollNo = 3;
        obj2.name = "Manish";
        obj2.section = 'B';
        obj2.Standard = 9;


        Student arr[] = {obj,obj1,obj2};
        System.out.println("########## Student Details ##########");
        for(int i=0 ; i < arr.length ; i++){
            System.out.println("Student "+ (i+1));
            System.out.println("Roll No : - "+arr[i].rollNo);
            System.out.println("Name :- "+arr[i].name);
            System.out.println("Standard :- "+arr[i].Standard);
            System.out.println("Section :- "+arr[i].section);
        }
    }
}
