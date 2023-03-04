package Giris;
public class Main {
    public static void main(String[] args) {

        Course Mat = new Course("Matematik", "MAT101", "MAT");
        Course Fizik = new Course("Fizik", "FZK101", "FZK");
        Course Kimya = new Course("Kimya", "KMY101", "KMY");

        Course MatSozlu = new Course("Matematik", "MAT101", "MAT");
        Course FizikSozlu = new Course("Fizik", "FZK101", "FZK");
        Course KimyaSozlu = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        Mat.addTeacher(t1);
        Fizik.addTeacher(t2);
        Kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "1401015", 4, Mat, Fizik, Kimya, MatSozlu, FizikSozlu, KimyaSozlu);
        s1.addBulkExamNote(50,20,40, 50, 60, 70);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "2211133", 4, Mat, Fizik, Kimya, MatSozlu, FizikSozlu, KimyaSozlu);
        s2.addBulkExamNote(100,50,40, 80, 30, 70);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", "1616036", 4, Mat, Fizik, Kimya, MatSozlu, FizikSozlu, KimyaSozlu);
        s3.addBulkExamNote(70,20,60, 70, 80, 50);
        s3.isPass();
    }
}
