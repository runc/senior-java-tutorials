package com.ak47.spring5.x;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

import java.util.stream.IntStream;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class DataSetupBean implements InitializingBean {

    @Autowired
    private FooRepository repo;

    //

    @Override
    public void afterPropertiesSet() throws Exception {
        // 这里生产随机数
        IntStream.range(1, 5).forEach(i -> repo.save(new Foo(randomAlphabetic(8))));
    }

}
