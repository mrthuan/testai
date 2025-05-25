package r7;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public class l {
    public static final l c = new l(true, null, null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f29480a;

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f29481b;

    public l(boolean z10, String str, Exception exc) {
        this.f29480a = z10;
        this.f29481b = exc;
    }

    public static l b(String str) {
        return new l(false, str, null);
    }

    public static l c(String str, Exception exc) {
        return new l(false, str, exc);
    }

    public void a() {
    }
}
