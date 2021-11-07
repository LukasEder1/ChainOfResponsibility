public class BiometricAuthenticationProcessor extends AuthenticationProcessor{
    public BiometricAuthenticationProcessor(AuthenticationProcessor nextAuthenticationProcessor) {
        super(nextAuthenticationProcessor);
    }

    protected boolean requestMatches(AuthenticationRequest authRequest){
        return authRequest.getAuthenticationRequestType() == AuthenticationRequestType.BIOMETRIC;
    }

    protected void authenticate(AuthenticationRequest authRequest){
        System.out.println("Authentication Request of type "+ authRequest.getAuthenticationRequestType() +"  done by BiometricAuthenticationProcessor");
    }


}

