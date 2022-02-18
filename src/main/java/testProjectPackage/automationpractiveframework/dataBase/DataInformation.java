package testProjectPackage.automationpractiveframework.dataBase;

public enum DataInformation {

    LOGIN_USERNAME("Serhii"),
    LOGIN_PASSWORD("Aa1234567890");

    private String displayData;

    DataInformation(String displayData){
        this.displayData = displayData;
    }
    public String getDisplayData(){
        return displayData;
    }

    @Override
    public String toString() {
        return "DataInformation{" +
                "displayData='" + displayData + '\'' +
                '}';
    }
}
