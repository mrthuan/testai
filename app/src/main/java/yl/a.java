package yl;

import android.content.Context;
import cg.l;
import com.lib.detect.edge.MNNDetectEdgeNativeHelper;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.jvm.internal.g;
import o9.d;

/* compiled from: MNNDetectEdgeImageHelper.kt */
/* loaded from: classes3.dex */
public final class a {
    public static final C0421a c;

    /* renamed from: a  reason: collision with root package name */
    public final Context f32178a;

    /* renamed from: b  reason: collision with root package name */
    public final long f32179b;

    /* compiled from: MNNDetectEdgeImageHelper.kt */
    /* renamed from: yl.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0421a {
        public static String a(Context context, boolean z10, l lVar) {
            g.e(context, "context");
            File file = new File(context.getCacheDir(), ea.a.p("Im9VZRVfBjJqOQ==", "eFQxNZnA"));
            if (!file.exists() || !z10) {
                try {
                    fc.a aVar = new fc.a(context.getAssets().open(ea.a.p("Im9VZRVfBjJqOQ==", "UZYLeeLK")));
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        ea.a.m(aVar, fileOutputStream, 8192);
                        d.l(fileOutputStream, null);
                        d.l(aVar, null);
                        if (lVar != null) {
                            lVar.invoke(Boolean.TRUE);
                        }
                    } finally {
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                    if (lVar != null) {
                        lVar.invoke(Boolean.FALSE);
                    }
                    return null;
                }
            }
            return file.getAbsolutePath();
        }
    }

    static {
        ea.a.p("Xm8vZR9fUzJCOQ==", "hZmfSQ3r");
        c = new C0421a();
    }

    public a(Context context) {
        g.e(context, ea.a.p("UG8ldBZ4dA==", "jwDWwmSC"));
        this.f32178a = context;
        c.getClass();
        String a10 = C0421a.a(context, true, null);
        if (a10 != null) {
            this.f32179b = MNNDetectEdgeNativeHelper.initSession(a10);
        }
    }
}
