package com.tom_roush.fontbox.util.autodetect;

/* loaded from: classes2.dex */
public class OS400FontDirFinder extends NativeFontDirFinder {
    @Override // com.tom_roush.fontbox.util.autodetect.NativeFontDirFinder
    public String[] getSearchableDirectories() {
        return new String[]{System.getProperty("user.home") + "/.fonts", "/QIBM/ProdData/OS400/Fonts"};
    }
}
