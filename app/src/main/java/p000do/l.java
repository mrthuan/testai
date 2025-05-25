package p000do;

import android.widget.ImageView;

/* compiled from: Util.java */
/* renamed from: do.l  reason: invalid package */
/* loaded from: classes3.dex */
public final class l {

    /* compiled from: Util.java */
    /* renamed from: do.l$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16310a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f16310a = iArr;
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static void a(float f10, float f11, float f12) {
        if (f10 < f11) {
            if (f11 < f12) {
                return;
            }
            throw new IllegalArgumentException(ea.a.p("fmUvaQZtQnodb1kgAWElIDBvEmIjIC9lQ3NadAVhPiB-YTNpHnUPIAhvW21HIBVhKGwScyN0DmFIaRd1AFo_b14oYiAEaRZoUmEUbQZyMyAlcEJyKXAxaVF0HyAbYTx1ZQ==", "0zmPcnEJ"));
        }
        throw new IllegalArgumentException(ea.a.p("JWk2aTx1NCAybwltFGg2cxh0PSArZRZsEXMCICVoI25ITT1kOHU0IDJvCW0aIBRhVGxycyx0e2kaaRx1PFotbwUocSAmaS1oaGFGbVtyMiBZcCJyJnBEaRV0FCAnYS51ZQ==", "z6hXQYIH"));
    }
}
