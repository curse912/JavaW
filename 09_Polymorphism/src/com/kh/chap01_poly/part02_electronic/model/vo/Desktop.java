package com.kh.chap01_poly.part02_electronic.model.vo;

public class Desktop extends Electronic {
	public static final String CPU = "intel";
	private String garphic;
	
	public Desktop() {}
	
	public Desktop(String brand, String naem , int price, String graphic) {
		super(brand, graphic, price);
		this.garphic = graphic;
		
	}

	public String getGarphic() {
		return garphic;
	}

	public void setGarphic(String garphic) {
		this.garphic = garphic;
	}

	@Override
	public String toString() {
		return "Desktop [garphic=" + garphic + ", toString()=" + super.toString() + "]";
	}

	
	
}
