package t3;

import android.text.TextUtils;
import androidx.activity.r;
import java.security.MessageDigest;

/* compiled from: Option.java */
/* loaded from: classes.dex */
public final class d<T> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f29919e = new a();

    /* renamed from: a  reason: collision with root package name */
    public final T f29920a;

    /* renamed from: b  reason: collision with root package name */
    public final b<T> f29921b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public volatile byte[] f29922d;

    /* compiled from: Option.java */
    /* loaded from: classes.dex */
    public interface b<T> {
        void a(byte[] bArr, T t4, MessageDigest messageDigest);
    }

    public d(String str, T t4, b<T> bVar) {
        if (!TextUtils.isEmpty(str)) {
            this.c = str;
            this.f29920a = t4;
            this.f29921b = bVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static d a(Object obj, String str) {
        return new d(str, obj, f29919e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.c.equals(((d) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return r.g(new StringBuilder("Option{key='"), this.c, "'}");
    }

    /* compiled from: Option.java */
    /* loaded from: classes.dex */
    public class a implements b<Object> {
        @Override // t3.d.b
        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }
}
