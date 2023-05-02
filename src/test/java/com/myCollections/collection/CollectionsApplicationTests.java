package com.myCollections.collection;

import com.myCollections.collection.controller.UserController;
import com.myCollections.collection.pojo.Collection;
import com.myCollections.collection.repository.CollectionRepository;
import com.myCollections.collection.service.CollectionService;
import com.myCollections.collection.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.myCollections.collection.repository.UserRepository;

import java.util.List;

@SpringBootTest
class CollectionsApplicationTests {
    @Autowired
    UserRepository userRepository;

    @Autowired
    CollectionRepository collectionRepository;

    @Autowired
    UserController userController;

    @Autowired
    UserService userService;

    @Autowired
    CollectionService collectionService;

    @Test
    public void getSpringVersion() {
        List<Collection> list = collectionRepository.findByTitleContainingAndIsDeletedFalse("123");
        System.out.println(list.size());

    }

}
