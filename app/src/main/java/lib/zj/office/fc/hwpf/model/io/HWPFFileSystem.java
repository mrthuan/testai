package lib.zj.office.fc.hwpf.model.io;

import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public final class HWPFFileSystem {
    Map<String, HWPFOutputStream> _streams;

    public HWPFFileSystem() {
        HashMap hashMap = new HashMap();
        this._streams = hashMap;
        hashMap.put("WordDocument", new HWPFOutputStream());
        this._streams.put("1Table", new HWPFOutputStream());
        this._streams.put("Data", new HWPFOutputStream());
    }

    public HWPFOutputStream getStream(String str) {
        return this._streams.get(str);
    }
}
