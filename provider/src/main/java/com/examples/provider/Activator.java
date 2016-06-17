package com.examples.provider;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * Created by ka40215 on 6/17/16.
 */
public class Activator implements BundleActivator {
    public void start(BundleContext bundleContext) throws Exception {
        bundleContext.registerService(HelloProvider.class.getName(), new HelloProvider(), null);
    }

    public void stop(BundleContext bundleContext) throws Exception {

    }
}
