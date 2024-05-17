package com.example.travel_backend.service;

import com.example.travel_backend.data.TourDTO;
import com.example.travel_backend.mapper.TourMapper;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinationService {
    private final TourMapper tourMapper;

    @Autowired
    public DestinationService(TourMapper tourMapper) {
        this.tourMapper = tourMapper;
    }

    public List<TourDTO> getAllDestinations() {
        return tourMapper.selectAllDestinations();
    }
}