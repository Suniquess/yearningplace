package com.go.common.pojo;

public class StrategyImgUrl {
	private Integer id;
	private String strategyTheme;
	private String strategyImgUrl;

	public StrategyImgUrl() {
		super();
	}

	public StrategyImgUrl(Integer id, String strategyTheme, String strategyImgUrl) {
		super();
		this.id = id;
		this.strategyTheme = strategyTheme;
		this.strategyImgUrl = strategyImgUrl;
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

	public String getStrategyImgUrl() {
		return strategyImgUrl;
	}

	public void setStrategyImgUrl(String strategyImgUrl) {
		this.strategyImgUrl = strategyImgUrl;
	}

	@Override
	public String toString() {
		return "StrategyImgUrl [id=" + id + ", strategyTheme=" + strategyTheme + ", strategyImgUrl=" + strategyImgUrl
				+ "]";
	}

}
