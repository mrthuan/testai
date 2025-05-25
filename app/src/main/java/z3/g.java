package z3;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* compiled from: GlideUrl.java */
/* loaded from: classes.dex */
public final class g implements t3.b {

    /* renamed from: b  reason: collision with root package name */
    public final h f32238b;
    public final URL c;

    /* renamed from: d  reason: collision with root package name */
    public final String f32239d;

    /* renamed from: e  reason: collision with root package name */
    public String f32240e;

    /* renamed from: f  reason: collision with root package name */
    public URL f32241f;

    /* renamed from: g  reason: collision with root package name */
    public volatile byte[] f32242g;

    /* renamed from: h  reason: collision with root package name */
    public int f32243h;

    public g(URL url) {
        j jVar = h.f32244a;
        com.google.android.play.core.assetpacks.c.l(url);
        this.c = url;
        this.f32239d = null;
        com.google.android.play.core.assetpacks.c.l(jVar);
        this.f32238b = jVar;
    }

    @Override // t3.b
    public final void a(MessageDigest messageDigest) {
        if (this.f32242g == null) {
            this.f32242g = c().getBytes(t3.b.f29917a);
        }
        messageDigest.update(this.f32242g);
    }

    public final String c() {
        String str = this.f32239d;
        if (str == null) {
            URL url = this.c;
            com.google.android.play.core.assetpacks.c.l(url);
            return url.toString();
        }
        return str;
    }

    public final URL d() {
        if (this.f32241f == null) {
            if (TextUtils.isEmpty(this.f32240e)) {
                String str = this.f32239d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.c;
                    com.google.android.play.core.assetpacks.c.l(url);
                    str = url.toString();
                }
                this.f32240e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f32241f = new URL(this.f32240e);
        }
        return this.f32241f;
    }

    @Override // t3.b
    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!c().equals(gVar.c()) || !this.f32238b.equals(gVar.f32238b)) {
            return false;
        }
        return true;
    }

    @Override // t3.b
    public final int hashCode() {
        if (this.f32243h == 0) {
            int hashCode = c().hashCode();
            this.f32243h = hashCode;
            this.f32243h = this.f32238b.hashCode() + (hashCode * 31);
        }
        return this.f32243h;
    }

    public final String toString() {
        return c();
    }

    public g(String str) {
        j jVar = h.f32244a;
        this.c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f32239d = str;
            com.google.android.play.core.assetpacks.c.l(jVar);
            this.f32238b = jVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
