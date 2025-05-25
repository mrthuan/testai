package com.tom_roush.pdfbox.pdmodel.encryption;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class SecurityHandlerFactory {
    public static final SecurityHandlerFactory INSTANCE = new SecurityHandlerFactory();
    private final Map<String, Class<? extends SecurityHandler>> nameToHandler = new HashMap();
    private final Map<Class<? extends ProtectionPolicy>, Class<? extends SecurityHandler>> policyToHandler = new HashMap();

    private SecurityHandlerFactory() {
        registerHandler("Standard", StandardSecurityHandler.class, StandardProtectionPolicy.class);
    }

    private SecurityHandler newSecurityHandler(Class<? extends SecurityHandler> cls, Class<?>[] clsArr, Object[] objArr) {
        try {
            return cls.getDeclaredConstructor(clsArr).newInstance(objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException(e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException(e13);
        }
    }

    public SecurityHandler newSecurityHandlerForFilter(String str) {
        Class<? extends SecurityHandler> cls = this.nameToHandler.get(str);
        if (cls == null) {
            return null;
        }
        return newSecurityHandler(cls, new Class[0], new Object[0]);
    }

    public SecurityHandler newSecurityHandlerForPolicy(ProtectionPolicy protectionPolicy) {
        Class<? extends SecurityHandler> cls = this.policyToHandler.get(protectionPolicy.getClass());
        if (cls == null) {
            return null;
        }
        return newSecurityHandler(cls, new Class[]{protectionPolicy.getClass()}, new Object[]{protectionPolicy});
    }

    public void registerHandler(String str, Class<? extends SecurityHandler> cls, Class<? extends ProtectionPolicy> cls2) {
        if (!this.nameToHandler.containsKey(str)) {
            this.nameToHandler.put(str, cls);
            this.policyToHandler.put(cls2, cls);
            return;
        }
        throw new IllegalStateException("The security handler name is already registered");
    }
}
