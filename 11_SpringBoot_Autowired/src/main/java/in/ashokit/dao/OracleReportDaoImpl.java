package in.ashokit.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("oracle")
@Primary
public class OracleReportDaoImpl implements ReportDao {
	public OracleReportDaoImpl() {
		System.out.println("ReportDaoImpl::Constructor");
	}

	@Override
	public String findData() {
	 System.out.println("fetching report data from oracledb...");
		return "report data";
	}
}
