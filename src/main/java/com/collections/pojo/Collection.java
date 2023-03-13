package com.collections.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Collection {
    Long collectionId;
    Long userId;
    String title;
    String websiteAddress;
    String description;
    String imagePath;
    boolean owned;
    Long parentCollectionId;
}