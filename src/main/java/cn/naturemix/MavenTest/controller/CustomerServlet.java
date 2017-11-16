package cn.naturemix.MavenTest.controller;

import cn.naturemix.MavenTest.model.Customer;
import cn.naturemix.MavenTest.service.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 进入客户列表 界面
 */
@WebServlet("/Customer")
public class CustomerServlet extends HttpServlet {

    private CustomerService customerService;

    @Override
    public void init() throws ServletException {
        customerService = new CustomerService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //TODO
        List<Customer> customerList = customerService.getCustomerList();
        req.setAttribute("customerlist",customerList);
        req.getRequestDispatcher("/WEB-INF/view/Customer.jsp").forward(req,resp);
    }

}
