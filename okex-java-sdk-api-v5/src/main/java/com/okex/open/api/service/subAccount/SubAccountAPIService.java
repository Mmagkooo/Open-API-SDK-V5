package com.okex.open.api.service.subAccount;

import com.alibaba.fastjson.JSONObject;
import com.okex.open.api.bean.subAccount.param.CreateSubAccountApikey;
import com.okex.open.api.bean.subAccount.param.DelSunAccountApikey;
import com.okex.open.api.bean.subAccount.param.ReSetSubAccountApikey;
import com.okex.open.api.bean.subAccount.param.SubAccountTransfer;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface SubAccountAPIService {

    //查看子账户列表 View sub-account list
    JSONObject getSubAccountList(String enable, String subAcct, String after, String before, String limit);

    //获取子账户资产余额 Get Sub-account Balance
    JSONObject getSubAccountBalances(String subAcct);

    //查询子账户转账记录 History of sub-account transfer
    JSONObject getSubAccountBills(String ccy, String type, String subAcct, String after, String before, String limit);

    //子账户间资金划转 Master accounts manage the transfers between sub-accounts
    JSONObject subAccountTransfer(SubAccountTransfer subAccountTransfer);

    //查看被托管的子账户列表 Entrust Subaccount List
    JSONObject getEntrustSubList(String subAcct);
}
