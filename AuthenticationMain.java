public class AuthenticationMain {
    public static void main(String[] args) {
        TokenAuthenticationProcessor tokenAuthenticationProcessor = new TokenAuthenticationProcessor(null);
        CredentialAuthenticationProcessor credentialAuthenticationProcessor = new CredentialAuthenticationProcessor(tokenAuthenticationProcessor);
        BiometricAuthenticationProcessor biometricAuthenticationProcessor = new BiometricAuthenticationProcessor(credentialAuthenticationProcessor);
        AuthenticationProvider provider = new AuthenticationProvider();
        provider.initAuthenticationProcessors(biometricAuthenticationProcessor);

        CredentialAuthContext request1 = new CredentialAuthContext();
        BiometricAuthContext request2 = new BiometricAuthContext();
        TokenAuthContext request3 = new TokenAuthContext();

        provider.performAuthentication(request1);
        provider.performAuthentication(request2);
        provider.performAuthentication(request3);




    }
}
