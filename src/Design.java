public class Design extends Company {
    private String searching;
    private String start;

    public Design(String searching, String start) {
        this.searching = start;
        this.start = searching;
    }

    @Override
    public void print() {
        System.out.println("Start search and do Design: " + start + "\nDesign team: " + searching);

    }
}
