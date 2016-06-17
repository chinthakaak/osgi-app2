package com.examples.client;

import com.examples.provider.HelloProvider;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

/**
 * Created by ka40215 on 6/17/16.
 */
public class Client implements BundleActivator {

    public void start(BundleContext bundleContext) throws Exception {
        ServiceReference serviceReference = bundleContext.getServiceReference(HelloProvider.class.getName());
        ((HelloProvider)bundleContext.getService(serviceReference)).sayHello();
    }

    public void stop(BundleContext bundleContext) throws Exception {

    }
}
