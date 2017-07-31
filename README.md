# 整合SpringMVC进行开发
## 使用到的知识点：
1. SpringMVC常用注解：
-     @Controller 用于标记一个类，所标记的类就是一个控制器.控制器就相当于Struts2中的Action
    ```java
    @Controller
    public class UserController {....}
    ```
-     @RequestMapping 用于注解一个控制器类，这样就相当于将所有方法都映射在此控制器类级别下；还可以用来注解一个控制器方法，就相当于给该方法加上了一个映射。
    ```java
    @Controller
    @RequestMapping("user")
    public class UserController {
    @RequestMapping(value="u")
    public String login(....){
        ....
        }
    }
    ```
-     @Model @ModelView 都是将模型数据传输到View视图上的注解，不同的是，前者传输的是数据对象，而后者将数据对象及View视图也一并保存在ModelView中进行传输。
    ```java
    @Controller
    @RequestMapping("user")
    public class UserController {
    @RequestMapping(value="u")
    public String login(Model model){
        ....
        }
    }
    ```
-     @ModelAttribute 其中有一个value属性，终于将请求数据传输到value中设置的变量中。另外需要使用@RequestParm进行绑定。
     ```java
    @Controller
    @RequestMapping("user")
    public class UserController {
    @RequestMapping(value="u")
    @ModelAttribute(value = "loginname")
    public String login(Model model, @RequestParm("loginname") String loginname){
       return loginname;
        }
    }
    ```
-     #requestScope# 在JSP页面上使用的标签，可以获取到保存在Model中的值。
    ```HTML
        ${requestScope.user.loginname}
    ```
2. 表单标签库
-     #form 支持除了POST,GET方法之外的其他方法进行提交，同时自动绑定Model中的一个属性值到当前form对应的实体对象。
    ```HTML
        <form:form.....></form:form>
    ```     
-     #input 会被渲染为一个类型为text的普通HTML input标签。
    ```HTML
        <form:input.....></form:input>
    ```  
-     #password 会被渲染为一个类型为password的普通HTML input标签。
     ```HTML
        <form:password.....></form:password>
    ``` 
-     #form+input/password 即可被渲染为相应的html标签，格式为form:input

3. Spring数据转换，格式化，检验
-     #数据转换 意思是将Java对象进行数据转换，比如Spring转换成Date，其中，转换的方法有ConversionService,@InitBinder(自定义转换器),@WebBindingInitializer(注册使用全局转换器)
>多种转换器的优先顺序
对于同一个类型的对象来说，如果既在ConversionService中装配看自定义的转换器，又通过WebBindingInitializer接口装配了全局的自定义编辑器，同时还在控制器中通过@InitBinder装配了自定义的编辑器，此时SpringMVC将按照以下的优先顺序查找对应的编辑器：
(1).查询通过@InitBinder装配的自定义编辑器
(2).查询通过ConversionService装配的自定义转换器
(3).查询通过WebBindingInitializer接口装配的全局自定义编辑器
-     #数据格式化 即通过Format进行数据的格式转化，比如百分数有百分数的格式%，等等。
-     #数据校验 通过Spring提供的接口进行数据的校验，比如检验电话，邮箱的格式是否正确。常用的校验方法有Validation和JRS303,感觉JRS303的功能更强大一些。
-     #使用到JRS303需要添加jar包，通过maven添加依赖：
    ```XML
    <dependency>
      <groupId>org.hibernate</groupId>
      <artifactId>hibernate-validator</artifactId>
      <version>5.4.0.Final</version>
    </dependency>
    ```
***
## 大致就是以上所述
