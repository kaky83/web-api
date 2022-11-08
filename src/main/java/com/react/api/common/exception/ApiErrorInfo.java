package com.react.api.common.exception;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class ApiErrorInfo {

    private String message;

    private final List<ApiErrorDetailInfo> details = new ArrayList<ApiErrorDetailInfo>();

}
