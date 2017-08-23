package com.answern.config.client.foo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(value = "测试config使用",description = "测试从configServer 获取一个from 配置 @RestController 相当于Controller + ResponseBody  不能返回页面解析器")
@RefreshScope   //自动更新配置变量
@RestController // 相当于Controller + ResponseBody  不能返回页面解析器
public class TestController {

	@Value("${from}")
	private String from;
	
	@Autowired
	private Environment env;
	
	
	 @ApiOperation(value="这就是不写method类型的下场", notes="方法说明：不写method类型的下场")
	 @ApiImplicitParams({ @ApiImplicitParam(name = "value", value = "传入一个value", required = true, dataType = "String")})
	@RequestMapping("/from/{value}")
	public String index(@PathVariable String value) {
		System.out.println("进入config client =="+this.from+"=value="+value);
		return this.from+"==="+value;
	}
	
	@RequestMapping("/fromEnv")
	public String indexfromenv() {
		return env.getProperty("from");
	}
}
