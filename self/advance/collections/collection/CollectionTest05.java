package advance.collections.collection;

import java.util.ArrayList;
import java.util.Collection;
/* 
 * 存放在一个集合的类型，一定要重写equals方法
 */
public class CollectionTest05 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        User u = new User("jack");
        c.add(u);
        User u1 = new User("jack");
        System.out.println(c.contains(u1));
        c.add(u1);
        System.out.println(c.size());
        User u2 = new User("jack");
        c.remove(u2);
        System.out.println(c.size());
    }
}

class User{
    String name;
    public User(){

    }
    public User(String name){
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    
}