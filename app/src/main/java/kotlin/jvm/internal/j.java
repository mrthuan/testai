package kotlin.jvm.internal;

/* compiled from: ReflectionFactory.java */
/* loaded from: classes.dex */
public final class j {
    public static String a(f fVar) {
        String obj = fVar.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }
}
