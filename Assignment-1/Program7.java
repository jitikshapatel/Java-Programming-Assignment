class Outer {

    class MemberInner {
        void show() {
            System.out.println("This is Member Inner Class");
        }
    }

    void display() {

        class LocalInner {
            void show() {
                System.out.println("This is Local Inner Class");
            }
        }

        LocalInner l = new LocalInner();
        l.show();
    }
}

interface Test {
    void show();
}

class Program7 {
    public static void main(String[] args) {

        Outer obj = new Outer();

        Outer.MemberInner m = obj.new MemberInner();
        m.show();

        obj.display();

        Test t = new Test() {
            public void show() {
                System.out.println("This is Anonymous Inner Class");
            }
        };
        t.show();
    }
}
