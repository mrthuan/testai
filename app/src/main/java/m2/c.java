package m2;

import androidx.activity.f;
import com.tom_roush.fontbox.ttf.OpenTypeScript;
import java.util.Objects;

/* compiled from: WebMessageCompat.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f21793a;

    /* renamed from: b  reason: collision with root package name */
    public final int f21794b;

    public c(String str) {
        this.f21793a = str;
        this.f21794b = 0;
    }

    public final String a() {
        String str;
        int i10 = this.f21794b;
        if (i10 == 0) {
            return this.f21793a;
        }
        StringBuilder sb2 = new StringBuilder("Wrong data accessor type detected. ");
        if (i10 == 0) {
            str = "String";
        } else if (i10 != 1) {
            str = OpenTypeScript.UNKNOWN;
        } else {
            str = "ArrayBuffer";
        }
        throw new IllegalStateException(f.o(sb2, str, " expected, but got ", "String"));
    }

    public c(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f21793a = null;
        this.f21794b = 1;
    }
}
