package com.outreachengine.campaign.dto;


import java.time.Instant;

public record CreateCampaignResponse(String campaignId, String status, int totalRecipients, Instant createdAt) {
}