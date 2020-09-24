/*
 * WSO2 Identity Server - Application Management Rest API
 * This document specifies a **Application Management RESTful API** for **WSO2 Identity Server** . 
 *
 * OpenAPI spec version: v1
 * Contact: architecture@wso2.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.iqvia.development.portal.application.client.api;

import com.iqvia.development.portal.application.client.ApiCallback;
import com.iqvia.development.portal.application.client.ApiClient;
import com.iqvia.development.portal.application.client.ApiException;
import com.iqvia.development.portal.application.client.ApiResponse;
import com.iqvia.development.portal.application.client.Configuration;
import com.iqvia.development.portal.application.client.Pair;
import com.iqvia.development.portal.application.client.ProgressRequestBody;
import com.iqvia.development.portal.application.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.iqvia.development.portal.application.client.model.Error;
import com.iqvia.development.portal.application.client.model.PassiveStsConfiguration;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InboundProtocolsPassiveStsApi {
    private ApiClient apiClient;

    public InboundProtocolsPassiveStsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InboundProtocolsPassiveStsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deletePassiveStsConfiguration
     * @param applicationId ID of the application. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deletePassiveStsConfigurationCall(String applicationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/applications/{applicationId}/inbound-protocols/passive-sts"
            .replaceAll("\\{" + "applicationId" + "\\}", apiClient.escapeString(applicationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "BasicAuth", "OAuth2" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deletePassiveStsConfigurationValidateBeforeCall(String applicationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'applicationId' is set
        if (applicationId == null) {
            throw new ApiException("Missing the required parameter 'applicationId' when calling deletePassiveStsConfiguration(Async)");
        }
        
        com.squareup.okhttp.Call call = deletePassiveStsConfigurationCall(applicationId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete Passive STS authentication protocol parameters of application 
     * This API provides the capability to delete Passive STS authentication protocol parameters of an application. 
     * @param applicationId ID of the application. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deletePassiveStsConfiguration(String applicationId) throws ApiException {
        deletePassiveStsConfigurationWithHttpInfo(applicationId);
    }

    /**
     * Delete Passive STS authentication protocol parameters of application 
     * This API provides the capability to delete Passive STS authentication protocol parameters of an application. 
     * @param applicationId ID of the application. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deletePassiveStsConfigurationWithHttpInfo(String applicationId) throws ApiException {
        com.squareup.okhttp.Call call = deletePassiveStsConfigurationValidateBeforeCall(applicationId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete Passive STS authentication protocol parameters of application  (asynchronously)
     * This API provides the capability to delete Passive STS authentication protocol parameters of an application. 
     * @param applicationId ID of the application. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deletePassiveStsConfigurationAsync(String applicationId, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deletePassiveStsConfigurationValidateBeforeCall(applicationId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getPassiveStsConfiguration
     * @param applicationId ID of the application (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPassiveStsConfigurationCall(String applicationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/applications/{applicationId}/inbound-protocols/passive-sts"
            .replaceAll("\\{" + "applicationId" + "\\}", apiClient.escapeString(applicationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "BasicAuth", "OAuth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getPassiveStsConfigurationValidateBeforeCall(String applicationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'applicationId' is set
        if (applicationId == null) {
            throw new ApiException("Missing the required parameter 'applicationId' when calling getPassiveStsConfiguration(Async)");
        }
        
        com.squareup.okhttp.Call call = getPassiveStsConfigurationCall(applicationId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieve Passive STS authentication protocol parameters of application 
     * This API provides the capability to retrieve Passive STS authentication protocol parameters of an application. 
     * @param applicationId ID of the application (required)
     * @return PassiveStsConfiguration
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PassiveStsConfiguration getPassiveStsConfiguration(String applicationId) throws ApiException {
        ApiResponse<PassiveStsConfiguration> resp = getPassiveStsConfigurationWithHttpInfo(applicationId);
        return resp.getData();
    }

    /**
     * Retrieve Passive STS authentication protocol parameters of application 
     * This API provides the capability to retrieve Passive STS authentication protocol parameters of an application. 
     * @param applicationId ID of the application (required)
     * @return ApiResponse&lt;PassiveStsConfiguration&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PassiveStsConfiguration> getPassiveStsConfigurationWithHttpInfo(String applicationId) throws ApiException {
        com.squareup.okhttp.Call call = getPassiveStsConfigurationValidateBeforeCall(applicationId, null, null);
        Type localVarReturnType = new TypeToken<PassiveStsConfiguration>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve Passive STS authentication protocol parameters of application  (asynchronously)
     * This API provides the capability to retrieve Passive STS authentication protocol parameters of an application. 
     * @param applicationId ID of the application (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPassiveStsConfigurationAsync(String applicationId, final ApiCallback<PassiveStsConfiguration> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getPassiveStsConfigurationValidateBeforeCall(applicationId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PassiveStsConfiguration>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updatePassiveStsConfiguration
     * @param body This represents the Passive STS authentication protocol parameters of an application. (required)
     * @param applicationId ID of the application. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updatePassiveStsConfigurationCall(PassiveStsConfiguration body, String applicationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/applications/{applicationId}/inbound-protocols/passive-sts"
            .replaceAll("\\{" + "applicationId" + "\\}", apiClient.escapeString(applicationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "BasicAuth", "OAuth2" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updatePassiveStsConfigurationValidateBeforeCall(PassiveStsConfiguration body, String applicationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updatePassiveStsConfiguration(Async)");
        }
        // verify the required parameter 'applicationId' is set
        if (applicationId == null) {
            throw new ApiException("Missing the required parameter 'applicationId' when calling updatePassiveStsConfiguration(Async)");
        }
        
        com.squareup.okhttp.Call call = updatePassiveStsConfigurationCall(body, applicationId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update Passive STS authentication protocol parameters of application 
     * This API provides the capability to store passive STS authentication protocol parameters of an application. 
     * @param body This represents the Passive STS authentication protocol parameters of an application. (required)
     * @param applicationId ID of the application. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void updatePassiveStsConfiguration(PassiveStsConfiguration body, String applicationId) throws ApiException {
        updatePassiveStsConfigurationWithHttpInfo(body, applicationId);
    }

    /**
     * Update Passive STS authentication protocol parameters of application 
     * This API provides the capability to store passive STS authentication protocol parameters of an application. 
     * @param body This represents the Passive STS authentication protocol parameters of an application. (required)
     * @param applicationId ID of the application. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> updatePassiveStsConfigurationWithHttpInfo(PassiveStsConfiguration body, String applicationId) throws ApiException {
        com.squareup.okhttp.Call call = updatePassiveStsConfigurationValidateBeforeCall(body, applicationId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Update Passive STS authentication protocol parameters of application  (asynchronously)
     * This API provides the capability to store passive STS authentication protocol parameters of an application. 
     * @param body This represents the Passive STS authentication protocol parameters of an application. (required)
     * @param applicationId ID of the application. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updatePassiveStsConfigurationAsync(PassiveStsConfiguration body, String applicationId, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updatePassiveStsConfigurationValidateBeforeCall(body, applicationId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}