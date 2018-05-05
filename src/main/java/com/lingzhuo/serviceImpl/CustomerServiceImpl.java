/**
 * 
 */
package com.lingzhuo.serviceImpl;

import java.util.List;

import com.lingzhuo.dao.CustomerDao;
import com.lingzhuo.entity.CustomerEntity;
import com.lingzhuo.service.CustomerService;



/**
 * @ClassName: CustomerServiceImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author LHX
 * @date 2017�?�?8�?下午9:28:44
 *
 */
public class CustomerServiceImpl implements CustomerService{

	private CustomerDao customerDao;
	/* (non-Javadoc)
	 * @see com.lingzhuo.sh.Maven_SH.dao.CustomerDao#saveEntity(com.lingzhuo.sh.Maven_SH.entity.CustomerEntity)
	 */
	public void saveEntity(CustomerEntity entity) {
		// TODO Auto-generated method stub
		customerDao.saveEntity(entity);
	}
	public CustomerDao getCustomerDao() {
		return customerDao;
	}
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	/* (non-Javadoc)
	 * @see com.lingzhuo.service.CustomerService#selectAll()
	 */
	public List<CustomerEntity> selectAll() {
		// TODO Auto-generated method stub
		return customerDao.selectAll();
	}

}
