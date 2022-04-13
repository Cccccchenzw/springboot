package czw.controller;

import czw.model.Book;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

//Unable to render this definition
//The provided definition does not specify a valid version field.
//
//Please indicate a valid Swagger or OpenAPI version field. Supported version fields are swagger: "2.0" and those that match openapi: 3.0.n (for example, openapi: 3.0.0).


@RestController
@Api(tags = "测试数据")
public class SwaggerTestController {
    @ApiOperation(value = "查询用户",notes = "根据ID查询用户")
    @ApiImplicitParam(paramType = "path",name = "id",value = "用户id",required = true)
    @GetMapping("/getUser2022/{id}")
    public String getUserById(@PathVariable Integer id){
        return "/user/" + id;
    }

    @ApiResponses({
            @ApiResponse(code = 200,message = "删除成功！"),
            @ApiResponse(code = 500,message = "删除失败！")})
    @ApiOperation(value = "删除用户",notes = "通过ID删除用户")
    @DeleteMapping("/user2022/{id}")
    public Integer deleteUserById(@PathVariable Integer id){
        return id;
    }

    @ApiOperation(value = "添加用户",notes = "添加用户，传入与用户名和地址")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "name",value = "用户名",required = true,defaultValue = "czw"),
            @ApiImplicitParam(paramType = "query", name = "author",value = "作者",required = true,defaultValue = "CZW")})
    @PostMapping("/user2022")
    public String addUser(@RequestParam String name,@RequestParam String author){
        return name + ":" + author;
    }

    @ApiOperation(value = "修改用户",notes = "修改用户，传入用户信息")
    @PutMapping("/user2022")
    public String updateUser(@RequestBody Book book){
        return book.toString();
    }

    @GetMapping("/ignore2022")
    @ApiIgnore
    public void ignoreWay(){
        System.out.println("该方法不会在丝袜格出现");
    }
}

