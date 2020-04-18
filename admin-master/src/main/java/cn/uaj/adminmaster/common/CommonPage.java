package cn.uaj.adminmaster.common;

import org.springframework.data.domain.Page;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 分页数据封装类
 * @Author: wushaojie
 * @Date: 2020/4/14 10:45
 */
public class CommonPage<T> {
    private Integer pageNum; // 当前页码
    private Integer pageSize; // 每页的数量
    private Integer totalPage; //  总页码数
    private Long total; // 总记录数
    private List<T> list; // 每页显示的数据

    /**
     * 将PageHelper分页后的list转为分页信息
     * @param list
     * @param <T>
     * @return
     */
    public static <T> CommonPage<T> restPage(List<T> list){
        CommonPage<T> tCommonPage = new CommonPage<>();
        PageInfo<T> tPageInfo = new PageInfo<>(list);
        tCommonPage.setTotalPage(tPageInfo.getPages());
        tCommonPage.setPageNum(tPageInfo.getPageNum());
        tCommonPage.setPageSize(tPageInfo.getPageSize());
        tCommonPage.setTotal(tPageInfo.getTotal());
        tCommonPage.setList(tPageInfo.getList());
        return tCommonPage;
    }

    /**
     * 将springData分页后的list转为分页信息
     * @param pageInfo
     * @param <T>
     * @return
     */
    public static <T> CommonPage<T> restPage(Page<T> pageInfo){
        CommonPage<T> tCommonPage = new CommonPage<>();
        tCommonPage.setPageSize(pageInfo.getSize());
        tCommonPage.setTotalPage(pageInfo.getTotalPages());
        tCommonPage.setList(pageInfo.getContent());
        tCommonPage.setPageNum(pageInfo.getNumber());
        tCommonPage.setTotal(pageInfo.getTotalElements());
        return tCommonPage;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
