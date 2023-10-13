package com.xzx.controller;

import com.xzx.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    /**
     * 根据id查询
     * @param
     * @return
     */
    @GetMapping("/select/{index}")
    public Object select(@PathVariable Integer index) {
        return orderService.method1(index);
    }

    /**
     * 查询全部
     * @return
     */
    @GetMapping("/selectAll")
    public Object selectAll() {
        return orderService.method5();
    }

    /**
     * 新增数据
     * @param seq
     * @return
     */
    @PostMapping("/add")
    public Object add(@RequestParam String seq) {
        return orderService.method2(seq);
    }

    /**
     * 删除数据
     * @param index
     * @return
     */
    @DeleteMapping("/delete")
    public Object delete(@RequestParam int index) {
        return orderService.method3(index);
    }

    /**
     * 修改数据
     * @param index
     * @param element
     * @return
     */
    @PutMapping("/update")
    public Object update(@RequestParam Integer index,@RequestParam String element) {
        return orderService.method4(index,element);
    }
}
