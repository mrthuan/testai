package com.bykv.vk.openvk.preload.geckox.f.a;

import java.io.File;
import java.io.InputStream;

/* compiled from: FileLoader.java */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private File f7588a;

    public a(File file) {
        this.f7588a = file;
    }

    public abstract InputStream a(File file, String str);

    public final InputStream a(String str) {
        return a(this.f7588a, str);
    }

    public abstract boolean b(File file, String str);

    public final boolean b(String str) {
        return b(this.f7588a, str);
    }
}
