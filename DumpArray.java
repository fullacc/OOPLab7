import java.lang.Object;

public class DumpArray {
	public void DumpArray(Object[]array){
		int len = array.length;
		for(int i = 0; i < len; i++){
			System.out.println(array[i].toString());
		}
	}
}
