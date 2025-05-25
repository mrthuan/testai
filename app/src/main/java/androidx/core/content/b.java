package androidx.core.content;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;

/* compiled from: LocusIdCompat.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f3528a;

    /* compiled from: LocusIdCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static LocusId a(String str) {
            return new LocusId(str);
        }

        public static String b(LocusId locusId) {
            return locusId.getId();
        }
    }

    public b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f3528a = str;
            if (Build.VERSION.SDK_INT >= 29) {
                a.a(str);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("id cannot be empty");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        String str = ((b) obj).f3528a;
        String str2 = this.f3528a;
        if (str2 == null) {
            if (str == null) {
                return true;
            }
            return false;
        }
        return str2.equals(str);
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f3528a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return 31 + hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocusIdCompat[");
        int length = this.f3528a.length();
        sb2.append(length + "_chars");
        sb2.append("]");
        return sb2.toString();
    }
}
