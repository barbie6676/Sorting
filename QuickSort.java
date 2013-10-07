public void quickSort(int[] A){
		
		int n = A.length;
		if (n <= 1) return;
		
		quickSort(A,0,n-1);
	}
	
	public void quickSort(int[] A, int start, int end){
		if (start>=end) return;
		
		int pivotIdx = partition(A,start,end);
		quickSort(A,start,pivotIdx-1);
		quickSort(A,pivotIdx+1,end);
	}
	
	public int partition(int[] A, int start, int end){
		int pivot = A[end];
		int i = start -1;
		for (int j = start; j< end;j++){
			if(A[j]<=pivot){
				i++;
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}
		A[end] = A[i+1];
		A[i+1] = pivot;
		return i+1;
	}