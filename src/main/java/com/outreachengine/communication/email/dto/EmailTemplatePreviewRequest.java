package com.outreachengine.communication.email.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.util.Map;

public record EmailTemplatePreviewRequest(@NotBlank(message = "Template name is required") String templateName,
                                          @NotEmpty(message = "Template variables are required")
                                          Map<String, Object> variables) {
}