package com.example.first.service.serviceImpl;

import com.example.first.dto.GoodsForOrdersRequest;
import com.example.first.dto.GoodsForOrdersResponse;
import com.example.first.dto.GoodsRequest;
import com.example.first.dto.GoodsResponse;
import com.example.first.entity.Goods;
import com.example.first.entity.GoodsForOrders;
import com.example.first.repository.GoodsForOrdersRepository;
import com.example.first.repository.GoodsRepository;
import com.example.first.repository.SubCategoryRepository;
import com.example.first.service.GoodsForOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsForOrdersServiceImpl implements GoodsForOrdersService{


    @Autowired
    private GoodsForOrdersRepository goodsForOrdersRepository;

    @Autowired
    private GoodsRepository goodsRepository;


    @Override
    public GoodsForOrdersResponse save(GoodsForOrdersRequest goodsForOrdersRequest) {
        GoodsForOrders goodsForOrders = new GoodsForOrders();
        goodsForOrders.setId(goodsForOrdersRequest.getId());
        goodsForOrders.setCount(goodsForOrdersRequest.getCount());
        goodsForOrders.setUnitPrice(goodsForOrdersRequest.getUnitPrice());
        goodsForOrders.setGoods(goodsRepository.findOne(goodsForOrdersRequest.getIdGoods()));
        return new GoodsForOrdersResponse(goodsForOrdersRepository.save(goodsForOrders));
    }

    @Override
    public GoodsForOrders findOne(Long id) {
        return goodsForOrdersRepository.findOne(id);
    }

    @Override
    public List<GoodsForOrdersResponse> findAll() {
        return null;
    }

    @Override
    public GoodsForOrdersResponse update(Long id, GoodsForOrdersRequest goodsForOrdersRequest) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
