package com.outreachengine.communication.email.dto;

public record EmailTemplatePreviewResponse(String templateName, String renderedContent) {
}