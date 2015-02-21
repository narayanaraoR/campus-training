
public interface login
{
	void login(String socialNetworkName);
}

public class LoginWithSocialNetwork implements login
{
	public static void main(String[] args) 
	  {
		LoginType logintype = new LoginType();
		
		logintype.login(socialNetworkName);
		
	  }
	
}

public class LoginType
{
	public void login(String socialNetworkName)
	{
		if(socialNetworkName="Google")
		{
			return GoogleLogin();
		} 
		else if(socialNetworkName="Facebook")
		{
			return FacebookLogin();
		}
		else if(socialNetworkName="Twitter")
		{
			return TwitterLogin();
		}
		else if(socialNetworkName="LinkedIn")
		{
			return LinkedInLogin();
		}
		else if(socialNetworkName= null)
		{
			return System.out.println("Not a valid Social network");
		}
	}
}

public login Googlelogin()
{
	//Login using google
	//Email:
	//password
}

public login FacebookLogin()
{
	//Login using facebook
	//Username
	//password
}

public login TwitterLogin():
{
	//Login using Twitter
	//handle
	//password
}

public login LinkedInlogin();
{
	//Login using LinkedIn
	//Username
	//password
}