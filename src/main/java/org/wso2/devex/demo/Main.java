package org.wso2.devex.demo;

import com.iqvia.development.portal.application.client.ApiClient;
import com.iqvia.development.portal.application.client.ApiException;
import com.iqvia.development.portal.application.client.ApiResponse;
import com.iqvia.development.portal.application.client.Configuration;
import com.iqvia.development.portal.application.client.api.ApplicationsApi;
import com.iqvia.development.portal.application.client.model.ApplicationModel;

import javax.servlet.http.HttpServletResponse;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    final static Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        // Configure default API client
        configureDefaultHttpClient();
        ApplicationsApi applicationsApi = new ApplicationsApi();
        // Create the model of the application that needs to be created.
        ApplicationModel application = new ApplicationModel();
        application.setName("sample-application");
        application.setDescription("Sample application for dev-ex sub demo.");
        try {
            ApiResponse<Void> apiResponse = applicationsApi.createApplicationWithHttpInfo(application,
                    null);
            if (HttpServletResponse.SC_CREATED == apiResponse.getStatusCode()) {
                LOGGER.log(Level.INFO, "Application successfully created.");
            }
        } catch (ApiException e) {
            LOGGER.log(Level.INFO, "Application creation failed.");
        }
    }

    protected static void configureDefaultHttpClient() {

        ApiClient apiClient = new ApiClient();
        // Configure base path of the API.
        String host = "localhost";
        String port  = "9443";
        String tenantDomain = "carbon.super";
        String basePath = "https://" + host + ":" + port + "/t/" + tenantDomain + "/api/server/v1";
        apiClient.setBasePath(basePath);
        apiClient.setVerifyingSsl(false);
        // Set username and password of the API client.
        apiClient.setUsername("admin@wso2.com");
        apiClient.setPassword("admin");
        // Set the API client as the default API client.
        Configuration.setDefaultApiClient(apiClient);
    }
}
