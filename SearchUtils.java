
public class SearchUtils {

	public static int serialSearch(Comparable[] objs, Comparable obj){
		if(objs == null || objs.length == 0){
			return -1;
		}else{
			int result = -1;
			for(int i=0; i<objs.length; i++){
				if(((Subject)objs[i]).equals(obj)){
					result = i;
					break;
				}
			}
			return result;
		}
	}
	
	public static int binarySearch(Comparable[] objs, Comparable obj){
		if(objs == null || objs.length == 0){
			return -1;
		}else if(objs.length == 1){
			return objs[0].equals(obj) ? 0 : -1;
		}else{
			SortUtils.shellSort(objs);;
			int result = -1;
			int head = 0;
			int tail = objs.length -1;
			while(head <= tail){
				int mid = (head+tail)/2;
				if(objs[mid].equals(obj)){
					result = mid;
					break;
				}else if(objs[mid].compareTo(obj) == 1){
					tail = mid;
				}else{
					head = mid;
				}
			}
			return result;
		}
	}
	
}
