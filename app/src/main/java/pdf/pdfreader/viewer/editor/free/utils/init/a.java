package pdf.pdfreader.viewer.editor.free.utils.init;

import android.app.Application;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.play.core.assetpacks.c;
import com.google.android.tools.f;
import com.lib.flutter.encrypt.EngineHelper;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.g;

/* compiled from: AppInitHelper.kt */
/* loaded from: classes3.dex */
public final class a implements pl.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Application f28708a;

    public a(Application application) {
        this.f28708a = application;
    }

    @Override // pl.a
    public final String a() {
        EngineHelper.f15726a.getClass();
        String str = (String) EngineHelper.f15730f.get(ea.a.p("LGFccBhpUG4=", "eVEF2klh"));
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // pl.a
    public final String b() {
        String x4 = c.x(this.f28708a);
        g.d(x4, ea.a.p("VGU_Qxx1DHQAeXdvDWV-YTRwXmklYTdpO24p", "TfPy5uly"));
        return x4;
    }

    @Override // pl.a
    public final String c() {
        EngineHelper.f15726a.getClass();
        String str = (String) EngineHelper.f15730f.get(ea.a.p("LHVCXwxzUnIFdDNwZQ==", "gjd1zF6R"));
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // pl.a
    public final String d() {
        AdvertisingIdClient.Info info;
        LinkedHashMap linkedHashMap = f.f13487a;
        Application context = this.f28708a;
        g.e(context, "context");
        String str = null;
        try {
            info = AdvertisingIdClient.getAdvertisingIdInfo(context.getApplicationContext());
        } catch (Exception e10) {
            e10.printStackTrace();
            info = null;
        }
        if (info != null) {
            str = info.getId();
        }
        if (str == null) {
            return "";
        }
        return str;
    }
}
