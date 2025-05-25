package jb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;

/* compiled from: TopicsStore.java */
/* loaded from: classes2.dex */
public final class a0 {

    /* renamed from: d  reason: collision with root package name */
    public static WeakReference<a0> f19093d;

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f19094a;

    /* renamed from: b  reason: collision with root package name */
    public x f19095b;
    public final Executor c;

    public a0(SharedPreferences sharedPreferences, ScheduledExecutorService scheduledExecutorService) {
        this.c = scheduledExecutorService;
        this.f19094a = sharedPreferences;
    }

    public final synchronized z a() {
        z zVar;
        String b10 = this.f19095b.b();
        Pattern pattern = z.f19169d;
        if (!TextUtils.isEmpty(b10)) {
            String[] split = b10.split("!", -1);
            if (split.length == 2) {
                zVar = new z(split[0], split[1]);
            }
        }
        zVar = null;
        return zVar;
    }

    public final synchronized void b() {
        this.f19095b = x.a(this.f19094a, this.c);
    }

    public final synchronized void c(z zVar) {
        this.f19095b.c(zVar.c);
    }
}
