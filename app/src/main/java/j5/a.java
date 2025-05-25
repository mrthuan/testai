package j5;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.g;

/* compiled from: SPUtil.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0258a f19040b = new C0258a();
    public static volatile a c;

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f19041a;

    /* compiled from: SPUtil.kt */
    /* renamed from: j5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0258a {
        public final a a(Context context) {
            g.e(context, "context");
            a aVar = a.c;
            if (aVar == null) {
                synchronized (this) {
                    aVar = a.c;
                    if (aVar == null) {
                        Context applicationContext = context.getApplicationContext();
                        g.d(applicationContext, "context.applicationContext");
                        aVar = new a(applicationContext);
                        a.c = aVar;
                    }
                }
            }
            return aVar;
        }
    }

    public a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("ugl_sp", 0);
        g.d(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.f19041a = sharedPreferences;
    }

    public static void b(a aVar, String str, int i10) {
        aVar.f19041a.edit().putInt(str, i10).apply();
    }

    public final int a(String str, int i10) {
        return this.f19041a.getInt(str, i10);
    }
}
