package chapter02;

public class Java01_Variable {
    public static void main(String[] args) {
        //todo 变量
        //所谓的变量，其实就是可以改变的变量存储
        //1.变量的声明
        //变量类型  变量的名称
        String name;

        //2.变量的赋值
        //变量名称=数据
        name ="zhangsan";

        //3.变量的使用
        //直接访问变量的名称即可
        System.out.println(name);


        //将变量的声明和赋值在一行代码中完成,在使用之前必须要给变量赋值，这个操作称之为变量的初始化
        String username="lisi";
        System.out.println(username);
    }
}
