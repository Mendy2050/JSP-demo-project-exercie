package com.itheima.web; /**
 * @author Mendy
 * @create 2023-05-28 14:45
 */

import com.itheima.pojo.Brand;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/demo1")
public class ServletDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1、prepare data
        List<Brand> brands = new ArrayList<Brand>();
        brands.add(new Brand(1,"三只松鼠","三只松鼠",100,"三只松鼠，好吃不上火",1));
        brands.add(new Brand(2,"优衣库","优衣库",200,"优衣库，服适人生",0));
        brands.add(new Brand(3,"小米","小米科技有限公司",1000,"为发烧而生",1));

        //2、save to request scope
        request.setAttribute("brands",brands);
        request.setAttribute("status",1);

        //3、forward to el-demo.jsp
//        request.getRequestDispatcher("/el-demo.jsp").forward(request,response);
//        request.getRequestDispatcher("/jstl-if.jsp").forward(request,response);
        request.getRequestDispatcher("/jstl-foreach.jsp").forward(request,response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
