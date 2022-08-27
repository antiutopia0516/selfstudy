package advance.shuzu;

public class MyStackTest {
    public static void main(String[] args) {

        //创建一个栈对象，初始化容量为10个
        MyStack stack = new MyStack();

        //调用方法压栈
        stack.push("a");
        stack.push("a");
        stack.push("a");
        stack.push("a");
        stack.push("a");
        stack.push("a");
        stack.push("a");
        stack.push("a");
        stack.push("a");
        stack.push("b");
        stack.push("a");
        stack.push("a");

        for(int i = 0; i < stack.element.length; i++){
            System.out.println(stack.element[i]);
        }

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        
        for(int i = 0; i < stack.element.length; i++){
            System.out.println(stack.element[i]);
        }

    }
}
