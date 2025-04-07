package com.xworkz.passportapp;

public class PassportSeva {
    package com.xworkz.passportapp;

    public class PassportDto {

        private Long phoneNumber;
        private String emailId;
        private String password;
        private String confirmPassword;
        private String hintQuestion;

        public void setPhoneNumber(Long number){
            this.phoneNumber=phoneNumber;
        }

        public Long getPhoneNumber() {
            return phoneNumber;
        }

        public void setEmailId(String emailId) {
            this.emailId = emailId;
        }

        public String getEmailId() {
            return emailId;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getPassword() {
            return password;
        }

        public void setConfirmPassword(String confirmPassword) {
            this.confirmPassword = confirmPassword;
        }

        public String getConfirmPassword() {
            return confirmPassword;
        }

        public void setHintQuestion(String hintQuestion) {
            this.hintQuestion = hintQuestion;
        }

        public String getHintQuestion() {
            return hintQuestion;
        }
    }
}
