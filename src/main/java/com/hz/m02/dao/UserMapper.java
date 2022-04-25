package com.hz.m02.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hz.m02.pojo.SmbmsUser;
import org.apache.ibatis.annotations.Select;

;import java.util.List;

public interface UserMapper extends BaseMapper<SmbmsUser> {
    @Select( "select * from smbms_user a left join smbms_role b on a.userRole=b.id" )
    public List<SmbmsUser>findSmbmsUserList();
}

