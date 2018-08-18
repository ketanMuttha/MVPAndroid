package com.mvp.android.environment;

import android.net.Uri;

public class WeatherEnvironment implements EnvironmentService{

    /** Cutter Production URL Scheme */
    private final String WEATHER_URL_SCHEME = "https";

    /** Cutter Production URL Authority */
    private final String WEATHER_BACKEND_URL_AUTHORITY = "www.metaweather.com";

    /** Server timeout in milliseconds */
    private final int SERVER_TIMEOUT_IN_MS = 10000;

    /** Request retry count */
    private final int SERVER_REQUEST_RETRY_COUNT = 0;

    /** Request Backoff multiplier */
    private final float SERVER_REQUEST_BACKOFF_MULTIPLIER = 1f;

    private static final String CONTENT_TYPE = "application/json";

    @Override
    public Uri.Builder getUriBuilder() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(WEATHER_URL_SCHEME);
        builder.authority(WEATHER_BACKEND_URL_AUTHORITY);
        return builder;
    }

    @Override
    public int getServerTimeoutInMS() {
        return SERVER_TIMEOUT_IN_MS;
    }

    @Override
    public int getRequestRetryCount() {
        return SERVER_REQUEST_RETRY_COUNT;
    }

    @Override
    public float getRequestBackoffMultiplier() {
        return SERVER_REQUEST_BACKOFF_MULTIPLIER;
    }

    @Override
    public String getContentType() {
        return CONTENT_TYPE;
    }
}
