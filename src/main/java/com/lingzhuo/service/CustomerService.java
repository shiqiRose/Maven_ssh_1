/**
 * 
 */
package com.lingzhuo.service;

import java.util.List;

import com.lingzhuo.entity.CustomerEntity;



/**
 * @ClassName: CustomerService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author LHX
 * @date 2017�?�?8�?下午9:27:49
 *
 */
public interface CustomerService {
	  public void saveEntity(CustomerEntity entity);
	  public List<CustomerEntity> selectAll();
}
