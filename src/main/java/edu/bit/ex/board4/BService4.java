package edu.bit.ex.board4;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;


@Service
public class BService4 {
	
	@Inject
	BoardMapper4 boardMapper; //인터페이스 주입
	
    public List<BDto> selectblist()throws Exception {
		return boardMapper.selectBoardListt();
    }
}
