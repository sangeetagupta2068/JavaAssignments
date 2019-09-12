package com.domain.sangeetagupta;

interface A{
    int num = 10;
    void mem();
}

interface B{
    default void mem2(){
        System.out.print("Hrllo");
    }
}

interface C extends A,B{
    void mem1();
}
class AM{
    int var;
    int num;
    static int var1 = 10;

    AM(){
        System.out.println("Constructor called!");
    }

    public void whatever(){
        var = var1;
    }
}

class MethodOverLoadingTest extends AM{
    int cat;
    MethodOverLoadingTest(){
        System.out.println("MD Constructor called!" );
    }

    public static void main(String... s){
        AM am =  new MethodOverLoadingTest();
        MethodOverLoadingTest methodOverLoadingTest = (MethodOverLoadingTest) am;
    }

}