/**
 * 
 */
package com.lingzhuo.action;

import java.util.List;

import com.lingzhuo.entity.CustomerEntity;
import com.lingzhuo.service.CustomerService;

/**
 * @ClassName: CusAction
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author LHX
 * @date 2017年9月21日 下午8:32:36
 *
 */
public class CusAction {
	private CustomerService customerService;
	private  List<CustomerEntity> rows;
	public String selectAll(){
		rows=customerService.selectAll();
		return "success";
		
	}

	public List<CustomerEntity> getRows() {
		return rows;
	}

	public void setRows(List<CustomerEntity> rows) {
		this.rows = rows;
	}

	public CustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	
}
