
public class LoginFactory 
{
	public static DomainType login(String socialNetworkName)
	{
		if(socialNetworkName.equals("Google"))
		{
			return new GoogleDomain();
		} 
		if(socialNetworkName.equals("Facebook"))
		{
			return new FacebookDomain();
		}
		else if(socialNetworkName.equals("Twitter"))
		{
			return new TwitterDomain();
		}
		else if(socialNetworkName.equals("LinkedIn"))
		{
			return new LinkedInDomain();
		}
		else
		return null;
	}
}
