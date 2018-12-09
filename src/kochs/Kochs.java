package kochs;



import ch.aplu.turtle.Turtle;

public class Kochs extends Turtle {
	public Kochs(int a, int b) {
		 speed(2100000000);
		 hideTurtle();
		 setPos(-180,0);// point begin
		 right(90);//90 rotaite
		 koch(300, 4, a);
		/* if(a >= 3 && a <=5) {
		 koch(300, 4, a);//sizes
		 }else if(a == 2) {
			 koch(300, 4, a);}*/
		System.out.println("a =" +a+ "b =" + b );
	 }

	 private void koch(double s, int levels, int a) {
		 if(levels == 0) {
			 forward(s);
			 return;
		 }else {
			 s /= a;// close average   triangular bump
			 koch(s, levels - 1, a);
			 left(60);// begin average   triangular bump
			 koch(s, levels -1, a);
			 right(120);
			 koch(s, levels -1, a);
			 left(60);
			 koch(s, levels -1, a);
		 }
	 }
	
	
}
