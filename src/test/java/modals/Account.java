package modals;

public class Account {
    String accountName;
    String phone;
    String fax;
    String website;
    String employees;
    String annualRevenue;
    String billingCity;
    String billingZipCode;
    String billingState;
    String billingCountry;
    String shippingCity;
    String shippingZipCode;
    String shippingState;
    String shippingCountry;
    String industry;
    String type;


    public Account(String accountName, String phone, String fax, String website,
                   String employees, String annualRevenue, String billingCity,
                   String billingZipCode, String billingState, String billingCountry,
                   String shippingCity, String shippingZipCode, String shippingState,
                   String shippingCountry, String industry, String type) {
        this.accountName = accountName;
        this.phone = phone;
        this.fax = fax;
        this.website = website;
        this.employees = employees;
        this.annualRevenue = annualRevenue;
        this.billingCity = billingCity;
        this.billingZipCode = billingZipCode;
        this.billingState = billingState;
        this.billingCountry = billingCountry;
        this.shippingCity = shippingCity;
        this.shippingZipCode = shippingZipCode;
        this.shippingState = shippingState;
        this.shippingCountry = shippingCountry;
        this.industry = industry;
        this.type = type;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }


    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(String annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingZipCode() {
        return billingZipCode;
    }

    public void setBillingZipCode(String billingZipCode) {
        this.billingZipCode = billingZipCode;
    }

    public String getBillingState() {
        return billingState;
    }

    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getShippingZipCode() {
        return shippingZipCode;
    }

    public void setShippingZipCode(String shippingZipCode) {
        this.shippingZipCode = shippingZipCode;
    }

    public String getShippingState() {
        return shippingState;
    }

    public void setShippingState(String shippingState) {
        this.shippingState = shippingState;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }

    public void setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
