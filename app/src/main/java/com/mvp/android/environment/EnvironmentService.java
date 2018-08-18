package com.mvp.android.environment;

import android.net.Uri;

public interface EnvironmentService {
    /**
     * Get Uri Builder for this environment
     */
    Uri.Builder getUriBuilder();

    /**
     * Get Environment Server Timeout in MS
     * @return Server Timeout
     */
    int getServerTimeoutInMS();

    /**
     * Get Request retry count
     * @return Retry count
     */
    int getRequestRetryCount();

    /**
     * Get Request backoff multiplier
     * @return Request backoff multiplier
     */
    float getRequestBackoffMultiplier();

    /**
     * Get Header request
     * @return header accept request.
     */
    String getContentType();
}
