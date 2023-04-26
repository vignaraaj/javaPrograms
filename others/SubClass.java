package others;
class SubClass {
    public static void main(String[] args) {
        BoundedTypes2<String> bb1 = new BoundedTypes2<String>("vkj");
        BoundedTypes2<Integer> bb2 = new BoundedTypes2<Integer>(20);
        bb1.show();
        bb2.show();
    }
}
