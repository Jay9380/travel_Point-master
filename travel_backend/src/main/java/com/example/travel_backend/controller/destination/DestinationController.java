package com.example.travel_backend.controller.destination;

import com.example.travel_backend.data.TourDTO;
import com.example.travel_backend.mapper.TourMapper;
import com.example.travel_backend.service.DestinationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "관광지 정보 호출", description = "모든 관광지 정보들 호출이 가능합니다.")
@RestController // json, xml 형식으로 데이터 반환
public class DestinationController {
    private final DestinationService destinationService; //destination 컨트롤러에서 사용하는 객체

    @Autowired
    public DestinationController(DestinationService destinationService) { // 의존성 주입?
        this.destinationService = destinationService;
    }

    @Operation(summary = "관광 데이터 호출", description = "모든 관광 데이터들을 호출합니다.")
    @GetMapping("/destination/")
    public List<TourDTO> allDestination() {
        return destinationService.getAllDestinations();
    }
}
