package com.bwie.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.omg.CORBA.PRIVATE_MEMBER;

import com.bwie.dao.MyemailMapper;
import com.bwie.pojo.Myemail;
import com.bwie.pojo.MyemailExample;
import com.bwie.pojo.MyemailExample.Criteria;

/**
 * @作者:PanChenLe
 * 时间:2017年7月25日上午9:36:43
 * 类描述:测试类
 */

public class EmailTest {
            public static void main(String[] args) throws Exception {
         	   List<String> warnings = new ArrayList<String>();
    		   boolean overwrite = true;
    		   File configFile = new File("mbg.xml");
    		   ConfigurationParser cp = new ConfigurationParser(warnings);
    		   Configuration config = cp.parseConfiguration(configFile);
    		   DefaultShellCallback callback = new DefaultShellCallback(overwrite);
    		   MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
    		   myBatisGenerator.generate(null);
    	}    
            private MyemailMapper mapper;
		   @Test
            public  void  testDao(){
			        //查询所有的已读邮件
			       MyemailExample example=new MyemailExample();
			       Criteria criteria = example.createCriteria();
			          //增加约束条件  已读的是0   未读是1 
			       criteria.andStatusEqualTo(0);
			          List<Myemail> list = mapper.selectByExample(null);
			          //遍历集合
			         for (Myemail myemail : list) {
						    System.out.println(myemail);
					}
			   
			   
		   }
            
            
}
