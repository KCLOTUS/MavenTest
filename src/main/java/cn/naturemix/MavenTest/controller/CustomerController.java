package cn.naturemix.MavenTest.controller;

import cn.naturemix.MavenTest.model.Customer;
import cn.naturemix.MavenTest.service.CustomerService;
import com.sun.javafx.tools.packager.Param;

import javax.swing.text.View;
import javax.xml.crypto.Data;
import javax.xml.ws.Action;
import java.util.List;
import java.util.Map;

/**
 * 处理客户管理相关请求
 */
public class CustomerController {
    /*
    @Inject
    private CustomerService customerService;

    /**
     * 进入客户列表 界面
     */
    /*
    @Action("get:/Customer")
    public View index(Param param){
        List<Customer> customerList = customerService.getCustomerList();
        return new View("Customer.jsp").addModel("customerList",customerList);
    }

    /**
     * 显示客户基本信息
     */
    /*
    @Action("get:/customer_show")
    public View show(Param param){
        long id = param.getLong("id");
        Customer customer = customerService.getCustomer(id);
        return new View("customer_show.jsp").addModel("Customer",customer);
    }

    /**
     * 进入创建客户界面
     */
    /*
    @Action("get:/customer_create")
    public View create(Param param){
        return new View("customer_create.jsp");
    }

    /**
     * 处理创建客户请求
     */
    /*
    @Action("post:/customer_create")
    public Data createSubmit(Param param){
        Map<String,Object> fieldMap = param.getMap();
        boolean result = customerService.createCustomer(fieldMap);
        return new Data(result);
    }

    /**
     * 进入编辑客户界面
     */
    /*
    @Action("get:/customer_edit")
    public View edit(Param param){
        long id = param.getLong("id");
        Customer customer = customerService.getCustomer(id);
        return new View("customer_edit.jsp").addModel("Customer",customer);
    }

    /**
     * 处理编辑客户请求
     */
    /*
    @Action("put:/customer_edit")
    public Data editSubmit(Param param){
        long id = param.getLong("id");
        Map<String,Object> fieldMap = param.getMap();
        boolean result = customerService.updateCustomer(id,fieldMap);
        return new Data(result);
    }

    /**
     * 处理删除客户请求
     */
    /*
    @Action("delete:/customer_edit")
    public Data delete(Param param){
        long id = param.getLong("id");
        boolean result = customerService.deleteCustomer(id);
        return new Data(result);
    }
    */
}
