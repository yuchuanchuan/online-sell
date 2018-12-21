package com.chuanyu.onlinesell.repository;

import com.chuanyu.onlinesell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void findOneTest() {
        ProductCategory productCategory = productCategoryRepository.findById(1).get();
        System.out.println(productCategory);
    }

    /**
     * @Transactional 注解在测试中，并不是事务回滚的操作机制，而是当进行的是测试数据时，验证测试通过，但是测试数据不会写入到数据库中
     * 也就是在测试时，并不希望测试数据存到数据库中
     */
    @Test
    @Transactional
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory("男生最爱哈哈哈", 1);
        ProductCategory result = productCategoryRepository.save(productCategory);
        Assert.assertNotNull(result);   // 等价于Assert.assertNotEquals(null, result);
    }

    @Test
    public void findByCategoryTypeInTest() {

        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<ProductCategory> result = productCategoryRepository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, result.size());
    }
}