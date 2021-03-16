package com.go.common.pojo;

public class StrategyContent {
	private Integer id;
	private String strategyTheme;
	private String strategyContent;

	public StrategyContent() {
		super();
	}

	public StrategyContent(Integer id, String strategyTheme, String strategyContent) {
		super();
		this.id = id;
		this.strategyTheme = strategyTheme;
		this.strategyContent = strategyContent;
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

	public String getStrategyContent() {
		return strategyContent;
	}

	public void setStrategyContent(String strategyContent) {
		this.strategyContent = strategyContent;
	}

	@Override
	public String toString() {
		return "StrategyContent [id=" + id + ", strategyTheme=" + strategyTheme + ", strategyContent=" + strategyContent
				+ "]";
	}

}
