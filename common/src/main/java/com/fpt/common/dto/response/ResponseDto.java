package com.fpt.common.dto.response;

import lombok.*;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ResponseDto<T> {
    private String timestamp;
    private String message;
    private T data;
    private List<T> list;
    private String uri;
}
