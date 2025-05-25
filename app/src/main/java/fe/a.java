package fe;

import android.text.TextUtils;
import com.google.firebase.crashlytics.FirebaseCrashlytics;

/* compiled from: ADLogUtil.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static a f17269b;

    /* renamed from: a  reason: collision with root package name */
    public InterfaceC0219a f17270a;

    /* compiled from: ADLogUtil.java */
    /* renamed from: fe.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0219a {
        void a(String str);

        void b(Throwable th2);
    }

    public static a a() {
        if (f17269b == null) {
            f17269b = new a();
        }
        return f17269b;
    }

    public final void b(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (!xd.a.f31647a) {
                    FirebaseCrashlytics.getInstance().log(str);
                }
                InterfaceC0219a interfaceC0219a = this.f17270a;
                if (interfaceC0219a != null) {
                    interfaceC0219a.a(str);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void c(Throwable th2) {
        try {
            th2.printStackTrace();
            if (!xd.a.f31647a) {
                FirebaseCrashlytics.getInstance().recordException(th2);
            }
            InterfaceC0219a interfaceC0219a = this.f17270a;
            if (interfaceC0219a != null) {
                interfaceC0219a.b(th2);
            }
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
    }
}
