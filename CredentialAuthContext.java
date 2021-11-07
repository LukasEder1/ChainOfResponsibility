public class CredentialAuthContext extends AuthenticationRequest{
    private AuthenticationRequestType requestType = AuthenticationRequestType.CREDENTIALS;
    protected AuthenticationRequestType getAuthenticationRequestType(){
        return requestType;
    }
}
