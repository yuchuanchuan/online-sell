package com.chuanyu.onlinesell.dataobject;

import lombok.Data;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 商品类目
 * Create by yuchuanchuan
 * 2018年11月10日
 * 若数据库中的表名为product_category则类名可直接命名为ProductCategory
 * 若数据库中的表名和类名不一致，则在类名前使用@Table(name="表名称")注解
 * DynamicUpdate 动态更新，如更新时，先查询这个实体类的信息，就会将日期查询
 * 出来，在次更新，则日期不会进行更新。加上这个注解，则会动态更新日期
 *
 * @Data 先要在pom.xml文件中进行lombok的依赖。添加@Data注解，则在这个类中无需添加getter()和setter()及toString()
 * 这个注解会自动生成getter()和setter()方法。lombok也有@Setter方法，就是为该类自动添加setter()
 * 方法，@Getter方法，为该类自动生成getter方法
 */
@Entity
@DynamicUpdate
@Data
public class ProductCategory {

    @Id
    @GeneratedValue
    private Integer categoryId;     // 类目id
    private String categoryName;    // 类目名称
    private Integer categoryType;   // 类目编号
    // private Date createTime;        // 创建时间
    //  private Date updateTime;        // 更新时间


    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}

