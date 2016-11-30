/*
 * Copyright (C) 2012-2016 52°North Initiative for Geospatial Open Source
 * Software GmbH
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 as published
 * by the Free Software Foundation.
 *
 * If the program is linked with libraries which are licensed under one of
 * the following licenses, the combination of the program with the linked
 * library is not considered a "derivative work" of the program:
 *
 *     - Apache License, version 2.0
 *     - Apache Software License, version 1.0
 *     - GNU Lesser General Public License, version 3
 *     - Mozilla Public License, versions 1.0, 1.1 and 2.0
 *     - Common Development and Distribution License (CDDL), version 1.0
 *
 * Therefore the distribution of the program linked with libraries licensed
 * under the aforementioned licenses, is permitted by the copyright holders
 * if the distribution is compliant with both the GNU General Public
 * License version 2 and the aforementioned licenses.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details.
 */
package org.n52.shetland.ogc.sos.request;

import org.n52.shetland.ogc.sos.ResponseFormat;
import org.n52.shetland.ogc.ows.service.OwsServiceRequest;

import com.google.common.base.Strings;

/**
 * SOS AbstractObservation request
 *
 * @since 4.0.0
 */
public abstract class AbstractObservationRequest extends OwsServiceRequest
        implements ResponseFormat, SrsNameRequest {
    /**
     * SRS name
     */
    private String srsName;

    /**
     * Response format
     */
    private String responseFormat;

    /**
     * Result model
     */
    private String resultModel;

    /**
     * Response mode
     */
    private String responseMode;

    public AbstractObservationRequest() {
    }

    public AbstractObservationRequest(String service, String version) {
        super(service, version);
    }

    public AbstractObservationRequest(String service, String version, String operationName) {
        super(service, version, operationName);
    }

    /**
     * Get response format
     *
     * @return response format
     */
    @Override
    public String getResponseFormat() {
        return responseFormat;
    }

    /**
     * Set response format
     *
     * @param responseFormat
     *                       response format
     */
    @Override
    public void setResponseFormat(String responseFormat) {
        this.responseFormat = responseFormat;
    }

    @Override
    public boolean isSetResponseFormat() {
        return !Strings.isNullOrEmpty(getResponseFormat());
    }

    /**
     * Get response mode
     *
     * @return response mode
     */
    public String getResponseMode() {
        return responseMode;
    }

    /**
     * Set response mode
     *
     * @param responseMode
     *                     response mode
     */
    public void setResponseMode(String responseMode) {
        this.responseMode = responseMode;
    }

    public boolean isSetResponseMode() {
        return !Strings.isNullOrEmpty(getResponseMode());
    }

    /**
     * Get result model
     *
     * @return result model
     */
    public String getResultModel() {
        return resultModel;
    }

    /**
     * Set result model
     *
     * @param resultModel
     *                    result model
     */
    public void setResultModel(String resultModel) {
        this.resultModel = resultModel;
    }

    public boolean isSetResultModel() {
        return !Strings.isNullOrEmpty(getResultModel());
    }

    @Override
    public String getSrsName() {
        return srsName;
    }

    @Override
    public void setSrsName(String srsName) {
        this.srsName = srsName;
    }

    @Override
    public boolean isSetSrsName() {
        return !Strings.isNullOrEmpty(getSrsName());
    }

    public void copyOf(AbstractObservationRequest res) {
        res.setResponseFormat(this.responseFormat);
        res.setResponseMode(this.responseMode);
        res.setResultModel(this.resultModel);
        res.setSrsName(this.srsName);
    }

}
