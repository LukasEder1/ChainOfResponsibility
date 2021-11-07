public class TokenAuthContext extends AuthenticationRequest{
    private AuthenticationRequestType requestType = AuthenticationRequestType.TOKEN;
    protected AuthenticationRequestType getAuthenticationRequestType(){
        return requestType;
    }
}
