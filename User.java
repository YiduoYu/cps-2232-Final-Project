package Project;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class User {
    private String email;
    private String password;
    private boolean isAdmin;
    private int numOfRentCars;

    // Constructor
    public User(String email, String password, boolean isAdmin, int numOfRentCars) {
        this.email = email;
        this.password = password;
        this.isAdmin = isAdmin;
        this.numOfRentCars = numOfRentCars;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public int getNumOfRentCars() {
        return numOfRentCars;
    }

    public void setNumOfRentCars(int numOfRentCars) {
        this.numOfRentCars = numOfRentCars;
    }

    private void sendEmail(String to, String subject, String content) {
        // QQ mail configuration
        String from = "your_email_address@qq.com";
        String password = "your_password"; // This is an application-specific password

        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.qq.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        // Create a session
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(subject);
            message.setText(content);

            Transport.send(message);
            System.out.println("Email sent successfully to " + to);
        } catch (MessagingException e) {
            e.printStackTrace();
            System.out.println("Failed to send email to " + to);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", isAdmin=" + isAdmin +
                '}';
    }
}
