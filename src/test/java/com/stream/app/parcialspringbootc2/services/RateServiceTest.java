package com.stream.app.parcialspringbootc2.services;

import com.stream.app.parcialspringbootc2.entities.Character;
import com.stream.app.parcialspringbootc2.entities.Rate;
import com.stream.app.parcialspringbootc2.services.Impl.CharacterServiceImpl;
import com.stream.app.parcialspringbootc2.services.Impl.RateServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RateServiceTest {

    @Autowired
    RateServiceImpl rateService;




    @Test
    void save() {
        Rate rate = new Rate();
        rate.setId(1L);
        rate.setRate(6F);
        rateService.save(rate,1L);
    }

}
