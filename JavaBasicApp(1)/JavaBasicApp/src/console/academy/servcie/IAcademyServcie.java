package console.academy.servcie;

import java.util.List;

import console.academy.Person;

public interface IAcademyServcie {
	
	List<AcademyDTO> selectList(AcademyDTO dto) throws Exception;
	AcademyDTO selectOne(AcademyDTO dto) throws Exception;
	
	int insert(AcademyDTO dto) throws Exception;
	int delete(AcademyDTO dto) throws Exception;
	int update(AcademyDTO dto) throws Exception;
	
	void close();
	
}
