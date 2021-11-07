public class TokenAuthenticationProcessor extends AuthenticationProcessor{
    public TokenAuthenticationProcessor(AuthenticationProcessor nextAuthenticationProcessor) {
        super(nextAuthenticationProcessor);
    }

    protected boolean requestMatches(AuthenticationRequest authRequest){
        return authRequest.getAuthenticationRequestType() == AuthenticationRequestType.TOKEN;
    }

    protected void authenticate(AuthenticationRequest authRequest){
        System.out.println("Authentication Request of type "+ authRequest.getAuthenticationRequestType()+ " done by TokenAuthenticationProcessor");
    }
}
