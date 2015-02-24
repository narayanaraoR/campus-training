
public class LoginWithSocialNetwork
{
	public static void main(String[] args) 
	  {
		//Take Social network name. Eg. Facebook
		String socialNetworkName = "Facebook";
		DomainType domain = LoginFactory.login(socialNetworkName);
		domain.login("NR", "NR123");
		
	  }
	
}