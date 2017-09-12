package cn.itcast.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import cn.itcast.entity.CstLinkman;
import cn.itcast.utils.HiberbnateUtils;

public class HibernateDemo01 {
	/*@Test
	public void Save(){
		Session session = HiberbnateUtils.getSession();
		Transaction tx = session.beginTransaction();
		CstLinkman c = new CstLinkman("张三","男","1534725487","174678236487","732476@qq.com","经理","好好干");		
	
		session.save(c);
		tx.commit();
		session.close();
	}*/
	/*@Test
	public void select(){
		Session session = HiberbnateUtils.getSession();
		Transaction tx = session.beginTransaction();
		CstLinkman cstLinkman = session.get(CstLinkman.class, 1l);
		tx.commit();
		session.close();
		System.out.println(cstLinkman);
	
	}*/
	/*@Test
	public void del(){
		Session session = HiberbnateUtils.getSession();
		Transaction tx = session.beginTransaction();
		CstLinkman cstLinkman = session.get(CstLinkman.class, 1l);
		session.delete(cstLinkman);
		tx.commit();
		session.close();
	}*/
	@Test
	public void update(){
		Session session = HiberbnateUtils.getSession();
		Transaction tx = session.beginTransaction();
		CstLinkman cstLinkman = session.get(CstLinkman.class, 1l);
		cstLinkman.setLkmName("hah");
		session.update(cstLinkman);
		tx.commit();
		session.close();
	}
	
	
}
