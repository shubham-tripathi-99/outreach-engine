package com.outreachengine.campaign.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;
import java.util.Map;

public record CreateCampaignRequest(@NotBlank(message = "Campaign name is required") String campaignName,
                                    @NotBlank(message = "Subject is required") String subject,
                                    @NotEmpty(message = "At least one recipient email is required")
                                    List<@Email(message = "Invalid recipient email") String> recipients,
                                    Map<String, Object> templateVariables) {
}