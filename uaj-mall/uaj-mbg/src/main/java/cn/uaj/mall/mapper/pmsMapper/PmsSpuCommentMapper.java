package cn.uaj.mall.mapper.pmsMapper;

import cn.uaj.mall.entity.pms.PmsSpuComment;
import cn.uaj.mall.entity.pms.PmsSpuCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsSpuCommentMapper {
    long countByExample(PmsSpuCommentExample example);

    int deleteByExample(PmsSpuCommentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsSpuComment record);

    int insertSelective(PmsSpuComment record);

    List<PmsSpuComment> selectByExampleWithBLOBs(PmsSpuCommentExample example);

    List<PmsSpuComment> selectByExample(PmsSpuCommentExample example);

    PmsSpuComment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsSpuComment record, @Param("example") PmsSpuCommentExample example);

    int updateByExampleWithBLOBs(@Param("record") PmsSpuComment record, @Param("example") PmsSpuCommentExample example);

    int updateByExample(@Param("record") PmsSpuComment record, @Param("example") PmsSpuCommentExample example);

    int updateByPrimaryKeySelective(PmsSpuComment record);

    int updateByPrimaryKeyWithBLOBs(PmsSpuComment record);

    int updateByPrimaryKey(PmsSpuComment record);
}