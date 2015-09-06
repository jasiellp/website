package website;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JUtil
{ 

	public static String dataFeliz()
	{
		return new SimpleDateFormat("hh:mm:ss").format(new Date());
	}

}