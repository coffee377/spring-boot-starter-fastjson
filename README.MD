#FastJSON

使用 FastJson 作为实体转换工具


https://github.com/alibaba/druid/tree/master/druid-spring-boot-starter

[V 1.0.0 - RELEASE]
1.spring-boot 版本 2.0.X

application.yaml 配置文件

    spring:
      fastjson:
    #    enabled: false
        config:
    #      charset: utf-8
    #      serializeConfig:
    #      parserConfig:
    #      dateFormat: yyyy-MM-dd
          serializerFeatures:
            - disablecircularreferencedetect #  禁止循环引用
            - prettyformat            # 格式化输出
    #        - writeclassname          # 输出实体类名称
    #        - WriteMapNullValue       # 是否输出值为null的字段,默认为false
    #        - WriteNullNumberAsZero   # 数值字段如果为null,输出为0,而非null
    #        - WriteNullListAsEmpty    # List字段如果为null,输出为[],而非null
    #        - WriteNullStringAsEmpty  # 字符类型字段如果为null,输出为"",而非null
    #        - WriteNullBooleanAsFalse # Boolean字段如果为null,输出为false,而非null
    #      serializeFilters:
    #      features:
    #      classSerializeFilters:
    #      dateFormat: yyyy-MM-dd HH:mm:ss
    #      writeContentLength: true
