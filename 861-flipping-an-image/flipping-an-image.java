class Solution {

    public int[][] flipAndInvertImage(int[][] image) {

        reverse(image);
        invert(image);

        return image;
    }

    int[][] reverse(int[][] image) {

        int rows = image.length;
        int cols = image[0].length;

        for(int i = 0; i < rows; i++) {

            int start = 0;
            int end = cols - 1;

            while(start < end) {

                int temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;

                start++;
                end--;
            }
        }

        return image;
    }

    int[][] invert(int[][] image) {

        int rows = image.length;
        int cols = image[0].length;

        for(int i = 0; i < rows; i++) {

            for(int j = 0; j < cols; j++) {

                if(image[i][j] == 1) {
                    image[i][j] = 0;
                }
                else {
                    image[i][j] = 1;
                }
            }
        }

        return image;
    }
}