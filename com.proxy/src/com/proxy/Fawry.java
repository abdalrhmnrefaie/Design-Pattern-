package com.proxy;

public class Fawry  implements InternetServiceProvider{

    private int browsingSpeed = 10;

    @Override
    public String serverSite(String url) {
        return String.format("https://%s.com", url);
    }


    public int getBrowsingSpeed() {
        return browsingSpeed;
    }

}
