package kotlin.jvm.internal;

import cg.l;
import cg.m;
import cg.n;
import cg.o;
import cg.p;
import cg.q;
import cg.r;
import cg.s;
import cg.t;
import cg.u;
import cg.v;
import cg.w;
import com.adjust.sdk.Constants;
import com.google.android.play.core.assetpacks.b1;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: ClassReference.kt */
/* loaded from: classes.dex */
public final class c implements ig.c<Object>, b {

    /* renamed from: b  reason: collision with root package name */
    public static final Map<Class<? extends tf.a<?>>, Integer> f19946b;
    public static final LinkedHashMap c;

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f19947a;

    static {
        int i10 = 0;
        List I = ge.a.I(cg.a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, cg.b.class, cg.c.class, cg.d.class, cg.e.class, cg.f.class, cg.g.class, cg.h.class, cg.i.class, cg.j.class, cg.k.class, m.class, n.class, o.class);
        ArrayList arrayList = new ArrayList(kotlin.collections.g.h0(I, 10));
        for (Object obj : I) {
            int i11 = i10 + 1;
            if (i10 >= 0) {
                arrayList.add(new Pair((Class) obj, Integer.valueOf(i10)));
                i10 = i11;
            } else {
                ge.a.c0();
                throw null;
            }
        }
        f19946b = kotlin.collections.q.E0(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put(Constants.LONG, "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        g.d(values, "primitiveFqNames.values");
        for (String kotlinName : values) {
            StringBuilder sb2 = new StringBuilder("kotlin.jvm.internal.");
            g.d(kotlinName, "kotlinName");
            sb2.append(kotlin.text.k.k0(kotlinName, kotlinName));
            sb2.append("CompanionObject");
            Pair pair = new Pair(sb2.toString(), kotlinName.concat(".Companion"));
            hashMap3.put(pair.getFirst(), pair.getSecond());
        }
        for (Map.Entry<Class<? extends tf.a<?>>, Integer> entry : f19946b.entrySet()) {
            int intValue = entry.getValue().intValue();
            String name = entry.getKey().getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(t0.g0(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str = (String) entry2.getValue();
            linkedHashMap.put(key, kotlin.text.k.k0(str, str));
        }
        c = linkedHashMap;
    }

    public c(Class<?> jClass) {
        g.e(jClass, "jClass");
        this.f19947a = jClass;
    }

    @Override // kotlin.jvm.internal.b
    public final Class<?> a() {
        return this.f19947a;
    }

    public final String b() {
        String str;
        Class<?> jClass = this.f19947a;
        g.e(jClass, "jClass");
        String str2 = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (jClass.isLocalClass()) {
            String simpleName = jClass.getSimpleName();
            Method enclosingMethod = jClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                return kotlin.text.k.j0(simpleName, enclosingMethod.getName() + '$');
            }
            Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                return kotlin.text.k.j0(simpleName, enclosingConstructor.getName() + '$');
            }
            int U = kotlin.text.k.U(simpleName, '$', 0, false, 6);
            if (U != -1) {
                String substring = simpleName.substring(U + 1, simpleName.length());
                g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring;
            }
            return simpleName;
        }
        boolean isArray = jClass.isArray();
        LinkedHashMap linkedHashMap = c;
        if (isArray) {
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            if (str2 == null) {
                return "Array";
            }
            return str2;
        }
        String str3 = (String) linkedHashMap.get(jClass.getName());
        if (str3 == null) {
            return jClass.getSimpleName();
        }
        return str3;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof c) && g.a(b1.B(this), b1.B((ig.c) obj))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return b1.B(this).hashCode();
    }

    public final String toString() {
        return this.f19947a.toString() + " (Kotlin reflection is not available)";
    }
}
