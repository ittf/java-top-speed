package chapter02;

public class Java02_Identifier {
    public static void main(String[] args) {
        //todo 标识符
        //标识数据的符号，称之为标识符


        //变量名称就是标识符
        //标识符主要用于起名
        String name="zhangsan";

        //todo 标识符的命名规则
        //1.英文拉丁字母
        String username="zhangsan";
        String xingming="lisi";
        //2.符号
        //@,#,%,$
        //标识符只能采用下划线和美元$符号，其他符号不能使用，称之为特殊符号
        //空格属于特殊符号，所以也不能作为标识符
        String _name="wangwu";
        String $name="wangwu";

        System.out.println(name);
        System.out.println(username);
        System.out.println(xingming);

        //3.数字
        //阿拉伯数字0到9可以作为标识符使用
        //数字如果在标识符的开头位置，那没会被识别为数字，而不是标识符
        String name1="zhangsan";

        //4.在大括号范围内，标识符不允许重复
        //标识符是区分大小写的

        //5.java语言中预先定义好的一些标识符，称之为关键字或保留字
    }
}
