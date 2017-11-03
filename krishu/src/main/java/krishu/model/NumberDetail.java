package krishu.model;

public class NumberDetail {
	
	private Integer NumberId;
	private Integer NumberCounts;
	private Integer TotalCounts;
	//private Integer WiningAmount;
	//private float Ratio;
	
	
	public NumberDetail(Integer numberId, Integer numberCounts, Integer totalCounts) {
		super();
		NumberId = numberId;
		NumberCounts = numberCounts;
		TotalCounts = totalCounts;
	}
	
	public Integer getNumberId() {
		return NumberId;
	}

	public Integer getNumberCounts() {
		return NumberCounts;
	}

	public Integer getTotalCounts() {
		return TotalCounts;
	}

	public Integer getWiningAmount() {
		return NumberCounts * 9;
	}

	public float getRatio() {
		return (getWiningAmount() * 100 / TotalCounts);
	}
}
