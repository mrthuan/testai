package t5;

import android.content.SharedPreferences;

/* compiled from: ProfileCache.kt */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f29941a;

    public k() {
        SharedPreferences sharedPreferences = com.facebook.d.a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        kotlin.jvm.internal.g.d(sharedPreferences, "getApplicationContext()\n…ME, Context.MODE_PRIVATE)");
        this.f29941a = sharedPreferences;
    }
}
