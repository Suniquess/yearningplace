package com.go.common.pojo;

public class AnalyScenicSimilar {
	private Integer id;
	private Integer mainScenicId;
	private String mainScenicName;
	private Integer scenicLikeId;
	private String scenicLikeName;
	private String madeDate;

	public AnalyScenicSimilar() {
		super();
	}

	public AnalyScenicSimilar(Integer id, Integer mainScenicId, String mainScenicName, Integer scenicLikeId,
			String scenicLikeName, String madeDate) {
		super();
		this.id = id;
		this.mainScenicId = mainScenicId;
		this.mainScenicName = mainScenicName;
		this.scenicLikeId = scenicLikeId;
		this.scenicLikeName = scenicLikeName;
		this.madeDate = madeDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMainScenicId() {
		return mainScenicId;
	}

	public void setMainScenicId(Integer mainScenicId) {
		this.mainScenicId = mainScenicId;
	}

	public String getMainScenicName() {
		return mainScenicName;
	}

	public void setMainScenicName(String mainScenicName) {
		this.mainScenicName = mainScenicName;
	}

	public Integer getScenicLikeId() {
		return scenicLikeId;
	}

	public void setScenicLikeId(Integer scenicLikeId) {
		this.scenicLikeId = scenicLikeId;
	}

	public String getScenicLikeName() {
		return scenicLikeName;
	}

	public void setScenicLikeName(String scenicLikeName) {
		this.scenicLikeName = scenicLikeName;
	}

	public String getMadeDate() {
		return madeDate;
	}

	public void setMadeDate(String madeDate) {
		this.madeDate = madeDate;
	}

	@Override
	public String toString() {
		return "AnalyScenicSimilar [id=" + id + ", mainScenicId=" + mainScenicId + ", mainScenicName=" + mainScenicName
				+ ", scenicLikeId=" + scenicLikeId + ", scenicLikeName=" + scenicLikeName + ", madeDate=" + madeDate
				+ "]";
	}
	
	public Integer getCommCounta() {
		return commCount;
	}
	public Integer getCommCountb() {
		return commCount;
	}
	public Integer getCommCountc() {
		return commCount;
	}

}
