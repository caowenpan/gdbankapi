package com.mychery.mespulgin.boot.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service("cimToSWPTService")
@Transactional
public class CimToSWPTService {

//    @Autowired //注入数据库操作
//    @Qualifier("cimXnyJdbcTemplate")
//    private JdbcTemplate jdbcTemplate;

    public  List<Map> doExecuteProcForSWPT4Sale() {
//        List<Map> resultList = (List<Map>) jdbcTemplate.execute(new CallableStatementCreator() {
//            @Override
//            public CallableStatement createCallableStatement(Connection con) throws SQLException {
//                String storedProc = "{call getSalesCarImpl()}";// 调用的sql
//                CallableStatement cs = con.prepareCall(storedProc);
//                return cs;
//            }
//        }, new CallableStatementCallback() {
//            public Object doInCallableStatement(CallableStatement cs) throws SQLException, DataAccessException {
//                List<Map> result = new ArrayList<Map>();
//                ResultSet rs = (ResultSet)  cs.executeQuery();// 获取游标一行的值
//                while (rs.next()) {
//                    Map<String, String> resultMap = new HashMap<String, String>();
//                    resultMap.put("vinNo", rs.getString("vinNo"));
//                    resultMap.put("plateNo", rs.getString("plateNo"));
//                    resultMap.put("carDomain", rs.getString("carDomain"));
//                    resultMap.put("saleDate", rs.getString("saleDate"));
//                    resultMap.put("saleAddress", rs.getString("saleAddress"));
//                    resultMap.put("carBuyerName", rs.getString("carBuyerName"));
//                    resultMap.put("carBuyerId", rs.getString("carBuyerId"));
//                    resultMap.put("companyName", rs.getString("companyName"));
//                    resultMap.put("companyAddress", rs.getString("companyAddress"));
//                    resultMap.put("paperNo", rs.getString("paperNo"));
//                    resultMap.put("vinType", rs.getString("vinType"));
//                    resultMap.put("carType", rs.getString("carType"));
//                    result.add(resultMap);
//                }
//                return result;
//            }
//        });
//        System.out.println(resultList);
        return new ArrayList<Map>();
    }

    public  List<Map> doExecuteProcForSWPTToResult4Sale(String code,String message,String vinList ) {//处理返回结果
//        List<Map> resultList = (List<Map>) jdbcTemplate.execute(new CallableStatementCreator() {
//            @Override
//            public CallableStatement createCallableStatement(Connection con) throws SQLException {
//                String storedProc = "{call updateSalesCarImpl(?,?,?)}";// 调用的sql
//                CallableStatement cs = con.prepareCall(storedProc);
//                cs.setString(1, code);
//                cs.setString(2, message);
//                cs.setString(3, vinList );
//                return cs;
//            }
//        }, new CallableStatementCallback() {
//            public Object doInCallableStatement(CallableStatement cs) throws SQLException, DataAccessException {
//                List<Map> result = new ArrayList<Map>();
//                cs.execute();
//                return result;
//            }
//        });
//        System.out.println(resultList);
//        return resultList;
        return new ArrayList<Map>();

    }
}