package pethotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pethotel.dto.ApplyDto;
import pethotel.dto.CompanyDto;
import pethotel.dto.ConsultingDto;
import pethotel.mapper.PetHotelMapper;

@Service
public class PetHotelServiceImpl implements PetHotelService {
	@Autowired
	private PetHotelMapper petHotelMapper;

	@Override
	public void insertconsulting(ConsultingDto consultingDto) throws Exception {
		petHotelMapper.insertconsulting(consultingDto);
	}

//	@Override
//	public void insertreply(int consultingIdx) throws Exception {
//		petHotelMapper.insertreply(consultingIdx);
//	}

	

	@Override
	public List<ConsultingDto> consultinglist() throws Exception {
		return petHotelMapper.consultinglist() ;
	}

	@Override
	public void insertreply(ConsultingDto consultingDto) throws Exception {
		petHotelMapper.insertreply(consultingDto);
		
	}

	@Override
	public ConsultingDto detail(int consultingIdx) throws Exception {
	
		return petHotelMapper.detail(consultingIdx);
	}

	//업체등록버튼
	@Override
	public void insertcompany(CompanyDto companydto) throws Exception {
		petHotelMapper.insertcompany(companydto);
		
	}

	@Override
	public List<ApplyDto> reservation() throws Exception {

		return petHotelMapper.reservation();
	}

	@Override
	public void insertapply(ApplyDto applyDto) throws Exception {
		petHotelMapper.insertapply(applyDto);
		
	}

}
