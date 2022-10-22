package novianto.anggoro.user.registration.email;


public interface EmailSender {

    void send(String to, String email);
}
