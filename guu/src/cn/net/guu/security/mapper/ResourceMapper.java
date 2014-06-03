package cn.net.guu.security.mapper;

import cn.net.guu.core.mapper.MapperFactory;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResourceMapper extends MapperFactory{
   
  
    /**
     * ͨ�� Ȩ����Ʋ�ѯ��Ȩ��Ӧ�÷��ʵ���Դ�б�
     * @author xrz
     * @param authName Ȩ�����
     * @return
     */
     List<cn.net.guu.security.model.Resource> selectAuthResByAuthName(@Param("authName") String authName);
}