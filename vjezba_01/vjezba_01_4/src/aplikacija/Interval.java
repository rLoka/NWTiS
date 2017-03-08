package Podrska;

public class Interval{
	int odBroja;
	int doBroja;
	long zbrojBrojeva;	
	
	public Interval(int odBroja, int doBroja){
		this.odBroja = odBroja;
		this.doBroja = doBroja;
	}
	
	public long dajZbroj(){		
		for(; this.odBroja < this.doBroja; this.odBroja++){
			this.zbrojBrojeva += this.odBroja;
		}
		return this.zbrojBrojeva;
	}
}