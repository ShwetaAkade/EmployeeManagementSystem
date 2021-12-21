package com.capg.ems;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.capg.ems.entities.Department;
import com.capg.ems.entities.StatusReport;
import com.capg.ems.repositories.DepartmentRepository;
import com.capg.ems.repositories.StatusReportRepository;
import com.capg.ems.service.DepartmentServiceimpl;
import com.capg.ems.service.StatusReportServiceimpl;


@RunWith(SpringRunner.class)
@SpringBootTest
public class StatusReportTest {
	@InjectMocks
	private StatusReportServiceimpl iservice;
	@Mock
	private StatusReportRepository Dao;
	@Test
	public void addStatusReportTest()
	{
		StatusReport statusreport = new StatusReport();
		statusreport.setStatusId(1);
		statusreport.setComments("please reslove the issue");
		statusreport.setDetails("MYSQL COnnector");
		statusreport.setStatusreport("open");
		Mockito.when(Dao.save(statusreport)).thenReturn(statusreport);
	}
	@Test
	public void getAllStatusReportsTest() {
		StatusReport statusreport1 = new StatusReport();
		StatusReport statusreport2 = new StatusReport();
		statusreport1.setStatusId(1);
		statusreport1.setComments("please reslove the issue");
		statusreport1.setDetails("MYSQL COnnector");
		statusreport1.setStatusreport("open");
		statusreport2.setStatusId(1);
		statusreport2.setComments("please reslove the issue");
		statusreport2.setDetails("MYSQL COnnector");
		statusreport2.setStatusreport("close");
			Mockito.when(Dao.findAll()).thenReturn(Stream.of(statusreport1,statusreport2).collect(Collectors.toList()));
			assertEquals(2,iservice.getAllStatusReports().size());
	}
}

