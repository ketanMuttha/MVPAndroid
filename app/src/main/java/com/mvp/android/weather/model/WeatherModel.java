package com.mvp.android.weather.model;

import com.google.gson.annotations.SerializedName;


public class WeatherModel {

    @SerializedName("timezone")
    private String mTimezone;

    @SerializedName("title")
    private String mTitle;

    @SerializedName("time")
    private String mTime;

    @SerializedName("location_type")
    private String mLocationType;

    @SerializedName("timezone_name")
    private String mTimezoneName;

    @SerializedName("woeid")
    private String mWoeid;

    @SerializedName("parent")
    private Parent mParent;

    @SerializedName("sun_rise")
    private String mSunRise;

    @SerializedName("latt_long")
    private String mLattLong;

    @SerializedName("sun_set")
    private String mSunSet;

    @SerializedName("sources")
    private Sources[] mSources;

    @SerializedName("consolidated_weather")
    private Consolidated_weather[] mConsolidatedWeather;

    public String getTimezone() {
        return mTimezone;
    }

    public void setTimezone(String timezone) {
        this.mTimezone = timezone;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getTime() {
        return mTime;
    }

    public void setTime(String time) {
        this.mTime = time;
    }

    public String getLocation_type() {
        return mLocationType;
    }

    public void setLocation_type(String location_type) {
        this.mLocationType = location_type;
    }

    public String getTimezone_name() {
        return mTimezoneName;
    }

    public void setTimezone_name(String timezone_name) {
        this.mTimezoneName = timezone_name;
    }

    public String getWoeid() {
        return mWoeid;
    }

    public void setWoeid(String woeid) {
        this.mWoeid = woeid;
    }

    public Parent getParent() {
        return mParent;
    }

    public void setParent(Parent parent) {
        this.mParent = parent;
    }

    public String getSun_rise() {
        return mSunRise;
    }

    public void setSun_rise(String sun_rise) {
        this.mSunRise = sun_rise;
    }

    public String getLatt_long() {
        return mLattLong;
    }

    public void setLatt_long(String latt_long) {
        this.mLattLong = latt_long;
    }

    public String getSun_set() {
        return mSunSet;
    }

    public void setSun_set(String sun_set) {
        this.mSunSet = sun_set;
    }

    public Sources[] getSources() {
        return mSources;
    }

    public void setSources(Sources[] sources) {
        this.mSources = sources;
    }

    public Consolidated_weather[] getConsolidated_weather() {
        return mConsolidatedWeather;
    }

    public void setConsolidated_weather(Consolidated_weather[] consolidated_weather) {
        this.mConsolidatedWeather = consolidated_weather;
    }

    @Override
    public String toString() {
        return "ClassPojo [timezone = " + mTimezone + ", mTitle = " + mTitle + ", time = " + mTime + ", location_type = " + mLocationType + ", timezone_name = " + mTimezoneName + ", woeid = " + mWoeid + ", parent = " + mParent + ", sun_rise = " + mSunRise + ", latt_long = " + mLattLong + ", sun_set = " + mSunSet + ", sources = " + mSources + ", consolidated_weather = " + mConsolidatedWeather + "]";
    }

    public class Consolidated_weather {
        @SerializedName("weather_state_name")
        private String mWeatherStateName;

        @SerializedName("visibility")
        private String mVisibility;

        @SerializedName("wind_direction")
        private String mWindDirection;

        @SerializedName("predictability")
        private String mPedictability;

        @SerializedName("min_temp")
        private String mMinTemp;

        @SerializedName("wind_speed")
        private String mWindSpeed;

        @SerializedName("applicable_date")
        private String mApplicableDate;

        @SerializedName("max_temp")
        private String mMaxTemp;

        @SerializedName("id")
        private String mId;

        @SerializedName("humidity")
        private String mHumidity;

        @SerializedName("weather_state_abbr")
        private String mWeatherStateAbbr;

        @SerializedName("created")
        private String mCreated;

        @SerializedName("the_temp")
        private String mTheTemp;

        @SerializedName("air_pressure")
        private String mAirPressure;

        @SerializedName("wind_direction_compass")
        private String mWindDirectionCompass;

        public String getWeather_state_name() {
            return mWeatherStateName;
        }

        public void setWeather_state_name(String weather_state_name) {
            this.mWeatherStateName = weather_state_name;
        }

        public String getVisibility() {
            return mVisibility;
        }

        public void setVisibility(String visibility) {
            this.mVisibility = visibility;
        }

        public String getWind_direction() {
            return mWindDirection;
        }

        public void setWind_direction(String wind_direction) {
            this.mWindDirection = wind_direction;
        }

        public String getPredictability() {
            return mPedictability;
        }

        public void setPredictability(String predictability) {
            this.mPedictability = predictability;
        }

        public String getMin_temp() {
            return mMinTemp;
        }

        public void setMin_temp(String min_temp) {
            this.mMinTemp = min_temp;
        }

        public String getWind_speed() {
            return mWindSpeed;
        }

        public void setWind_speed(String wind_speed) {
            this.mWindSpeed = wind_speed;
        }

        public String getApplicable_date() {
            return mApplicableDate;
        }

        public void setApplicable_date(String applicable_date) {
            this.mApplicableDate = applicable_date;
        }

        public String getMax_temp() {
            return mMaxTemp;
        }

        public void setMax_temp(String max_temp) {
            this.mMaxTemp = max_temp;
        }

        public String getId() {
            return mId;
        }

        public void setId(String id) {
            this.mId = id;
        }

        public String getHumidity() {
            return mHumidity;
        }

        public void setHumidity(String humidity) {
            this.mHumidity = humidity;
        }

        public String getWeather_state_abbr() {
            return mWeatherStateAbbr;
        }

        public void setWeather_state_abbr(String weather_state_abbr) {
            this.mWeatherStateAbbr = weather_state_abbr;
        }

        public String getCreated() {
            return mCreated;
        }

        public void setCreated(String created) {
            this.mCreated = created;
        }

        public String getThe_temp() {
            return mTheTemp;
        }

        public void setThe_temp(String the_temp) {
            this.mTheTemp = the_temp;
        }

        public String getAir_pressure() {
            return mAirPressure;
        }

        public void setAir_pressure(String air_pressure) {
            this.mAirPressure = air_pressure;
        }

        public String getWind_direction_compass() {
            return mWindDirectionCompass;
        }

        public void setWind_direction_compass(String wind_direction_compass) {
            this.mWindDirectionCompass = wind_direction_compass;
        }

        @Override
        public String toString() {
            return "ClassPojo [weather_state_name = " + mWeatherStateName + ", visibility = " + mVisibility + ", wind_direction = " + mWindDirection + ", predictability = " + mPedictability + ", min_temp = " + mMinTemp + ", wind_speed = " + mWindSpeed + ", applicable_date = " + mApplicableDate + ", max_temp = " + mMaxTemp + ", id = " + mId + ", humidity = " + mHumidity + ", weather_state_abbr = " + mWeatherStateAbbr + ", created = " + mCreated + ", the_temp = " + mTheTemp + ", air_pressure = " + mAirPressure + ", wind_direction_compass = " + mWindDirectionCompass + "]";
        }
    }

    public class Sources {
        @SerializedName("title")
        private String mTitle;

        @SerializedName("slug")
        private String mSlug;

        @SerializedName("crawl_rate")
        private String mCrawlRate;

        @SerializedName("url")
        private String mUrl;

        public String getTitle() {
            return mTitle;
        }

        public void setTitle(String title) {
            this.mTitle = title;
        }

        public String getSlug() {
            return mSlug;
        }

        public void setSlug(String slug) {
            this.mSlug = slug;
        }

        public String getCrawl_rate() {
            return mCrawlRate;
        }

        public void setCrawl_rate(String crawl_rate) {
            this.mCrawlRate = crawl_rate;
        }

        public String getUrl() {
            return mUrl;
        }

        public void setUrl(String url) {
            this.mUrl = url;
        }

        @Override
        public String toString() {
            return "ClassPojo [mTitle = " + mTitle + ", slug = " + mSlug + ", crawl_rate = " + mCrawlRate + ", url = " + mUrl + "]";
        }
    }

    public class Parent {
        @SerializedName("title")
        private String mTitle;

        @SerializedName("location_type")
        private String mLocationType;

        @SerializedName("woeid")
        private String mWoeid;

        @SerializedName("latt_long")
        private String mLattLong;

        public String getTitle() {
            return mTitle;
        }

        public void setTitle(String title) {
            this.mTitle = title;
        }

        public String getLocation_type() {
            return mLocationType;
        }

        public void setLocation_type(String location_type) {
            this.mLocationType = location_type;
        }

        public String getWoeid() {
            return mWoeid;
        }

        public void setWoeid(String woeid) {
            this.mWoeid = woeid;
        }

        public String getLatt_long() {
            return mLattLong;
        }

        public void setLatt_long(String latt_long) {
            this.mLattLong = latt_long;
        }

        @Override
        public String toString() {
            return "ClassPojo [mTitle = " + mTitle + ", location_type = " + mLocationType + ", woeid = " + mWoeid + ", latt_long = " + mLattLong + "]";
        }
    }
}
