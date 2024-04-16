package homework5;

public class Place {
	private java.lang.String cityName;
	private java.lang.String countryName;
	private Currency currency;
	private java.lang.String cityHallTel;

	public Place(String cityName, String countryName, Currency currency, String cityHallTel) {
		this.cityName = cityName;
		this.countryName = countryName;
		this.currency = currency;
		this.cityHallTel = cityHallTel;
	}

	public java.lang.String getCityName() {
		return cityName;
	}

	public void setCityName(java.lang.String cityName) {
		this.cityName = cityName;
	}

	public java.lang.String getCountryName() {
		return countryName;
	}

	public void setCountryName(java.lang.String countryName) {
		this.countryName = countryName;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "Place: cityName=" + cityName + ", countryName=" + countryName + ", currency=" + currency
				+ ", cityHallTel=" + cityHallTel ;
	}

}
