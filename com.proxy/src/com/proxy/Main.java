package com.proxy;

import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		
	     List<String> sites = Arrays.asList("fawryWeb","abdalrhmnr.g","www.google","Facebook", "Youtube", "Twitter");

		
		InternetServiceProvider internetServiceProvider = new InternetProxy();

        for(String site: sites) {
            System.out.println(internetServiceProvider.serverSite(site));
        }
	}

}
