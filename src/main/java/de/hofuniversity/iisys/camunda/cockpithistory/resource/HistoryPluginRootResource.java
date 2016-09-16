package de.hofuniversity.iisys.camunda.cockpithistory.resource;

import javax.ws.rs.Path;

import org.camunda.bpm.cockpit.plugin.resource.AbstractPluginRootResource;

import de.hofuniversity.iisys.camunda.cockpithistory.HistoryPlugin;

@Path("plugin/" + HistoryPlugin.ID)
public class HistoryPluginRootResource extends AbstractPluginRootResource
{
    public HistoryPluginRootResource()
    {
        super(HistoryPlugin.ID);
    }
}
