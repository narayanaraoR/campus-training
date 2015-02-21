
public class LoginWithSocialNetwork
{
	public static void main(String[] args) 
	  {
		String socialNetworkName = "Facebook";//Take Social network name
		DomainType domain = LoginFactory.login(socialNetworkName);
		domain.login("NR", "NR123");
		
	  }
	
}