package console.academy.service;

import java.util.List;

import console.academy.Person;

public interface IAcademyService {
	List<AcademyDTO> selectList(AcademyDTO dto) throws Exception;//selectList(AcademyDTO dto) : 여러개 레코드를 반환하는 메소드
	//하나의 레코드만 반환하는 메소드
	AcademyDTO selectOne(AcademyDTO dto) throws Exception;
	
	int insert(AcademyDTO dto) throws Exception;
	int delete(AcademyDTO dto) throws Exception;
	int update(AcademyDTO dto) throws Exception;
	
	void close();
	
}
