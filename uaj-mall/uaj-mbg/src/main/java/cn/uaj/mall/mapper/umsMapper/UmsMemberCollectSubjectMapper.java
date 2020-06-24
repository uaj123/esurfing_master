package cn.uaj.mall.mapper.umsMapper;

import cn.uaj.mall.entity.ums.UmsMemberCollectSubject;
import cn.uaj.mall.entity.ums.UmsMemberCollectSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberCollectSubjectMapper {
    long countByExample(UmsMemberCollectSubjectExample example);

    int deleteByExample(UmsMemberCollectSubjectExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberCollectSubject record);

    int insertSelective(UmsMemberCollectSubject record);

    List<UmsMemberCollectSubject> selectByExample(UmsMemberCollectSubjectExample example);

    UmsMemberCollectSubject selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsMemberCollectSubject record, @Param("example") UmsMemberCollectSubjectExample example);

    int updateByExample(@Param("record") UmsMemberCollectSubject record, @Param("example") UmsMemberCollectSubjectExample example);

    int updateByPrimaryKeySelective(UmsMemberCollectSubject record);

    int updateByPrimaryKey(UmsMemberCollectSubject record);
}