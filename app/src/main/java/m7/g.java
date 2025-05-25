package m7;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.ads.zzapl;
import com.google.android.gms.internal.ads.zzapq;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.assetpacks.d0;
import com.tom_roush.fontbox.ttf.NamingTable;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class g implements zzapl, OnSuccessListener, ka.b, la.b {

    /* renamed from: a  reason: collision with root package name */
    public Object f21833a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(int i10) {
        this(TimeUnit.MINUTES);
        if (i10 == 5) {
            this.f21833a = new ArrayList();
        } else if (i10 != 6) {
        }
    }

    public static boolean d(int i10) {
        if ((48 > i10 || i10 > 57) && i10 != 35 && i10 != 42) {
            return false;
        }
        return true;
    }

    public static String f(Bundle bundle, String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put(NamingTable.TAG, str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // ka.b
    public final void a(Bundle bundle, String str) {
        la.a aVar = (la.a) this.f21833a;
        if (aVar != null) {
            try {
                aVar.a("$A$:" + f(bundle, str));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // la.b
    public final void b(la.a aVar) {
        this.f21833a = aVar;
        Log.isLoggable("FirebaseCrashlytics", 3);
    }

    public final boolean c(int i10) {
        return ((FlutterJNI) this.f21833a).isCodePointEmoji(i10);
    }

    public final boolean e(int i10) {
        return ((FlutterJNI) this.f21833a).isCodePointVariantSelector(i10);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        d0 d0Var = (d0) this.f21833a;
        List list = (List) obj;
        int a10 = d0Var.f13208b.a();
        Iterator it = d0Var.f().iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (!list.contains(file.getName()) && d0.b(file, true) != a10) {
                d0.h(file);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapl
    public final void zza(zzapq zzapqVar) {
        ((zzbzt) this.f21833a).zzd(zzapqVar);
    }

    public /* synthetic */ g(Object obj) {
        this.f21833a = obj;
    }

    public g(TimeUnit timeUnit) {
        kotlin.jvm.internal.g.e(timeUnit, "timeUnit");
        this.f21833a = new okhttp3.internal.connection.h(bk.d.f5452i, timeUnit);
    }
}
