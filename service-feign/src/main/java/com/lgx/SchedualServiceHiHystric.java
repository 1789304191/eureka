package com.lgx;

import org.springframework.stereotype.Component;

/**
 * Created by Maggie on 2017/9/22.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
