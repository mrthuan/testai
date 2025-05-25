package pdf.pdfreader.viewer.editor.free;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.activity.s;
import androidx.appcompat.app.c;
import java.util.HashMap;
import kotlin.Result;
import kotlin.jvm.internal.g;
import tf.d;

/* compiled from: ReaderDeepLinkActivity.kt */
/* loaded from: classes3.dex */
public final class ReaderDeepLinkActivity extends c {

    /* renamed from: b  reason: collision with root package name */
    public static final String f23849b = ea.a.p("FmUycCxsUW4tXw5hRHAuX1ZlJV8wZVdyKzJBMmRfMmEAYW0=", "F1rWs8c7");
    public static final String c = ea.a.p("V2UucCxsC24XX1xhGXAvXyplRV8_ZSJyLzJ9MltfIGleZQ==", "pMnT459t");

    /* renamed from: a  reason: collision with root package name */
    public static final a f23848a = new a();

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap<Long, Boolean> f23850d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public static final HashMap<Long, Boolean> f23851e = new HashMap<>();

    /* compiled from: ReaderDeepLinkActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    @Override // androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        d dVar;
        super.onCreate(bundle);
        boolean z10 = false;
        try {
            Uri data = getIntent().getData();
            if (data != null) {
                String scheme = data.getScheme();
                String host = data.getHost();
                String path = data.getPath();
                if (g.a(scheme, ea.a.p("K3QjcHM=", "MrCWA17X")) && g.a(host, ea.a.p("Q2QtchZhBmUALlBlDHAiaCt1VWgyLipuLnUldB1pMnM=", "JVoWSw8p")) && g.a(path, ea.a.p("RmgpcCJ5fGU_WQNhRjJnMjU=", "NIiHR2mG"))) {
                    z10 = true;
                }
                dVar = d.f30009a;
            } else {
                dVar = null;
            }
            Result.m13constructorimpl(dVar);
        } catch (Throwable th2) {
            Result.m13constructorimpl(s.v(th2));
        }
        finishAndRemoveTask();
        Intent intent = new Intent(this, ReaderSplashActivity.class);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        intent.putExtra(f23849b, z10);
        intent.putExtra(c, elapsedRealtime);
        f23850d.put(Long.valueOf(elapsedRealtime), Boolean.TRUE);
        startActivity(intent);
    }
}
