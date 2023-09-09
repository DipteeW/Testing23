package casting;
// in explicit casting memory loss
public class Explicit {
	public static void main(String[] args) {
	double d =20;
	float f=(float) d;
	long l = (long) d;
	int i = (int) d;
	short s = (short) d;
	byte b = (byte) d;
	System.out.println(d);
	System.out.println(f);
	System.out.println(l);
	System.out.println(i);
	System.out.println(s);
	System.out.println(b);
	}
}
