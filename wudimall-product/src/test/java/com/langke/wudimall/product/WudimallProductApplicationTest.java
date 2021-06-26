package com.langke.wudimall.product;

import com.langke.wudimall.product.entity.BrandEntity;
import com.langke.wudimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author LangKe
 * @description
 * @date 2021/6/26 17:04
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class WudimallProductApplicationTest {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(6L);
        brandEntity.setDescript("666");
//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
//        System.out.println("保存成功");
        brandService.updateById(brandEntity);
    }
}
