package de.hofuniversity.iisys.camunda.cockpithistory;

import java.util.HashSet;
import java.util.Set;

import org.camunda.bpm.cockpit.plugin.spi.impl.AbstractCockpitPlugin;

import de.hofuniversity.iisys.camunda.cockpithistory.resource.HistoryPluginRootResource;

public class HistoryPlugin extends AbstractCockpitPlugin
{
    public static final String ID = "cockpit-history-plugin";

    @Override
    public String getId()
    {
        return ID;
    }

    @Override
    public Set<Class<?>> getResourceClasses() {
      Set<Class<?>> classes = new HashSet<Class<?>>();

      classes.add(HistoryPluginRootResource.class);

      return classes;
    }
}
