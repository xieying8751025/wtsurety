package com.qfang.model.surety;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.http.conn.scheme.Scheme;

import com.qfang.model.Entity;
import com.qfang.model.broker.house.BaseInfo;
import com.qfang.model.dictionary.Building;
import com.qfang.model.dictionary.Garden;
import com.qfang.model.dictionary.Room;
import com.qfang.model.hr.Org;
import com.qfang.model.hr.Person;
import com.qfang.model.surety.enums.BuildingModelEnum;
import com.qfang.model.surety.enums.ChargeAffirmStateEnum;
import com.qfang.model.surety.enums.OrderStateEnum;
import com.qfang.model.surety.enums.RedeemStateEnum;
import com.qfang.model.surety.enums.RejectNodeEnum;
import com.qfang.model.surety.enums.RepaymentEnum;
import com.qfang.model.surety.enums.RepaymentSourceEnum;
import com.qfang.model.surety.enums.ReturnBalanceStateEnum;
import com.qfang.model.surety.enums.ReturnFactorageStateEnum;
import com.qfang.model.surety.enums.ReturnSuretyMoneyStateEnum;
import com.qfang.model.surety.enums.SourceEnum;
import com.qfang.model.surety.enums.SteamAgainStateEnum;
import com.qfang.model.trade.TradeBank;
import com.qfang.model.trade.Transfer;
import com.qfang.model.trade.enums.CustomerPayTypeEnum;

public class Order extends Entity<String> {
	private static final long serialVersionUID = 6345151628186337056L;
	private String ordercode;
	private int isinnerorder;// 是否是内单
	private Transfer assignedorder;// 过户单据（内单才会有）
	private Scheme scheme; // 业务方案
	private Garden garden; // 小区
	private Building building;// 楼栋
	private Room room;// 住房

	private String purpose;// 用途

	private BigDecimal buildarea;// 建筑面积

	private String housecardname;// 房产证名称

	private String housecardcode;// 房产证编号

	private SourceEnum source;// 来源
	private String sourceLinkMan;// 业务来源联系人
	private String sourceLinkPhone;// 业务来源联系人电话

	private BigDecimal totalprice;// 成交总价

	private CustomerPayTypeEnum customerpaytype; // 付款方式（ONCE("一次性付款"),
													// MORTGAGE("按揭付款")）

	private String proposer;// 申请人

	private BigDecimal suretymoney;// 担保金额

	private BigDecimal scheduleredeemfloormoney;// 预定赎楼金额

	private int loandays;// 担保天数

	private BigDecimal receivablesuretycost;// 标准咨询费

	private BigDecimal receivableconsultingcost;// 标准担保费

	private BigDecimal suretycost;// 应收担保费

	private BigDecimal consultingcost;// 应收咨询费

	private BigDecimal handlingcharge;// 手续费

	private BigDecimal receivabletotal;// 应收合计

	private BigDecimal rakebackmoney;// 返佣金额

	private String rakebackaccount;// 返佣账户名

	private String rakebackbankcard;// 返佣银行卡号

	private String rakebackbank;// 返佣开户行

	private TradeBank oldmortgagebank;// 原按揭银行

	private String oldmortgagebankName;// 原按揭银行名字

	private String oldbanklinkman;// 原按揭银行联系人

	private String oldbanklinkmanphone;// 原按揭银行联系人电话

	private BigDecimal oldloanamount;// 原贷款金额

	private String oldBorrower;// 原借款人（多个已、分隔）

	private BigDecimal amountinarear;// 欠款金额

	private TradeBank newmortgagebank;// 新按揭银行

	private String newbanklinkman;// 新按揭银行联系人

	private String newmortgagebankName;// 新按揭银行名称

	private String newbanklinkmanphone;// 新按揭银行联系人电话

	private BigDecimal newloanamount;// 新贷款金额
	private BigDecimal accumulationLoanAmount;// 公积金贷款金额（公积金业务）
												// 新贷款金额+公积金贷款金额=总的新贷款金额

	private TradeBank supervisebank;// 监管银行

	private String supervisebankmanager;// 监管银行客户经理

	private String supervisebankmanagerphone;// 监管银行客户经理电话

	private BigDecimal supervisemoney;// 监管金额

	private String remark;

	private Person customermanager;// 客户经理

	private Person deptmanager;// 部门经理

	private Org businessorg;// 业务部

	private Person areamanager;// 区域总监

	private Org businessteamorg;// 业务团队

	private Org loancenterorg;// 贷款中心

	private Person createby;// 创建人

	private Date createtime;

	private Person lastupdateby;// 最后修改人

	private Date lastupdatetime;// 最后修改日期

	private Date getoldcarddate;// 取旧证日期

	private Date cancelpledgedate;// 注销抵押日期
	private Person cancelpledgeer;// 注销抵押人

	private Date transferownershipdate;// 过户日期
	private Person transferownershiper;// 过户人
	private String returncode;// 过户回执编号

	private Date getnewcarddate;// 取新证日期
	private Person getnewcarder;// 取新证人

	private String newHouseCode;// 新房产证编号

	private Date pledgeregisterdate;// 抵押登记日期
	private Person pledgeregisterer;// 抵押登记人

	private Date pledgeanswerdate;// 抵押答复日期

	private String pledgereturncode;// 抵押登记回执编号

	private Date deblockingdate;// 解保日期

	private SuretyApprove approve;// 当前节点
	private SuretyApprove nextApprove;// 下一审批节点

	private Person chargeaffirmperson;// 收费财务确认人

	private Date chargeaffirmtime;// 收费财务确认时间

	private ChargeAffirmStateEnum chargeaffirmstate;// 收费状态

	private int israkeback;// 是否已返佣

	private RedeemStateEnum redeemstate;// 资金状态

	private Date filedate;// 归档日期

	private Person fileperson;// 归档人

	private DocumentStore store;// 归档地点

	private Person checkreceiveperson;// 待核查受理人
	private Date checkreceivedate;// 待核查受理日期

	private OrderStateEnum currentstate;// 当前业务状态

	private String buyername;// 买方名字（冗余字段，即关系为本人的客户）
	private String sellername;// 卖方名字（冗余字段，即关系为本人的业主）

	// private FundType fundtype;//资金方案
	private String balanceusername;// 收余款户名
	private String balancebankcard;// 收余款账号
	private String balancebank;// 收余款账户开户行
	private TradeBank atonebank;// 出赎楼款银行
	private BigDecimal atonemoney;// 赎楼贷款金额
	private String atonelinkman;// 出赎楼贷款银行联系人
	private String atonelinkphone;// 出赎楼贷款银行联系人电话
	private String buyersuperviseaccount;// 买方监管账户户名
	private String buyersupervisecard;// 买方监管账号
	private String buyersupervisebank;// 买方监管开户行
	private String sellersuperviseaccount;// 卖方监管账户户名
	private String sellersupervisecard;// 卖方监管账号
	private String sellersupervisebank;// 卖方监管开户行
	private String repaymentaccount;// 回款账户户名
	private String repaymentmoney;// 回款金额
	private String repaymentcard;// 回款账号
	private String repaymentbank;// 回款账户开户行
	private RepaymentSourceEnum repaymentSource;// 回款来源
	private int isdelete;// 是否已删除（0是为删除，1为已删除）
	private int isLiability;// 是否承担担保责任（0是为不但责，1为但责）
	private Date atoneDate;// 赎楼日期

	private Date notarizeDate;// 公证日期
	private Person atoneer;// 赎楼员(赎楼成功时维护)
	private Person stagnationPoiner;// 驻点专员(公证时确定)
	private BigDecimal evaluatingPrice;// 评估价（针对于非交易类业务）
	private SteamAgainStateEnum steamAgainState;// 资金回笼状态
	private ChargeAffirmStateEnum overdueState;// 收逾期款状态
	private BaseInfo medium;// 中介公司(baseInfo表中INDUSTRY_MEDIUM类型)
							// 单据业务来源选择了中介时才会维护
	private BaseInfo accumulation;// 公积金银行(baseInfo表中BANK类型)

	private double receiveMoney;// 总到账金额（查询字段）
	private int keepTime;// 计时 即单据停留在当前处理环节的天数（查询字段）
	private EarlyWarning earlyWarning;// 预警设置（查询字段）
	private double ountMoneyCount;// 总出账金额（查询字段）
	private double refundMoney;// 赎楼金额（查询字段）
	private double spareMoney;// 需退款金额
	private double atoneBalance;// 财务确认到账余额（查询字段）
	private String returnState;// 退付状态（查询字段，可能是退余款状态，退手续费状态）
	private String returnBalanceId;// 退付单据Id（查询字段，可能是退余款单ID，退手续费ID)
	private Date printDate;// 打印日期（查询字段）
	private Date chargeOffDate;// 出账日期（查询字段）
	private Date planChargeDate;// 计划出款日期（查询字段）

	private BackLetter backletter;// 制作保函（查询字段)
	private Atone atone;// 赎楼（查询字段)
	private ReturnSuretyMoney returnSurety;// 退担保费（查询字段)

	private String isOldOrder;// 是否是补录的单据（是/否）待删除
	private int isDerive;// 是否为派生单据（只有非派生的内单才能派生新的单据）

	private BuildingModelEnum buildingModelState;// 建模关联,当新增外单选择无建模数据时，
	private RejectNodeEnum rejectNode;// 驳回节点名称
	private String fileKeeperRemark;// 要件保管员 备注
	private RepaymentEnum repaystate;// 还款 类型 ：中行二次 还款 BOC_REPAY

	private int warningOperate; // 跟进操作
	private String warningRemark;// 跟进备注

	private String mediumContact;// 中介联系人
	private String mediumTel;// 中介联系电话
	private String feeDiscountNum;// 担保费打折申请流水号
	private String feeDiscountBill;
	private Date voucherDate;// 交凭证日期

	private FundApply fundApply;

	public FundApply getFundApply() {
		return fundApply;
	}

	public void setFundApply(FundApply fundApply) {
		this.fundApply = fundApply;
	}

	public Date getVoucherDate() {
		return voucherDate;
	}

	public void setVoucherDate(Date voucherDate) {
		this.voucherDate = voucherDate;
	}

	public String getNewmortgagebankName() {
		return newmortgagebankName;
	}

	public void setNewmortgagebankName(String newmortgagebankName) {
		this.newmortgagebankName = newmortgagebankName;
	}

	public String getFeeDiscountBill() {
		return feeDiscountBill;
	}

	public void setFeeDiscountBill(String feeDiscountBill) {
		this.feeDiscountBill = feeDiscountBill;
	}

	public String getFeeDiscountNum() {
		return feeDiscountNum;
	}

	public void setFeeDiscountNum(String feeDiscountNum) {
		this.feeDiscountNum = feeDiscountNum;
	}

	public int getWarningOperate() {
		return warningOperate;
	}

	public void setWarningOperate(int warningOperate) {
		this.warningOperate = warningOperate;
	}

	public String getWarningRemark() {
		return warningRemark;
	}

	public void setWarningRemark(String warningRemark) {
		this.warningRemark = warningRemark;
	}

	private String ip;// 冗余字段

	public RepaymentEnum getRepaystate() {
		return repaystate;
	}

	public void setRepaystate(RepaymentEnum repaystate) {
		this.repaystate = repaystate;
	}

	public Date getChargeOffDate() {
		return chargeOffDate;
	}

	public void setChargeOffDate(Date chargeOffDate) {
		this.chargeOffDate = chargeOffDate;
	}

	public Person getCancelpledgeer() {
		return cancelpledgeer;
	}

	public void setCancelpledgeer(Person cancelpledgeer) {
		this.cancelpledgeer = cancelpledgeer;
	}

	public Person getTransferownershiper() {
		return transferownershiper;
	}

	public void setTransferownershiper(Person transferownershiper) {
		this.transferownershiper = transferownershiper;
	}

	public Person getGetnewcarder() {
		return getnewcarder;
	}

	public void setGetnewcarder(Person getnewcarder) {
		this.getnewcarder = getnewcarder;
	}

	public Person getPledgeregisterer() {
		return pledgeregisterer;
	}

	public void setPledgeregisterer(Person pledgeregisterer) {
		this.pledgeregisterer = pledgeregisterer;
	}

	public RepaymentSourceEnum getRepaymentSource() {
		return repaymentSource;
	}

	public String getRepaymentSourceDesc() {
		if (repaymentSource != null) {
			return repaymentSource.getDesc();
		}
		return "";
	}

	public void setRepaymentSource(RepaymentSourceEnum repaymentSource) {
		this.repaymentSource = repaymentSource;
	}

	public String getOldmortgagebankName() {
		return oldmortgagebankName;
	}

	public void setOldmortgagebankName(String oldmortgagebankName) {
		this.oldmortgagebankName = oldmortgagebankName;
	}

	public int getIsDerive() {
		return isDerive;
	}

	public void setIsDerive(int isDerive) {
		this.isDerive = isDerive;
	}

	public String getIsOldOrder() {
		return isOldOrder;
	}

	public void setIsOldOrder(String isOldOrder) {
		this.isOldOrder = isOldOrder;
	}

	public Date getAtoneDate() {
		return atoneDate;
	}

	public void setAtoneDate(Date atoneDate) {
		this.atoneDate = atoneDate;
	}

	public ReturnSuretyMoney getReturnSurety() {
		return returnSurety;
	}

	public void setReturnSurety(ReturnSuretyMoney returnSurety) {
		this.returnSurety = returnSurety;
	}

	public BaseInfo getAccumulation() {
		return accumulation;
	}

	public void setAccumulation(BaseInfo accumulation) {
		this.accumulation = accumulation;
	}

	public Date getPrintDate() {
		return printDate;
	}

	public void setPrintDate(Date printDate) {
		this.printDate = printDate;
	}

	public BaseInfo getMedium() {
		return medium;
	}

	public void setMedium(BaseInfo medium) {
		this.medium = medium;
	}

	public int getIsLiability() {
		return isLiability;
	}

	public void setIsLiability(int isLiability) {
		this.isLiability = isLiability;
	}

	public int getKeepTime() {
		return keepTime;
	}

	public void setKeepTime(int keepTime) {
		this.keepTime = keepTime;
	}

	public EarlyWarning getEarlyWarning() {
		return earlyWarning;
	}

	public void setEarlyWarning(EarlyWarning earlyWarning) {
		this.earlyWarning = earlyWarning;
	}

	public double getAtoneBalance() {
		return atoneBalance;
	}

	public void setAtoneBalance(double atoneBalance) {
		this.atoneBalance = atoneBalance;
	}

	public double getReceiveMoney() {
		return receiveMoney;
	}

	public void setReceiveMoney(double receiveMoney) {
		this.receiveMoney = receiveMoney;
	}

	public String getOverdueStateDesc() {
		if (overdueState != null) {
			return overdueState.getDesc();
		}
		return "";
	}

	public ChargeAffirmStateEnum getOverdueState() {
		return overdueState;
	}

	public void setOverdueState(ChargeAffirmStateEnum overdueState) {
		this.overdueState = overdueState;
	}

	public SteamAgainStateEnum getSteamAgainState() {
		return steamAgainState;
	}

	public String getSteamAgainStateDesc() {
		if (steamAgainState != null) {
			return steamAgainState.getDesc();
		}
		return "";
	}

	public void setSteamAgainState(SteamAgainStateEnum steamAgainState) {
		this.steamAgainState = steamAgainState;
	}

	public String getNewHouseCode() {
		return newHouseCode;
	}

	public void setNewHouseCode(String newHouseCode) {
		this.newHouseCode = newHouseCode;
	}

	public Atone getAtone() {
		return atone;
	}

	public void setAtone(Atone atone) {
		this.atone = atone;
	}

	public BackLetter getBackletter() {
		return backletter;
	}

	public void setBackletter(BackLetter backletter) {
		this.backletter = backletter;
	}

	public BigDecimal getAccumulationLoanAmount() {
		return accumulationLoanAmount;
	}

	public void setAccumulationLoanAmount(BigDecimal accumulationLoanAmount) {
		this.accumulationLoanAmount = accumulationLoanAmount;
	}

	public SuretyApprove getNextApprove() {
		return nextApprove;
	}

	public void setNextApprove(SuretyApprove nextApprove) {
		this.nextApprove = nextApprove;
	}

	public String getReturnState() {
		return returnState;
	}

	public void setReturnState(String returnState) {
		this.returnState = returnState;
	}

	public String getReturnBalanceId() {
		return returnBalanceId;
	}

	public void setReturnBalanceId(String returnBalanceId) {
		this.returnBalanceId = returnBalanceId;
	}

	public double getOuntMoneyCount() {
		return ountMoneyCount;
	}

	public void setOuntMoneyCount(double ountMoneyCount) {
		this.ountMoneyCount = ountMoneyCount;
	}

	public double getRefundMoney() {
		return refundMoney;
	}

	public void setRefundMoney(double refundMoney) {
		this.refundMoney = refundMoney;
	}

	public double getSpareMoney() {
		return spareMoney;
	}

	public void setSpareMoney(double spareMoney) {
		this.spareMoney = spareMoney;
	}

	public Date getNotarizeDate() {
		return notarizeDate;
	}

	public void setNotarizeDate(Date notarizeDate) {
		this.notarizeDate = notarizeDate;
	}

	public Person getAtoneer() {
		return atoneer;
	}

	public void setAtoneer(Person atoneer) {
		this.atoneer = atoneer;
	}

	public Person getStagnationPoiner() {
		return stagnationPoiner;
	}

	public void setStagnationPoiner(Person stagnationPoiner) {
		this.stagnationPoiner = stagnationPoiner;
	}

	public int getIsdelete() {
		return isdelete;
	}

	public void setIsdelete(int isdelete) {
		this.isdelete = isdelete;
	}

	public String getBalanceusername() {
		return balanceusername;
	}

	public void setBalanceusername(String balanceusername) {
		this.balanceusername = balanceusername;
	}

	public String getBalancebankcard() {
		return balancebankcard;
	}

	public void setBalancebankcard(String balancebankcard) {
		this.balancebankcard = balancebankcard;
	}

	public String getBalancebank() {
		return balancebank;
	}

	public void setBalancebank(String balancebank) {
		this.balancebank = balancebank;
	}

	public String getOldBorrower() {
		return oldBorrower;
	}

	public void setOldBorrower(String oldBorrower) {
		this.oldBorrower = oldBorrower;
	}

	public TradeBank getAtonebank() {
		return atonebank;
	}

	public void setAtonebank(TradeBank atonebank) {
		this.atonebank = atonebank;
	}

	public BigDecimal getAtonemoney() {
		return atonemoney;
	}

	public void setAtonemoney(BigDecimal atonemoney) {
		this.atonemoney = atonemoney;
	}

	public String getAtonelinkman() {
		return atonelinkman;
	}

	public void setAtonelinkman(String atonelinkman) {
		this.atonelinkman = atonelinkman;
	}

	public String getAtonelinkphone() {
		return atonelinkphone;
	}

	public void setAtonelinkphone(String atonelinkphone) {
		this.atonelinkphone = atonelinkphone;
	}

	public String getBuyersuperviseaccount() {
		return buyersuperviseaccount;
	}

	public void setBuyersuperviseaccount(String buyersuperviseaccount) {
		this.buyersuperviseaccount = buyersuperviseaccount;
	}

	public String getBuyersupervisecard() {
		return buyersupervisecard;
	}

	public void setBuyersupervisecard(String buyersupervisecard) {
		this.buyersupervisecard = buyersupervisecard;
	}

	public String getBuyersupervisebank() {
		return buyersupervisebank;
	}

	public void setBuyersupervisebank(String buyersupervisebank) {
		this.buyersupervisebank = buyersupervisebank;
	}

	public String getSellersuperviseaccount() {
		return sellersuperviseaccount;
	}

	public void setSellersuperviseaccount(String sellersuperviseaccount) {
		this.sellersuperviseaccount = sellersuperviseaccount;
	}

	public String getSellersupervisecard() {
		return sellersupervisecard;
	}

	public void setSellersupervisecard(String sellersupervisecard) {
		this.sellersupervisecard = sellersupervisecard;
	}

	public String getSellersupervisebank() {
		return sellersupervisebank;
	}

	public void setSellersupervisebank(String sellersupervisebank) {
		this.sellersupervisebank = sellersupervisebank;
	}

	public String getRepaymentaccount() {
		return repaymentaccount;
	}

	public void setRepaymentaccount(String repaymentaccount) {
		this.repaymentaccount = repaymentaccount;
	}

	public String getRepaymentmoney() {
		return repaymentmoney;
	}

	public void setRepaymentmoney(String repaymentmoney) {
		this.repaymentmoney = repaymentmoney;
	}

	public String getRepaymentcard() {
		return repaymentcard;
	}

	public void setRepaymentcard(String repaymentcard) {
		this.repaymentcard = repaymentcard;
	}

	public String getRepaymentbank() {
		return repaymentbank;
	}

	public void setRepaymentbank(String repaymentbank) {
		this.repaymentbank = repaymentbank;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getBuyername() {
		return buyername;
	}

	public void setBuyername(String buyername) {
		this.buyername = buyername;
	}

	public String getSellername() {
		return sellername;
	}

	public void setSellername(String sellername) {
		this.sellername = sellername;
	}

	public String getOrdercode() {
		return ordercode;
	}

	public void setOrdercode(String ordercode) {
		this.ordercode = ordercode;
	}

	public int getIsinnerorder() {
		return isinnerorder;
	}

	public void setIsinnerorder(int isinnerorder) {
		this.isinnerorder = isinnerorder;
	}

	public Transfer getAssignedorder() {
		return assignedorder;
	}

	public void setAssignedorder(Transfer assignedorder) {
		this.assignedorder = assignedorder;
	}

	public Scheme getScheme() {
		return scheme;
	}

	public void setScheme(Scheme scheme) {
		this.scheme = scheme;
	}

	public Garden getGarden() {
		return garden;
	}

	public void setGarden(Garden garden) {
		this.garden = garden;
	}

	public Building getBuilding() {
		return building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public BigDecimal getBuildarea() {
		return buildarea;
	}

	public void setBuildarea(BigDecimal buildarea) {
		this.buildarea = buildarea;
	}

	public String getHousecardname() {
		return housecardname;
	}

	public void setHousecardname(String housecardname) {
		this.housecardname = housecardname;
	}

	public String getHousecardcode() {
		return housecardcode;
	}

	public void setHousecardcode(String housecardcode) {
		this.housecardcode = housecardcode;
	}

	public SourceEnum getSource() {
		return source;
	}

	public void setSource(SourceEnum source) {
		this.source = source;
	}

	public BigDecimal getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(BigDecimal totalprice) {
		this.totalprice = totalprice;
	}

	public CustomerPayTypeEnum getCustomerpaytype() {
		return customerpaytype;
	}

	public void setCustomerpaytype(CustomerPayTypeEnum customerpaytype) {
		this.customerpaytype = customerpaytype;
	}

	public String getProposer() {
		return proposer;
	}

	public void setProposer(String proposer) {
		this.proposer = proposer;
	}

	public BigDecimal getSuretymoney() {
		return suretymoney;
	}

	public void setSuretymoney(BigDecimal suretymoney) {
		this.suretymoney = suretymoney;
	}

	public BigDecimal getScheduleredeemfloormoney() {
		return scheduleredeemfloormoney;
	}

	public void setScheduleredeemfloormoney(BigDecimal scheduleredeemfloormoney) {
		this.scheduleredeemfloormoney = scheduleredeemfloormoney;
	}

	public int getLoandays() {
		return loandays;
	}

	public void setLoandays(int loandays) {
		this.loandays = loandays;
	}

	public BigDecimal getReceivablesuretycost() {
		return receivablesuretycost;
	}

	public void setReceivablesuretycost(BigDecimal receivablesuretycost) {
		this.receivablesuretycost = receivablesuretycost;
	}

	public BigDecimal getReceivableconsultingcost() {
		return receivableconsultingcost;
	}

	public void setReceivableconsultingcost(BigDecimal receivableconsultingcost) {
		this.receivableconsultingcost = receivableconsultingcost;
	}

	public BigDecimal getSuretycost() {
		return suretycost;
	}

	public void setSuretycost(BigDecimal suretycost) {
		this.suretycost = suretycost;
	}

	public BigDecimal getConsultingcost() {
		return consultingcost;
	}

	public void setConsultingcost(BigDecimal consultingcost) {
		this.consultingcost = consultingcost;
	}

	public BigDecimal getHandlingcharge() {
		return handlingcharge;
	}

	public void setHandlingcharge(BigDecimal handlingcharge) {
		this.handlingcharge = handlingcharge;
	}

	public BigDecimal getReceivabletotal() {
		return receivabletotal;
	}

	public void setReceivabletotal(BigDecimal receivabletotal) {
		this.receivabletotal = receivabletotal;
	}

	public BigDecimal getRakebackmoney() {
		return rakebackmoney;
	}

	public void setRakebackmoney(BigDecimal rakebackmoney) {
		this.rakebackmoney = rakebackmoney;
	}

	public String getRakebackaccount() {
		return rakebackaccount;
	}

	public void setRakebackaccount(String rakebackaccount) {
		this.rakebackaccount = rakebackaccount;
	}

	public String getRakebackbankcard() {
		return rakebackbankcard;
	}

	public void setRakebackbankcard(String rakebackbankcard) {
		this.rakebackbankcard = rakebackbankcard;
	}

	public String getRakebackbank() {
		return rakebackbank;
	}

	public void setRakebackbank(String rakebackbank) {
		this.rakebackbank = rakebackbank;
	}

	public TradeBank getOldmortgagebank() {
		return oldmortgagebank;
	}

	public void setOldmortgagebank(TradeBank oldmortgagebank) {
		this.oldmortgagebank = oldmortgagebank;
	}

	public String getOldbanklinkman() {
		return oldbanklinkman;
	}

	public void setOldbanklinkman(String oldbanklinkman) {
		this.oldbanklinkman = oldbanklinkman;
	}

	public String getOldbanklinkmanphone() {
		return oldbanklinkmanphone;
	}

	public void setOldbanklinkmanphone(String oldbanklinkmanphone) {
		this.oldbanklinkmanphone = oldbanklinkmanphone;
	}

	public BigDecimal getOldloanamount() {
		return oldloanamount;
	}

	public void setOldloanamount(BigDecimal oldloanamount) {
		this.oldloanamount = oldloanamount;
	}

	public BigDecimal getAmountinarear() {
		return amountinarear;
	}

	public void setAmountinarear(BigDecimal amountinarear) {
		this.amountinarear = amountinarear;
	}

	public TradeBank getNewmortgagebank() {
		return newmortgagebank;
	}

	public void setNewmortgagebank(TradeBank newmortgagebank) {
		this.newmortgagebank = newmortgagebank;
	}

	public String getNewbanklinkman() {
		return newbanklinkman;
	}

	public void setNewbanklinkman(String newbanklinkman) {
		this.newbanklinkman = newbanklinkman;
	}

	public String getNewbanklinkmanphone() {
		return newbanklinkmanphone;
	}

	public void setNewbanklinkmanphone(String newbanklinkmanphone) {
		this.newbanklinkmanphone = newbanklinkmanphone;
	}

	public BigDecimal getNewloanamount() {
		return newloanamount;
	}

	public void setNewloanamount(BigDecimal newloanamount) {
		this.newloanamount = newloanamount;
	}

	public TradeBank getSupervisebank() {
		return supervisebank;
	}

	public void setSupervisebank(TradeBank supervisebank) {
		this.supervisebank = supervisebank;
	}

	public String getSupervisebankmanager() {
		return supervisebankmanager;
	}

	public void setSupervisebankmanager(String supervisebankmanager) {
		this.supervisebankmanager = supervisebankmanager;
	}

	public String getSupervisebankmanagerphone() {
		return supervisebankmanagerphone;
	}

	public void setSupervisebankmanagerphone(String supervisebankmanagerphone) {
		this.supervisebankmanagerphone = supervisebankmanagerphone;
	}

	public BigDecimal getSupervisemoney() {
		return supervisemoney;
	}

	public void setSupervisemoney(BigDecimal supervisemoney) {
		this.supervisemoney = supervisemoney;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Person getCustomermanager() {
		return customermanager;
	}

	public void setCustomermanager(Person customermanager) {
		this.customermanager = customermanager;
	}

	public Person getDeptmanager() {
		return deptmanager;
	}

	public void setDeptmanager(Person deptmanager) {
		this.deptmanager = deptmanager;
	}

	public Org getBusinessorg() {
		return businessorg;
	}

	public void setBusinessorg(Org businessorg) {
		this.businessorg = businessorg;
	}

	public Person getAreamanager() {
		return areamanager;
	}

	public void setAreamanager(Person areamanager) {
		this.areamanager = areamanager;
	}

	public Org getBusinessteamorg() {
		return businessteamorg;
	}

	public void setBusinessteamorg(Org businessteamorg) {
		this.businessteamorg = businessteamorg;
	}

	public Org getLoancenterorg() {
		return loancenterorg;
	}

	public void setLoancenterorg(Org loancenterorg) {
		this.loancenterorg = loancenterorg;
	}

	public Person getCreateby() {
		return createby;
	}

	public void setCreateby(Person createby) {
		this.createby = createby;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Person getLastupdateby() {
		return lastupdateby;
	}

	public void setLastupdateby(Person lastupdateby) {
		this.lastupdateby = lastupdateby;
	}

	public Date getLastupdatetime() {
		return lastupdatetime;
	}

	public void setLastupdatetime(Date lastupdatetime) {
		this.lastupdatetime = lastupdatetime;
	}

	public Date getGetoldcarddate() {
		return getoldcarddate;
	}

	public void setGetoldcarddate(Date getoldcarddate) {
		this.getoldcarddate = getoldcarddate;
	}

	public Date getCancelpledgedate() {
		return cancelpledgedate;
	}

	public void setCancelpledgedate(Date cancelpledgedate) {
		this.cancelpledgedate = cancelpledgedate;
	}

	public Date getTransferownershipdate() {
		return transferownershipdate;
	}

	public void setTransferownershipdate(Date transferownershipdate) {
		this.transferownershipdate = transferownershipdate;
	}

	public String getReturncode() {
		return returncode;
	}

	public void setReturncode(String returncode) {
		this.returncode = returncode;
	}

	public Date getGetnewcarddate() {
		return getnewcarddate;
	}

	public void setGetnewcarddate(Date getnewcarddate) {
		this.getnewcarddate = getnewcarddate;
	}

	public Date getPledgeregisterdate() {
		return pledgeregisterdate;
	}

	public void setPledgeregisterdate(Date pledgeregisterdate) {
		this.pledgeregisterdate = pledgeregisterdate;
	}

	public Date getPledgeanswerdate() {
		return pledgeanswerdate;
	}

	public void setPledgeanswerdate(Date pledgeanswerdate) {
		this.pledgeanswerdate = pledgeanswerdate;
	}

	public String getPledgereturncode() {
		return pledgereturncode;
	}

	public void setPledgereturncode(String pledgereturncode) {
		this.pledgereturncode = pledgereturncode;
	}

	public Date getDeblockingdate() {
		return deblockingdate;
	}

	public void setDeblockingdate(Date deblockingdate) {
		this.deblockingdate = deblockingdate;
	}

	public SuretyApprove getApprove() {
		return approve;
	}

	public void setApprove(SuretyApprove approve) {
		this.approve = approve;
	}

	public Person getChargeaffirmperson() {
		return chargeaffirmperson;
	}

	public void setChargeaffirmperson(Person chargeaffirmperson) {
		this.chargeaffirmperson = chargeaffirmperson;
	}

	public Date getChargeaffirmtime() {
		return chargeaffirmtime;
	}

	public void setChargeaffirmtime(Date chargeaffirmtime) {
		this.chargeaffirmtime = chargeaffirmtime;
	}

	public ChargeAffirmStateEnum getChargeaffirmstate() {
		return chargeaffirmstate;
	}

	public void setChargeaffirmstate(ChargeAffirmStateEnum chargeaffirmstate) {
		this.chargeaffirmstate = chargeaffirmstate;
	}

	public int getIsrakeback() {
		return israkeback;
	}

	public void setIsrakeback(int israkeback) {
		this.israkeback = israkeback;
	}

	public RedeemStateEnum getRedeemstate() {
		return redeemstate;
	}

	public void setRedeemstate(RedeemStateEnum redeemstate) {
		this.redeemstate = redeemstate;
	}

	public Date getFiledate() {
		return filedate;
	}

	public void setFiledate(Date filedate) {
		this.filedate = filedate;
	}

	public Person getFileperson() {
		return fileperson;
	}

	public void setFileperson(Person fileperson) {
		this.fileperson = fileperson;
	}

	public DocumentStore getStore() {
		return store;
	}

	public void setStore(DocumentStore store) {
		this.store = store;
	}

	public Person getCheckreceiveperson() {
		return checkreceiveperson;
	}

	public void setCheckreceiveperson(Person checkreceiveperson) {
		this.checkreceiveperson = checkreceiveperson;
	}

	public Date getCheckreceivedate() {
		return checkreceivedate;
	}

	public void setCheckreceivedate(Date checkreceivedate) {
		this.checkreceivedate = checkreceivedate;
	}

	public OrderStateEnum getCurrentstate() {
		return currentstate;
	}

	public void setCurrentstate(OrderStateEnum currentstate) {
		this.currentstate = currentstate;
	}

	public String getChargeaffirmstateDesc() {
		return this.chargeaffirmstate == null ? "" : chargeaffirmstate
				.getDesc();
	}

	public String getCurrentstateDesc() {
		return this.currentstate == null ? "" : this.currentstate.getDesc();
	}

	public String getredeemstateDesc() {
		return this.redeemstate == null ? "" : this.redeemstate.getDesc();
	}

	public String getsourceDesc() {
		return this.source == null ? "" : this.source.getDesc();
	}

	public String getReturnStateDesc() {
		try {
			return this.returnState == null ? "" : ReturnBalanceStateEnum
					.valueOf(returnState).getDesc();
		} catch (IllegalArgumentException ex) {
			ex.printStackTrace();
			try {
				return this.returnState == null ? "" : ReturnFactorageStateEnum
						.valueOf(returnState).getDesc();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
				return this.returnState == null ? ""
						: ReturnSuretyMoneyStateEnum.valueOf(returnState)
								.getDesc();
			}
		}
	}

	public String getSourceLinkMan() {
		return sourceLinkMan;
	}

	public void setSourceLinkMan(String sourceLinkMan) {
		this.sourceLinkMan = sourceLinkMan;
	}

	public String getSourceLinkPhone() {
		return sourceLinkPhone;
	}

	public void setSourceLinkPhone(String sourceLinkPhone) {
		this.sourceLinkPhone = sourceLinkPhone;
	}

	public BigDecimal getEvaluatingPrice() {
		return evaluatingPrice;
	}

	public void setEvaluatingPrice(BigDecimal evaluatingPrice) {
		this.evaluatingPrice = evaluatingPrice;
	}

	public BuildingModelEnum getBuildingModelState() {
		return buildingModelState;
	}

	public void setBuildingModelState(BuildingModelEnum buildingModelState) {
		this.buildingModelState = buildingModelState;
	}

	public RejectNodeEnum getRejectNode() {
		return rejectNode;
	}

	public void setRejectNode(RejectNodeEnum rejectNode) {
		this.rejectNode = rejectNode;
	}

	public String getFileKeeperRemark() {
		return fileKeeperRemark;
	}

	public void setFileKeeperRemark(String fileKeeperRemark) {
		this.fileKeeperRemark = fileKeeperRemark;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Date getPlanChargeDate() {
		return planChargeDate;
	}

	public void setPlanChargeDate(Date planChargeDate) {
		this.planChargeDate = planChargeDate;
	}

	public String getMediumContact() {
		return mediumContact;
	}

	public void setMediumContact(String mediumContact) {
		this.mediumContact = mediumContact;
	}

	public String getMediumTel() {
		return mediumTel;
	}

	public void setMediumTel(String mediumTel) {
		this.mediumTel = mediumTel;
	}
}
