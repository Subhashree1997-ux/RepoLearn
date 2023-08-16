package org.report;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportingClass {
	public static void generateReport(String json) {
		File f=new File("C:\\Users\\Dinesh\\Desktop\\New Folder2");
		Configuration con=new Configuration(f, "FacebookHomePage");
		con.addClassifications("user", "subamuki1997@gmail.com");
		con.addClassifications("Tool", "Eclipse");
		con.addClassifications("Java-Version", "JDK-11");
		List<String> li=new LinkedList<String>();
		li.add(json);
		ReportBuilder r=new ReportBuilder(li,con);
		r.generateReports();
		}
}
