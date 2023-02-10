public class Main {
    public static void main(String[] args) {
        Printable[] printables = {createObject("Administration"), createObject("Design"), createObject("IT")};
        for (Printable printable: printables) {
            printable.print();
        }

    }
    public static Printable createObject(String className){
        switch (className){
            case "Administration":
                return new Administration("Search some projects","Give this projects for creating design team");
            case "Design":
                return new Design("Start do Design","After give example to Programmers team");
            case "IT":
                return new IT("Start create projects","After give company for proverka");
        }
        return null;
    }


}