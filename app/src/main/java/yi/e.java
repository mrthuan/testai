package yi;

import androidx.appcompat.widget.i;
import java.io.FileInputStream;

/* compiled from: TaggedInputStream.java */
/* loaded from: classes3.dex */
public abstract class e extends a {

    /* renamed from: g  reason: collision with root package name */
    public int f32160g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f32161h;

    /* renamed from: i  reason: collision with root package name */
    public final i f32162i;

    /* renamed from: j  reason: collision with root package name */
    public d f32163j;

    public e(FileInputStream fileInputStream, i iVar) {
        super(fileInputStream);
        this.f32161h = new int[8];
        this.f32160g = -1;
        this.f32162i = iVar;
    }

    public final byte[] d() {
        int i10 = this.f32160g;
        if (i10 >= 0) {
            int i11 = this.f32161h[i10];
            if (i11 > 0) {
                return b(i11);
            }
            if (i11 < 0) {
                System.err.println("ByteCountInputStream: Internal Error");
            }
            this.f32160g--;
        }
        return null;
    }

    @Override // yi.b, java.io.InputStream
    /* renamed from: f */
    public final int read() {
        int i10 = this.f32160g;
        if (i10 == -1) {
            return super.read();
        }
        int[] iArr = this.f32161h;
        int i11 = iArr[i10];
        if (i11 <= 0) {
            return -1;
        }
        iArr[i10] = i11 - 1;
        return super.read();
    }
}
