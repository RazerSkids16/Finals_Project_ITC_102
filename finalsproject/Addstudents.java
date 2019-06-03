package finalsproject;

import Database.ConnectDB;
import java.util.ArrayList;
import java.sql.*;

public class Addstudents {

    private static final String tblName = "students";

    private int ID;
    private String fullname;
    private String idnumber;
    private String age;
    private String address;
    private String gender;
    private String status;
    private String course;
    private String sem;
    private String prog;
    private String hci;
    private String math;
    private String read;
    private String otik;
    private String arts;
    private String gpa;

    public Addstudents(int ID, String num, String fname, String age, String course, String stat, String address, String sem,
            String prograde, String hci, String math, String read, String otik, String gpa, String arts, String gender) {
        this.ID = ID;
        this.fullname = fname;
        this.idnumber = num;
        this.age = age;
        this.course = course;
        this.status = stat;
        this.address = address;
        this.sem = sem;
        this.prog = prograde;
        this.hci = hci;
        this.math = math;
        this.otik = otik;
        this.read = read;
        this.arts = arts;
        this.gpa = gpa;
        this.gender = gender;
    }

    public Addstudents(String fname, String num, String age, String addrss, String gender, String stat, String course, String sem,
            String prograde, String hci, String math, String otik, String read, String arts, String gpa) {
        this(0, fname, num, age, addrss, gender, stat, course, sem, prograde, hci, math, otik, read, arts, gpa);
    }

    public Addstudents() {
        this("", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String Gender) {
        this.gender = Gender;
    }

    public void setID(int id) {
        this.ID = id;
    }

    public int getID() {
        return ID;
    }

    public void setfname(String name) {
        this.fullname = name;
    }

    public String getfname() {
        return fullname;
    }

    public void setIdnum(String num) {
        this.idnumber = num;
    }

    public String getIdnum() {
        return idnumber;
    }

    public static String getTblName() {
        return tblName;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setAddress(String addrss) {
        this.address = addrss;
    }

    public String getAddress() {
        return address;
    }

    public void setStats(String stat) {
        this.status = stat;
    }

    public String getStats() {
        return status;
    }

    public void getCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setSem(String sem) {
        this.sem = sem;
    }

    public String getSem() {
        return sem;
    }

    public void setPrograde(String prograde) {
        this.prog = prograde;
    }

    public String getPrograde() {
        return prog;
    }

    public void setHci(String hci) {
        this.hci = hci;
    }

    public String getHci() {
        return hci;
    }

    public void setMath(String math) {
        this.math = math;
    }

    public String getMath() {
        return math;
    }

    public void setRead(String read) {
        this.read = read;
    }

    public String getRead() {
        return read;
    }

    public void setOtik(String otik) {
        this.otik = otik;
    }

    public String getOtik() {
        return otik;
    }

    public void setArts(String arts) {
        this.arts = arts;
    }

    public String getArts() {
        return arts;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public String getGpa() {
        return gpa;
    }

    public void InsertToDb() throws SQLException {
        String db = String.format("INSERT INTO %s VALUES(NULL, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", tblName,
                idnumber, fullname, age, address, gender, course, status, sem, prog, hci, math, arts, otik, read, gpa);
        ConnectDB.Query(db, true);
    }

    public static Addstudents getStudentWithID(String id) throws SQLException, Exception {

        String s = String.format("SELECT * FROM %s WHERE id %s", tblName, id);
        ResultSet rs = ConnectDB.Query(s);

        if (!rs.next()) {
            throw new Exception("Student with ID: " + id + " not found!");
        }
        Addstudents ad = getStudentFromResult(rs);
        return ad;
    }

    public static ArrayList<Addstudents> searchStudentUsingId(String Values) throws SQLException {
        ArrayList<Addstudents> students = new ArrayList<>();
        String db = String.format("SELECT * from %s WHERE Idnumber LIKE \"%%%%%s%%%%\"", tblName, Values);

        ResultSet res = ConnectDB.Query(db);

        while (res.next()) {
            System.out.print("Query Found");
            Addstudents stud = getStudentFromResult(res);
            System.out.println(stud);
            students.add(stud);
        }
        return students;

    }

    public static Addstudents getStudentFromResult(ResultSet res) throws SQLException {
        int ID = res.getInt("ID");
        String idnumber = res.getString("Idnumber");
        String fullname = res.getString("Fname");
        String age = res.getString("Age");
        String status = res.getString("Civilstats");
        String address = res.getString("Address");
        String gender = res.getString("Gender");
        String sem = res.getString("Sem");
        String course = res.getString("Course");
        String prog = res.getString("Comprog");
        String hci = res.getString("Hci");
        String math = res.getString("Math");
        String arts = res.getString("Arts");
        String otik = res.getString("Hist10");
        String read = res.getString("Hist11");
        String gpa = res.getString("Gpa");
        

        Addstudents add = new Addstudents(ID, idnumber, fullname, age, status, address, gender, sem, course, prog, hci, math, arts, otik, read, gpa);

        return add;
    }

    @Override
    public String toString() {
        return String.format("Student Academic Overview\n"
                + "ID: %d\n"
                + "IDnum: %s\n"
                + "Fullname: %s\n"
                + "Age: %s\n"
                + "Semester: %s\n"
                + "Civil Status: %s \n"
                + "Address: %s\n"
                + "Course: %s\n"
                + "Gender: %s\n"
                + "ProgGrade: %s\n"
                + "hci: %s\n"
                + "math: %s\n"
                + "otik: %s\n"
                + "arts: %s\n"
                + "Reading: %s\n"
                + "gpa: %s\n",
                ID, idnumber, fullname, age, sem, status, address, course, gender, prog, hci, math, otik, arts, read, gpa);
    }

    public static String[][] Arraylist(ArrayList<Addstudents> As) {
        int row = As.size();
        int column = 16;
        String[][] size = new String[row][column];
        for (int i = 0; i < row; i++) {
            Addstudents add = As.get(i);
            size[i][0] = add.getID() + "";
            size[i][1] = add.getIdnum();
            size[i][2] = add.getfname();
            size[i][3] = add.getAge();
            size[i][4] = add.getCourse();
            size[i][5] = add.getStats();
            size[i][6] = add.getAddress();
            size[i][7] = add.getSem();
            size[i][8] = add.getPrograde();
            size[i][9] = add.getGpa();
            size[i][10] = add.getHci();
            size[i][11] = add.getMath();
            size[i][12] = add.getOtik();
            size[i][13] = add.getArts();
            size[i][14] = add.getRead();
            size[i][15] = add.getGender();
        }
        return size;
    }

}
