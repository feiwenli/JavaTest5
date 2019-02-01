### java 基础测试5
- 没做出来，出现一个错误一直无法解决

#### EXAM1
使用sakila 数据库。
下载成功之后，将sakila-schema.sql 和sakila-data.sql 放在 项目根目录docker/mysql/文件夹下。

程序使用mysql + spring boot + spring mvc + mybatis。

要求：

使用Spring 技术实现往film 表中插入一条数据，具体实现过程有以下要求：

1、Spring boot 的配置文件名称为application.yml。

2、Web 容器使用undertow 替换tomcat。

3、使用Logback。从数据库中查询到结果时，将日志打印到控制台。

4、数据库连接信息从环境变量中读取，使用spring 默认的环境变量。同时application.yml 中指定默认
值。

5、登录接口，/POST 请求，通过curl 传入name 和password。只有 name 与 customer 表的 first_name 相
同，且 password 与last_name 相同时。登录成功。

6、声明一个Page 对象，包含pageSize 、page和 sort 属性，分别表示要查询分页的大小、页数以及是正序
还是倒叙。
```
private int pageSize;
private int page;
private String sort = "ASC";
```
编写Resolver 将RequestParam 中的pageSize 和page 两个属性解析成Page对象。

7、查询film 列表，/GET 请求，通过curl 传入pageSize 和page。方法上使用Page对象接收。
```
@GetMapping("/")
public void list(Page page){
}
```
8、新增用户，/PUT 请求。通过curl 传入用户对象，包含first_name, last_name, email, address。
address 传入字符串， 必须是address 表中已经存在的地址。并将用户id返回。
9、更新刚才的用户，/POST 请求。通过curl 传入修改过的用户对象。根据用户id修改用户，id为上一道题返
回的用户。然后将更新后的用户数据返回。
10、删除新增的用户，/DELETE 请求。其中用户的id为上一道题返回的id，然后通过cookie 发送给接口，后
台使用HttpServlet 获取id。根据id删除用户。

##### 附加题
使用mybatis 的PageHelper 插件来执行分页查询。

### 运行
- 运行步骤
	- git clone git@github.com:feiwenli/JavaTest5.git


