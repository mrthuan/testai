package com.inmobi.media;

import android.app.Activity;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.Map;

/* loaded from: classes2.dex */
public interface r {
    void a();

    void a(byte b10, Map map);

    void b();

    boolean c();

    void e();

    AdConfig getAdConfig();

    String getAdType();

    String getCreativeId();

    Object getDataModel();

    InterfaceC1768q getFullScreenEventsListener();

    String getImpressionId();

    String getMarkupType();

    byte getPlacementType();

    View getVideoContainerView();

    AbstractC1701kc getViewableAd();

    void setFullScreenActivityContext(Activity activity);
}
