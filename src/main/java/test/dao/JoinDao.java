package test.dao;

import test.domain.RequestJoinDTO;

public class JoinDao {
	public String joinRow(RequestJoinDTO params) {
		System.out.println("debug >>> dao joinRow params = " + params);
		return "회원가입이 완료되었습니다.";
	}
}
