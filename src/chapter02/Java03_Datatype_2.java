package chapter02;

public class Java03_Datatype_2 {
    //todo 数据类型的转换
    String name="zhangsan";
    int age=30;

    //byte->short->int->long->float->double
    byte b =10;
    short s =b;
    int i =s;
    long lon =i;
    float f =lon;
    double d =f;
    //java中范围小的数据可以直接转换为范围大的数据，但是范围大的数据无法直接转换范围小的数据


    //若果想要将范围大的数据转换为范围小的数据，那么需要使用小括号进行强制转换
    int i1 =(int)d;
}
