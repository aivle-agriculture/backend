package com.aivle.agriculture.domain.chat.dto;

import lombok.Builder;

@Builder
public record ChatResponse(String conversationId, String answer) {
}
