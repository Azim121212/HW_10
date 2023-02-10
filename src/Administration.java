public class Administration extends Company {
    private String Look;
    private String GiveEducation;

    public Administration(String look, String giveEducation) {
        this.Look = look;
        this.GiveEducation = giveEducation;
    }

    @Override
    public void print() {
        System.out.println("Administration " + Look
        + "\nAdministartion : " + GiveEducation );
    }
}