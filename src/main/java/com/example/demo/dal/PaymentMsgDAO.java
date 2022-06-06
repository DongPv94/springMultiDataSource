//package com.example.demo.dal;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
//import javax.transaction.Transactional;
//
//import org.apache.commons.lang3.StringUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.example.demo.domain.PaymentMsgEntity;
//import com.example.demo.repository.PaymentMsgRepository;
//
//public class PaymentMsgDAO {
//	@PersistenceContext
//	private EntityManager em;
//	
//	@Autowired
//	private PaymentMsgRepository pmntService;
//	
//	@SuppressWarnings("unchecked")
//	@Transactional
//	public List<PaymentMsgEntity> findListMyPayment(String userLogin, String pmid) {
//		final StringBuilder SQL = new StringBuilder()
//				.append("Select * from Payment_msg where USERHANDLE=:userLogin \r\n");
//		if (StringUtils.isNotBlank(pmid)) {
//			SQL.append("and P_MID =:pmid \r\n");
//		}
//		SQL.append("and rownum <20");
//		final Query nativeQuery = this.em.createNativeQuery(SQL.toString(), PaymentMsgEntity.class);
//		nativeQuery.setParameter("userLogin", userLogin);
//		if (!StringUtils.isBlank(pmid)) {
//			nativeQuery.setParameter("pmid", pmid);
//		}
//		return nativeQuery.getResultList();
//	}
//}
