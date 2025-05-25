package com.bykv.vk.openvk.preload.falconx.loader;

import java.io.InputStream;
import java.util.Map;

/* loaded from: classes.dex */
public interface ILoader {
    boolean exist(String str);

    Map<String, Long> getChannelVersion();

    InputStream getInputStream(String str);

    String getResRootDir();

    void release();
}
