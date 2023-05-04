package com.myCollections.collection;

import com.myCollections.collection.pojo.Collection;
import com.myCollections.collection.repository.CollectionRepository;
import com.myCollections.collection.service.CollectionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CollectionApplicationTests {

    @Autowired
    CollectionRepository collectionRepository;

    @Autowired
    CollectionService collectionService;

    @Test
    public void getSpringVersion() {
        Collection collection = collectionRepository.findCollectionByCollectionId(149L);
        System.out.println(collection.getIsPublic());

    }

}
