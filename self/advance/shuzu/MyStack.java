package advance.shuzu;

/*
 * 编写程序，使用一维数组，模拟栈数据结构
 * 要求：
 *  1、这个栈可以存储java中的任何引用数据的类型
 *  2、在栈中提供push方法模拟压栈（栈满了要有提示信息
 *  3、在栈中提供pop方法模拟弹栈（栈空了要有提示信息
 *  4、编写测试程序，new栈对象。调用push pop方法来模拟压栈弹栈的动作
 */
public class MyStack {
    //提供一个数组来储存栈中的元素
    Object[] element;
    int index;

    //构造方法
    public MyStack(){
        this.element = new Object[10]; 
        this.index = 0;
    }

    //push方法
    //压栈表示栈中多一个元素
    //但是栈如果已满，压栈失败
    public void push(Object a){

        if(index >= element.length){
            System.out.println("栈已满，压栈失败");
            return;
        }
        System.out.println("压栈成功，栈针指向" + index);
        element[index++] = a;
        
    }

    //pop方法
    //弹栈表示栈中少一个元素
    //但是栈如果已空，弹栈失败
    public void pop(){
        
        if(index <= 0){
            System.out.println("栈已空，弹栈失败");
            return;
        }
        
        System.out.println("弹出的元素为" + element[--index]);
        element[index] = null;
        System.out.println("弹栈成功，栈针指向" + index);
        
        
    }
    
}

