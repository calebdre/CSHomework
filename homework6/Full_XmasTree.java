import java.util.Scanner;


public class Full_XmasTree {

	public static void main(String[] args) {
		// Author: Caleb Lewis
		// Assignment: Homework #6
		
		System.out.println("Please type in the number of rows you want for the christmas tree");
		Scanner scanner = new Scanner(System.in);
		int treeHeight = scanner.nextInt();    
        int treeWidth = 1+2*(treeHeight-1);
        for(int i = 0;i<treeHeight;i++){
            String treeLine = "";
            for(int j = 0; j<treeWidth;j++){
                if(j<treeWidth/2-i || j>treeWidth/2+i){
                    treeLine = treeLine + " ";
                }else{
                    treeLine = treeLine + "*";
                }
            }
            System.out.println(treeLine);
        }
        
	}

}
