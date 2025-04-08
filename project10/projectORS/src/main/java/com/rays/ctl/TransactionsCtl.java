package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.TransactionsDTO;
import com.rays.form.TransactionsForm;
import com.rays.service.TransactionServiceImpl;


@RestController
@RequestMapping( value = "transactions")
public class TransactionsCtl extends BaseCtl<TransactionsForm, TransactionsDTO, TransactionServiceImpl> {


	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
				
		
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "cash");
		map.put(2, "online");
		map.put(3, "cheque");
		
		
		res.addResult("transactionsTypeList", map);

		return res;
	}

}
