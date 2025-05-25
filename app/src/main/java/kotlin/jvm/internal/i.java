package kotlin.jvm.internal;

/* compiled from: Reflection.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final j f19949a;

    /* renamed from: b  reason: collision with root package name */
    public static final ig.c[] f19950b;

    static {
        j jVar = null;
        try {
            jVar = (j) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (jVar == null) {
            jVar = new j();
        }
        f19949a = jVar;
        f19950b = new ig.c[0];
    }

    public static c a(Class cls) {
        f19949a.getClass();
        return new c(cls);
    }
}
