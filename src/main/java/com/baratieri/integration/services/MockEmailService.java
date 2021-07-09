package com.baratieri.integration.services;

import com.baratieri.integration.dto.EmailDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MockEmailService implements EmailService {

    private static Logger LOG = LoggerFactory.getLogger(MockEmailService.class);

    public void senEmail(EmailDTO dto) {

        LOG.info("Sending email to: " + dto.getTo());
        LOG.info("Email sent !");
    }
}
