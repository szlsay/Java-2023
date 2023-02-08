package cn.st.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.st.entity.Setmeal;
import cn.st.mapper.SetmealMapper;
import cn.st.service.SetmealService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SetmealServiceImpl extends ServiceImpl<SetmealMapper,Setmeal> implements SetmealService {
}
