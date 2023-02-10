public class IT extends Company {
    private String step1;
    private String step2;

    public IT(String study, String sphereOfinFluence) {
        this.step1 = study;
        this.step2 = sphereOfinFluence;
    }

    @Override
    public void print() {
        System.out.println("Programmers team: " + step1 +
                "\nend the project: " + step2);

    }
}
