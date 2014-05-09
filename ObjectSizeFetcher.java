import java.lang.instrument.Instrumentation;
import java.util.*;



public class ObjectSizeFetcher {
	private static Instrumentation instrumentation;

	public static void premain(String args, Instrumentation inst) {
		instrumentation = inst;
	}

	public static long getObjectSizeOf(Object o) {
		return instrumentation.getObjectSize(o);
	}

	public static void main(String[] args) {
		
		HashMap<String, Object> a = new HashMap<>();
		
		System.out.println("empyt hashmap size:" +ObjectSizeFetcher.getObjectSizeOf(a));
		System.out.println("empty hashset size:" + ObjectSizeFetcher.getObjectSizeOf(new HashSet()));
		System.out.println("empty arraylist size:" + ObjectSizeFetcher.getObjectSizeOf(new ArrayList()));
		System.out.println("empty LinkedList size:" + ObjectSizeFetcher.getObjectSizeOf(new LinkedList()));
        System.out.println("empty String size:" + ObjectSizeFetcher.getObjectSizeOf(new String()));
        
        System.out.println("empty String[] size:" + ObjectSizeFetcher.getObjectSizeOf(new String[0]));
        System.out.println("String[1] size:" + ObjectSizeFetcher.getObjectSizeOf(new String[1]));
        System.out.println("String[2] size:" + ObjectSizeFetcher.getObjectSizeOf(new String[2]));
        System.out.println("String[255] size:" + ObjectSizeFetcher.getObjectSizeOf(new String[255]));
        System.out.println("String[256] size:" + ObjectSizeFetcher.getObjectSizeOf(new String[256]));
        System.out.println("String[500] size:" + ObjectSizeFetcher.getObjectSizeOf(new String[500]));
        String[] strArray = {"1"};
        System.out.println("String[] with one element size:" + ObjectSizeFetcher.getObjectSizeOf(strArray));


        System.out.println("empty int[] size:" + ObjectSizeFetcher.getObjectSizeOf(new int[0]));
        System.out.println("int[1] size:" + ObjectSizeFetcher.getObjectSizeOf(new int[1]));
        System.out.println("int[2] size:" + ObjectSizeFetcher.getObjectSizeOf(new int[2]));
        System.out.println("int[64] size:" + ObjectSizeFetcher.getObjectSizeOf(new int[2]));
        System.out.println("int[255] size:" + ObjectSizeFetcher.getObjectSizeOf(new int[255]));
        System.out.println("int[256] size:" + ObjectSizeFetcher.getObjectSizeOf(new int[256]));
        System.out.println("int[500] size:" + ObjectSizeFetcher.getObjectSizeOf(new int[500]));

        for (int i=0;i<256;i++){
            System.out.println("int["+i+"] size:" + ObjectSizeFetcher.getObjectSizeOf(new int[i])); 
        }

        System.out.println("simple object size:" + ObjectSizeFetcher.getObjectSizeOf(new Object()));
	}
}
