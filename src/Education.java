public class Education extends Person{
    private String schoolName;
    public Education(){

    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

@Override
public String toString(){
        return "School Names:" +getSchoolName();
}



}
