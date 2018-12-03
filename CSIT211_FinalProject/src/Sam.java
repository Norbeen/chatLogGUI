//What differentiates these specific users from the User class is the array of strings they have
//Each user's array is going to contain varying amounts of offenses
//This is the 1st user: Sam. Sam does not curse at all. Sam mostly likes to share motivational quotes

public class Sam extends User {
	//Constructor
	 Sam() {
		nameTag = "Sam";
	}
	//No idea what is a good amount of strings for now. These are just test strings to see if the RNG works!
	String[] phrases = new String[] {
			"You miss 100% of the shots you don稚 take. 妨ayne Gretzky",
			"Strive not to be a success, but rather to be of value. 泡lbert Einstein",
			"I attribute my success to this: I never gave or took any excuse. 芳lorence Nightingale",
			"Every strike brings me closer to the next home run. 烹abe Ruth",
			"Life is what happens to you while you池e busy making other plans. 褒ohn Lennon",
			"We become what we think about. 胞arl Nightingale",
			"Life is 10% what happens to me and 90% of how I react to it. 砲harles Swindoll",
			"The mind is everything. What you think you become.  烹uddha",
			"An unexamined life is not worth living. 亡ocrates",
			"Eighty percent of success is showing up. 妨oody Allen",
			"Winning isn稚 everything, but wanting to win is. 坊ince Lombardi",
			"Every child is an artist.  The problem is how to remain an artist once he grows up. 鳳ablo Picasso",
			"Either you run the day, or the day runs you. 褒im Rohn",
			"The best revenge is massive success. 芳rank Sinatra",
			"Life shrinks or expands in proportion to one's courage. 泡nais Nin",
			"There is only one way to avoid criticism: do nothing, say nothing, and be nothing. 泡ristotle",
			"The only person you are destined to become is the person you decide to be. 乏alph Waldo Emerson",
			"Everything has beauty, but not everyone can see. 砲onfucius",
			"When I let go of what I am, I become what I might be. 豊ao Tzu",
			"Happiness is not something readymade.  It comes from your own actions. 縫alai Lama",
						
	};
	
	//Here is the method to print out a random string from the array (will be edited later once io files are figured out!)
	public void generateMessage() {
		int n = rand.nextInt(20);
		//The message is concatenated with the user's name!
		message = phrases[n];
	} //End of generateMessage method definition
	
	//debugging methods
	//Returns the user's name
		public String nameCheck() {
			return nameTag;
		}
	
}
