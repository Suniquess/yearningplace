package com.go.common.pojo;

public class StrategyControduce {
	private Integer id;
	private String strategyTheme;
	private String strategyPublishTime;
	private String strategyLike;
	private String strategyPageView;
	private String strategyTimeConsuming;
	private String strategyTravelTime;
	private String strategyTravelCost;
	private String strategyTravelWith;

	public StrategyControduce() {
		super();
	}

	public StrategyControduce(Integer id, String strategyTheme, String strategyPublishTime, String strategyLike,
			String strategyPageView, String strategyTimeConsuming, String strategyTravelTime, String strategyTravelCost,
			String strategyTravelWith) {
		super();
		this.id = id;
		this.strategyTheme = strategyTheme;
		this.strategyPublishTime = strategyPublishTime;
		this.strategyLike = strategyLike;
		this.strategyPageView = strategyPageView;
		this.strategyTimeConsuming = strategyTimeConsuming;
		this.strategyTravelTime = strategyTravelTime;
		this.strategyTravelCost = strategyTravelCost;
		this.strategyTravelWith = strategyTravelWith;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStrategyTheme() {
		return strategyTheme;
	}

	public void setStrategyTheme(String strategyTheme) {
		this.strategyTheme = strategyTheme;
	}

	public String getStrategyPublishTime() {
		return strategyPublishTime;
	}

	public void setStrategyPublishTime(String strategyPublishTime) {
		this.strategyPublishTime = strategyPublishTime;
	}

	public String getStrategyLike() {
		return strategyLike;
	}

	public void setStrategyLike(String strategyLike) {
		this.strategyLike = strategyLike;
	}

	public String getStrategyPageView() {
		return strategyPageView;
	}

	public void setStrategyPageView(String strategyPageView) {
		this.strategyPageView = strategyPageView;
	}

	public String getStrategyTimeConsuming() {
		return strategyTimeConsuming;
	}

	public void setStrategyTimeConsuming(String strategyTimeConsuming) {
		this.strategyTimeConsuming = strategyTimeConsuming;
	}

	public String getStrategyTravelTime() {
		return strategyTravelTime;
	}

	public void setStrategyTravelTime(String strategyTravelTime) {
		this.strategyTravelTime = strategyTravelTime;
	}

	public String getStrategyTravelCost() {
		return strategyTravelCost;
	}

	public void setStrategyTravelCost(String strategyTravelCost) {
		this.strategyTravelCost = strategyTravelCost;
	}

	public String getStrategyTravelWith() {
		return strategyTravelWith;
	}

	public void setStrategyTravelWith(String strategyTravelWith) {
		this.strategyTravelWith = strategyTravelWith;
	}

	@Override
	public String toString() {
		return "StrategyControduce [id=" + id + ", strategyTheme=" + strategyTheme + ", strategyPublishTime="
				+ strategyPublishTime + ", strategyLike=" + strategyLike + ", strategyPageView=" + strategyPageView
				+ ", strategyTimeConsuming=" + strategyTimeConsuming + ", strategyTravelTime=" + strategyTravelTime
				+ ", strategyTravelCost=" + strategyTravelCost + ", strategyTravelWith=" + strategyTravelWith + "]";
	}

}
