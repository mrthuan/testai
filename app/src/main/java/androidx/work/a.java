package androidx.work;

import androidx.core.content.e;
import com.google.android.gms.common.api.Api;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import o2.g;
import o2.n;
import o2.o;

/* compiled from: Configuration.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f4902a = a(false);

    /* renamed from: b  reason: collision with root package name */
    public final ExecutorService f4903b = a(true);
    public final n c;

    /* renamed from: d  reason: collision with root package name */
    public final g f4904d;

    /* renamed from: e  reason: collision with root package name */
    public final e f4905e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4906f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4907g;

    /* renamed from: h  reason: collision with root package name */
    public final int f4908h;

    /* compiled from: Configuration.java */
    /* renamed from: androidx.work.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0026a {
    }

    /* compiled from: Configuration.java */
    /* loaded from: classes.dex */
    public interface b {
        a a();
    }

    public a(C0026a c0026a) {
        int i10 = o.f22694a;
        this.c = new n();
        this.f4904d = new g();
        this.f4905e = new e(2);
        this.f4906f = 4;
        this.f4907g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f4908h = 20;
    }

    public static ExecutorService a(boolean z10) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new o2.a(z10));
    }
}
