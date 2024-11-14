package entity;

public class Customer {
    private int customerId;
    private String fullname;
    private String cccd;
    private String birthday;
    private String address;
    private String phone;
    private String email;
    private String occupation;
    private byte[] signSample;
    private byte[] profilePicture;
    private String gender;

    // Constructor, getters and setters
    public Customer(int customerId, String fullname, String cccd, String birthday, String address, String phone, 
                    String email, String occupation, byte[] signSample, byte[] profilePicture, String gender) {
        this.customerId = customerId;
        this.fullname = fullname;
        this.cccd = cccd;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.occupation = occupation;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerId=" + customerId + ", fullname=" + fullname + ", cccd=" + cccd + ", birthday=" + birthday + ", address=" + address + ", phone=" + phone + ", email=" + email + ", occupation=" + occupation + ", signSample=" + signSample + ", profilePicture=" + profilePicture + ", gender=" + gender + '}';
    }
}
