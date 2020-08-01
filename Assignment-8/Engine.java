package filehandling;

import java.io.Serializable;

public class Engine implements Serializable{
	private transient String engineNo;
	private int cubicCapicity;
	public String getEngineNo() {
		return engineNo;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	public int getCubicCapicity() {
		return cubicCapicity;
	}
	public void setCubicCapicity(int cubicCapicity) {
		this.cubicCapicity = cubicCapicity;
	}
	public Engine(String engineNo, int cubicCapicity) {
		super();
		this.engineNo = engineNo;
		this.cubicCapicity = cubicCapicity;
	}
	@Override
	public String toString() {
		return "Engine [engineNo=" + engineNo + ", cubicCapicity=" + cubicCapicity + "]";
	}
	
}
