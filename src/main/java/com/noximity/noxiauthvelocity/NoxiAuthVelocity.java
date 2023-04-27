package com.noximity.noxiauthvelocity;

import com.google.inject.Inject;
import com.velocitypowered.api.command.CommandManager;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;

import java.io.File;

@Plugin(id = "noxiauthvelocity", name = "NoxiAuth", version = "1.0.0",
        url = "https://noximity.com", description = "", authors = {"NoximityMC"})

public class NoxiAuthVelocity {
    private final ProxyServer proxyServer;
    private final CommandManager commandManager;
    public static String mainPath = null;



    @Inject
    public NoxiAuthVelocity(ProxyServer proxyServer, CommandManager commandManager) {
        mainPath = new File("").getAbsolutePath();
        mainPath = mainPath+"/plugins/";
        mainPath = mainPath+"/NoxiAuthVelocity";
        this.proxyServer = proxyServer;
        this.commandManager = commandManager;
        onEnable();
    }

    public void onEnable() {


        System.out.println("NoxiAuth has been enabled!");
    }
}
