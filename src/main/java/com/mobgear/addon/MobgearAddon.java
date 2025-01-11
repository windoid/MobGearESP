package com.mobgear.addon;

import com.mobgear.addon.modules.MobGearESP;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.GithubRepo;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.hud.HudGroup;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;

public class MobgearAddon extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final Category CATEGORY = new Category("MobGearESP");
    public static final HudGroup HUD_GROUP = new HudGroup("MobGearESP");

    @Override
    public void onInitialize() {
        LOG.info("Initializing Mobgear Addon");

        // Modules
        Modules.get().add(new MobGearESP());
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "com.mobgear.addon";
    }

    @Override
    public GithubRepo getRepo() {
        return new GithubRepo("windoid", "MobGearESP");
    }
}
