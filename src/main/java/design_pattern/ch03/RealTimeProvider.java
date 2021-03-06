package design_pattern.ch03;

import java.util.Calendar;

public class RealTimeProvider implements TimeProvider {
	private Calendar cal;
	
	
	public RealTimeProvider() {
		cal = Calendar.getInstance();
	}

	@Override
	public void setHours(int hour) {
//		cal.set(Calendar.HOUR_OF_DAY, hour);
	}

	@Override
	public int getTime() {
		return cal.get(Calendar.HOUR_OF_DAY);
	}

}
