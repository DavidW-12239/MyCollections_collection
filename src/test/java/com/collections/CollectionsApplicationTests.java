package com.collections;

import com.collections.mapper.CollectionMapper;
import com.collections.pojo.Collection;
import com.collections.pojo.User;
import com.collections.service.CollectionService;
import com.collections.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.collections.mapper.UserMapper;

import java.util.List;

@SpringBootTest
class CollectionsApplicationTests {
    @Autowired
    UserMapper userMapper;

    @Autowired
    CollectionMapper collectionMapper;

    @Autowired
    UserService userService;

    @Autowired
    CollectionService collectionService;




    @Test
    void testCollection(){
        Collection collection = new Collection
                (null, 2L, "kkk", "casd.com", "description2", "qwe", false, null);
        collectionMapper.addCollection(collection);
    }

}