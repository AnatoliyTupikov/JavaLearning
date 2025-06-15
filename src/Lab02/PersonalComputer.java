package Lab02;



public class PersonalComputer {

    private Processor CPU;
    public String GPU;
    public int FansCount;
    public  String Motherboard;
    public  String CaseColor;

    public PersonalComputer(){}

    public PersonalComputer(Processor cpu, String motherboard, String gpu, int fans, String color)
    {
        CPU = cpu;
        Motherboard = motherboard;
        GPU = gpu;
        FansCount = fans;
        CaseColor = color;
    }

    public Processor getProcessor()
    {
        return this.CPU;
    }

    public void setProcessor(Processor value)
    {
        this.CPU = value;
    }


}
