package Base_Libreary;

import java.util.List;


public interface LocatorsRepo {
	String  HomePage = " Ravi Bharti"; 
	String SignIn = "//*[text()='Sign in']";
	String emailBox = "//*[@placeholder='Enter your email']";
	String passwordBox = "//*[@placeholder='Password']";
	String submit = "//*[@type='submit']";
	
	// Search page 
	//String searchDropDown = "//*[text()='Skill Listings']";
	String searchDropDown="//*[text()='Skill Listings']//parent::button";
	String searchMenuList = "//*[@role='menu']/div/div";
	String searchBar = "//*[@placeholder='Search']";
	
	
	// ResultPage
	String searchResult = "//*[@class='skill-thecard']/..";
	//String candidate ="//a[@href=\"/employer/profiledetail/49130\"]";
   // String candidate = "//div[@class=\"ant-col suggestion-wrdapper ant-col-xs-24\"]/following::div/div/a";
  	String page="//a[@rel=\"nofollow\" and text()='2' ]";
	String Favuseranme="//*[@class=\"username\"]";
	String Heartclick="//span[@class=\"anticon anticon-heart\"]//*[name()='svg']";
	String Burger="//div[@class='ant-dropdown-trigger Avat1']";
	String Favbtn="//ul[@role='menu']//div[contains(text(),'Favorites')]";
	String Favcandidatelist="//div[@class='card-details-column']/div[@class='nameofcandidate']";
	
	
	//*[@aria-label=\"heart\"]
	
	// Talent Page
	String username = "//*[@class='username']";
	String email = "//*[@class='profile-details-container']/div[5]";
	String skills = "//*[text()='Skills']/..";
	
	//place  a  bid
	String Placebid="//*[text()='Place a bid']";
	String next = "//*[text()='Next']";
	String gigs=" //div[@class=\"jobcard-container\"]";
	//String gigs = "//*[@class='ant-row jobcard-img-cont']";	
	String weekly = "//*[text()='Weekly']";
	String amountNext = "//*[text()='Next']";
	String calender = "//*[@class='ant-picker-input']";
	String randomDate = "//*[@class='ant-picker-content'] //*[text()='25']"; ////*[@class="ant-select-selection-placeholder"]
	String length = "//*[@class='contract_container'] //*[@class='ant-select-selector']";
	String lengthOption = "//*[@class='rc-virtual-list']/div/div/div/div";
	//String lengthOption = "//*[@class='rc-virtual-list-holder-inner']/div";
	String about = "//div[@class=\"ql-editor ql-blank\"]";
	String placeBid = "//*[text()='Place Bid']";
	String editBid = "//*[text()='Edit bid']";
	String Done = "//*[text()='Done']";
	//String Resume="//*[@class='resume-btn-3d']";
	String Updatebid="//*[text()='Update Bid']";
	
	//Post a gigs
    //tring postgig="//div[@class=\"skillListing\" and text()='Post a gig']";
	//ring postgig =loginButton theAlign\"]//div[text()='Post a gig']";
    //	String postagig= "//div[@class=\"loginButton theAlign\"]//div[text()='Post a gig']";
	String postagig ="//div[normalize-space()='Post a gig']";
	
	
	
	
}
