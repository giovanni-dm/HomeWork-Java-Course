package Homework.HW31012025;

public enum Countries {

    USA(01, "i don't know"),
    GERMANY(49, "Berlin"),
    FRANCE(123, "Paris"),
    JAPAN(1234, "Tokyo");

    /*

     1. Enum Custom Values
    Modify the following enum Countries so that it holds additional fields: countryCode (int) and capitalCity (String). Provide a constructor and getter methods.
    public enum Countries {

}

     */


    public int getCountryCode() {
        return countryCode;
    }

    public String getCityName() {
        return cityName;
    }

    private final int countryCode;
    private final String cityName;

    Countries(int countryCode, String cityName){
        this.countryCode = countryCode;
        this.cityName = cityName;
    }




}
