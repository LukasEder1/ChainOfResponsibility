public class BiometricAuthContext extends AuthenticationRequest{
    private AuthenticationRequestType requestType = AuthenticationRequestType.BIOMETRIC;
    protected AuthenticationRequestType getAuthenticationRequestType(){
        return requestType;
    }
}
