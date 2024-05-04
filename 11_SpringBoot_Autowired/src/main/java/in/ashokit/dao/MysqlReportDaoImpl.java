package in.ashokit.dao;

import org.springframework.stereotype.Repository;

@Repository("mysql")
public class MysqlReportDaoImpl implements ReportDao {

	@Override
	public String findData() {
		System.out.println("fetching report data from mysqldb.... ");
		return "reportdata";
	}

}
