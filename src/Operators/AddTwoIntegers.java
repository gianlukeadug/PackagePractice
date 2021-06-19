//Package name is src (folder where DefaultPackage is with) until the folder 
//this class is in (Operators folder).
package src.Operators;

public class AddTwoIntegers {
    private int num1;
    private int num2;

    public AddTwoIntegers(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int operateAdd(){
        return num1 + num2;
    }

    public int getNum1(){
        return num1;
    }

    public int getNum2(){
        return num2;
    }
}
