public class CompositionBasics {
    public static void main(String[] args) {
        Person bobby = new Person();
        System.out.println(bobby.getSalary());

        Education education = new Education();
        education.setSchoolName("UMUC");

        System.out.println(education.toString());
    }
}