public void mergeSort(int[] A){
		int n = A.length;
		if (n <= 1) return;
		mergeSort(A,0,n-1);
	}
	
	public void mergeSort(int[] A, int start, int end){
		if (start >= end) return;
		
		int mid = start+(end - start)/2;
		if (mid>start)mergeSort(A,start,mid);;
		if (end>mid+1) mergeSort(A,mid+1,end);
		
		
		merge(A,start,mid,end);
	}
	
	public void merge(int[] A, int start, int mid, int end){
		if (start >= end) return;
		int[] secondhalf = new int[end-mid];
		for (int i = mid+1;i<=end;i++){
			secondhalf[i-mid-1] = A[i];
		}
		int i = mid;
		int j = end-mid-1;
		int k = end;
		while (i>=start&&j>=0){
			if (A[i]<secondhalf[j]) A[k--]=secondhalf[j--];
			else A[k--] = A[i--];
		}
		
		while (j>=0){
			A[k--] = secondhalf[j--];
		}
		
	}