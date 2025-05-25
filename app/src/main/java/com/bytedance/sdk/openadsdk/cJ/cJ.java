package com.bytedance.sdk.openadsdk.cJ;

import com.inmobi.media.C1646h;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: AdEventConstants.java */
/* loaded from: classes.dex */
public class cJ {
    public static final Set<String> Qhi = new HashSet(Arrays.asList(C1646h.CLICK_BEACON, "show", "insight_log"));

    /* compiled from: AdEventConstants.java */
    /* loaded from: classes.dex */
    public static class Qhi {
        public static String Qhi = "openDetailPage";

        /* renamed from: ac  reason: collision with root package name */
        public static String f8694ac = "direct";
        public static String cJ = "openAdLandPageLinks";
    }

    /* compiled from: AdEventConstants.java */
    /* renamed from: com.bytedance.sdk.openadsdk.cJ.cJ$cJ  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0110cJ {
        public static int Qhi = 1;

        /* renamed from: ac  reason: collision with root package name */
        public static int f8695ac = 100;
        public static int cJ = 2;
    }

    public static boolean Qhi(String str) {
        if (!"embeded_ad".equals(str) && !"banner_ad".equals(str) && !"interaction".equals(str) && !"slide_banner_ad".equals(str)) {
            return false;
        }
        return true;
    }
}
