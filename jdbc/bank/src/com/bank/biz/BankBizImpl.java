package com.bank.biz;

import com.bank.dao.BankAccountDaoImpl;
import com.bank.model.BankAccount;

/**
 * 实现业务逻辑接口
 * 
 * @author 朱帅
 * 
 */
public class BankBizImpl implements BankBiz {
	BankAccountDaoImpl impl = null;

	@Override
	public BankAccount insertAccount(String name, float balance) {
		impl = new BankAccountDaoImpl();
		BankAccount account = impl.open(name, balance);
		// 判断
		if (account.getAccno() == 0) {
			System.out.println("开户失败");
			return null;
		}
		return account;
	}
}
