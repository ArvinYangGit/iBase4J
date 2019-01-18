package org.ibase4j.web.sys;

import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.ibase4j.model.sys.SysParam;
import org.ibase4j.service.sys.SysParamService;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import top.ibase4j.core.base.BaseController;

/**
 * 参数管理
 *
 * @author ShenHuaJie
 * @version 2016年5月20日 下午3:15:19
 */
@RestController
@Api(value = "系统参数管理", description = "系统参数管理")
@RequestMapping(value = "param")
public class SysParamController extends BaseController<SysParam, SysParamService> {
    @Override
    @GetMapping(value = "/read/page")
    @ApiOperation(value = "查询系统参数")
    @RequiresPermissions("sys.base.param.read")
    public Object query(ModelMap modelMap, Map<String, Object> param) {
        return super.query(modelMap, param);
    }

    @GetMapping(value = "/read/detail")
    @ApiOperation(value = "系统参数详情")
    @RequiresPermissions("sys.base.param.read")
    public Object get(ModelMap modelMap, SysParam param) {
        return super.get(modelMap, param);
    }

    @Override
    @PostMapping
    @ApiOperation(value = "修改系统参数")
    @RequiresPermissions("sys.base.param.update")
    public Object update(ModelMap modelMap, SysParam param) {
        return super.update(modelMap, param);
    }

    @Override
    @DeleteMapping
    @ApiOperation(value = "删除系统参数")
    @RequiresPermissions("sys.base.param.delete")
    public Object delete(ModelMap modelMap, SysParam param) {
        return super.delete(modelMap, param);
    }
}
