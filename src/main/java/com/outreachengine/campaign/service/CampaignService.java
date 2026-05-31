package com.outreachengine.campaign.service;

import com.outreachengine.campaign.dto.CreateCampaignRequest;
import com.outreachengine.campaign.dto.CreateCampaignResponse;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.UUID;

@Service
public class CampaignService {

    public CreateCampaignResponse createCampaign(CreateCampaignRequest request) {
        String campaignId = UUID.randomUUID().toString();
        return new CreateCampaignResponse(campaignId, "ACCEPTED", request.recipients().size(), Instant.now());
    }

}