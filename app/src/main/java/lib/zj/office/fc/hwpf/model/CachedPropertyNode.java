package lib.zj.office.fc.hwpf.model;

import java.lang.ref.SoftReference;
import lib.zj.office.fc.hwpf.sprm.SprmBuffer;
import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public final class CachedPropertyNode extends PropertyNode<CachedPropertyNode> {
    protected SoftReference<Object> _propCache;

    public CachedPropertyNode(int i10, int i11, SprmBuffer sprmBuffer) {
        super(i10, i11, sprmBuffer);
    }

    public void fillCache(Object obj) {
        this._propCache = new SoftReference<>(obj);
    }

    public Object getCacheContents() {
        SoftReference<Object> softReference = this._propCache;
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    public SprmBuffer getSprmBuf() {
        return (SprmBuffer) this._buf;
    }
}
