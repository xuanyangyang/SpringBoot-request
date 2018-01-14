package lierabbit.request;

import org.springframework.web.bind.annotation.*;

@RestController//这是一个控制器并只返回数据不寻找视图
public class RequestCtrl
{
    @RequestMapping("/")//将本方法映射到/
    public String all(String name, Integer age)//接受2个参数,name和age
    {
        return "这里是all\n" + "name: " + name + "\n" + "age: " + age;
    }

    @GetMapping("/get")//将本方法映射到/get，且只能用get方式访问
    public String get(String name, int age)//接受2个参数,name和age
    {
        return "这里是get\n" + "name: " + name + "\n" + "age: " + age;
    }

    @PostMapping("/post")//将本方法映射到/post，且只能用post方式访问
    public String post(String name, int age)//接受2个参数,name和age
    {
        return "这里是post\n" + "name: " + name + "\n" + "age: " + age;
    }

    @PutMapping("/put")//将本方法映射到/put，且只能用put方式访问
    public User put(@RequestBody User user)//接受一个user实体
    {
        user.setName("名字已经被修改：" + user.getName());
        user.setAge(user.getAge() + 1);
        return user;
    }

    @DeleteMapping("/delete")//将本方法映射到/delete，且只能用delete方式访问
    public User delete(@RequestBody User user)//接受一个user实体
    {
        user.setName("这个用户将会被删除：" + user.getName());
        user.setAge(user.getAge() + 1);
        return user;
    }

    @PatchMapping("/patch")//将本方法映射到/patch，且只能用patch方式访问
    public User pathch(@RequestBody User user)//接受一个user实体
    {
        user.setName("只改名称：" + user.getName());
        return user;
    }
}
