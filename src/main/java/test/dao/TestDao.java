package test.dao;

import test.domain.RequestTestDTO;
import test.domain.ResponseTestDTO;

public class TestDao {
	private ResponseTestDTO response;
	public TestDao() {
		response = new ResponseTestDTO();
	}
	
	public ResponseTestDTO loginRow(RequestTestDTO params) {
		System.out.println("debug >>> dao loginRow params = " + params);
		if(params.getId().equals("jslim") && params.getPwd().equals("jslim")) {
			response.setName("섭섭해");
			return response;
		} else {
			return null;
		}
	}
}
