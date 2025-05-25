package ul;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustType;

/* compiled from: Image.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: w  reason: collision with root package name */
    public static final List<Float> f30403w;

    /* renamed from: a  reason: collision with root package name */
    public String f30404a;

    /* renamed from: b  reason: collision with root package name */
    public long f30405b;
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public long f30406d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f30407e;

    /* renamed from: g  reason: collision with root package name */
    public boolean f30409g;

    /* renamed from: h  reason: collision with root package name */
    public String f30410h;

    /* renamed from: i  reason: collision with root package name */
    public String f30411i;

    /* renamed from: k  reason: collision with root package name */
    public WeakReference<Bitmap> f30413k;

    /* renamed from: l  reason: collision with root package name */
    public WeakReference<Bitmap> f30414l;

    /* renamed from: m  reason: collision with root package name */
    public WeakReference<Bitmap> f30415m;

    /* renamed from: n  reason: collision with root package name */
    public WeakReference<Bitmap> f30416n;

    /* renamed from: s  reason: collision with root package name */
    public int f30421s;

    /* renamed from: t  reason: collision with root package name */
    public int f30422t;

    /* renamed from: u  reason: collision with root package name */
    public b f30423u;

    /* renamed from: f  reason: collision with root package name */
    public int f30408f = -1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f30412j = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f30417o = false;

    /* renamed from: p  reason: collision with root package name */
    public ImageAdjustType f30418p = ImageAdjustType.PREVIEW;

    /* renamed from: q  reason: collision with root package name */
    public final c f30419q = new c();

    /* renamed from: r  reason: collision with root package name */
    public final c f30420r = new c();

    /* renamed from: v  reason: collision with root package name */
    public boolean f30424v = false;

    static {
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(1.0f);
        f30403w = Arrays.asList(valueOf, valueOf, valueOf2, valueOf, valueOf, valueOf2, valueOf2, valueOf2);
    }

    public final boolean a() {
        if (!this.f30409g && this.f30406d > 0 && this.f30421s > 0 && this.f30422t > 0) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f30407e = z10;
        if (!z10) {
            this.f30408f = -1;
        }
    }

    public final void c(int i10) {
        this.f30408f = i10;
        b bVar = this.f30423u;
        if (bVar != null) {
            bVar.f30408f = i10;
        }
    }
}
