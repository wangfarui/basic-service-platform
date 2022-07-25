package com.wfr.basic.service.platform.dao;


import com.wfr.basic.service.platform.dao.mapper.BaseDaoMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Dao Mapper自动装配
 *
 * @author wangfarui
 * @since 2022/7/25
 */
@Configuration(proxyBeanMethods = false)
@MapperScan(basePackageClasses = BaseDaoMapper.class)
public class DaoMapperAutoConfiguration {

}
