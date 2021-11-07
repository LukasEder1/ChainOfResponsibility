public class CredentialAuthenticationProcessor extends AuthenticationProcessor{
    public CredentialAuthenticationProcessor(AuthenticationProcessor nextAuthenticationProcessor) {
        super(nextAuthenticationProcessor);
    }

    protected boolean requestMatches(AuthenticationRequest authRequest){
        return authRequest.getAuthenticationRequestType() == AuthenticationRequestType.CREDENTIALS;
    }

    protected void authenticate(AuthenticationRequest authRequest){
        System.out.println("Authentication Request of type "+ authRequest.getAuthenticationRequestType() +" done by CredentialAuthenticationProcessor");
    }

}
