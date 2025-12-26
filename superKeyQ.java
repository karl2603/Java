    class UniversityMember {
        String name;
        int id;

        UniversityMember(String name, int id) {
            this.name = name;
            this.id = id;
        }

        void displayMember() {
            System.out.println("Name : " + this.name);
            System.out.println("Id : " + this.id);
        }
    }

    class Student extends UniversityMember {
        String dept;
        double cgpa;
        
        Student(String name, int id, String dept, double cgpa){
            super(name, id);
            this.dept = dept;
            this.cgpa = cgpa;
        }

        void displayStudent() {
            System.out.println("--Student Details--");
            super.displayMember();
            System.out.println("Department : " + this.dept);
            System.out.println("Cgpa : " + this.cgpa);
        }
    }

    class Professor extends UniversityMember {
        String course;
        int salary;

        Professor(String name, int id, String course, int salary){
            super(name, id);
            this.course = course;
            this.salary = salary;
        }

        void displayProfessor() {
            System.out.println("--Faculty Details--");
            super.displayMember();
            System.out.println("Course : " + this.course);
            System.out.println("Salary : " + this.salary);
        }
    }

    class superKeyQ {
        public static void main(String args[]) {
            Student stud1 = new Student("Karl", 29, "Computer Science", 8.97);
            Student stud2 = new Student("Vignesh", 27, "Computer Science", 7.8);
            Student stud3 = new Student("Allwin", 12, "Electronics and Communication Engineering", 7.5);
            Professor prof1 = new Professor("Hasini", 20, "Law", 89000);
            stud1.displayStudent();
            stud2.displayStudent();
            stud3.displayStudent();
            prof1.displayProfessor();
        }
    }