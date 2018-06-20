package com.xs.service.deskbill;

import java.util.Date;
import java.util.List;

import com.xs.dao.bill.DeskBillMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xs.pojo.BillSummary;
import com.xs.pojo.BillSummaryPager;
import com.xs.pojo.DeskBillPager;
import com.xs.pojo.DeskInfo_detail;
import com.xs.pojo.Deskbill;
@Service
public class DeskBillServiceImpl implements DeskBillService {
	@Autowired
	private DeskBillMapper deskBillMappler;
	@Override
	public int addDeskBill(Deskbill deskBill) {
		return deskBillMappler.addDeskBill(deskBill);
	}
	@Override
	public int addDeskBillDetail(DeskInfo_detail deskInfo_detail) {
		// TODO Auto-generated method stub
		return deskBillMappler.addDeskBillDetail(deskInfo_detail);
	}
	@Override
	public List<Deskbill> getDekBills(DeskBillPager pager) {
		// TODO Auto-generated method stub
		return deskBillMappler.getDekBills(pager);
	}
	@Override
	public List<DeskInfo_detail> getDeskInfo_detailByDeskBillId(int id) {
		// TODO Auto-generated method stub
		return deskBillMappler.getDeskInfo_detailByDeskBillId(id);
	}
	@Override
	public List<BillSummary> getBillSummarys(BillSummaryPager pager) {
		// TODO Auto-generated method stub
		return deskBillMappler.getBillSummarys(pager);
	}
	@Override
	public int getCount(Date date) {
		// TODO Auto-generated method stub
		return deskBillMappler.getCount(date);
	}
	@Override
	public int getBillSummaryCount(BillSummaryPager pager) {
		// TODO Auto-generated method stub
		return deskBillMappler.getBillSummaryCount(pager);
	}
	/**
	 * 让销售数目自增1
	 */
	@Override
	public int sellDrink(String drinkBillCode,int count){
		return deskBillMappler.sellDrink(drinkBillCode,count);
	}

}
