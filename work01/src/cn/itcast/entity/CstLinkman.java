package cn.itcast.entity;

public class CstLinkman {
	private Long lkmId;
	private String lkmName;
	private String lkGgender;
	private String lkmPhone;
	private String lkmMobile;
	private String lkmEmail;
	private String lkmPosition;
	private String lkmMemo;
	
	public CstLinkman(String lkmName, String lkGgender, String lkmPhone, String lkmMobile, String lkmEmail,
			String lkmPosition, String lkmMemo) {	
		this.lkmName = lkmName;
		this.lkGgender = lkGgender;
		this.lkmPhone = lkmPhone;
		this.lkmMobile = lkmMobile;
		this.lkmEmail = lkmEmail;
		this.lkmPosition = lkmPosition;
		this.lkmMemo = lkmMemo;
	}
	public CstLinkman() {

	}
	public Long getLkmId() {
		return lkmId;
	}
	public void setLkmId(Long lkmId) {
		this.lkmId = lkmId;
	}
	public String getLkmName() {
		return lkmName;
	}
	public void setLkmName(String lkmName) {
		this.lkmName = lkmName;
	}
	public String getLkGgender() {
		return lkGgender;
	}
	public void setLkGgender(String lkGgender) {
		this.lkGgender = lkGgender;
	}
	public String getLkmPhone() {
		return lkmPhone;
	}
	public void setLkmPhone(String lkmPhone) {
		this.lkmPhone = lkmPhone;
	}
	public String getLkmMobile() {
		return lkmMobile;
	}
	public void setLkmMobile(String lkmMobile) {
		this.lkmMobile = lkmMobile;
	}
	public String getLkmEmail() {
		return lkmEmail;
	}
	public void setLkmEmail(String lkmEmail) {
		this.lkmEmail = lkmEmail;
	}
	public String getLkmPosition() {
		return lkmPosition;
	}
	public void setLkmPosition(String lkmPosition) {
		this.lkmPosition = lkmPosition;
	}
	public String getLkmMemo() {
		return lkmMemo;
	}
	public void setLkmMemo(String lkmMemo) {
		this.lkmMemo = lkmMemo;
	}
	@Override
	public String toString() {
		return "CstLinkman [lkmId=" + lkmId + ", lkmName=" + lkmName + ", lkGgender=" + lkGgender + ", lkmPhone="
				+ lkmPhone + ", lkmMobile=" + lkmMobile + ", lkmEmail=" + lkmEmail + ", lkmPosition=" + lkmPosition
				+ ", lkmMemo=" + lkmMemo + "]";
	}
	
	
	
	
}
