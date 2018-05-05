/**
 * 
 */
package com.lingzhuo.action;

import com.lingzhuo.vo.PageVo;

/**
 * @ClassName: PageAction
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author LHX
 * @date 2017年9月21日 下午9:22:43
 *
 */
public class PageAction {

	private PageVo pagevo;
	public String selectPage(){
		return "success";
		
	}
	public PageVo getPagevo() {
		return pagevo;
	}

	public void setPagevo(PageVo pagevo) {
		this.pagevo = pagevo;
	}
	
}
