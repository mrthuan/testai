package com.bytedance.sdk.component.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.lang.reflect.Method;

/* compiled from: ResourceHelp.java */
/* loaded from: classes.dex */
public final class MQ {
    private static String CJ = null;
    @SuppressLint({"StaticFieldLeak"})
    private static Context Qhi = null;
    private static boolean Tgh = false;

    /* renamed from: ac  reason: collision with root package name */
    private static Resources f8423ac = null;
    private static String cJ = null;

    /* renamed from: fl  reason: collision with root package name */
    private static boolean f8424fl = false;

    private static String CJ(Context context) {
        if (CJ == null) {
            CJ = context.getPackageName();
        }
        return CJ;
    }

    public static void Qhi(Context context) {
        Qhi = context;
    }

    public static int ROR(Context context, String str) {
        return cJ(context).getColor(Sf(context, str));
    }

    public static int Sf(Context context, String str) {
        return Qhi(context, str, "color");
    }

    public static int Tgh(Context context, String str) {
        return Qhi(context, str, "style");
    }

    public static Drawable ac(Context context, String str) {
        return cJ(context).getDrawable(CJ(context, str));
    }

    public static int cJ(Context context, String str) {
        return Qhi(context, str, "string");
    }

    public static int fl(Context context, String str) {
        return Qhi(context, str, FacebookMediationAdapter.KEY_ID);
    }

    public static int hm(Context context, String str) {
        return Qhi(context, str, "anim");
    }

    public static void Qhi(String str) {
        CJ = str;
    }

    public static Resources cJ(Context context) {
        Resources resources = f8423ac;
        if (resources == null) {
            resources = null;
        }
        Context context2 = Qhi;
        if (context2 != null) {
            resources = context2.getResources();
        }
        return resources == null ? context.getResources() : resources;
    }

    private static int Qhi(Context context, String str, String str2) {
        int identifier = cJ(context).getIdentifier(str, str2, CJ(context));
        if (identifier == 0) {
            if (!f8424fl) {
                ac(context);
                return cJ(context).getIdentifier(str, str2, CJ(context));
            }
            return context.getResources().getIdentifier(str, str2, CJ(context));
        }
        return identifier;
    }

    public static synchronized void ac(Context context) {
        synchronized (MQ.class) {
            try {
                if (TextUtils.isEmpty(cJ)) {
                    return;
                }
                Resources resources = context.getResources();
                f8423ac = new Resources(cJ(resources.getAssets(), cJ + "/apk/base-1.apk"), resources.getDisplayMetrics(), resources.getConfiguration());
                CJ = context.getPackageName();
                f8424fl = true;
            } catch (Throwable unused) {
            }
        }
    }

    public static int CJ(Context context, String str) {
        return Qhi(context, str, "drawable");
    }

    private static AssetManager cJ(AssetManager assetManager, String str) {
        AssetManager assetManager2;
        try {
            if (assetManager.getClass().getName().equals("android.content.res.BaiduAssetManager")) {
                assetManager2 = (AssetManager) Class.forName("android.content.res.BaiduAssetManager").getConstructor(new Class[0]).newInstance(new Object[0]);
            } else {
                assetManager2 = (AssetManager) AssetManager.class.newInstance();
            }
            Qhi(assetManager2, str);
            assetManager = assetManager2;
        } catch (Exception unused) {
            Qhi(assetManager, str);
        }
        try {
            pM.Qhi(assetManager, "ensureStringBlocks", new Object[0]);
        } catch (Exception unused2) {
        }
        return assetManager;
    }

    public static String Qhi(Context context, String str) {
        return cJ(context).getString(cJ(context, str));
    }

    public static boolean Qhi(AssetManager assetManager, String str) {
        Method Qhi2 = pM.Qhi((Class<?>) AssetManager.class, "addAssetPath", (Class<?>[]) new Class[]{String.class});
        if (Qhi2 == null) {
            Qhi2 = pM.Qhi((Class<?>) AssetManager.class, "addAssetPath", (Class<?>[]) new Class[]{String.class});
        }
        if (Qhi2 != null) {
            int i10 = 3;
            while (true) {
                int i11 = i10 - 1;
                if (i10 < 0) {
                    break;
                } else if (((Integer) Qhi2.invoke(assetManager, str)).intValue() != 0) {
                    return true;
                } else {
                    i10 = i11;
                }
            }
        }
        return false;
    }
}
