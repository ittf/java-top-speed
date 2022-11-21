package chapter02;

public class Java04_Operator {

    public static void main(String[] args) {
        //todo 运算符
        //所谓的运算符就是参与数据运算的符号。java定义的，无法自行定义的

        //todo 表达式
        //所为表达式就是采用运算符和数据连接在一起形成符合java语法规则的指令代码，称之为表达式

        //TODO 算数运算符
        //1.二元运算符：两个元素参与运算的运算符，1+2
        //todo 算术表达式=元素1 二元运算符 元素2
        //这个表达式是有结果的，就需要有类型，这里的类型是元素类型最大的那一种,最小使用的类型是int
        System.out.println(1+2); //3
        System.out.println(2-2); //0
        System.out.println(3*2); //6
        System.out.println(4/2); //2
        System.out.println(1/2); //0.5 (int，int)=>int
        System.out.println(1.0/2); //0.5 (double，double)=>double
        System.out.println(5%2); //1 取余（模运算）


        byte b1=10;
        byte b2=20;
        byte b3= (byte) (b1+b2);


        //2.一元运算符：两个元素参与运算的运算符 ++ --
    }
}
