public abstract class AuthenticationProcessor {
    private AuthenticationProcessor nextAuthenticationProcessor;

    public AuthenticationProcessor(AuthenticationProcessor nextAuthenticationProcessor) {
        this.nextAuthenticationProcessor = nextAuthenticationProcessor;
    }

    public void performAuthentication(AuthenticationProcessor nextAuthProcessor){}

    public AuthenticationProcessor getNextAuthenticationProcessor() {
        return nextAuthenticationProcessor;
    }

    protected abstract boolean requestMatches(AuthenticationRequest authRequest);

    protected abstract void authenticate(AuthenticationRequest authRequest);
}
