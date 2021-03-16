package com.go.common.pojo;

public class AnalyScenicDepart {
	private Integer id;
	private String departName;
	private Integer scenicCount;
	private String madeDate;

	public AnalyScenicDepart() {
		super();
	}

	public AnalyScenicDepart(Integer id, String departName, Integer scenicCount, String madeDate) {
		super();
		this.id = id;
		this.departName = departName;
		this.scenicCount = scenicCount;
		this.madeDate = madeDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public Integer getScenicCount() {
		return scenicCount;
	}

	public void setScenicCount(Integer scenicCount) {
		this.scenicCount = scenicCount;
	}

	public String getMadeDate() {
		return madeDate;
	}

	public void setMadeDate(String madeDate) {
		this.madeDate = madeDate;
	}

	@Override
	public String toString() {
		return "AnalyScenicDepart [id=" + id + ", departName=" + departName + ", scenicCount=" + scenicCount
				+ ", madeDate=" + madeDate + "]";
	}

}
