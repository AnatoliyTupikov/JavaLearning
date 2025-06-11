package Lab02;



public class PersonalComputer {

    public Processors CPU;
    public String GPU;
    public int FansCount;
    public  String Motherboard;
    public  String CaseColor;

    PersonalComputer(){}

    PersonalComputer(Processors cpu, String motherboard, String gpu, int fans, String color)
    {
        CPU = cpu;
        Motherboard = motherboard;
        GPU = gpu;
        FansCount = fans;
        CaseColor = color;
    }
}
