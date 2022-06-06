package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.IndexMapper;
import com.example.demo.entity.BrainCoData;
import org.springframework.stereotype.Service;

/**
 * @author macbookproz11
 */
@Service
public class IndexServiceImpl extends ServiceImpl<IndexMapper, BrainCoData> implements IndexService {
}
