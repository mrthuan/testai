package t0;

import android.util.Base64;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.List;

/* compiled from: FontRequest.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f29877a;

    /* renamed from: b  reason: collision with root package name */
    public final String f29878b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final List<List<byte[]>> f29879d;

    /* renamed from: e  reason: collision with root package name */
    public final String f29880e;

    public f(String str, String str2, String str3, List<List<byte[]>> list) {
        str.getClass();
        this.f29877a = str;
        str2.getClass();
        this.f29878b = str2;
        this.c = str3;
        list.getClass();
        this.f29879d = list;
        this.f29880e = a0.d.d(str, "-", str2, "-", str3);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f29877a + ", mProviderPackage: " + this.f29878b + ", mQuery: " + this.c + ", mCertificates:");
        int i10 = 0;
        while (true) {
            List<List<byte[]>> list = this.f29879d;
            if (i10 < list.size()) {
                sb2.append(" [");
                List<byte[]> list2 = list.get(i10);
                for (int i11 = 0; i11 < list2.size(); i11++) {
                    sb2.append(" \"");
                    sb2.append(Base64.encodeToString(list2.get(i11), 0));
                    sb2.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                }
                sb2.append(" ]");
                i10++;
            } else {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
        }
    }
}
