//The import notation starts with the folder where DefaultPackage
//is (src folder) then goes down only until the folder with the 
//classes in it (Operators folder). Can import individual classes
//or all in the Operators folder with '*' 
import src.Operators.AddTwoIntegers;
import src.Operators.FindRemainderTwoIntegers;

public class DefaultPackage{
    
    public static void main(String[] args){
        AddTwoIntegers addInts = new AddTwoIntegers(5, 100);
        System.out.printf("%d is %d + %d\n", addInts.operateAdd(), addInts.getNum1(), addInts.getNum2());

        FindRemainderTwoIntegers findRemainder = new FindRemainderTwoIntegers(100, 3);
        System.out.printf("%d is %d mod %d\n", findRemainder.findRemainder(), findRemainder.getNum1(), findRemainder.getNum2());
    }
}