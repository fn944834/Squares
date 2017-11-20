package squares;

public class Squares_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x[] = { 0.1, 0.3, 0.5, 0.7, 0.9, 1.1, 1.3 };
		double y[] = { 1.3, 1.7, 2.2, 4.7, 5.8, 7.5, 8.3 };
		double theta[] = new double[2];
		
		Squares_lib slib = new Squares_lib(x, y);
		
		for(int i=0; i<100; i++) {
			theta = slib.getDx();
			System.out.println(i + ": theta[0] = "+theta[0]);
			System.out.println(i + ": theta[1] = "+theta[1]);
			System.out.println(i + ": Objective function = "+slib.getObject());
		}

	}

}
