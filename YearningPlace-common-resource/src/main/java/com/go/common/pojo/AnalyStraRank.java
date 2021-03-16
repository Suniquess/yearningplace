package com.go.common.pojo;

public class AnalyStraRank {
	private Integer id;
	private Integer straId;
	private Integer straRank;
	private String straNm;
	private String recDate;
	private String madeDt;

	public AnalyStraRank() {
		super();
	}

	public AnalyStraRank(Integer id, Integer straId, Integer straRank, String straNm, String recDate, String madeDt) {
		super();
		this.id = id;
		this.straId = straId;
		this.straRank = straRank;
		this.straNm = straNm;
		this.recDate = recDate;
		this.madeDt = madeDt;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStraId() {
		return straId;
	}

	public void setStraId(Integer straId) {
		this.straId = straId;
	}

	public Integer getStraRank() {
		return straRank;
	}

	public void setStraRank(Integer straRank) {
		this.straRank = straRank;
	}

	public String getStraNm() {
		return straNm;
	}

	public void setStraNm(String straNm) {
		this.straNm = straNm;
	}

	public String getRecDate() {
		return recDate;
	}

	public void setRecDate(String recDate) {
		this.recDate = recDate;
	}

	public String getMadeDt() {
		return madeDt;
	}

	public void setMadeDt(String madeDt) {
		this.madeDt = madeDt;
	}

	@Override
	public String toString() {
		return "AnalyStraRank [id=" + id + ", straId=" + straId + ", straRank=" + straRank + ", straNm=" + straNm
				+ ", recDate=" + recDate + ", madeDt=" + madeDt + "]";
	}

}
