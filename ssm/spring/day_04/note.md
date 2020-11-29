##spring常用依赖
 <dependency>
          <groupId>org.springframework</groupId>
          <artifactId>spring-webmvc</artifactId>
          <version>5.2.0.RELEASE</version>
        </dependency>
        <dependency>
          <groupId>junit</groupId>
          <artifactId>junit</artifactId>
          <version>4.11</version>
          <scope>test</scope>
        </dependency>
        
    
   -   @Autowired用法自动装配
        开启注解支持需要 beans中配置context  
        和开启配置<context:annotation-config/>    
         @Autowired直接在类的属性上使用就行 set方法可不写
         
         如果@Autowired不能唯一自动装配属性，就通过@Qualifier(value = "cat111")加装配
    -@Nullable  这个注解标记以后该属性可以为空不会报错
    -@Component  相当于<bean id="user" class="com.lsm.pojo.user"/>    
            赋值      @Value("小鬼")可以放在set方法上也可以放在属性上,需要开启注解扫描
            
    这四个注解相当于把某个类注册到bean容器中
    -@Controller    Controller层
    -@Repository   dao层
    -@Component    dao层
    -@Service       service层
    -@Scope("singleton")  作用域 singleton单列  多列prototype
    