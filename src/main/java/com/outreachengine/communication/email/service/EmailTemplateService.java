package com.outreachengine.communication.email.service;

import com.outreachengine.communication.email.exception.EmailTemplateRenderingException;
import freemarker.template.Configuration;
import freemarker.template.Template;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class EmailTemplateService {

    private final Configuration freemarkerConfiguration;

    public String renderTemplate(String templateName, Map<String, Object> variables) {

        try {
            Template template = freemarkerConfiguration.getTemplate(templateName);
            return FreeMarkerTemplateUtils.processTemplateIntoString(template, variables);
        } catch (Exception e) {
            throw new EmailTemplateRenderingException("Failed to render email template: " + templateName, e);
        }

    }

}
