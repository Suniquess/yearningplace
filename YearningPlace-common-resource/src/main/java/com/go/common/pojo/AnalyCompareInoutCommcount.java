package com.go.common.pojo;

public class AnalyCompareInoutCommcount {
	private Integer id;
	private String commPartName;
	private Integer year;
	private Integer commCount;
	private String madeDt;

	public AnalyCompareInoutCommcount() {
		super();
	}

	public AnalyCompareInoutCommcount(Integer id, String commPartName, Integer year, Integer commCount, String madeDt) {
		super();
		this.id = id;
		this.commPartName = commPartName;
		this.year = year;
		this.commCount = commCount;
		this.madeDt = madeDt;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCommPartName() {
		return commPartName;
	}

	public void setCommPartName(String commPartName) {
		this.commPartName = commPartName;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getCommCount() {
		return commCount;
	}

	public void setCommCount(Integer commCount) {
		this.commCount = commCount;
	}

	public String getMadeDt() {
		return madeDt;
	}

	public void setMadeDt(String madeDt) {
		this.madeDt = madeDt;
	}

	@Override
	public String toString() {
		return "AnalyCompareInoutCommcount [id=" + id + ", commPartName=" + commPartName + ", year=" + year
				+ ", commCount=" + commCount + ", madeDt=" + madeDt + "]";
	}

}
