package cn.st.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.st.entity.Category;

public interface CategoryService extends IService<Category> {

    public void remove(Long id);

}
