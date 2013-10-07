public void heapSort(int[] A){
		
		int n = A.length;
		if (n<=1) return;
		
		buildHeap(A,n);
		for (int i = n-1; i >=1; i--){
			
			int temp = A[0];
			A[0] = A[i];
			A[i] = temp;
			n--;
			maxifyHeap(A,0,n);
		}		
	}
	
	public void buildHeap(int[] A, int size){
		if (size <= 1) return;
		for (int i = size/2; i >= 0; i--){
			maxifyHeap(A,i,size);
		}
	}
	
	public void maxifyHeap(int[] A, int index, int size){
		int leftIdx = index*2+1;
		int rightIdx = index*2+2;
		int largest = index;
		if (leftIdx<size&&A[leftIdx]>A[index]) largest = leftIdx;
		if (rightIdx<size&&A[rightIdx]>A[largest]) largest = rightIdx;
		
		if (largest != index) {
			int temp = A[index];
			A[index] = A[largest];
			A[largest] = temp;
			maxifyHeap(A,largest,size);
		}
	}