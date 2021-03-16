package com.go.common.pojo;

public class AnalyTraStraValue {
	private Integer id;
	private String partName;
	private Integer allCount;
	private Integer highCount;
	private Double highValue;
	private Integer lowCount;
	private Double lowValue;
	private String madeDt;

	public AnalyTraStraValue() {
		super();
	}

	public AnalyTraStraValue(Integer id, String partName, Integer allCount, Integer highCount, Double highValue,
			Integer lowCount, Double lowValue, String madeDt) {
		super();
		this.id = id;
		this.partName = partName;
		this.allCount = allCount;
		this.highCount = highCount;
		this.highValue = highValue;
		this.lowCount = lowCount;
		this.lowValue = lowValue;
		this.madeDt = madeDt;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public Integer getAllCount() {
		return allCount;
	}

	public void setAllCount(Integer allCount) {
		this.allCount = allCount;
	}

	public Integer getHighCount() {
		return highCount;
	}

	public void setHighCount(Integer highCount) {
		this.highCount = highCount;
	}

	public Double getHighValue() {
		return highValue;
	}

	public void setHighValue(Double highValue) {
		this.highValue = highValue;
	}

	public Integer getLowCount() {
		return lowCount;
	}

	public void setLowCount(Integer lowCount) {
		this.lowCount = lowCount;
	}

	public Double getLowValue() {
		return lowValue;
	}

	public void setLowValue(Double lowValue) {
		this.lowValue = lowValue;
	}

	public String getMadeDt() {
		return madeDt;
	}

	public void setMadeDt(String madeDt) {
		this.madeDt = madeDt;
	}

	@Override
	public String toString() {
		return "AnalyTraStraValue [id=" + id + ", partName=" + partName + ", allCount=" + allCount + ", highCount="
				+ highCount + ", highValue=" + highValue + ", lowCount=" + lowCount + ", lowValue=" + lowValue
				+ ", madeDt=" + madeDt + "]";
	}

}
