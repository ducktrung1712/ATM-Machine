package entity;

public class Customer {
    private int customerId;
    private String fullname;
    private String cccd;
    private String birthday;
    private String address;
    private String phone;
    private String pin;
    private String email;
    private String occupation;
    private double balance;
    private byte[] signSample;
    private byte[] profilePicture;
    private boolean gender;

    // Constructor, getters and setters
    public Customer(int customerId, String fullname, String cccd, String birthday, String address, String phone, 
                    String pin, String email, String occupation, double balance, byte[] signSample, 
                    byte[] profilePicture, boolean gender) {
        this.customerId = customerId;
        this.fullname = fullname;
        this.cccd = cccd;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
        this.pin = pin;
        this.email = email;
        this.occupation = occupation;
        this.balance = balance;
        this.signSample = signSample;
        this.profilePicture = profilePicture;
        this.gender = gender;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public byte[] getSignSample() {
        return signSample;
    }

    public void setSignSample(byte[] signSample) {
        this.signSample = signSample;
    }

    public byte[] getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(byte[] profilePicture) {
        this.profilePicture = profilePicture;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerId=" + customerId + ", fullname=" + fullname + ", cccd=" + cccd + ", birthday=" + birthday + ", address=" + address + ", phone=" + phone + ", pin=" + pin + ", email=" + email + ", occupation=" + occupation + ", balance=" + balance + ", signSample=" + signSample + ", profilePicture=" + profilePicture + ", gender=" + gender + '}';
    }

    
}
