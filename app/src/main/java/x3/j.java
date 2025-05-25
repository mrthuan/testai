package x3;

import com.adjust.sdk.Constants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import q4.a;
import q4.d;

/* compiled from: SafeKeyGenerator.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final p4.g<t3.b, String> f31614a = new p4.g<>(1000);

    /* renamed from: b  reason: collision with root package name */
    public final a.c f31615b = q4.a.a(10, new a());

    /* compiled from: SafeKeyGenerator.java */
    /* loaded from: classes.dex */
    public class a implements a.b<b> {
        @Override // q4.a.b
        public final b a() {
            try {
                return new b(MessageDigest.getInstance(Constants.SHA256));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* compiled from: SafeKeyGenerator.java */
    /* loaded from: classes.dex */
    public static final class b implements a.d {

        /* renamed from: a  reason: collision with root package name */
        public final MessageDigest f31616a;

        /* renamed from: b  reason: collision with root package name */
        public final d.a f31617b = new d.a();

        public b(MessageDigest messageDigest) {
            this.f31616a = messageDigest;
        }

        @Override // q4.a.d
        public final d.a b() {
            return this.f31617b;
        }
    }

    public final String a(t3.b bVar) {
        String str;
        Object b10 = this.f31615b.b();
        com.google.android.play.core.assetpacks.c.l(b10);
        b bVar2 = (b) b10;
        try {
            bVar.a(bVar2.f31616a);
            byte[] digest = bVar2.f31616a.digest();
            char[] cArr = p4.j.f23704b;
            synchronized (cArr) {
                for (int i10 = 0; i10 < digest.length; i10++) {
                    int i11 = digest[i10] & 255;
                    int i12 = i10 * 2;
                    char[] cArr2 = p4.j.f23703a;
                    cArr[i12] = cArr2[i11 >>> 4];
                    cArr[i12 + 1] = cArr2[i11 & 15];
                }
                str = new String(cArr);
            }
            return str;
        } finally {
            this.f31615b.a(bVar2);
        }
    }

    public final String b(t3.b bVar) {
        String a10;
        synchronized (this.f31614a) {
            a10 = this.f31614a.a(bVar);
        }
        if (a10 == null) {
            a10 = a(bVar);
        }
        synchronized (this.f31614a) {
            this.f31614a.d(bVar, a10);
        }
        return a10;
    }
}
