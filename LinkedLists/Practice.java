//This keyword Example 
class Rectangle {
    int len, wid;

    Rectangle(int len, int wid) {
        this.len = len;
        this.wid = wid;
    }

    public void calarea() {
        System.out.println("Area=" + (len * wid));
        System.out.println("a= " + this.len);
        System.out.println("a= " + len);

    }
}

class this1 {

    int x = 20;

    void method(int x) {
        System.out.println("x=" + x);
        System.out.println("x=" + this.x);

    }
}

class Practice {
    public static void main(String args[]) {
        Rectangle obj = new Rectangle(2, 6);
        obj.calarea();
    }
}

// class Practice {
// public static void main(String args[]) {
// this1 obj = new this1();
// obj.method(40);
// }
// }
