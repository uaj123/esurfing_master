package cn.uaj.adminmaster.service.portal;

import cn.uaj.adminmaster.domain.portal.MemberReadHistory;

import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/4/20 16:46
 */
public interface MemberReadHistoryService {
    /**
     * 生成浏览记录
     * @param memberReadHistory
     * @return
     */
    int create(MemberReadHistory memberReadHistory);

    /**
     * 批量删除浏览记录
     * @param ids
     * @return
     */
    int delete(List<String> ids);

    /**
     * 获取用户浏览历史记录
     * @param memberId
     * @return
     */
    List<MemberReadHistory> historyList(Long memberId);
}
