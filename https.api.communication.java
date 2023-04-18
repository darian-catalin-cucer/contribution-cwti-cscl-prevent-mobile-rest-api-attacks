import javax.net.ssl.HttpsURLConnection;
import java.net.URL;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public class HttpsURLConnectionExample {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://api.example.com");
        HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        // Accept all SSL certificates
        con.setHostnameVerifier((hostname, session) -> true);
        con.setSSLSocketFactory(new TrustAllCertsSSLSocketFactory());

        int responseCode = con.getResponseCode();
        System.out.println("Response code: " + responseCode);
    }

    static class TrustAllCertsSSLSocketFactory extends SSLSocketFactory {
        @Override
        public Socket createSocket(Socket s, String host, int port, boolean autoClose) throws IOException {
            return null;
        }

        @Override
        public String[] getDefaultCipherSuites() {
            return new String[0];
        }

        @Override
        public String[] getSupportedCipherSuites() {
            return new String[0];
        }

        @Override
        public Socket createSocket(String host, int port) throws IOException {
            return null;
        }

        @Override
        public Socket createSocket(String host, int port, InetAddress localAddress, int localPort) throws IOException {
            return null;
        }

        @Override
        public Socket createSocket(InetAddress host, int port) throws IOException {
            return null;
        }

        @Override
        public Socket createSocket(InetAddress address, int port, InetAddress localAddress, int localPort) throws IOException {
            return null;
        }

        @Override
        public Socket createSocket() throws IOException {
            return null;
        }

        @Override
        public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        }

        @Override
        public HostnameVerifier getHostnameVerifier() {
            return null;
        }

        @Override
        public void setDefaultCipherSuites(String[] strings) {
        }

        @Override
        public void setEnabledCipherSuites(String[] strings) {
        }

        @Override
        public String[] getEnabledCipherSuites() {
            return new String[0];
        }

        @Override
        public void setDefaultSSLParameters(SSLParameters sslParameters) {
        }

        @Override
        public SSLParameters getDefaultSSLParameters() {
            return null;
        }

        @Override
        public SSLSession createSession(Socket socket) {
            return null;
        }

        @Override
        public SSLSessionContext getServerSessionContext() {
            return null;
        }

        @Override
        public SSLSessionContext getClientSessionContext() {
            return null;
        }

        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }

        @Override
        public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
        }

        @Override
        public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
        }
    }
}
