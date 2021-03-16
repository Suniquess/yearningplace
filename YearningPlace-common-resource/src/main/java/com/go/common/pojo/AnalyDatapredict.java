package com.go.common.pojo;

public class AnalyDatapredict {
	private Integer id;
	private String scenicNm;
	private Integer year;
	private Integer flow;
	private String madeDt;

	public AnalyDatapredict() {
		super();
	}

	public AnalyDatapredict(Integer id, String scenicNm, Integer year, Integer flow, String madeDt) {
		super();
		this.id = id;
		this.scenicNm = scenicNm;
		this.year = year;
		this.flow = flow;
		this.madeDt = madeDt;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getScenicNm() {
		return scenicNm;
	}

	public void setScenicNm(String scenicNm) {
		this.scenicNm = scenicNm;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getFlow() {
		return flow;
	}

	public void setFlow(Integer flow) {
		this.flow = flow;
	}

	public String getMadeDt() {
		return madeDt;
	}

	public void setMadeDt(String madeDt) {
		this.madeDt = madeDt;
	}

	@Override
	public String toString() {
		return "AnalyDatapredict [id=" + id + ", scenicNm=" + scenicNm + ", year=" + year + ", flow=" + flow
				+ ", madeDt=" + madeDt + "]";
	}

}
