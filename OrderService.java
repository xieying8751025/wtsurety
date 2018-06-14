package com.shihua.service.surety;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.qfang.common.page.Pagination;
import com.qfang.model.hr.Person;
import com.shihua.model.surety.Charge;
import com.shihua.model.surety.Order;
import com.shihua.model.surety.SuretyApprove;
import com.shihua.model.surety.enums.NodeEnum;
import com.shihua.service.common.BaseService;

public interface OrderService extends BaseService {
	public List<Order> getList(Map<String, Object> params);

	public void update(Order obj);

	public void insert(Order obj);

	public void deleteById(String id, Map<String, Object> params);

	public Order getById(String id);

	/**
	 * 模糊查询
	 * */
	public List<Map> getListByKey(Map<String, Object> params);

	/**
	 * 得到待审批的数量
	 * */
	public Map getCount(Map<String, Object> params);

	public void setDeleteState(Order obj);

	public Map<String, Object> save(Order order, String saveType, Person createBy, String ownerArr, String clientArr,String guaranteeArr,Person currentPerson,
			Charge charge);
	
	public Map<String,String> submitApply(Order order,Person currentUser);

	/**
	 * 委托公证
	 * 
	 * @param obj
	 */
	public void notarizeById(Order obj);

	/**
	 * 修改单据状态和审批节点
	 * 
	 * @param order单据
	 * @param app审批节点
	 * @return
	 */
	public Map<String, Object> updateOrderState(Order order, SuretyApprove app);

	/**
	 * 1.如果是按揭付款则取已抵押登记的数据，20000以上的需要过了答复日期才能退余款，20000以下的只要抵押登记已完毕即可。
	 * 2.如果是一次性付款则取已过户的数据 3.所能退的余款必须是已财务审核的
	 * 
	 * @param pagination
	 * @param params
	 * @return
	 */
	public Pagination<Order> getReturnBalance(Pagination pagination, Map<String, Object> params);

	/**
	 * 单据审批
	 * 
	 * @param order
	 *            担保单 （本接口只维护单据的已操作节点及下一节点2个字段）
	 * @param remark
	 *            审批意见
	 * @param person
	 *            当前登录人
	 * @param isPasss
	 *            是否审批通过
	 * @param backNode
	 *            需要打回到某个节点（如果是审批不通过，且打回节点为空 则相当于流程结束）
	 * @throws RuntimeException
	 */
	public void orderApprove(Order order, String remark, Person person, boolean isPasss, NodeEnum backNode, Date date)
			throws RuntimeException;

	/**
	 * 分页查询担保单据
	 * 
	 * @param pagination
	 * @param params
	 * @return
	 */
	public Pagination<Order> getOrderPage(Pagination pagination, Map<String, Object> params);

	/**
	 * 退手续费
	 * 
	 * @param pagination
	 * @param params
	 * @return
	 */
	public Pagination<Map<String, Object>> getReturnFactorage(Pagination pagination, Map<String, Object> params);

	/**
	 * 只修改单据资金状态
	 * 
	 * @param obj
	 */
	public void updateRedeemState(Order obj);

	/**
	 * 退担保费
	 * 
	 * @param pagination
	 * @param params
	 * @return
	 */
	public Pagination<Order> getReturnSuretyMoney(Pagination pagination, Map<String, Object> params);

	/**
	 * 查询某个处理节点的单据量
	 * 
	 * @param params
	 * @return
	 */
	public int getOrderCountByNode(Map<String, Object> params);

	/**
	 * 只修改单据状态
	 * 
	 * @param obj
	 */
	public void updateState(Order obj);

	/**
	 * 单据审批
	 * 
	 * @param order
	 *            担保单 （本接口只维护单据的已操作节点及下一节点2个字段）
	 * @param remark
	 *            审批意见
	 * @param person
	 *            当前登录人
	 * @param isPasss
	 *            是否审批通过
	 * @param backNode
	 *            需要打回到某个节点（如果是审批不通过，且打回节点为空 则相当于流程结束）
	 * @param removeNodes
	 *            打回的节点中需要排除掉的节点
	 * @throws RuntimeException
	 */
	@Transactional
	public void orderApprove(Order order, String remark, Person person, boolean isPasss, NodeEnum backNode, List<NodeEnum> removeNodes,
			Date date) throws RuntimeException;

	/**
	 * 驳回到发起人
	 * 
	 **/
	public Map<String, Object> rejectSubmit(String orderId, Person person, String remark);

	/**
	 * 针对 赎楼后跟进 几步， 添加修改功能 需要处理关联的内单
	 * 
	 * @param order
	 *            担保单
	 * @param approveId
	 *            需要修改的审核节点
	 * @param person
	 *            当前修改人，
	 * @param remark
	 *            备注内容
	 */
	public void updateApproveNode(Order order, String approveId, Person person, String remark, Date date, Map<String, Object> logParams);

	public Map<String, Object> updateBuildModelState(Order order);

	public Pagination<Order> findOrder4NodeStatics(Pagination pagination, Map<String, Object> params);

	/**
	 * 判断当前 通过节点是否是 待 审批的
	 * 
	 * @param id
	 * @param passNode
	 * @return
	 */
	public boolean isNeedPassNode(String id, NodeEnum passNode);

	/**
	 * 如果退余款记录 ，在未发起或打回的状态，不能有新增修改 删除 操作
	 * 
	 * @param id
	 * @return
	 */
	public Map<String, Object> getRBStateByOrderId(String id);

	/**
	 * 验证是否可以更新 到账出账赎楼 信息， 如果已发起余款发起申请 ， 就不能修改信息
	 * 
	 * @param orderId
	 */
	public void validUpdateInOutAtone4RB(String orderId);

	/**
	 * 修改 担保经办人
	 * 
	 * @param order
	 */
	public void updateCustomerManager(Order order);

	// 更新资金状态
	public Map<String, Object> updateOrder4Redeem(Order order, Person currentPerson);

	/**
	 * 查询 预警 列表
	 * 
	 * @param pagination
	 * @param params
	 * @return
	 */
	public Pagination<Order> findEarlyWarningList(Pagination pagination, Map<String, Object> params);

	/**
	 * 
	 */
	public Map<String, Object> cancelCapitalConfirm(String orderId);

	public String getOutAccountDate(String id);

	/**
	 * 根据OrderId 获取最新的查档记录
	 * 
	 * @param id
	 * @return
	 */
	public Map getExamineByOrderId(String id);

	/**
	 * 审批流程
	 * 
	 * @param order
	 * @param node
	 * @param person
	 * @param params
	 * @return
	 */
	public Map<String, Object> doBizNodeAppprove(Order order, NodeEnum node, Person person, String isPass, Map<String, String> params);

	/**
	 * 审批流程
	 * 
	 * @param order
	 * @param node
	 * @param person
	 * @param paramMap
	 * @return
	 */
	public Map<String, Object> doBizNodeAppprove(Order order, NodeEnum node, Person person, Map<String, String> paramMap);

	/**
	 * 
	 * @Description
	 * @author zhongyongbo
	 * @date 2014-6-19 上午10:23:45
	 * @version V1.0
	 */
	public List<Map<String, Object>> getPeronsInfo(Map<String, Object> param);

	/**
	 * 保后监管 解保页签 查询合计
	 * 
	 * @Description
	 * @author zhongyongbo
	 * @date 2014-6-20 下午04:17:51
	 * @version V1.0
	 */
	public List<Order> query4RELIEVE(Map<String, String> params);

	/**
	 * 保后监管 解保页签 查询列表数据
	 * 
	 * @Description
	 * @author zhongyongbo
	 * @date 2014-6-20 下午04:18:50
	 * @version V1.0
	 */
	public Pagination<Order> query4RELIEVE(Pagination<Order> pagination, Map<String, String> params);

	/**
	 * 保后监管 非解保页签 查询列表数据
	 * 
	 * @Description
	 * @author zhongyongbo
	 * @date 2014-6-20 下午04:18:50
	 * @version V1.0
	 */
	public List<Order> queryAfterSupervise(Map<String, String> params);

	/**
	 * 保后监管 非解保页签 查询列表数据
	 * 
	 * @Description
	 * @author zhongyongbo
	 * @date 2014-6-20 下午04:18:50
	 * @version V1.0
	 */
	public Pagination<Order> queryAfterSupervise(Pagination<Order> pagination, Map<String, String> params);

	/**
	 * 更新担保单数据
	 * @param order
	 * @return
	 */
	public int updateOrderSubarea(Order order);

	public boolean updateRevokeReason(Order order);

	void transferProcess(Order order, SuretyApprove approve, Person person) throws RuntimeException;

	public Order selectOrderByTransferId(String transferId);
	
	public int deleteByPrimaryKey(String id);
	
	public String getWorkFlowName(Order order);
	
	public void toWriteRelieveSurety(Order order,Person person,String isPass);
}
