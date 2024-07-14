public class garbageCollector {
    public void finalize(){
        System.out.println("garbage collected");
    }
    public static void main(String[] args) {
        garbageCollector g1 = new garbageCollector();
        garbageCollector g2 = new garbageCollector();
        g1 = null;
        g2 = null;
        System.gc();
    }
}
