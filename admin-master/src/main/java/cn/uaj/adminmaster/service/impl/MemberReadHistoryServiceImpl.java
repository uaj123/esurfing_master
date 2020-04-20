package cn.uaj.adminmaster.service.impl;

import cn.uaj.adminmaster.domain.portal.MemberReadHistory;
import cn.uaj.adminmaster.repository.portal.MemberReadHistoryRepository;
import cn.uaj.adminmaster.service.portal.MemberReadHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 会员浏览记录管理service实现类
 * @Author: wushaojie
 * @Date: 2020/4/20 16:52
 */
@Service
public class MemberReadHistoryServiceImpl implements MemberReadHistoryService {

    @Autowired
    private MemberReadHistoryRepository memberReadHistoryRepository;


    @Override
    public int create(MemberReadHistory memberReadHistory) {
        memberReadHistory.setId(null);
        memberReadHistory.setCreateTime(new Date());
        memberReadHistoryRepository.save(memberReadHistory);
        return 1;
    }

    @Override
    public int delete(List<String> ids) {
        List<MemberReadHistory> memberReadHistoryList = new ArrayList<>();
        for (String id :ids) {
            MemberReadHistory memberReadHistory = new MemberReadHistory();
            memberReadHistory.setId(id);
            memberReadHistoryList.add(memberReadHistory);
        }
        memberReadHistoryRepository.deleteAll(memberReadHistoryList);
        return ids.size();
    }

    @Override
    public List<MemberReadHistory> historyList(Long memberId) {
        return memberReadHistoryRepository.findByMemberIdOrderByCreateTimeDesc(memberId);
    }
}
