package com.bank.biz;

import com.bank.dao.BankAccountDaoImpl;
import com.bank.model.BankAccount;

/**
 * ʵ��ҵ���߼��ӿ�
 * 
 * @author ��˧
 * 
 */
public class BankBizImpl implements BankBiz {
	BankAccountDaoImpl impl = null;

	@Override
	public BankAccount insertAccount(String name, float balance) {
		impl = new BankAccountDaoImpl();
		BankAccount account = impl.open(name, balance);
		// �ж�
		if (account.getAccno() == 0) {
			System.out.println("����ʧ��");
			return null;
		}
		return account;
	}
}
