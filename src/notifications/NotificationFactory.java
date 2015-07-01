package notifications;

public class NotificationFactory {
		
	public Notification createNotification(String zone){
		if (zone == null){
			return null;
		}
		else if(zone == "danger zone"){
			Notification notification = new Notification();
			notification.dangerZoneNotification();
		}
		else if(zone == "zone A"){
			Notification notification = new Notification();
			notification.zoneANotification();
		}
		return null;
	}

}
