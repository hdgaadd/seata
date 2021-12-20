# Seata

> [si ta]

**WHAT**

- 阿里巴巴开源的一款分布式事务解决方案



**使用到分布式事务的场景类型**

- 单体项目使用多个数据源，就使用到分布式事务
- 微服务，显而易见必须使用分布式事务



**Coding**

- 服务1：传递order，生成订单编号，在数据库创建订单

- 服务2：传递userId、amount，扣减钱包

  若服务3调用服务1和服务2，某个服务执行方法失败，则**回滚事务**

- 在file.conf配置Seata的**服务分组**

  ```
  ## 配置服务分组
  service {
  	#vgroup->rgroup 服务分组 集群分组默认为"default"
  	vgroupMapping.my_test_tx_group = "default"
  	#only support single node
  	default.grouplist = "127.0.0.1:8091"
  	#degrade current not support 服务降级达到多次错误不走seata
  	enableDegrade = false
  	#disable
  	disable = false
  	#unit ms,s,m,h,d represents milliseconds, seconds, minutes, hours, days,default permanent
  	max.commit.retry.timeout = "-1"
  	max.rollback.retry.timeout = "-1"
  }
  ```

- 导入Seata的pom依赖
- 调用**调用多个服务**的主方法添加@GolbalTransactional
- 3个module在application.yml**配置Seata**的配置信息，与配置在file.conf配置的Seata的**服务分组**
