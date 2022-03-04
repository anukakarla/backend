package com.te.carmaintenance.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.te.carmaintenance.bean.CarDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SuperAdminResponse {
	private String message;
	private boolean error;
	List<CarDetails> carDetails;

}
