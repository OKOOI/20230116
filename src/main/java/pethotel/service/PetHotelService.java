package pethotel.service;

import java.util.List;

import pethotel.dto.ApplyDto;
import pethotel.dto.CompanyDto;
import pethotel.dto.ConsultingDto;

public interface PetHotelService {
//	List<ConsultingDto>insertconsulting ()throws Exception;

	//qna
	void insertconsulting(ConsultingDto consultingDto)throws Exception;
	void insertreply(ConsultingDto consultingDto)throws Exception;
	ConsultingDto detail(int consultingIdx) throws Exception;
	List<ConsultingDto> consultinglist()throws Exception;
	//업체등록
	void insertcompany(CompanyDto companydto)throws Exception;
	//예약자 확인
	List<ApplyDto> reservation()throws Exception;
	void insertapply(ApplyDto applyDto) throws Exception;
	

	
}
