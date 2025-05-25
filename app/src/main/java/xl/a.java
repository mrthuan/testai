package xl;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.b;
import com.dj.lib.rtt.RTT;
import com.lib.detect.edge.MNNDetectEdgeNativeHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.f;
import kotlin.jvm.internal.g;
import l4.e;
import lib.zj.office.fc.hslf.record.SlideAtom;
import o4.d;

/* compiled from: DetectDocEdgeHelper.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final ArrayList<Float> f31883b;

    /* renamed from: a  reason: collision with root package name */
    public yl.a f31884a;

    static {
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(1.0f);
        f31883b = ge.a.j(valueOf, valueOf, valueOf2, valueOf, valueOf, valueOf2, valueOf2, valueOf2);
    }

    public a(Context context) {
        g.e(context, ea.a.p("LG9fdBx4dA==", "hkGNFG42"));
    }

    public static Bitmap d(long j10, Context context, String str) {
        e n10 = new e().n(720, 720);
        g.d(n10, ea.a.p("YWU6dRZzFk8CdF1vB3N-KU4gEiBmIGMgYyByIBUuJHZWcjlpF2VKN0AwGCBeMmYp", "CR5K5MjC"));
        com.bumptech.glide.e<Bitmap> a10 = b.c(context).f(context).a();
        a10.F = str;
        a10.I = true;
        Object obj = a10.u(new d(Long.valueOf(j10))).C(n10).J(SlideAtom.USES_MASTER_SLIDE_ID, SlideAtom.USES_MASTER_SLIDE_ID).get();
        g.d(obj, ea.a.p("OGlFaFFjWG4uZTJ0XC4Jc3dpGm0kcE0pu4DDcz1PSHQmb19zUC5EdThtI3RdKUZnUHRGKQ==", "gRFdYeI8"));
        return (Bitmap) obj;
    }

    public final void a() {
        yl.a aVar = this.f31884a;
        if (aVar != null) {
            MNNDetectEdgeNativeHelper.releaseSession(aVar.f32179b);
        }
        this.f31884a = null;
    }

    public final List b(Context context, Bitmap bitmap) {
        g.e(context, "context");
        boolean isRecycled = bitmap.isRecycled();
        ArrayList<Float> arrayList = f31883b;
        if (isRecycled) {
            return arrayList;
        }
        if (this.f31884a == null) {
            this.f31884a = new yl.a(context);
        }
        yl.a aVar = this.f31884a;
        Bitmap bitmap2 = (aVar == null || bitmap.isRecycled() || (bitmap2 = MNNDetectEdgeNativeHelper.processImageWithMNN(aVar.f32179b, bitmap)) == null) ? null : null;
        if (bitmap2 == null) {
            return arrayList;
        }
        float[] findRectPoint = RTT.findRectPoint(bitmap2);
        Float[] fArr = new Float[8];
        for (int i10 = 0; i10 < 8; i10++) {
            fArr[i10] = Float.valueOf(0.0f);
        }
        fArr[0] = Float.valueOf(findRectPoint[0] / bitmap2.getWidth());
        fArr[1] = Float.valueOf(findRectPoint[1] / bitmap2.getHeight());
        fArr[2] = Float.valueOf(findRectPoint[2] / bitmap2.getWidth());
        fArr[3] = Float.valueOf(findRectPoint[3] / bitmap2.getHeight());
        fArr[4] = Float.valueOf(findRectPoint[4] / bitmap2.getWidth());
        fArr[5] = Float.valueOf(findRectPoint[5] / bitmap2.getHeight());
        fArr[6] = Float.valueOf(findRectPoint[6] / bitmap2.getWidth());
        fArr[7] = Float.valueOf(findRectPoint[7] / bitmap2.getHeight());
        for (int i11 = 0; i11 < 8; i11++) {
            if (fArr[i11].floatValue() < 0.0f) {
                fArr[i11] = Float.valueOf(0.0f);
            } else if (fArr[i11].floatValue() > 1.0f) {
                fArr[i11] = Float.valueOf(1.0f);
            }
        }
        return f.H(fArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0017 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0018 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:4:0x0009, B:13:0x0018, B:16:0x0024), top: B:20:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.Float> c(android.content.Context r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g.e(r4, r0)
            java.util.ArrayList<java.lang.Float> r0 = xl.a.f31883b
            if (r5 == 0) goto L14
            int r1 = r5.length()     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L10
            goto L14
        L10:
            r1 = 0
            goto L15
        L12:
            r4 = move-exception
            goto L31
        L14:
            r1 = 1
        L15:
            if (r1 == 0) goto L18
            return r0
        L18:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L12
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L12
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L12
            if (r2 != 0) goto L24
            return r0
        L24:
            long r1 = r1.lastModified()     // Catch: java.lang.Throwable -> L12
            android.graphics.Bitmap r5 = d(r1, r4, r5)     // Catch: java.lang.Throwable -> L12
            java.util.List r4 = r3.b(r4, r5)     // Catch: java.lang.Throwable -> L12
            return r4
        L31:
            r4.printStackTrace()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xl.a.c(android.content.Context, java.lang.String):java.util.List");
    }
}
