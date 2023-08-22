package OOp.Abstract;

public class TractorClass implements TractorEngine, TractorTire, TractorGlassCompany{

    void buildModelT23(){
        System.out.println("Building Model T23");
    }
    void getMainFrame(){
        System.out.println("Main Frame is Set");
    }

    @Override
    public void engineSize(int size) {
        System.out.println("Getting Engine Size of : " + size);

    }

    @Override
    public void makeTractorTire() {
        System.out.println("Tractor Size");

    }

    @Override
    public int tireSize() {
        return 45;
    }

    @Override
    public int glassSize() {
        return 189;
    }

    @Override
    public String glassMode() {
        return "Model for T23";
    }
}
