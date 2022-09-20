	
	import java.util.ArrayList;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

public class ValidEmail {



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ArrayList <String> emails= new ArrayList<>();
			emails.add("user+@gmail.com");
			emails.add("user98@domain.co.in");
			emails.add("user1@yahoo.com");
			emails.add("user.name@gmail.com");
			emails.add("user_name@domain.co.in");
			emails.add("user87-name@domain.co.in");
			emails.add("use565r@gmail.com");
			 
			//Invalid emails
			emails.add("@yahoo.com");
			emails.add("9856@yahoo.com");
			 
			String regex = "^[A-Za-z0-9+_.-]+@(.+)";
			 
			Pattern pattern = Pattern.compile(regex);
			 
			for(String email : emails){
			  Matcher matcher = pattern.matcher(email);
			  System.out.println(email +" : "+ matcher.matches());
			}

		}

	}


