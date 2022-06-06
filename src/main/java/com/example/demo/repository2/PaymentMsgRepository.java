package com.example.demo.repository2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.domain2.PaymentMsgEntity;

public interface PaymentMsgRepository extends JpaRepository<PaymentMsgEntity, String> {
	@Query(value = "SELECT * FROM Payment_msg WHERE USERHANDLE = :userLogin and rownum <21", nativeQuery = true)
	List<PaymentMsgEntity> findListMyPayment(@Param("userLogin") String userLogin);

	@Query(value = "SELECT * FROM Payment_msg WHERE USERHANDLE = :userLogin and P_MID =:pmid and rownum <21", nativeQuery = true)
	List<PaymentMsgEntity> findListMyPaymentWithPmid(@Param("userLogin") String userLogin, @Param("pmid") String pmid);

}
