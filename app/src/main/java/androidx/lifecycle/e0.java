package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: SavedStateHandle.kt */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: f  reason: collision with root package name */
    public static final Class<? extends Object>[] f4038f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f4039a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f4040b;
    public final LinkedHashMap c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f4041d;

    /* renamed from: e  reason: collision with root package name */
    public final a.b f4042e;

    /* compiled from: SavedStateHandle.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static e0 a(Bundle bundle, Bundle bundle2) {
            boolean z10;
            if (bundle == null) {
                if (bundle2 == null) {
                    return new e0();
                }
                HashMap hashMap = new HashMap();
                for (String key : bundle2.keySet()) {
                    kotlin.jvm.internal.g.d(key, "key");
                    hashMap.put(key, bundle2.get(key));
                }
                return new e0(hashMap);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = parcelableArrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj = parcelableArrayList.get(i10);
                    kotlin.jvm.internal.g.c(obj, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
                }
                return new e0(linkedHashMap);
            }
            throw new IllegalStateException("Invalid bundle passed as restored state".toString());
        }
    }

    public e0(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f4039a = linkedHashMap;
        this.f4040b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.f4041d = new LinkedHashMap();
        this.f4042e = new androidx.activity.d(this, 2);
        linkedHashMap.putAll(hashMap);
    }

    public static Bundle a(e0 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        for (Map.Entry entry : kotlin.collections.q.D0(this$0.f4040b).entrySet()) {
            this$0.c(((a.b) entry.getValue()).a(), (String) entry.getKey());
        }
        LinkedHashMap linkedHashMap = this$0.f4039a;
        Set<String> keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(linkedHashMap.get(str));
        }
        return t0.q(new Pair("keys", arrayList), new Pair("values", arrayList2));
    }

    public final <T> w<T> b(String str) {
        b bVar;
        LinkedHashMap linkedHashMap = this.c;
        Object obj = linkedHashMap.get(str);
        if (obj instanceof w) {
            bVar = (w) obj;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            LinkedHashMap linkedHashMap2 = this.f4039a;
            if (linkedHashMap2.containsKey(str)) {
                bVar = new b(this, str, linkedHashMap2.get(str));
            } else {
                bVar = new b(this, str);
            }
            linkedHashMap.put(str, bVar);
        }
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.Object r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g.e(r6, r0)
            if (r5 != 0) goto L8
            goto L1b
        L8:
            java.lang.Class<? extends java.lang.Object>[] r0 = androidx.lifecycle.e0.f4038f
            r1 = 0
            r2 = r1
        Lc:
            r3 = 29
            if (r2 >= r3) goto L20
            r3 = r0[r2]
            kotlin.jvm.internal.g.b(r3)
            boolean r3 = r3.isInstance(r5)
            if (r3 == 0) goto L1d
        L1b:
            r1 = 1
            goto L20
        L1d:
            int r2 = r2 + 1
            goto Lc
        L20:
            if (r1 == 0) goto L4a
            java.util.LinkedHashMap r0 = r4.c
            java.lang.Object r0 = r0.get(r6)
            boolean r1 = r0 instanceof androidx.lifecycle.w
            if (r1 == 0) goto L2f
            androidx.lifecycle.w r0 = (androidx.lifecycle.w) r0
            goto L30
        L2f:
            r0 = 0
        L30:
            if (r0 == 0) goto L36
            r0.j(r5)
            goto L3b
        L36:
            java.util.LinkedHashMap r0 = r4.f4039a
            r0.put(r6, r5)
        L3b:
            java.util.LinkedHashMap r0 = r4.f4041d
            java.lang.Object r6 = r0.get(r6)
            kotlinx.coroutines.flow.r r6 = (kotlinx.coroutines.flow.r) r6
            if (r6 != 0) goto L46
            goto L49
        L46:
            r6.setValue(r5)
        L49:
            return
        L4a:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can't put value with type "
            r0.<init>(r1)
            kotlin.jvm.internal.g.b(r5)
            java.lang.Class r5 = r5.getClass()
            r0.append(r5)
            java.lang.String r5 = " into saved state"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.e0.c(java.lang.Object, java.lang.String):void");
    }

    /* compiled from: SavedStateHandle.kt */
    /* loaded from: classes.dex */
    public static final class b<T> extends w<T> {

        /* renamed from: l  reason: collision with root package name */
        public final String f4043l;

        /* renamed from: m  reason: collision with root package name */
        public e0 f4044m;

        public b(e0 e0Var, String str, T t4) {
            super(t4);
            this.f4043l = str;
            this.f4044m = e0Var;
        }

        @Override // androidx.lifecycle.w, androidx.lifecycle.LiveData
        public final void j(T t4) {
            e0 e0Var = this.f4044m;
            if (e0Var != null) {
                LinkedHashMap linkedHashMap = e0Var.f4039a;
                String str = this.f4043l;
                linkedHashMap.put(str, t4);
                kotlinx.coroutines.flow.r rVar = (kotlinx.coroutines.flow.r) e0Var.f4041d.get(str);
                if (rVar != null) {
                    rVar.setValue(t4);
                }
            }
            super.j(t4);
        }

        public b(e0 e0Var, String str) {
            this.f4043l = str;
            this.f4044m = e0Var;
        }
    }

    public e0() {
        this.f4039a = new LinkedHashMap();
        this.f4040b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.f4041d = new LinkedHashMap();
        this.f4042e = new a.b() { // from class: androidx.lifecycle.d0
            @Override // androidx.savedstate.a.b
            public final Bundle a() {
                return e0.a(e0.this);
            }
        };
    }
}
