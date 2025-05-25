package com.bykv.vk.openvk.preload.a.b.b;

import com.bykv.vk.openvk.preload.a.l;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* compiled from: UnsafeReflectionAccessor.java */
/* loaded from: classes.dex */
final class c extends b {

    /* renamed from: a  reason: collision with root package name */
    private static Class f7289a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f7290b = b();
    private final Field c = c();

    private boolean b(AccessibleObject accessibleObject) {
        if (this.f7290b != null && this.c != null) {
            try {
                f7289a.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f7290b, accessibleObject, Long.valueOf(((Long) f7289a.getMethod("objectFieldOffset", Field.class).invoke(this.f7290b, this.c)).longValue()), Boolean.TRUE);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private static Field c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.b.b.b
    public final void a(AccessibleObject accessibleObject) {
        if (!b(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e10) {
                throw new l("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e10);
            }
        }
    }

    private static Object b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f7289a = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
