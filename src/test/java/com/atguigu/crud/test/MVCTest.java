package com.atguigu.crud.test;

import com.atguigu.crud.bean.Employee;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

/**
 * 使用Spring测试模块提供的测试请求功能，测试crud请求的正确性
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:springmvc.xml"})
@WebAppConfiguration
public class MVCTest {
    //传入SpringMVC的ioc
    //如何装配一个ioc容器？需要@WebAppConfiguration注解
    @Autowired
    WebApplicationContext context;
    //虚拟mvc请求,获取到处理结果
    MockMvc mockMvc;

    @Before
    public void initMockMvc() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void testPage() throws Exception {
        //模拟请求并拿到返回值
//        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/emps").param("pageNum", "5"))
//                .andReturn();
//        //请求成功后请求域中会有pageInfo: 我们可以取出pageInfo进行验证
//        PageInfo pageInfo =(PageInfo) result.getRequest().getAttribute("pageInfo");
//        System.out.println("当前页码:" + pageInfo.getPageNum());
//        System.out.println("总页码:" + pageInfo.getPages());
//        System.out.println("总记录数:" + pageInfo.getTotal());
//        System.out.println("在页面需要连续显示的页码:");
//        int[] navigatepageNums = pageInfo.getNavigatepageNums();
//        for (int pagenum :
//                navigatepageNums) {
//            System.out.println(" " + pagenum);
//        }
//        //获取员工数据
//        List<Employee> list = pageInfo.getList();
//        list.forEach(System.out::println);

    }
}
