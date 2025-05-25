package androidx.core.content;

import a8.j2;
import a8.m0;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.airbnb.lottie.network.FileExtension;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzv;
import com.google.android.gms.ads.internal.overlay.zzx;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbzo;
import com.google.android.gms.internal.ads.zzftm;
import com.google.android.gms.internal.ads.zzftn;
import com.google.android.gms.measurement.internal.zzab;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzij;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.assetpacks.d0;
import com.google.android.play.core.assetpacks.r1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.y;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.ss.control.Spreadsheet;
import lib.zj.office.system.f;
import n2.l;
import okhttp3.a0;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONObject;
import q9.m;
import qk.r;
import ta.h;

/* compiled from: UnusedAppRestrictionsBackportCallback.java */
/* loaded from: classes.dex */
public class e implements l, zzftn, m0, j2, Continuation, q9.l, ka.a, xh.e {

    /* renamed from: a  reason: collision with root package name */
    public final Object f3529a;

    public /* synthetic */ e(Object obj) {
        this.f3529a = obj;
    }

    public static String g(String str, FileExtension fileExtension, boolean z10) {
        String str2;
        StringBuilder sb2 = new StringBuilder("lottie_cache_");
        sb2.append(str.replaceAll("\\W+", ""));
        if (z10) {
            str2 = fileExtension.tempExtension();
        } else {
            str2 = fileExtension.extension;
        }
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // xh.e
    public final qh.d a(int i10) {
        return null;
    }

    @Override // a8.j2
    public final void b(Bundle bundle, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        Object obj = this.f3529a;
        if (isEmpty) {
            zzij zzijVar = (zzij) obj;
            ((zzge) zzijVar.f3529a).f11785n.getClass();
            zzijVar.s("auto", "_err", bundle, true, true, System.currentTimeMillis());
            return;
        }
        ((zzij) obj).getClass();
        throw new IllegalStateException("Unexpected call on client side");
    }

    @Override // xh.e
    public final Rectangle c(long j10, Rectangle rectangle) {
        return null;
    }

    @Override // n2.l
    public final WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) mk.a.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f3529a).createWebView(webView));
    }

    @Override // n2.l
    public final String[] d() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f3529a).getSupportedFeatures();
    }

    public final synchronized void f(a0 route) {
        g.e(route, "route");
        ((Set) this.f3529a).remove(route);
    }

    @Override // xh.e
    public final f getControl() {
        return ((Spreadsheet) this.f3529a).getControl();
    }

    @Override // xh.e
    public final zh.g getDocument() {
        return null;
    }

    @Override // xh.e
    public final byte getEditType() {
        return (byte) 1;
    }

    @Override // xh.e
    public final xh.d getHighlight() {
        return null;
    }

    @Override // n2.l
    public final StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) mk.a.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f3529a).getStatics());
    }

    @Override // xh.e
    public final lh.g getTextBox() {
        return null;
    }

    @Override // ka.a
    public final void h(Bundle bundle) {
        ((da.a) this.f3529a).c(bundle, "clx", "_ae");
    }

    public final File i() {
        File file = new File(((Context) this.f3529a).getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final ta.c j(JSONObject jSONObject) {
        ta.e hVar;
        if (jSONObject.getInt("settings_version") != 3) {
            hVar = new ta.a();
        } else {
            hVar = new h();
        }
        return hVar.a((y) this.f3529a, jSONObject);
    }

    public final void k(r rVar) {
        uk.a aVar = (uk.a) ((Map) this.f3529a).get(rVar.getClass());
        if (aVar != null) {
            aVar.j(rVar);
        }
    }

    public final File l(String str, InputStream inputStream, FileExtension fileExtension) {
        File file = new File(i(), g(str, fileExtension, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return file;
                }
            }
        } finally {
            inputStream.close();
        }
    }

    public void m() {
        zzgb zzgbVar = ((zzge) this.f3529a).f11781j;
        zzge.f(zzgbVar);
        zzgbVar.m();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ Object then(Task task) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((Collection) this.f3529a);
        return Tasks.e(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzftn
    public final void zza(zzftm zzftmVar) {
        zzx zzxVar = (zzx) this.f3529a;
        zzxVar.getClass();
        if (!TextUtils.isEmpty(zzftmVar.zzb())) {
            if (!((Boolean) zzba.f10115d.c.zza(zzbbw.zzkC)).booleanValue()) {
                zzxVar.f10336a = zzftmVar.zzb();
            }
        }
        switch (zzftmVar.zza()) {
            case 8152:
                zzbzo.zze.execute(new zzv(zzxVar, "onLMDOverlayOpened", new HashMap()));
                return;
            case 8153:
                zzbzo.zze.execute(new zzv(zzxVar, "onLMDOverlayClicked", new HashMap()));
                return;
            case 8154:
            case 8156:
            case 8158:
            case 8159:
            default:
                return;
            case 8155:
                zzbzo.zze.execute(new zzv(zzxVar, "onLMDOverlayClose", new HashMap()));
                return;
            case 8157:
                zzxVar.f10336a = null;
                zzxVar.f10337b = null;
                zzxVar.f10339e = false;
                return;
            case 8160:
            case 8161:
            case 8162:
                HashMap hashMap = new HashMap();
                hashMap.put("error", String.valueOf(zzftmVar.zza()));
                zzbzo.zze.execute(new zzv(zzxVar, "onLMDOverlayFailedToOpen", hashMap));
                return;
        }
    }

    @Override // a8.m0
    public final zzeu zzaA() {
        throw null;
    }

    @Override // a8.m0
    public final zzgb zzaB() {
        throw null;
    }

    @Override // a8.m0
    public final Context zzaw() {
        throw null;
    }

    @Override // a8.m0
    public final Clock zzax() {
        throw null;
    }

    @Override // a8.m0
    public final zzab zzay() {
        throw null;
    }

    public e(zzge zzgeVar) {
        Preconditions.j(zzgeVar);
        this.f3529a = zzgeVar;
    }

    @Override // q9.m
    public final /* bridge */ /* synthetic */ Object a() {
        return new r1((d0) ((m) this.f3529a).a());
    }

    public e(Context context) {
        this.f3529a = context.getApplicationContext();
    }

    public e(int i10) {
        Handler handler;
        Handler handler2;
        if (i10 == 4) {
            this.f3529a = new ArrayList();
        } else if (i10 == 13) {
            this.f3529a = new LinkedHashSet();
        } else if (i10 != 14) {
            Looper mainLooper = Looper.getMainLooper();
            if (Build.VERSION.SDK_INT >= 28) {
                handler2 = s0.g.a(mainLooper);
            } else {
                try {
                    handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
                } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
                    handler = new Handler(mainLooper);
                } catch (InvocationTargetException e10) {
                    Throwable cause = e10.getCause();
                    if (!(cause instanceof RuntimeException)) {
                        if (cause instanceof Error) {
                            throw ((Error) cause);
                        }
                        throw new RuntimeException(cause);
                    }
                    throw ((RuntimeException) cause);
                }
                handler2 = handler;
            }
            this.f3529a = handler2;
        } else {
            this.f3529a = new HashMap(32);
        }
    }
}
