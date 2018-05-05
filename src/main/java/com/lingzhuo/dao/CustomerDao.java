/**
 * 
 */
package com.lingzhuo.dao;

import java.util.List;

import com.lingzhuo.entity.CustomerEntity;



/**
 * @ClassName: CustomerDao
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author LHX
 * @date 2017�?�?8�?下午8:46:56
 *
 */
public interface CustomerDao {
    public void saveEntity(CustomerEntity entity);
    public List<CustomerEntity> selectAll();
    public List<CustomerEntity> selectCusTotal(); 
}
