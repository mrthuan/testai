package com.bykv.vk.openvk.preload.geckox.f;

import com.bykv.vk.openvk.preload.geckox.g.c;
import com.bykv.vk.openvk.preload.geckox.utils.j;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ChannelVerLoader.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f7583a;

    /* renamed from: b  reason: collision with root package name */
    public String f7584b;
    public volatile File c;

    /* renamed from: d  reason: collision with root package name */
    volatile Long f7585d;

    /* renamed from: e  reason: collision with root package name */
    public AtomicBoolean f7586e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private volatile com.bykv.vk.openvk.preload.geckox.f.a.a f7587f;

    public a(String str, String str2) {
        this.f7583a = str;
        this.f7584b = str2;
    }

    private synchronized File c(String str) {
        if (this.c != null) {
            return this.c;
        } else if (this.f7585d != null && this.f7585d.longValue() == -1) {
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f7583a);
            String str2 = File.separator;
            sb2.append(str2);
            sb2.append(str);
            sb2.append(str2);
            sb2.append("select.lock");
            com.bykv.vk.openvk.preload.geckox.g.b a10 = com.bykv.vk.openvk.preload.geckox.g.b.a(sb2.toString());
            if (this.f7585d == null) {
                this.f7585d = j.a(new File(this.f7583a, str));
            }
            if (this.f7585d == null) {
                this.f7585d = -1L;
                a10.a();
                return null;
            }
            String str3 = this.f7583a;
            File file = new File(str3, str2 + str + str2 + this.f7585d + str2 + "using.lock");
            this.c = file.getParentFile();
            c.a(file.getAbsolutePath());
            File file2 = this.c;
            a10.a();
            return file2;
        }
    }

    public final synchronized com.bykv.vk.openvk.preload.geckox.f.a.a a(String str) {
        if (this.f7587f != null) {
            return this.f7587f;
        }
        File c = c(str);
        if (c != null) {
            File file = new File(c, "res.macv");
            File file2 = new File(c, "res");
            if (file2.exists() && file2.isDirectory()) {
                this.f7587f = new com.bykv.vk.openvk.preload.geckox.f.a.c(c);
            } else if (file.exists() && file.isFile()) {
                this.f7587f = new com.bykv.vk.openvk.preload.geckox.f.a.b(c);
            } else {
                throw new RuntimeException("can not find res, dir:" + c.getAbsolutePath());
            }
            return this.f7587f;
        }
        throw new FileNotFoundException("channel no exist，channel:".concat(String.valueOf(str)));
    }

    public final int b(String str) {
        try {
            File file = new File(c(str), "res");
            if (file.exists() && file.isDirectory()) {
                int length = file.listFiles().length;
                if (length > 0) {
                    return length - 1;
                }
                return 0;
            }
            return 0;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static String a(String str, String str2) {
        return str2.substring(str.length() + 1);
    }
}
