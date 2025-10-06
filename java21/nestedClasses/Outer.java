package java21.nestedClasses;

public class Outer {
    int var1;
    String var2;
    private String var3;
    private static int counts;
    static {
        counts = 45;
    }

    class InnerClass {
        int innerVar1;
        String innerVar2;

        InnerClass(){
            this.innerVar2 = var3;
        }

        void accessibleVariables(){
            System.out.println("outer var1: "+ var1 + ", counts:" + counts);
        }
    }

    static class InnerStaticClass {
        InnerStaticClass(){
            counts+=1;
        }

        void printAccessibleVars(Outer outerClass){
            System.out.println("counts: "+counts +", inners:" + outerClass.var1);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.InnerClass innerClass = outer.new InnerClass();
        innerClass.accessibleVariables();

        InnerStaticClass innerStatic = new InnerStaticClass();
        innerStatic.printAccessibleVars(outer);
    }

}
