package n0;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* compiled from: ComplexColorCompat.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Shader f22278a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f22279b;
    public int c;

    public c(Shader shader, ColorStateList colorStateList, int i10) {
        this.f22278a = shader;
        this.f22279b = colorStateList;
        this.c = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x017e, code lost:
        if (r8.size() <= 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0180, code lost:
        r0 = new n0.e(r8, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0186, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0187, code lost:
        if (r0 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x018a, code lost:
        if (r19 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x018c, code lost:
        r0 = new n0.e(r5, r10, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0192, code lost:
        r0 = new n0.e(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0198, code lost:
        if (r11 == 1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x019b, code lost:
        if (r11 == 2) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x019d, code lost:
        r4 = r0.f22289a;
        r0 = r0.f22290b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a3, code lost:
        if (r7 == 1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a5, code lost:
        if (r7 == 2) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a7, code lost:
        r1 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01aa, code lost:
        r1 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ad, code lost:
        r1 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01af, code lost:
        r3 = new android.graphics.LinearGradient(r12, r26, r25, r15, r4, r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01c0, code lost:
        r3 = new android.graphics.SweepGradient(r7, r9, r0.f22289a, r0.f22290b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01d5, code lost:
        if (r8 <= 0.0f) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01d7, code lost:
        r1 = r0.f22289a;
        r0 = r0.f22290b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01de, code lost:
        if (r7 == 1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01e1, code lost:
        if (r7 == 2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e3, code lost:
        r5 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01e6, code lost:
        r5 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01e9, code lost:
        r5 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01eb, code lost:
        r3 = new android.graphics.RadialGradient(r7, r9, r8, r1, r0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0203, code lost:
        return new n0.c(r3, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x020b, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static n0.c a(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.c.a(android.content.res.Resources, int, android.content.res.Resources$Theme):n0.c");
    }

    public final boolean b() {
        ColorStateList colorStateList;
        if (this.f22278a == null && (colorStateList = this.f22279b) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }
}
