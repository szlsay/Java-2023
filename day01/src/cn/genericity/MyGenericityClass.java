package cn.genericity;
/**
 * 类型通配符：<?>
 *      ArrayList<?>：表示元素类型未知的ArrayList，它的元素可以匹配任何的类型
 *      但是并不能把元素添加到ArrayListList中了，获取出来的也是Object类型
 *
 * 类型通配符上限：<? extends 类型>
 *      ArrayList<? extends Number>：它表示的类型是Number或者其子类型
 *
 * 类型通配符下限：<? super 类型>
 *      ArrayList<? super Number>：它表示的类型是Number或者其父类型
 */
public class MyGenericityClass {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.setElement("box");

        System.out.println(box1.getElement());

        Box<Integer> box2 = new Box<>();
        box2.setElement(123);
        System.out.println(box2.getElement());
    }
}
