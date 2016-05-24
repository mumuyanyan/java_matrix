package test1;
import Jama.*;
public class test1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] array = {{2,0},{0,2}};
		Matrix A = new Matrix(array);
		Matrix B = A.inverse();
		A.print(1, 2);
		System.out.print(B.get(0, 0));
	}

}
