package com.answern.config.client.foo;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.answern.config.client.foo.mode.FromModel;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(value = "swagger使用",description = " swagger 例子使用")
@RefreshScope //自动更新配置变量
@Controller 
@RequestMapping("/swagger")
public class SwaggerController {
 
	
	 @ApiOperation(value="主页测试restful风格的url", notes="方法说明：获得一个value")
	 @ApiImplicitParams({ @ApiImplicitParam(name = "value", value = "返回value", required = true, dataType = "String") })
	@RequestMapping(value="/index/{value}" ,method=RequestMethod.GET)
	public String index(@PathVariable String value) {
		System.out.println("进入swagger controller value=="+value);
		return  value;
	}
	 @ApiOperation(value="测试get传入值 ", notes="方法说明：传入对象")
	 @ApiImplicitParams({ @ApiImplicitParam(name = "name", value = "用户名", required = true, dataType = "String"), 
		                  @ApiImplicitParam(name = "eage", value = "年龄", required = false, dataType = "int"),
	 					  @ApiImplicitParam(name = "email", value = "email", required = false, dataType = "String")	, 
	 					  @ApiImplicitParam(name = "birthday", value = "生日", required = false, dataType = "Date") 
	 					})
	@RequestMapping(value ="/indexPom" , method=RequestMethod.GET )
	public String indexfromenv(FromModel fromModel) {
		 
		return fromModel.getName();
	}
	 @ApiOperation(value="测试post传入 ", notes="方法说明：传入对象")
	 @ApiImplicitParams({ @ApiImplicitParam(name = "name", value = "用户名", required = true, dataType = "String"), 
		 @ApiImplicitParam(name = "eage", value = "年龄", required = false, dataType = "int"),
		 @ApiImplicitParam(name = "email", value = "email", required = false, dataType = "String")	, 
		 @ApiImplicitParam(name = "birthday", value = "生日", required = false, dataType = "Date") 
	 })
	 @RequestMapping(value ="/indexPost" , method=RequestMethod.POST )
	 public String indexpost(FromModel fromModel) {
		 
		 return fromModel.getName();
	 }
	 @ApiOperation(value="测试传入model ", notes="方法说明：传入对象")
	 @ApiImplicitParams({ 
		 @ApiImplicitParam(name = "fromModel", value = "这是一个fromModel对象", required = false, dataType = "FromModel") 
	 })
	 @RequestMapping(value ="/indexPostModel" , method=RequestMethod.POST )
	 public String indexpostModel(FromModel fromModel) {
		 
		 return fromModel.getName();
	 }
}
