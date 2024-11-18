package uz.ilmnajot.api_gossip.service;

public interface EmailSendingService {
    void sendMail(String email, String subject, String body);
    void sendRegisterEmail(String email);
}
