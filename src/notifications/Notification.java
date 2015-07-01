package notifications;

public class Notification {
	
	public void zoneANotification(){
		System.out.println("---------------");
		System.out.println("Approaching leading vehicle... <Zone A>"); // signal to CBS or OVERRIDE
		System.out.println("---------------");
	}
	
	public void dangerZoneNotification(){
		System.out.println("---------------");
		System.out.println("<DANGER ZONE!> engaging emergency brakes!"); // signal to CBS or OVERRIDE
		System.out.println("---------------");
	}
}