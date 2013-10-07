public void bubbleSort(int[] A){
		int n = A.length;
		if (n<=1) return;
		
		for (int i = 1; i < n;i++){
			for (int j = 0; j < n-i; j++){
				if (A[j]>A[j+1]) {
					int temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
				}
			}
		}
	}