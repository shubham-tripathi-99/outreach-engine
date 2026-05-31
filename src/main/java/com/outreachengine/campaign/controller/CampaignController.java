package com.outreachengine.campaign.controller;

import com.outreachengine.campaign.dto.CreateCampaignRequest;
import com.outreachengine.campaign.dto.CreateCampaignResponse;
import com.outreachengine.campaign.service.CampaignService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/campaigns")
@RequiredArgsConstructor
public class CampaignController {

    private final CampaignService campaignService;

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public CreateCampaignResponse createCampaign(@Valid @RequestBody CreateCampaignRequest request) {
        return campaignService.createCampaign(request);
    }

}