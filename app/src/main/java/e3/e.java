package e3;

import android.graphics.Rect;
import com.airbnb.lottie.model.layer.Layer;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: LottieComposition.java */
/* loaded from: classes.dex */
public final class e {
    public Map<String, List<Layer>> c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, l> f16343d;

    /* renamed from: e  reason: collision with root package name */
    public Map<String, j3.b> f16344e;

    /* renamed from: f  reason: collision with root package name */
    public List<j3.g> f16345f;

    /* renamed from: g  reason: collision with root package name */
    public y.j<j3.c> f16346g;

    /* renamed from: h  reason: collision with root package name */
    public y.f<Layer> f16347h;

    /* renamed from: i  reason: collision with root package name */
    public List<Layer> f16348i;

    /* renamed from: j  reason: collision with root package name */
    public Rect f16349j;

    /* renamed from: k  reason: collision with root package name */
    public float f16350k;

    /* renamed from: l  reason: collision with root package name */
    public float f16351l;

    /* renamed from: m  reason: collision with root package name */
    public float f16352m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f16353n;

    /* renamed from: a  reason: collision with root package name */
    public final s f16341a = new s();

    /* renamed from: b  reason: collision with root package name */
    public final HashSet<String> f16342b = new HashSet<>();

    /* renamed from: o  reason: collision with root package name */
    public int f16354o = 0;

    public final void a(String str) {
        p3.c.b(str);
        this.f16342b.add(str);
    }

    public final float b() {
        return ((this.f16351l - this.f16350k) / this.f16352m) * 1000.0f;
    }

    public final j3.g c(String str) {
        this.f16345f.size();
        for (int i10 = 0; i10 < this.f16345f.size(); i10++) {
            j3.g gVar = this.f16345f.get(i10);
            String str2 = gVar.f19036a;
            boolean z10 = true;
            if (!str2.equalsIgnoreCase(str) && (!str2.endsWith("\r") || !str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                z10 = false;
            }
            if (z10) {
                return gVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        for (Layer layer : this.f16348i) {
            sb2.append(layer.a("\t"));
        }
        return sb2.toString();
    }
}
