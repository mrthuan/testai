package xj;

import java.util.List;
import net.lingala.zip4j.model.enums.CompressionMethod;
import net.lingala.zip4j.model.enums.EncryptionMethod;

/* compiled from: AbstractFileHeader.java */
/* loaded from: classes3.dex */
public abstract class b extends g1.c {

    /* renamed from: b  reason: collision with root package name */
    public byte[] f31819b;
    public CompressionMethod c;

    /* renamed from: d  reason: collision with root package name */
    public long f31820d;

    /* renamed from: e  reason: collision with root package name */
    public long f31821e;

    /* renamed from: f  reason: collision with root package name */
    public long f31822f;

    /* renamed from: g  reason: collision with root package name */
    public long f31823g;

    /* renamed from: h  reason: collision with root package name */
    public int f31824h;

    /* renamed from: i  reason: collision with root package name */
    public String f31825i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f31826j;

    /* renamed from: k  reason: collision with root package name */
    public EncryptionMethod f31827k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f31828l;

    /* renamed from: m  reason: collision with root package name */
    public k f31829m;

    /* renamed from: n  reason: collision with root package name */
    public a f31830n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f31831o;

    /* renamed from: p  reason: collision with root package name */
    public List<e> f31832p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f31833q;

    public b() {
        super(3);
        this.f31821e = 0L;
        this.f31822f = 0L;
        this.f31823g = 0L;
        this.f31827k = EncryptionMethod.NONE;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        return this.f31825i.equals(((b) obj).f31825i);
    }
}
