package pethotel.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import pethotel.dto.ApplyDto;
import pethotel.dto.CompanyDto;
import pethotel.dto.ConsultingDto;
@Mapper
public interface PetHotelMapper {

//	List<ConsultingDto> insertreply(int consultingIdx) throws Exception;
	void insertconsulting(ConsultingDto consultingDto);
	void insertreply(ConsultingDto consultingDto)throws Exception;

	List<ConsultingDto> consultinglist()throws Exception;
	
	ConsultingDto detail(int consultingIdx) throws Exception;
	
	void insertcompany(CompanyDto companyDto)throws Exception;
	List<ApplyDto> reservation()throws Exception;
	void insertapply(ApplyDto applyDto)throws Exception;
}
