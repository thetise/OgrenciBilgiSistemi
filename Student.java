package Giris;
public class Student {

    String name;
    String stuNo;
    int Classes;
    Course Mat;
    Course Fizik;
    Course Kimya;
    Course MatSozlu;
    Course FizikSozlu;
    Course KimyaSozlu;
    double average;
    boolean isPass;


    Student(String name, String stuNo, int Classes, Course Mat, Course Fizik, Course Kimya, Course MatSozlu, Course FizikSozlu, Course KimyaSozlu){
        this.name = name;
        this.stuNo = stuNo;
        this.Classes = Classes;
        this.Mat = Mat;
        this.Fizik = Fizik;
        this.Kimya = Kimya;
        this.MatSozlu = MatSozlu;
        this.FizikSozlu = FizikSozlu;
        this.KimyaSozlu = KimyaSozlu;
        calcAverage();
        this.isPass = false;
    }

    public void addBulkExamNote(int Mat, int Fizik, int Kimya, int MatSozlu, int FizikSozlu ,int KimyaSozlu){
        if(Mat >=0 || Mat <=100){
            this.Mat.note = Mat;
        }
        if(Fizik >=0 || Fizik <=100){
            this.Fizik.note = Fizik;
        }
        if(Kimya >=0 || Kimya <=100){
            this.Kimya.note = Kimya;
        }
        if(MatSozlu >=0 || MatSozlu <=100){
            this.MatSozlu.note = MatSozlu;
        }
        if(FizikSozlu >=0 || FizikSozlu <=100){
            this.FizikSozlu.note = FizikSozlu;
        }
        if(KimyaSozlu >=0 || KimyaSozlu <=100){
            this.KimyaSozlu.note = KimyaSozlu;
        }
    }

    public void isPass(){
        if(this.Mat.note == 0 || this.Fizik.note == 0 || this.Kimya.note == 0){
            System.out.println("Notlar tam olarak girilmemiş.");
        }
        else{
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama: " + this.average);
            if(this.isPass){
                System.out.println("Sınıfı Geçti.");
            }
            else{
                System.out.println("Sınıfta kaldı.");
            }
        }
    }

    public void calcAverage(){
        this.average = (this.Mat.note + this.Fizik.note + this.Kimya.note + this.MatSozlu.note + this.FizikSozlu.note + this.KimyaSozlu.note) / 6.0;
    }

    public boolean isCheckPass(){
        calcAverage();
        return this.average > 55;
    }

    public void printNote(){
        System.out.println("==============");
        System.out.println("Öğrenci: " + this.name);
        System.out.println("Matematik Notu: " + this.Mat.note);
        System.out.println("Fizik Notu: " + this.Fizik.note);
        System.out.println("Kimya Notu: " + this.Kimya.note);
        System.out.println("Matematik Sözlü Notu: " + this.MatSozlu.note);
        System.out.println("Fizik Sözlü Notu: " + this.FizikSozlu.note);
        System.out.println("Kimya Sözlü Notu: " + this.KimyaSozlu.note);
    }
}