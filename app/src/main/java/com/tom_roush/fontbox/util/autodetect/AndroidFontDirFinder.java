package com.tom_roush.fontbox.util.autodetect;

/* loaded from: classes2.dex */
public class AndroidFontDirFinder extends NativeFontDirFinder {
    @Override // com.tom_roush.fontbox.util.autodetect.NativeFontDirFinder
    public String[] getSearchableDirectories() {
        return new String[]{"/system/fonts"};
    }
}
