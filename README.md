# spring-cloud-alibaba-G-demo

### 介绍
本项目是基于SpringCloud Hoxton与SpringCloud alibaba 2.1.1 的探索实践项目  
关联本人博客springcloud经验总结专题  
地址: https://blog.csdn.net/weixin_40461281/category_9280146.html  

### 软件架构
| 依赖 | 版本 |
|---- | ---- |
| SpringCloud | Hoxton.RELEASE |
| SpringCloud-alibaba | 2.1.1.RELEASE |
| SpringBoot-alibaba | 2.2.2.RELEASE |
| alibaba-nacos | 1.0.0 |

### spring cloud alibaba专题  
| 模块名称 | 模块作用 |
|---- | ---- |
| alibaba-nacos-discovery-server | 使用Nacos实现服务注册与发现：服务提供方 |
| alibaba-nacos-discovery-client | 使用Nacos实现服务注册与发现：服务消费方 |
| alibaba-nacos-config-client | 使用Nacos实现注册中心：客户端 |
| alibaba-dubbo-server | Dubbo 服务端实现(集成Nacos实现注册中心与配置中心) |
| alibaba-dubbo-client | Dubbo 客户端实现(集成Nacos实现注册中心与配置中心) |
| alibaba-dubbo-api | Dubbo API定义 |

### 即将更新 
| 模块名称 | 模块作用 |
|---- | ---- |
| alibaba-sentinel | 接口限流 |
