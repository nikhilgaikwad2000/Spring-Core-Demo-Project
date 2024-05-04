package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.ashokit.dao.ReportDao;

@Service
public class ReportService {
 
	
	private ReportDao reportDao;
	
	@Autowired
// it will use "byType mode for Autowiring..."
	
	public void setReportDao(ReportDao reportDao) {
		System.out.println("setter method call..");
		this.reportDao=reportDao;
	}
	
	
	public void genarateReport() {
		String findData = reportDao.findData();
		System.out.println("generating report........");
	}
	
}
