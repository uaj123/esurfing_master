package cn.uaj.mall.mapper.umsMapper;

import cn.uaj.mall.entity.ums.UmsMemberCollectSpu;
import cn.uaj.mall.entity.ums.UmsMemberCollectSpuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberCollectSpuMapper {
    long countByExample(UmsMemberCollectSpuExample example);

    int deleteByExample(UmsMemberCollectSpuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberCollectSpu record);

    int insertSelective(UmsMemberCollectSpu record);

    List<UmsMemberCollectSpu> selectByExample(UmsMemberCollectSpuExample example);

    UmsMemberCollectSpu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsMemberCollectSpu record, @Param("example") UmsMemberCollectSpuExample example);

    int updateByExample(@Param("record") UmsMemberCollectSpu record, @Param("example") UmsMemberCollectSpuExample example);

    int updateByPrimaryKeySelective(UmsMemberCollectSpu record);

    int updateByPrimaryKey(UmsMemberCollectSpu record);
}