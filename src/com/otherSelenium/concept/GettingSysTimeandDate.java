package com.otherSelenium.concept;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GettingSysTimeandDate {
	
	
	    public static void main(String[] args) {
	        // Get the current system date and time
	        Date currentDate = new Date();

	        // Format the date and time as per your requirement
	        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	        String formattedDate = dateFormat.format(currentDate);

	        System.out.println("Current System Date and Time: " + formattedDate);
	    }
	}


