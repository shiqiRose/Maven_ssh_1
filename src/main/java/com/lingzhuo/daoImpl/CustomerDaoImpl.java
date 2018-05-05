/**
 * 
 */
package com.lingzhuo.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.lingzhuo.dao.CustomerDao;
import com.lingzhuo.entity.CustomerEntity;


/**
 * @ClassName: CustomerDaoImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author LHX
 * @date 2017�?�?8�?下午9:03:46
 *
 */
public class CustomerDaoImpl  extends HibernateDaoSupport  implements CustomerDao{

	/* (non-Javadoc)
	 * @see com.lingzhuo.sh.Maven_SH.dao.CustomerDao#saveEntity(com.lingzhuo.sh.Maven_SH.entity.CustomerEntity)
	 */
	public void saveEntity(CustomerEntity entity) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(entity);
	}
	
	
	public List<CustomerEntity> selectAll(){
		Session session =this.getHibernateTemplate().getSessionFactory().openSession();
		Criteria cri=session.createCriteria(CustomerEntity.class);
		List<CustomerEntity> list=cri.list();
		session.close();
		return list;
		
	}


	/* (non-Javadoc)
	 * @see com.lingzhuo.dao.CustomerDao#selectCusTotal()
	 */
	public List<CustomerEntity> selectCusTotal() {
		// TODO Auto-generated method stub
		Session session =this.getHibernateTemplate().getSessionFactory().openSession();
		Criteria cri=session.createCriteria(CustomerEntity.class);
		
		return null;
	}
	
	
	

}
