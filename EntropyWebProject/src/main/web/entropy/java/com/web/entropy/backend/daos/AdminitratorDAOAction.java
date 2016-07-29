package com.web.entropy.backend.daos;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository("adminitratorDAO")
public class AdminitratorDAOAction implements AdminitratorDAO {
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public boolean checkAdminitratorLogin(String adminitratorAccount, String adminitratorPassword) {
		Session session = getSession();
		String sql_query = "FROM adminitrator AS admin WHERE admin.adminitrator_account=? AND admin.adminitrator_password=?";
		Query query = session.createQuery(sql_query);
		query.setParameter(1, adminitratorAccount);
		query.setParameter(2, adminitratorPassword);
		@SuppressWarnings("unchecked")
		List<Query> listQuery = query.list();
		if ((listQuery != null) && (listQuery.size() > 0)) {
			return true;
		} else {
			return false;
		}
	}

}
