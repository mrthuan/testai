package okhttp3;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.p;
import okhttp3.r;

/* compiled from: FormBody.kt */
/* loaded from: classes3.dex */
public final class n extends w {
    public static final r c;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f23357a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f23358b;

    /* compiled from: FormBody.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Charset f23359a = null;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f23360b = new ArrayList();
        public final ArrayList c = new ArrayList();

        public a(int i10) {
        }

        public final void a(String str, String value) {
            kotlin.jvm.internal.g.e(value, "value");
            this.f23360b.add(p.b.a(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f23359a, 91));
            this.c.add(p.b.a(value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f23359a, 91));
        }
    }

    static {
        Pattern pattern = r.c;
        c = r.a.a("application/x-www-form-urlencoded");
    }

    public n(ArrayList encodedNames, ArrayList encodedValues) {
        kotlin.jvm.internal.g.e(encodedNames, "encodedNames");
        kotlin.jvm.internal.g.e(encodedValues, "encodedValues");
        this.f23357a = ak.b.w(encodedNames);
        this.f23358b = ak.b.w(encodedValues);
    }

    @Override // okhttp3.w
    public final long a() {
        return d(null, true);
    }

    @Override // okhttp3.w
    public final r b() {
        return c;
    }

    @Override // okhttp3.w
    public final void c(kk.g gVar) {
        d(gVar, false);
    }

    public final long d(kk.g gVar, boolean z10) {
        kk.f y10;
        if (z10) {
            y10 = new kk.f();
        } else {
            kotlin.jvm.internal.g.b(gVar);
            y10 = gVar.y();
        }
        List<String> list = this.f23357a;
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                y10.q(38);
            }
            y10.x(list.get(i10));
            y10.q(61);
            y10.x(this.f23358b.get(i10));
            i10 = i11;
        }
        if (z10) {
            long j10 = y10.f19826b;
            y10.clear();
            return j10;
        }
        return 0L;
    }
}
