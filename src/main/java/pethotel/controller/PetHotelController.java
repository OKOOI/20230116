package pethotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;
import pethotel.dto.ApplyDto;
import pethotel.dto.CompanyDto;
import pethotel.dto.ConsultingDto;
import pethotel.service.PetHotelService;
@Slf4j
@Controller
public class PetHotelController {
	@Autowired
	private PetHotelService petHotelService;
	//----------------------------------여기서부터 QnA-----------------------------
	//--------------------------qna등록페이지-----------------------
	@GetMapping("/register")
	public ModelAndView consulting() throws Exception {
		ModelAndView mv = new ModelAndView("Business_QnA_regist.html");
		return mv;
	}

	@PostMapping("/register/12")
	public String insertConsulting(ConsultingDto consultingDto) throws Exception {
		petHotelService.insertconsulting(consultingDto);
		return ("redirect:/list");
	}

	//----------------------qna상세 페이지---------------------------------
	@GetMapping("/openconsultDetail.do")
	public ModelAndView detail(@RequestParam int consultingIdx) throws Exception {
		ModelAndView mv = new ModelAndView("Business_answer_content.html");
		ConsultingDto consultingDto = petHotelService.detail(consultingIdx);
		log.debug(consultingDto.getConsultingTitle());
		mv.addObject("detail", consultingDto);
		return mv;
	}
	@PostMapping("/reply/1234")
	public String insertreply(ConsultingDto consultingDto) throws Exception {
		log.debug(consultingDto.getReply());
		petHotelService.insertreply(consultingDto);
		return ("redirect:/list");
	}

	//---------------------qnalist--------------------------------------------
	@GetMapping("/list")
	public ModelAndView consultinglist() throws Exception {
		ModelAndView mv = new ModelAndView("Business_QA.html");
		List<ConsultingDto> list = petHotelService.consultinglist();
		mv.addObject("list", list);
		return mv;
	}	

	//--------------------------------업체 등록-----------------------------------------
	@GetMapping("/company")
	public ModelAndView companyregist() throws Exception {
		ModelAndView mv = new ModelAndView("Business_registration.html");
		return mv;
	}
	@PostMapping("/company/regist")
	public String insertcompany(CompanyDto companydto) throws Exception {
		log.debug(companydto.getCompanyName());
		petHotelService.insertcompany(companydto);
		return ("redirect:/company");
	}
	//---------------------------메인페이지--------------------------
	@GetMapping("/mainpage")
	public ModelAndView mainpage() throws Exception {
		ModelAndView mv = new ModelAndView("mainpage.html");
		return mv;
	}
	//--------------------예약자 확인 페이지 용석------------------------
	@GetMapping("/reservation")
	public ModelAndView reservation() throws Exception {
	ModelAndView mv = new ModelAndView("/reservation");
	List<ApplyDto> applyDto = petHotelService.reservation();
	mv.addObject("reservation", applyDto);
	return mv;
	}
	
	//--------------------예약 등록----------------------------
		@PostMapping("/apply")
		public String insertapply(ApplyDto applyDto) throws Exception {
			petHotelService.insertapply(applyDto);
			return ("redirect:/list");
		}
		
		@GetMapping("/apply123")
		public ModelAndView apply() throws Exception {
			ModelAndView mv = new ModelAndView("apply.html");
			return mv;
		}
}
