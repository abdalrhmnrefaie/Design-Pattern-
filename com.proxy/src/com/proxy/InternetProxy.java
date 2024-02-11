package com.proxy;

import java.util.Arrays;
import java.util.List;

public class InternetProxy implements InternetServiceProvider {

    private List<String> blockedSites = Arrays.asList("Facebook", "Youtube", "Twitter");

	
	@Override
	public String serverSite(String url) {

		internetLog(url);
        if (blockedSites.contains(url)) {
            return "This Website Is Blocked!";
        }
		return new Fawry().serverSite(url);
	}


	private void internetLog(String url) {

		System.out.printf("[%d] -> %s requested \n ",
				System.currentTimeMillis(), url);
	}

}
