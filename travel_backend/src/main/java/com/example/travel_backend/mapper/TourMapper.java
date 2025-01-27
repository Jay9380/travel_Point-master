package com.example.travel_backend.mapper;

import com.example.travel_backend.data.TourDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TourMapper {
    void insertTourDTO(TourDTO tourDTO);

    List<String> getAllContentIds();

    void updateDescriptionAndHomepageByContentId(String contentId, String description, String homepage);

    void updateIntroduceByContentId(String contentId, String parking, String useTime, String holiday);

    void updateImageByContentId(String contentId, String firstimage2, String firstimage3, String firstimage4, String firstimage5);

    List<TourDTO> selectAllDestinations(); // 관광지 모든 정보
}
