package sort;

public class PriorityQueue {
	public PriorityQueue(){
		//int heapsize;
	}
	public int heapMax(int[] A){
		if (A.length == 0) System.err.println("empty heap");	
		return A[0];
	}
	
	public int heapExtract(int[] A){
		if (A.length == 0) System.err.println("heap underflow");
		int max = A[0];
		int n = A.length;
		A[0] = A[n-1];
		n--;
		Sorting s = new Sorting();
		s.maxifyHeap(A,0,n);
		return max;
	}
	
	public void heapIncreaseKey(int[] A, int i, int key){
		if (i<0||i>=A.length) System.err.println("non index exception");
		if (key < A[i]) System.err.println("new key should be larger than current key");
		
		A[i] = key;
		int parent = (i-1)/2;
		while(parent >=0 &&A[parent]<A[i]){
			int temp = A[parent];
			A[parent] = A[i];
			A[i] = temp;
			i = parent;
			parent = (i-1)/2;
		}
	}
	
	public void heapInsert(int[] A, int key){
		int n = A.length;
		A = new int[n+1];
		A[n] = Integer.MIN_VALUE;
		heapIncreaseKey(A,n,key);
	}
}
