package com.myCollections.collection.dao;

import com.myCollections.collection.pojo.Collection;

import java.util.List;

public interface CollectionDao {
    Collection getCollectionByCollectionId(Long collectionId);
    List<Collection> getMainCollectionsByUser(Long userId);
    List<Collection> getSubCollectionsByCollection(Long parentCollectionId);
    List<Collection> getCollectionsByTitle(String title);
    List<Collection> getCollectionsByTitleAndUser(String title, Long userId);
    List<Collection> getDeletedCollectionsByUser(Long userId);
    void addCollection(Collection collection);
    void updateCollectionContext(Collection collection);
    void updateCollectionImage(String image, Long collectionId);
    void updateCollectionIsOwned(boolean isOwned, Long collectionId);
    void updateCollectionIsPublic(boolean isPublic, Long collectionId);
    void deleteCollectionById(Long collectionId);
    void recoverCollectionById(Long collectionId);
}
