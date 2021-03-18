package com.go.common.pojo;

public class TravellerDetile {
	private Integer id;
	private String travellerPartation;
	private String travellerTheme;
	private String travellerAuthor;
	private String travellerPublishTime;
	private String travellerPageView;
	private String travellerContent;
	private String travellerBeforePage;

	public TravellerDetile() {
		super();
	}

	public TravellerDetile(Integer id, String travellerPartation, String travellerTheme, String travellerAuthor,
			String travellerPublishTime, String travellerPageView, String travellerContent,
			String travellerBeforePage) {
		super();
		this.id = id;
		this.travellerPartation = travellerPartation;
		this.travellerTheme = travellerTheme;
		this.travellerAuthor = travellerAuthor;
		this.travellerPublishTime = travellerPublishTime;
		this.travellerPageView = travellerPageView;
		this.travellerContent = travellerContent;
		this.travellerBeforePage = travellerBeforePage;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTravellerPartation() {
		return travellerPartation;
	}

	public void setTravellerPartation(String travellerPartation) {
		this.travellerPartation = travellerPartation;
	}

	public String getTravellerTheme() {
		return travellerTheme;
	}

	public void setTravellerTheme(String travellerTheme) {
		this.travellerTheme = travellerTheme;
	}

	public String getTravellerAuthor() {
		return travellerAuthor;
	}

	public void setTravellerAuthor(String travellerAuthor) {
		this.travellerAuthor = travellerAuthor;
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

	public String getTravellerContent() {
		return travellerContent;
	}

	public void setTravellerContent(String travellerContent) {
		this.travellerContent = travellerContent;
	}

	public String getTravellerBeforePage() {
		return travellerBeforePage;
	}

	public void setTravellerBeforePage(String travellerBeforePage) {
		this.travellerBeforePage = travellerBeforePage;
	}

	@Override
	public String toString() {
		return "TravellerDetail [id=" + id + ", travellerPartation=" + travellerPartation + ", travellerTheme="
				+ travellerTheme + ", travellerAuthor=" + travellerAuthor + ", travellerPublishTime="
				+ travellerPublishTime + ", travellerPageView=" + travellerPageView + ", travellerContent="
				+ travellerContent + ", travellerBeforePage=" + travellerBeforePage + "]";
	}

}
