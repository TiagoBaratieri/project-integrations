package com.baratieri.integration.services;

import com.baratieri.integration.dto.EmailDTO;

public interface EmailService {

    void senEmail(EmailDTO dto);
}
