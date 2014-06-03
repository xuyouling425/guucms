package cn.net.guu.core.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;


/**
 * 将Mapper抽象出来，让自动生成的**Mapper继续，让子类实例化mapper
 * Mapper是MyBatis实现和数据库进行交换的接口
 * 
 * @author xrz
 * @date 2013-11-28 下午8:13:39
 */
public interface MapperFactory {

	
	/**
	 * 查询符合条件的记录数量。
	 * @author xrz
	 * @param example 对应的查询条件MapperExampleFactory
	 * @return 符合条件的数量
	 */
	public	int countByExample(MapperExampleFactory example);

	/**
	 * 通过条件批量删除
	 * @author xrz
	 * @param example 删除条件MapperExampleFactory
	 * @return 影响的行数
	 */
	public int deleteByExample(MapperExampleFactory example);

	/**
	 * 通过主键id删除一条记录
	 * @author xrz
	 * @param ObjectId 主键id
	 * @return 影响的行数
	 */
	public int deleteByPrimaryKey(Object ObjectId);

	/**
	 * 插入一个对象，不过滤为空字段，若属性为空，也会将null插入数据库。
	 * @author xrz
	 * @param record 对象
	 * @return  影响的行数
	 */
	public int insert(Object record);
	
	/**
	 * 插入一个对象，过滤为空字段
	 * @author xrz
	 * @param record 对象
	 * @return 影响的行数
	 */
	public int insertSelective(Object record);

	/**
	 * 通过条件批量修改，过滤为空字段
	 * record对象是值要将符合条件的数据，修改成record对象属性的值。
	 * 
	 * @author xrz
	 * @param record 修改符合条件的数据为对象的属性值
	 * @param example 修改的条件
	 * @return 影响的行数
	 */
	public int updateByExampleSelective(@Param("record") Object record, @Param("example") MapperExampleFactory example);

	/**
	 * 通过条件批量修改
	 * record对象是值要将符合条件的数据，修改成record对象属性的值。
	 * 
	 * @author xrz
	 * @param record 修改符合条件的数据为对象的属性值
	 * @param example 修改的条件
	 * @return 影响的行数
	 */
	public int updateByExample(@Param("record") Object record, @Param("example") MapperExampleFactory example);

	/**
	 * 通过主键修改对象，过滤为空字段
	 * @author xrz
	 * @param record 修改符合条件的数据为对象的属性值
	 * @return 影响的行数
	 */
	public int updateByPrimaryKeySelective(Object record);

	/**
	 * 通过主键修改对象
	 * @author xrz
	 * @param record 修改符合条件的数据为对象的属性值
	 * @return 影响的行数
	 */
	public int updateByPrimaryKey(Object record);

	/**
	 * 通过主键查询
	 * @author xrz
	 * @param ObjectId 主键
	 * @return 实体对象
	 */
	public Object selectByPrimaryKey(Object ObjectId);

	/**
	 * 通过MapperExampleFactory条件查询
	 * @author xrz
	 * @param example 查询条件
	 * @return 符合条件的结果集对象
	 */
	public   List<?> selectByExample(MapperExampleFactory example);
}
