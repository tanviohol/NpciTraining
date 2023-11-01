package com.npci;

public class ProfileValidation {
	
	private int profileId;
    private String name;
    private String email;
    private String password;
    private String phone;

    public ProfileValidation(int profileId, String name, String email, String password, String phone) {
        validateProfileId(profileId);
        validateName(name);
        validateEmail(email);
        validatePassword(password);
        validatePhone(phone);

        this.profileId = profileId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }


//Getter for id
    public int getProfileId() {
        return profileId;
    }
  //Getter for name
    public String getName() {
        return name;
    }
  //Getter for email
    public String getEmail() {
        return email;
    }
  //Getter for password
    public String getPassword() {
        return password;
    }
  //Getter for phone
    public String getPhone() {
        return phone;
    }
    
    //method to validate id
    private void validateProfileId(int profileId) {
        if (profileId <= 0) {
            throw new IllegalArgumentException("Profile ID must be a positive integer.");
        }
    }

  //profile validation by name 
    private void validateName(String name) {
        if (name == null || name.length() < 3 || name.length() > 60) {
            throw new IllegalArgumentException("Name must be between 5 and 60 characters.");
        }
    }
    
    //method to validate phone number
    private void validateEmail(String email) {
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new IllegalArgumentException("Invalid email format.");
        }
    }

    //method to validate password
    private void validatePassword(String password) {
        if (password == null || password.length() < 6) {
            throw new IllegalArgumentException("Password must be at least 6 characters long.");
        }
    }
  //method to validate phone number
    private void validatePhone(String phone) {
        if (phone == null || !phone.matches("\\d{10}")) {
            throw new IllegalArgumentException("Phone must be a 10-digit number.");
        }
    }

    
}
