package com.facebook.appevents.gps.ara;

import cg.l;
import com.facebook.appevents.AppEvent;
import java.net.URLEncoder;
import java.util.Iterator;
import jg.k;
import kotlin.jvm.internal.g;
import org.json.JSONObject;
import y5.a;

/* compiled from: GpsAraTriggersManager.kt */
/* loaded from: classes.dex */
public final class GpsAraTriggersManager {

    /* renamed from: a  reason: collision with root package name */
    public static final GpsAraTriggersManager f9522a = new GpsAraTriggersManager();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f9523b;
    public static a c;

    /* renamed from: d  reason: collision with root package name */
    public static String f9524d;

    static {
        g.d(GpsAraTriggersManager.class.toString(), "GpsAraTriggersManager::class.java.toString()");
    }

    public final String a(AppEvent appEvent) {
        if (k6.a.b(this)) {
            return null;
        }
        try {
            final JSONObject jSONObject = appEvent.getJSONObject();
            if (jSONObject != null && jSONObject.length() != 0) {
                Iterator<String> keys = jSONObject.keys();
                g.d(keys, "params.keys()");
                return kotlin.sequences.a.g0(kotlin.sequences.a.h0(k.f0(keys), new l<String, String>() { // from class: com.facebook.appevents.gps.ara.GpsAraTriggersManager$getEventParameters$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cg.l
                    public final String invoke(String str) {
                        Object opt = jSONObject.opt(str);
                        if (opt == null) {
                            return null;
                        }
                        try {
                            String encode = URLEncoder.encode(str, "UTF-8");
                            String encode2 = URLEncoder.encode(opt.toString(), "UTF-8");
                            return encode + '=' + encode2;
                        } catch (Exception unused) {
                            return null;
                        }
                    }
                }), "&");
            }
            return "";
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041 A[Catch: all -> 0x0110, TRY_LEAVE, TryCatch #5 {all -> 0x0110, blocks: (B:5:0x000f, B:19:0x0041, B:31:0x0057, B:33:0x005c, B:35:0x0066, B:37:0x0073, B:44:0x009d, B:45:0x00a5, B:52:0x00ac, B:53:0x00b4, B:54:0x00b5, B:55:0x00ba, B:56:0x00bb, B:57:0x00c1, B:58:0x00c2, B:60:0x00c6, B:61:0x00d8, B:62:0x00db, B:63:0x00dc, B:65:0x00e0, B:66:0x00f2, B:67:0x00f5, B:68:0x00f6, B:70:0x00fa, B:72:0x010c, B:73:0x010f, B:9:0x0018, B:11:0x002a, B:22:0x0048), top: B:78:0x000f }] */
    @android.annotation.TargetApi(34)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.String r10, com.facebook.appevents.AppEvent r11) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.gps.ara.GpsAraTriggersManager.b(java.lang.String, com.facebook.appevents.AppEvent):void");
    }
}
