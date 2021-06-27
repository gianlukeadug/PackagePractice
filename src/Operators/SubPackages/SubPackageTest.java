package src.Operators.SubPackages;

public class SubPackageTest {
    private String someThing;

    public SubPackageTest(){
        this.someThing = "null";
    }

    public SubPackageTest(String someThing){
        this.someThing = someThing;
    }

    public String getSomeThing(){
        return someThing;
    }
    
}
