# spring-annotation-config

基于spring-annotation-config的方式实现的组件化和注入

## 注入配置

### 添加注解
在src/main/java/asciiPanel/AsciiPanel.java中，添加AutoWired注解到setAsciiFont中,然后通过Value注解设置font参数的值，将其绑定到properties的font变量上

### context配置
在src/main/resource/config-annotation.xml中,设置annotation-config，base-package和property-placeholder location.

### property设置
在src/resource/value.properties中进行值的设置,font = CP437_9x16,之后可以修改值来进行不同组件之间的注入

## 运行
直接使用main函数可以运行

## spring-xml-config

基于spring-xml-config的方式实现的组件化和注入

### 注入配置
注入配置位于scr/main/resource/config.xml中,实现采用的注入setter,默认为CP437_9x16可以修改

### 运行
直接使用main函数可以运行
