package com.react.api.common.exception;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ApiErrorDetailInfo {
    private String target;
    private String message;
}
