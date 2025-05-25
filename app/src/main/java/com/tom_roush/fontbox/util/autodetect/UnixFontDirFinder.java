package com.tom_roush.fontbox.util.autodetect;

/* loaded from: classes2.dex */
public class UnixFontDirFinder extends NativeFontDirFinder {
    @Override // com.tom_roush.fontbox.util.autodetect.NativeFontDirFinder
    public String[] getSearchableDirectories() {
        return new String[]{System.getProperty("user.home") + "/.fonts", "/usr/local/fonts", "/usr/local/share/fonts", "/usr/share/fonts", "/usr/X11R6/lib/X11/fonts"};
    }
}
