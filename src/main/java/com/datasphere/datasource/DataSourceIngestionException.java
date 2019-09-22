/*
 * Copyright 2019, Huahuidata, Inc.
 * DataSphere is licensed under the Mulan PSL v1.
 * You can use this software according to the terms and conditions of the Mulan PSL v1.
 * You may obtain a copy of Mulan PSL v1 at:
 * http://license.coscl.org.cn/MulanPSL
 * THIS SOFTWARE IS PROVIDED ON AN "AS IS" BASIS, WITHOUT WARRANTIES OF ANY KIND, EITHER EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO NON-INFRINGEMENT, MERCHANTABILITY OR FIT FOR A PARTICULAR
 * PURPOSE.
 * See the Mulan PSL v1 for more details.
 */

package com.datasphere.datasource;

import static com.datasphere.datasource.DataSourceErrorCodes.INGESTION_COMMON_ERROR;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.datasphere.server.common.exception.ErrorCodes;
import com.datasphere.server.common.exception.DSSException;


@ResponseStatus(value= HttpStatus.INTERNAL_SERVER_ERROR, reason="DataSource Ingestion Error")
public class DataSourceIngestionException extends DSSException {

  public DataSourceIngestionException(String message) {
    super(INGESTION_COMMON_ERROR, message);
  }

  public DataSourceIngestionException(String message, Throwable cause) {
    super(INGESTION_COMMON_ERROR, message, cause);
  }

  public DataSourceIngestionException(ErrorCodes code, Throwable cause) {
    super(code, cause);
  }

  public DataSourceIngestionException(ErrorCodes code, String message) {
    super(code, message);
  }

  public DataSourceIngestionException(ErrorCodes code, String message, Throwable cause) {
    super(code, message, cause);
  }
}
