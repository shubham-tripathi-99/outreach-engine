package com.outreachengine.communication.email.controller;

import com.outreachengine.communication.email.dto.EmailTemplatePreviewRequest;
import com.outreachengine.communication.email.dto.EmailTemplatePreviewResponse;
import com.outreachengine.communication.email.service.EmailTemplateService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/email-templates")
@RequiredArgsConstructor
public class EmailTemplateController {

    private final EmailTemplateService emailTemplateService;

    @PostMapping("/preview")
    public EmailTemplatePreviewResponse previewTemplate(@Valid @RequestBody EmailTemplatePreviewRequest request) {

        String renderedContent = emailTemplateService.renderTemplate(request.templateName(), request.variables());
        return new EmailTemplatePreviewResponse(request.templateName(), renderedContent);

    }

}