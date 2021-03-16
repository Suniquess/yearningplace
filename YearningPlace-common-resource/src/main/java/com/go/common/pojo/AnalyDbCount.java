package com.go.common.pojo;

public class AnalyDbCount {
	private Integer id;
	private String partScenic;
	private Integer scenicCount;
	private Integer lowvalueScenicCount;
	private Integer commCount;
	private Integer userCount;
	private String madeDt;

	public AnalyDbCount() {
		super();
	}

	public AnalyDbCount(Integer id, String partScenic, Integer scenicCount, Integer lowvalueScenicCount,
			Integer commCount, Integer userCount, String madeDt) {
		super();
		this.id = id;
		this.partScenic = partScenic;
		this.scenicCount = scenicCount;
		this.lowvalueScenicCount = lowvalueScenicCount;
		this.commCount = commCount;
		this.userCount = userCount;
		this.madeDt = madeDt;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPartScenic() {
		return partScenic;
	}

	public void setPartScenic(String partScenic) {
		this.partScenic = partScenic;
	}

	public Integer getScenicCount() {
		return scenicCount;
	}

	public void setScenicCount(Integer scenicCount) {
		this.scenicCount = scenicCount;
	}

	public Integer getLowvalueScenicCount() {
		return lowvalueScenicCount;
	}

	public void setLowvalueScenicCount(Integer lowvalueScenicCount) {
		this.lowvalueScenicCount = lowvalueScenicCount;
	}

	public Integer getCommCount() {
		return commCount;
	}

	public void setCommCount(Integer commCount) {
		this.commCount = commCount;
	}

	public Integer getUserCount() {
		return userCount;
	}

	public void setUserCount(Integer userCount) {
		this.userCount = userCount;
	}

	public String getMadeDt() {
		return madeDt;
	}

	public void setMadeDt(String madeDt) {
		this.madeDt = madeDt;
	}

	@Override
	public String toString() {
		return "AnalyDbCount [id=" + id + ", partScenic=" + partScenic + ", scenicCount=" + scenicCount
				+ ", lowvalueScenicCount=" + lowvalueScenicCount + ", commCount=" + commCount + ", userCount="
				+ userCount + ", madeDt=" + madeDt + "]";
	}

}
