import java.util.SimpleTimeZone;

public class DumpArrayTest {

	DumpArray array = new DumpArray();
	public static void main(String []args){
	Object[] array = new Object[4];
	
	array[0] = 33;
	array[1] = new SimpleTimeZone(-3,"CPT");
	array[2] = "Hello World!";
	array[3] = 'f';
	DumpArray arrayTest = new DumpArray();
	arrayTest.DumpArray(array);
	
	}
	
	
}
