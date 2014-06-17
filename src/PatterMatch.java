import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PatterMatch {
	
	public void runThis() throws ParseException {
		String text= "aapl   2012 06 25 20   40";
		Pattern pat = Pattern.compile("(.{6}) (.{4}) (.{2}) (.{2}) (.{4})");
		
		Matcher m = pat.matcher(text);
		
		int i = 1;
		if (m.find()) {
			System.out.println(m.group(0));
			i ++;
		}
			
			TreeMap<Date,String> tMap = new TreeMap<Date,String>();
			
			Date dt = new SimpleDateFormat("MM/dd/yy hh:mm:ss").parse("01/22/14 14:20:38");
			Date dt1 = new SimpleDateFormat("MM/dd/yy hh:mm:ss").parse("01/23/14 14:20:38");
			Date dt2= new SimpleDateFormat("MM/dd/yy hh:mm:ss").parse("01/19/14 14:20:38");
			tMap.put(dt, "one");
			tMap.put(dt1, "two");
			tMap.put(dt2, "three");
			
			Iterator setIterator = tMap.entrySet().iterator();
			while (setIterator.hasNext()) {
				Entry<Date,String> entry = (Entry<Date, String>) setIterator.next();
				System.out.println("Iterator for map.. "+entry.getValue());
			}
			
			for (Map.Entry<Date, String> dt3: tMap.entrySet()) {
				System.out.println(dt3.getValue());
			}
			
		
		String[] tokens = pat.split(text);
	}
	
	public static void main(String[] args) throws ParseException {
		
		PatterMatch pm = new PatterMatch();
		pm.runThis();
		
	}

}


