package pethotel.dto;

import lombok.Data;

@Data
public class ApplyDto {
	private int applyIdx;
	private String applyName;
	private int applyPeriod;
	private String phoneNumber;
	private String contents;
	private String dogName;
	private int companyIdx;
}
