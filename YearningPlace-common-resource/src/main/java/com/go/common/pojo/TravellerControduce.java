package com.go.common.pojo;

public class TravellerControduce {
	private Integer id;
	private String travellerTheme;
	private String travellerControduceImgUrl;
	private String travellerControduceText;
	private String travellerPublishTime;
	private String travellerPageView;

	public TravellerControduce() {
		super();
	}

	public TravellerControduce(Integer id, String travellerTheme, String travellerControduceImgUrl,
			String travellerControduceText, String travellerPublishTime, String travellerPageView) {
		super();
		this.id = id;
		this.travellerTheme = travellerTheme;
		this.travellerControduceImgUrl = travellerControduceImgUrl;
		this.travellerControduceText = travellerControduceText;
		this.travellerPublishTime = travellerPublishTime;
		this.travellerPageView = travellerPageView;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTravellerTheme() {
		return travellerTheme;
	}

	public void setTravellerTheme(String travellerTheme) {
		this.travellerTheme = travellerTheme;
	}

	public String getTravellerControduceImgUrl() {
		return travellerControduceImgUrl;
	}

	public void setTravellerControduceImgUrl(String travellerControduceImgUrl) {
		this.travellerControduceImgUrl = travellerControduceImgUrl;
	}

	public String getTravellerControduceText() {
		return travellerControduceText;
	}

	public void setTravellerControduceText(String travellerControduceText) {
		this.travellerControduceText = travellerControduceText;
	}

	public String getTravellerPublishTime() {
		return travellerPublishTime;
	}

	public void setTravellerPublishTime(String travellerPublishTime) {
		this.travellerPublishTime = travellerPublishTime;
	}

	public String getTravellerPageView() {
		return travellerPageView;
	}

	public void setTravellerPageView(String travellerPageView) {
		this.travellerPageView = travellerPageView;
	}

	@Override
	public String toString() {
		return "TravellerControlduce [id=" + id + ", travellerTheme=" + travellerTheme + ", travellerControduceImgUrl="
				+ travellerControduceImgUrl + ", travellerControduceText=" + travellerControduceText
				+ ", travellerPublishTime=" + travellerPublishTime + ", travellerPageView=" + travellerPageView + "]";
	}

}
