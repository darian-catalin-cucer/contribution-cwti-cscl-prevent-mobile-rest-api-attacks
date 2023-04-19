import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class ApiKeyGenerator {

    private static final String API_KEY_SECRET = "my_api_key_secret";

    public static String generateApiKey(String mobileAppId) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] hash = messageDigest.digest((mobileAppId + API_KEY_SECRET).getBytes());
            return Base64.getEncoder().encodeToString(hash);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error generating API key", e);
        }
    }
}
