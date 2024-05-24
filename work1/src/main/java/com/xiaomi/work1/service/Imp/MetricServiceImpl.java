package com.xiaomi.work1.service.Imp;

import com.xiaomi.work1.bean.Result;
import com.xiaomi.work1.mapper.MetricMapper;
import com.xiaomi.work1.service.MetricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Metric;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: MetricServiceImpl
 * Package: com.xiaomi.work1.service.Imp
 * Description:服务实现类
 *
 * @Author WangYang
 * @Create 2024/5/24 22:06
 * @Version 1.0
 */
@Service
public class MetricServiceImpl implements MetricService {
    @Autowired
    private MetricMapper metricMapper;
    @Override
    public Result<?> uploadMetrics(List<Metric> metrics) {

        return null;
    }

    @Override
    public Result<?> queryMetrics(String endpoint, String metric, Long startTs, Long endTs) {
        return null;
    }
}
