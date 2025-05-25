package jh;

import java.io.File;

/* compiled from: PictureManage.java */
/* loaded from: classes.dex */
public final class d extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ File f19243a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f19244b;

    public d(e eVar, File file) {
        this.f19244b = eVar;
        this.f19243a = file;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            e eVar = this.f19244b;
            File file = this.f19243a;
            eVar.getClass();
            if (file.exists()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        file2.delete();
                    }
                }
                file.delete();
            }
        } catch (Exception unused) {
        }
    }
}
