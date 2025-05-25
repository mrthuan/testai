package o9;

import o9.c;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class o extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public int f22780a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f22781b;
    public byte c;

    public final p a() {
        if (this.c != 3) {
            StringBuilder sb2 = new StringBuilder();
            if ((this.c & 1) == 0) {
                sb2.append(" appUpdateType");
            }
            if ((this.c & 2) == 0) {
                sb2.append(" allowAssetPackDeletion");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
        }
        return new p(this.f22780a, this.f22781b);
    }
}
