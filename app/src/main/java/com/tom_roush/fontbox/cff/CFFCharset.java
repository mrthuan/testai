package com.tom_roush.fontbox.cff;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class CFFCharset {
    private final boolean isCIDFont;
    private final Map<Integer, Integer> sidOrCidToGid = new HashMap(250);
    private final Map<Integer, Integer> gidToSid = new HashMap(250);
    private final Map<String, Integer> nameToSid = new HashMap(250);
    private final Map<Integer, Integer> gidToCid = new HashMap();
    private final Map<Integer, String> gidToName = new HashMap(250);

    public CFFCharset(boolean z10) {
        this.isCIDFont = z10;
    }

    public void addCID(int i10, int i11) {
        if (this.isCIDFont) {
            this.sidOrCidToGid.put(Integer.valueOf(i11), Integer.valueOf(i10));
            this.gidToCid.put(Integer.valueOf(i10), Integer.valueOf(i11));
            return;
        }
        throw new IllegalStateException("Not a CIDFont");
    }

    public void addSID(int i10, int i11, String str) {
        if (!this.isCIDFont) {
            this.sidOrCidToGid.put(Integer.valueOf(i11), Integer.valueOf(i10));
            this.gidToSid.put(Integer.valueOf(i10), Integer.valueOf(i11));
            this.nameToSid.put(str, Integer.valueOf(i11));
            this.gidToName.put(Integer.valueOf(i10), str);
            return;
        }
        throw new IllegalStateException("Not a Type 1-equivalent font");
    }

    public int getCIDForGID(int i10) {
        if (this.isCIDFont) {
            Integer num = this.gidToCid.get(Integer.valueOf(i10));
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }
        throw new IllegalStateException("Not a CIDFont");
    }

    public int getGIDForCID(int i10) {
        if (this.isCIDFont) {
            Integer num = this.sidOrCidToGid.get(Integer.valueOf(i10));
            if (num == null) {
                return 0;
            }
            return num.intValue();
        }
        throw new IllegalStateException("Not a CIDFont");
    }

    public int getGIDForSID(int i10) {
        if (!this.isCIDFont) {
            Integer num = this.sidOrCidToGid.get(Integer.valueOf(i10));
            if (num == null) {
                return 0;
            }
            return num.intValue();
        }
        throw new IllegalStateException("Not a Type 1-equivalent font");
    }

    public String getNameForGID(int i10) {
        if (!this.isCIDFont) {
            return this.gidToName.get(Integer.valueOf(i10));
        }
        throw new IllegalStateException("Not a Type 1-equivalent font");
    }

    public int getSID(String str) {
        if (!this.isCIDFont) {
            Integer num = this.nameToSid.get(str);
            if (num == null) {
                return 0;
            }
            return num.intValue();
        }
        throw new IllegalStateException("Not a Type 1-equivalent font");
    }

    public int getSIDForGID(int i10) {
        if (!this.isCIDFont) {
            Integer num = this.gidToSid.get(Integer.valueOf(i10));
            if (num == null) {
                return 0;
            }
            return num.intValue();
        }
        throw new IllegalStateException("Not a Type 1-equivalent font");
    }

    public boolean isCIDFont() {
        return this.isCIDFont;
    }
}
