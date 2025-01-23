package com.company.day008;

class MobNote7 {
	private String iris;
	public String getIris() { return iris; }  public void setIris(String iris) { this.iris = iris; }
	public void newShow() {System.out.println(":::: NOTE7 = 홍채인식 \n" + iris);}
}

class MobNote8 extends MobNote7 {
	private String face;
	public String getFace() { return face; }  public void setFace(String face) { this.face = face; }
	@Override public void newShow() { super.newShow();
		System.out.println(":::: NOTE8 = 안면인식 \n"+face);}
}

class MobNote9 extends MobNote8 {
		private int battery;
		public MobNote9() {super(); this.battery=24;}
		public int getBattery() { return battery; }  public void setBattery(int battery) { this.battery = battery; }
		@Override public void newShow() {
			super.newShow(); System.out.println(":::: NOTE9 = 하루종일 사용가능 배터리 \n" + battery);}
}
public class Extends003 {
	public static void main(String[] args) {
		MobNote9 my9 = new MobNote9();
		my9.setIris("brown");
		my9.setFace("pretty");
		my9.newShow();
	}
}