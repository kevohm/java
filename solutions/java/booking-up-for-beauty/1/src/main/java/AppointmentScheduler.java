import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        String all = appointmentDateDescription;
        String d = all.split("\s+")[0];
		String t = all.split("\s+")[1];
		String[] dates = d.split("\\/");
		String[] times = t.split(":");
		int year = Integer.parseInt(dates[2]);
		int month = Integer.parseInt(dates[0]);
		int day = Integer.parseInt(dates[1]);
		int h = Integer.parseInt(times[0]);
		int m = Integer.parseInt(times[1]);
		int s = Integer.parseInt(times[2]);

		return LocalDateTime.of(year,month,day,h,m,s);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hourOfDay = appointmentDate.getHour();
        return hourOfDay >= 12 && hourOfDay < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, y");
        	DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("h:mm a.");
        String formattedDate = appointmentDate.format(formatter);
        String formattedTime = appointmentDate.format(timeFormatter);
        return "You have an appointment on " + formattedDate + ", at " + formattedTime;
    }

    public LocalDate getAnniversaryDate() {
        int currentYear = LocalDateTime.now().getYear();
        return LocalDate.of(currentYear, 9, 15);
    }
}
