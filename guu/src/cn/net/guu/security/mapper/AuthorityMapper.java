package cn.net.guu.security.mapper;

import cn.net.guu.core.mapper.MapperFactory;
import cn.net.guu.security.model.Authority;
import java.util.List;

public interface AuthorityMapper extends MapperFactory {
    
    /**
     * ͨ���û���ƣ�����û���Ӧ��Ȩ����Ϣ
     * @author xrz
     * @param userName �û���
     * @return
     */
    List<Authority> selectByUserName(String userName);
}