package test.service;

import test.dao.JoinDao;
import test.domain.RequestJoinDTO;

public class JoinService {
	private JoinDao dao;
	public JoinService() {
		dao = new JoinDao();
	}
	   
	public String join(RequestJoinDTO params) {
		System.out.println("debug >>> service login params = " + params);
		return dao.joinRow(params);
	}
}
