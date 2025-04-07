package com.xworkz.passportapp;

public class PassportDto {
    package com.xworkz.passportApp.passport;

    public class PassportDto {
        private String FirstName;
        private String LastName;
        private String dob;
        private String gender;
        private int  phoneNumber;
        private String emailId;
        private String  password;
        private String confirmPassword;
        private String hintQuestion;
        private String Nationality;
        private String FatherName;

        private String Address;
        private String passportType;

        public String getFirstName() {
            return FirstName;
        }

        public void setFirstName(String firstName) {
            FirstName = firstName;
        }

        public String getLastName() {
            return LastName;
        }

        public void setLastName(String lastName) {
            LastName = lastName;
        }

        public String getDob() {
            return dob;
        }

        public void setDob(String dob) {
            this.dob = dob;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public int getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getEmailId() {
            return emailId;
        }

        public void setEmailId(String emailId) {
            this.emailId = emailId;
        }

        public String getPassword() {
            return password;

        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getConfirmPassword() {
            return confirmPassword;
        }

        public void setConfirmPassword(String confirmPassword) {
            this.confirmPassword = confirmPassword;
        }

        public String getHintQuestion() {
            return hintQuestion;
        }

        public void setHintQuestion(String hintQuestion) {
            this.hintQuestion = hintQuestion;
        }

        public String getFatherName() {
            return FatherName;
        }

        public void setFatherName(String fatherName) {
            FatherName = fatherName;
        }

        public String getAddress() {
            return Address;
        }

        public void setAddress(String address) {
            Address = address;
        }

        public String getNationality() {
            return Nationality;
        }

        public void setNationality(String nationality) {
            Nationality = nationality;
        }

        public String getPassportType() {
            return passportType;
        }

        public void setPassportType(String passportType) {
            this.passportType = passportType;
        }
    }
}
