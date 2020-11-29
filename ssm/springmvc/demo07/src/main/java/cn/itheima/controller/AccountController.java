package cn.itheima.controller;

import cn.itheima.pojo.account;
import cn.itheima.service.AccountService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    //依赖注入一下子通过注解
    @Autowired
    private AccountService accountService;
    @RequestMapping("/main")
    public String login(){
        System.out.println("我差点就过去了");
        return "index1";
    }
    //登录验证
    @PostMapping("main1")
    public String main1(String username , HttpServletRequest request, HttpServletResponse response, String pass, Model model) throws IOException {
        System.out.println("用户名"+username+" 密码"+pass);
        account account = accountService.IdfindAll(username);
        System.out.println(account);
        if (username.equals("root")&&username.equals(account.getName())&& pass.equals(account.getPassword())){
            System.out.println("登录成功管理员");
            return "index1";
        }else if (!username.equals("root")&&username.equals(account.getName())&& pass.equals(account.getPassword())){
            System.out.println("登录成功普通员工");
//            model.addAttribute("findAll","龟儿子");
            return "redirect:/contact.jsp";
        }
        System.out.println("账号密码错误");
        model.addAttribute("error", "账号密码错误");
        request.getSession().setAttribute("finAll","账号或密码错误");
//        response.getWriter().print("登录失败账号或密码错误");
        return "../denglu";
    }

//    管理员权限管理 查询全部
    @RequestMapping("/hueyuanj")
    public String hueyuan1(Model model){
        System.out.println("来了管理员层Controller");
        List<account> all = accountService.findAll();
        System.out.println(all);
        model.addAttribute("findAll",all);
        return "member-list";
    }
    //    会员列表(动态态表格)
    @RequestMapping("/hueyuand")
    public String hueyuan2(){
        return "member-list1";
    }

//    添加表单admin-add.jsp
@RequestMapping("/add")
public String add(account account,Model model){

    account name = accountService.IdfindAll(account.getName());
    System.out.println("增加");
    System.out.println(account);
    System.out.println(name);
    if(account!=null&&name==null){
        accountService.saveAccount(account);
    }else{
        System.out.println("给弹框");
        model.addAttribute("error", "已有该员工添加失败");
        return "admin-add";
    }
    model.addAttribute("error", "添加成功");
    return "admin-add";
}

    //   模糊查询
    @RequestMapping("/FuzzyQuery")
    public String FuzzyQuery( String name, Model model){
        System.out.println("模糊查询");
        System.out.println(name);
            List<account> accounts = accountService.FuzzyQuery("%"+name+"%");
            System.out.println(accounts);
            model.addAttribute("findAll",accounts);

//        return "redirect:/account/hueyuanj";
        return "member-list";
    }

    //   删除员工
    @RequestMapping("/delete")
    public String delete(String name){
        System.out.println("删除");
        accountService.delete(name);
        return "redirect:/account/hueyuanj";
    }

    //修改
    @RequestMapping("/upfata")
    public String upfata(String name, String password, String newpassword, String repassword,Model model){
        System.out.println("修改");
        System.out.println("你是想搞事"+name);
        System.out.println("账号"+name+"  旧密码"+password+"  新密码"+newpassword+"  确认密码"+repassword);
        account account = accountService.IdfindAll(name);
        System.out.println(account);
        //如果旧密码等于数据库中的密码  并且 账号等于数据库中的账号 并且 新密码等于确认密码
        if(password.equals(account.getPassword())&&name.equals(account.getName())&&newpassword.equals(repassword)){
            accountService.updata(newpassword,name);
            System.out.println("修改成功");
            model.addAttribute("error", "修改成功");
            return "redirect:/account/hueyuanj";
        } else{
            model.addAttribute("error", "修改失败");
            return "member-password";
        }
    }
}
