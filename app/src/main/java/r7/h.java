package r7;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public abstract class h extends f {

    /* renamed from: d  reason: collision with root package name */
    public static final WeakReference f29471d = new WeakReference(null);
    public WeakReference c;

    public h(byte[] bArr) {
        super(bArr);
        this.c = f29471d;
    }

    @Override // r7.f
    public final byte[] L0() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.c.get();
            if (bArr == null) {
                bArr = M0();
                this.c = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    public abstract byte[] M0();
}
