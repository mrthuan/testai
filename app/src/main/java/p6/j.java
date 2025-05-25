package p6;

import android.widget.ImageView;

/* compiled from: Util.java */
/* loaded from: classes.dex */
public final class j {

    /* compiled from: Util.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23796a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f23796a = iArr;
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
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
        throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
    }
}
