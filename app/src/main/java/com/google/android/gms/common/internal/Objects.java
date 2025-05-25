package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class Objects {

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    @KeepForSdk
    /* loaded from: classes.dex */
    public static final class ToStringHelper {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f11224a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f11225b;

        public /* synthetic */ ToStringHelper(Object obj) {
            Preconditions.j(obj);
            this.f11225b = obj;
            this.f11224a = new ArrayList();
        }

        @KeepForSdk
        public final void a(Object obj, String str) {
            this.f11224a.add(androidx.activity.f.m(str, "=", String.valueOf(obj)));
        }

        @KeepForSdk
        public final String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f11225b.getClass().getSimpleName());
            sb2.append('{');
            ArrayList arrayList = this.f11224a;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append((String) arrayList.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    private Objects() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }
}
