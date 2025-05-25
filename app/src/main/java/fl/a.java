package fl;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.ads.standard.banner.BannerType;

/* compiled from: BaseBanner.kt */
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: BaseBanner.kt */
    /* renamed from: fl.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C0221a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17307a;

        static {
            int[] iArr = new int[BannerType.values().length];
            try {
                iArr[BannerType.Native.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BannerType.Adaptive.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BannerType.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f17307a = iArr;
        }
    }

    public static final String a(BannerType bannerType) {
        g.e(bannerType, "<this>");
        int i10 = C0221a.f17307a[bannerType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return "";
                }
                throw new NoWhenBranchMatchedException();
            }
            return ea.a.p("NGRh", "9eULZ26x");
        }
        return ea.a.p("LGEhaUFl", "lhBU7CuX");
    }
}
