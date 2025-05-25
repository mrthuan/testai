package lib.zj.office.system;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: AbstractReader.java */
/* loaded from: classes3.dex */
public class b implements j {
    protected boolean abortReader;
    protected f control;
    protected final AtomicBoolean isDisposed = new AtomicBoolean(false);

    @Override // lib.zj.office.system.j
    public void abortReader() {
        this.abortReader = true;
    }

    @Override // lib.zj.office.system.j
    public void dispose() {
        this.isDisposed.set(true);
    }

    public f getControl() {
        return this.control;
    }

    @Override // lib.zj.office.system.j
    public Object getModel() {
        return null;
    }

    @Override // lib.zj.office.system.j
    public boolean isAborted() {
        return this.abortReader;
    }

    @Override // lib.zj.office.system.j
    public boolean isReaderFinish() {
        return true;
    }

    public boolean searchContent(File file, String str) {
        return false;
    }

    @Override // lib.zj.office.system.j
    public void backReader() {
    }
}
