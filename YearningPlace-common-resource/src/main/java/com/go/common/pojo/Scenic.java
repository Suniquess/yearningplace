package com.go.common.pojo;

public class Scenic {
	private Integer id;
	private String sceNa1;
	private String sceNa2;
	private String imgUrl0;
	private String imgUrl1;
	private String imgUrl2;
	private String content;
	private String sceLocation;
	private String sceComm1;
	private String sceComm2;
	private String sceComm3;

	public Scenic() {
	}

	public Scenic(Integer id, String sceNa1, String sceNa2, String imgUrl0, String imgUrl1, String imgUrl2,
			String content, String sceLocation, String sceComm1, String sceComm2, String sceComm3) {
		this.id = id;
		this.sceNa1 = sceNa1;
		this.sceNa2 = sceNa2;
		this.imgUrl0 = imgUrl0;
		this.imgUrl1 = imgUrl1;
		this.imgUrl2 = imgUrl2;
		this.content = content;
		this.sceLocation = sceLocation;
		this.sceComm1 = sceComm1;
		this.sceComm2 = sceComm2;
		this.sceComm3 = sceComm3;
	}

	@Override
	public String toString() {
		return "Scenic [id=" + id + ", sceNa1=" + sceNa1 + ", sceNa2=" + sceNa2 + ", imgUrl0=" + imgUrl0 + ", imgUrl1="
				+ imgUrl1 + ", imgUrl2=" + imgUrl2 + ", content=" + content + ", sceLocation=" + sceLocation
				+ ", sceComm1=" + sceComm1 + ", sceComm2=" + sceComm2 + ", sceComm3=" + sceComm3 + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSceNa1() {
		return sceNa1;
	}

	public void setSceNa1(String sceNa1) {
		this.sceNa1 = sceNa1;
	}

	public String getSceNa2() {
		return sceNa2;
	}

	public void setSceNa2(String sceNa2) {
		this.sceNa2 = sceNa2;
	}

	public String getImgUrl0() {
		return imgUrl0;
	}

	public void setImgUrl0(String imgUrl0) {
		this.imgUrl0 = imgUrl0;
	}

	public String getImgUrl1() {
		return imgUrl1;
	}

	public void setImgUrl1(String imgUrl1) {
		this.imgUrl1 = imgUrl1;
	}

	public String getImgUrl2() {
		return imgUrl2;
	}

	public void setImgUrl2(String imgUrl2) {
		this.imgUrl2 = imgUrl2;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSceLocation() {
		return sceLocation;
	}

	public void setSceLocation(String sceLocation) {
		this.sceLocation = sceLocation;
	}

	public String getSceComm1() {
		return sceComm1;
	}

	public void setSceComm1(String sceComm1) {
		this.sceComm1 = sceComm1;
	}

	public String getSceComm2() {
		return sceComm2;
	}

	public void setSceComm2(String sceComm2) {
		this.sceComm2 = sceComm2;
	}

	public String getSceComm3() {
		return sceComm3;
	}

	public void setSceComm3(String sceComm3) {
		this.sceComm3 = sceComm3;
	}

}
