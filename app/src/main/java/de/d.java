package de;

import android.text.TextUtils;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.assetpacks.h1;
import java.util.concurrent.Callable;
import mb.f;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;

/* compiled from: RemoteConfig.java */
/* loaded from: classes.dex */
public final class d {
    public static d c = null;

    /* renamed from: d  reason: collision with root package name */
    public static long f16199d = -1;

    /* renamed from: a  reason: collision with root package name */
    public mb.e f16200a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f16201b;

    /* compiled from: RemoteConfig.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public d(ReaderPdfApplication.b bVar) {
        boolean z10;
        final f fVar;
        this.f16201b = false;
        synchronized (this) {
            try {
                if (System.currentTimeMillis() - f16199d > 43200000) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
                if (bVar != null) {
                    bVar.a(false);
                }
                this.f16201b = false;
            }
            if (!z10) {
                if (bVar != null) {
                    bVar.a(false);
                }
                return;
            }
            f16199d = -1L;
            if (this.f16201b) {
                if (bVar != null) {
                    bVar.a(false);
                }
                return;
            }
            this.f16201b = true;
            b bVar2 = new b(this, bVar);
            c cVar = new c(this, bVar);
            if (xd.a.f31647a) {
                f.a aVar = new f.a();
                aVar.b(5L);
                aVar.a(60L);
                fVar = new f(aVar);
            } else {
                f.a aVar2 = new f.a();
                aVar2.b(3600L);
                aVar2.a(60L);
                fVar = new f(aVar2);
            }
            final mb.e c10 = mb.e.c();
            this.f16200a = c10;
            c10.getClass();
            Tasks.c(new Callable() { // from class: mb.d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    e eVar = e.this;
                    f fVar2 = fVar;
                    com.google.firebase.remoteconfig.internal.b bVar3 = eVar.f21970h;
                    synchronized (bVar3.f13724b) {
                        bVar3.f13723a.edit().putLong("fetch_timeout_in_seconds", fVar2.f21973a).putLong("minimum_fetch_interval_in_seconds", fVar2.f21974b).commit();
                    }
                    return null;
                }
            }, c10.c);
            this.f16200a.a().e(bVar2).r(cVar);
        }
    }

    public static synchronized d a(ReaderPdfApplication.b bVar) {
        d dVar;
        synchronized (d.class) {
            if (c == null) {
                c = new d(bVar);
            }
            dVar = c;
        }
        return dVar;
    }

    public final String b(String str, String str2) {
        String str3;
        try {
            if (this.f16200a == null) {
                this.f16200a = mb.e.c();
            }
            if (!TextUtils.isEmpty(str)) {
                h1 d10 = this.f16200a.d(str);
                if (d10.f13248a == 0) {
                    str3 = "";
                } else {
                    str3 = d10.f13249b;
                    if (str3 == null) {
                        throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
                    }
                }
                if (!str3.isEmpty()) {
                    return str3;
                }
                return str2;
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return str2;
    }
}
