package z3;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: LazyHeaders.java */
/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, List<i>> f32245b;
    public volatile Map<String, String> c;

    /* compiled from: LazyHeaders.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final Map<String, List<i>> f32246b;

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, List<i>> f32247a = f32246b;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb2 = new StringBuilder(property.length());
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = property.charAt(i10);
                    if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                        sb2.append(charAt);
                    } else {
                        sb2.append('?');
                    }
                }
                property = sb2.toString();
            }
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(property)));
            }
            f32246b = Collections.unmodifiableMap(hashMap);
        }
    }

    /* compiled from: LazyHeaders.java */
    /* loaded from: classes.dex */
    public static final class b implements i {

        /* renamed from: a  reason: collision with root package name */
        public final String f32248a;

        public b(String str) {
            this.f32248a = str;
        }

        @Override // z3.i
        public final String a() {
            return this.f32248a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f32248a.equals(((b) obj).f32248a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f32248a.hashCode();
        }

        public final String toString() {
            return androidx.activity.r.g(new StringBuilder("StringHeaderFactory{value='"), this.f32248a, "'}");
        }
    }

    public j(Map<String, List<i>> map) {
        this.f32245b = Collections.unmodifiableMap(map);
    }

    @Override // z3.h
    public final Map<String, String> a() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = Collections.unmodifiableMap(b());
                }
            }
        }
        return this.c;
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<i>> entry : this.f32245b.entrySet()) {
            List<i> value = entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            int size = value.size();
            for (int i10 = 0; i10 < size; i10++) {
                String a10 = value.get(i10).a();
                if (!TextUtils.isEmpty(a10)) {
                    sb2.append(a10);
                    if (i10 != value.size() - 1) {
                        sb2.append(',');
                    }
                }
            }
            String sb3 = sb2.toString();
            if (!TextUtils.isEmpty(sb3)) {
                hashMap.put(entry.getKey(), sb3);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f32245b.equals(((j) obj).f32245b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32245b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f32245b + '}';
    }
}
