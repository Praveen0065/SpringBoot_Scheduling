package com.app.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/* cron Expression : Date and Time (from Linux)
 
    SEC  MIN  HRS  DAY  MONTH WEEKDAY
    0-59 0-59 0-23 1-31 1-12  0-7 SUN-SAT  */

@Component
public class ReportService {
	
  //@Scheduled(fixedDelay = 2000) //1000 mill sec = 1 sec
  //@Scheduled(cron = "0 0 9 * * *" ) // every day 9am
  //@Scheduled(cron = "0 0 18 * * *" ) // every day 6pm
  //@Scheduled(cron = "0 0 6,18 * * *" ) // every day 6am and 6pm
  //@Scheduled(cron = "0 0 8-10 * * *" ) // every day 8:00:00Am,9:00:00Am,10:00:00Am
  //@Scheduled(cron = "59 59 23 31 12 SUN-SAT" ) // every year dec 31st night 11:59:59 PM
  //@Scheduled(cron = "0 0 0 * * *" ) // every day mid night 12 Noon => 12:00:00 Am
  //@Scheduled(cron = "0 0 * * * *" ) // every hour(Starting) 1:00:00am,2:00:00am etc..
  //@Scheduled(cron = "0 10 * * * *" ) // every hour 10th mint 0sec(Starting) 1:10:00am,2:10:00am etc..
  //@Scheduled(cron = "10 * * * * *" ) // every hour every mint 10thsec(Starting) 
	public void printReport() {
		System.out.println("REPORT : " + new Date());
		
		System.out.println("=====================================");
	}
	
	
	//@Scheduled(cron = "*/10 * * * * *" ) //Execute task for every 10th sec
	//@Scheduled(cron = "* * * * * *" ) continuous excuting
	public void printReportGap() {
		System.out.println("REPORTS : " + new Date());
	}

}
