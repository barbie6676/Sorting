public void selectionSort(int[] A){
		int n = A.length;
		if (n<=1) return;
		
		for (int i = 0; i < n ; i++){
			
			int min = A[i];
			int minIdx = i;
			for (int j = i+1;j<n;j++){
				if (A[j]<min){
					min = A[j];
					minIdx = j;
				}
			}
			A[minIdx] = A[i];
			A[i]= min;
		}
	}