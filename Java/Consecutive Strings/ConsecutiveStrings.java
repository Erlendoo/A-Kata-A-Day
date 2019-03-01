public static String longestConsec(String[] strarr, int k) {


    int n = strarr.length;
    int[] nameLength = new int[n];
    if (n == 0 || k > n || k <= 0){
        return "";
    }

    for (int i = 0; i<n; i++){
        nameLength[i] = strarr[i].length();
    }

    int longest = 0;
    int l = 0;
    int sumLength = 0;
    for (int i = 0; i<n-(k-1); i++){
        sumLength = 0;

        for (int j = 0; j < k; j++){
            sumLength += nameLength[i+j];

        }
        if (longest < sumLength){
            longest = 0;
            for (int o = 0; o < k; o++) {
                longest += nameLength[i + o];
            }
            l = i;
        }
    }
    StringBuffer finalword = new StringBuffer();
    for (int i=l; i<(l+k); i++){
        finalword.append(strarr[i]);
    }
    return finalword.toString();
}
