package cn.net.guu.core.service;

import java.sql.SQLException;
import java.util.List;


import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import cn.net.guu.core.mapper.MapperExampleFactory;
import cn.net.guu.core.mapper.MapperFactory;


/**
 * 抽象一个服务工厂，在服务工厂里面抽象出共用的类
 *
 * @author xrz
 * @date 2013-11-28 下午9:22:28
 */
public  class ServiceFactoryImpl extends SqlSessionDaoSupport implements ServiceFactory{

	
	/**
	 * mapper接口
	 */

	private MapperFactory mapper;
	
	/**
	 *  *MapperXml文件的全名称。
	 */

	private String mapperXmlPath ;
	
	
	public void setMapper(MapperFactory mapper) {
		this.mapper = mapper;
	}


	public void setMapperXmlPath(String mapperXmlPath) {
		this.mapperXmlPath = mapperXmlPath;
	}
	
	
	/**
	 * 新增一个实体对象
	 * @author xrz
	 * @param obj 对象
	 * @return 影响的行数
	 * @throws SQLException
	 */
	public Integer add(Object entity) throws SQLException {
		return mapper.insert(entity);
	}

	/**
	 * 新增实体对象，过滤掉为空字段
	 * @author xrz
	 * @param entity
	 * @return 影响的行数
	 * @throws SQLException
	 */
	public Integer addSelective(Object entity) throws SQLException {
		return mapper.insertSelective(entity);
	}

	/**
	 * 通过主键修改
	 * @author xrz
	 * @param entity 实体对象
	 * @return 影响的行数
	 * @throws SQLException
	 */
	public Integer updateByPrimaryKey(Object entity) throws SQLException {
		return mapper.updateByPrimaryKey(entity);
	}

	/**
	 * 根据主键修改，过滤空字段
	 * @author xrz
	 * @param entity 实体对象
	 * @return 影响的行数
	 * @throws SQLException
	 */
	public Integer updateByPrimaryKeySelective(Object entity) throws SQLException {
		return mapper.updateByPrimaryKeySelective(entity);
	}

	/**
	 * 根据条件批量修改
	 * @author xrz
	 * @param entity 实体对象
	 * @param example 查询对象
	 * @return 影响的行数
	 * @throws SQLException
	 */
	public Integer updateByExample(Object entity, MapperExampleFactory example)
			throws SQLException {
		return mapper.updateByExample(entity, example);
	}

	/**
	 * 根据条件批量修改，过滤空字段
	 * @author xrz
	 * @param entity 实体对象
	 * @param example 查询对象
	 * @return 影响的行数
	 * @throws SQLException
	 */
	public Integer updateByExampleSelective(Object entity, MapperExampleFactory example)
			throws SQLException {
		return mapper.updateByExampleSelective(entity, example);
	}

	/**
	 * 通过主键id，删除一条记录
	 * @author xrz
	 * @param ObjectId 主键id
	 * @return 影响的行数
	 * @throws SQLException
	 */
	public Integer deleteByPrimaryKey(Object ObjectId) throws SQLException {
		return mapper.deleteByPrimaryKey(ObjectId);
	}

	/**
	 * 通过条件批量删除
	 * @author xrz
	 * @param example 删除条件对象
	 * @return 影响的行数
	 * @throws SQLException
	 */
	public Integer deleteByExample(MapperExampleFactory example) throws SQLException {
		return mapper.deleteByExample(example);
	}

	/**
	 * 通过主键id获得一个实体对象
	 * @author xrz
	 * @param objectId 主键id
	 * @return 实体对象
	 * @throws SQLException
	 */
	public Object selectBypk(Object objectId) throws SQLException {
		return mapper.selectByPrimaryKey(objectId);
	}

	/**
	 * 通过条件获得对象集合
	 * @author xrz
	 * @param example 查询条件对象
	 * @return 对象集合
	 * @throws SQLException
	 */
	public List<?> selectByExample(MapperExampleFactory example) throws SQLException {
		return mapper.selectByExample(example);
	}

	/**
	 * 通过条件，获得记录数
	 * @author xrz
	 * @param example 查询条件对象
	 * @return 符合条件的记录数
	 * @throws SQLException
	 */
	public Integer selectCount(MapperExampleFactory example) throws SQLException {
		return mapper.countByExample(example);
	}
	
	/**
	 * 分页查询符合条件的记录数
	 * @author xrz
	 * @param example 查询条件
	 * @param start 起始记录数
	 * @param limit 步长
	 * @return 对象集合
	 * @throws SQLException
	 */
	public List<?> selectPageByExample(MapperExampleFactory example,
			int start, int limit) throws SQLException {
		List<?> list = null;
		if(this.mapperXmlPath==null){
			return list;
		}
		list = getSqlSession().selectList(this.mapperXmlPath+".selectByExample", example, new RowBounds(start, limit));
		return list;
	}
	
}
