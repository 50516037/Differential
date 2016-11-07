package differential;

public class Differential_lib implements Differential_if {

	private double a,h;
	
	public Differential_lib(double a, double h) {
		super();
		this.a = a;
		this.h = h;
	}

	@Override
	public double GetRx() {
		// TODO Auto-generated method stub
		return 2*this.a;
	}

	@Override
	public double GetDx() {
		// TODO Auto-generated method stub
		return ((Math.pow(this.a+this.h,2))-Math.pow(this.a,2))/h;
	}


	@Override
	public double GetAx() {
		// TODO Auto-generated method stub
		return ((Math.abs(GetDx()-GetRx())/GetRx())*100);
	}
	
		
	}
	
	

