package o2;

import android.net.Uri;
import java.util.HashSet;

/* compiled from: ContentUriTriggers.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f22679a = new HashSet();

    /* compiled from: ContentUriTriggers.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f22680a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f22681b;

        public a(boolean z10, Uri uri) {
            this.f22680a = uri;
            this.f22681b = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f22681b == aVar.f22681b && this.f22680a.equals(aVar.f22680a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (this.f22680a.hashCode() * 31) + (this.f22681b ? 1 : 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            return this.f22679a.equals(((c) obj).f22679a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22679a.hashCode();
    }
}
