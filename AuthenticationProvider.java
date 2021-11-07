public class AuthenticationProvider {
    private AuthenticationProcessor nextAuthenticationProcessor;
    private AuthenticationProcessor initialAuthenticationProcessor;
    public void initAuthenticationProcessors(AuthenticationProcessor nextAuthenticationProcessor){
        this.nextAuthenticationProcessor = nextAuthenticationProcessor;
        this.initialAuthenticationProcessor = nextAuthenticationProcessor;
    }

    public void performAuthentication(AuthenticationRequest authRequest){
        while (nextAuthenticationProcessor != null){
            //System.out.println("Type: "+ authRequest.getAuthenticationRequestType()+ " Processor: "+ nextAuthenticationProcessor);
            if (nextAuthenticationProcessor.requestMatches(authRequest)){
                nextAuthenticationProcessor.authenticate(authRequest);
                break;
            }

            nextAuthenticationProcessor = nextAuthenticationProcessor.getNextAuthenticationProcessor();

        }
        nextAuthenticationProcessor = initialAuthenticationProcessor;
    }


}
