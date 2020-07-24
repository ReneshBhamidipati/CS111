public class MergesortExample{
	
	private static int count = 0;

	public static void sort (int[] a, int lo, int hi){
		// sort a[lo, hi)
		int n = hi - lo;
		if ( n <= 1 ) return;
		int middle = lo + n/2;
		StdOut.println("lo: " + lo + " middle: " + middle + " hi: " + hi);
		print_array(a);
		sort(a, lo, middle);
		print_array(a);
		sort(a, middle, hi);
		//print_array(a);
		StdOut.println("Before calling merge: ");
		merge(a, lo, middle, hi);
		StdOut.println("End of recursion");
		StdOut.println();
	}
	public static void merge (int[] a, int lo, int mid, int hi){
		StdOut.println("lo: " + lo + " mid: "+  mid + " hi: " + hi);
		print_array(a);
		// merge a[lo,mid) with a[mid,hi) into aux[0,hi-lo)
		int i =  lo, j = mid, n = hi - lo;
		int[] aux = new int[n];
		for ( int k = 0; k < n; k++ ){
			if ( i == mid ) aux[k] = a[j++];
			else if ( j == hi ) aux[k] = a[i++];
			else if ( a[j] < a[i] ) {
				aux[k] = a[j++];
				StdOut.println("Number of char-to-char comparisons: " + count++);
			}

			else aux[k] = a[i++];   
		}
		// copy back into a[lo, hi)
		for ( int k = 0; k < n; k++ ){
			a[lo+k] = aux[k];
		}
		print_array(a);
	}
	public static void print_array(int[] arr){
		for ( int k = 0; k < arr.length; k++ ) 
			StdOut.print(arr[k] + ", ");
		StdOut.println();
	}
	public static void main(String[] args){
		//char[] arr = {'C','Q','S','A','B','X','T'};
		int [] arr = {7,12,100,18,23,8,1,3,4,0,19,6,4,1,20,12};
		sort(arr, 0, arr.length);
		print_array(arr);
		}
	}