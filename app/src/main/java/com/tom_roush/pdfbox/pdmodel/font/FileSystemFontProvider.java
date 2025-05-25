package com.tom_roush.pdfbox.pdmodel.font;

import com.tom_roush.fontbox.FontBoxFont;
import com.tom_roush.fontbox.cff.CFFCIDFont;
import com.tom_roush.fontbox.cff.CFFFont;
import com.tom_roush.fontbox.ttf.NamingTable;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import com.tom_roush.fontbox.ttf.OTFParser;
import com.tom_roush.fontbox.ttf.OpenTypeFont;
import com.tom_roush.fontbox.ttf.TTFParser;
import com.tom_roush.fontbox.ttf.TrueTypeCollection;
import com.tom_roush.fontbox.ttf.TrueTypeFont;
import com.tom_roush.fontbox.type1.Type1Font;
import com.tom_roush.fontbox.util.autodetect.FontFileFinder;
import com.tom_roush.pdfbox.android.PDFBoxConfig;
import com.tom_roush.pdfbox.io.IOUtils;
import com.tom_roush.pdfbox.util.Charsets;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FileSystemFontProvider extends FontProvider {
    private final FontCache cache;
    private final List<FSFontInfo> fontInfoList = new ArrayList();

    /* renamed from: com.tom_roush.pdfbox.pdmodel.font.FileSystemFontProvider$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$tom_roush$pdfbox$pdmodel$font$FontFormat;

        static {
            int[] iArr = new int[FontFormat.values().length];
            $SwitchMap$com$tom_roush$pdfbox$pdmodel$font$FontFormat = iArr;
            try {
                iArr[FontFormat.PFB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tom_roush$pdfbox$pdmodel$font$FontFormat[FontFormat.TTF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tom_roush$pdfbox$pdmodel$font$FontFormat[FontFormat.OTF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class FSFontInfo extends FontInfo {
        private final CIDSystemInfo cidSystemInfo;
        private final File file;
        private final FontFormat format;
        private final int macStyle;
        private final PDPanoseClassification panose;
        private final FileSystemFontProvider parent;
        private final String postScriptName;
        private final int sFamilyClass;
        private final int ulCodePageRange1;
        private final int ulCodePageRange2;
        private final int usWeightClass;

        public /* synthetic */ FSFontInfo(File file, FontFormat fontFormat, String str, CIDSystemInfo cIDSystemInfo, int i10, int i11, int i12, int i13, int i14, byte[] bArr, FileSystemFontProvider fileSystemFontProvider, int i15) {
            this(file, fontFormat, str, cIDSystemInfo, i10, i11, i12, i13, i14, bArr, fileSystemFontProvider);
        }

        private OpenTypeFont getOTFFont(String str, File file) {
            try {
                if (file.getName().toLowerCase().endsWith(".ttc")) {
                    TrueTypeCollection trueTypeCollection = new TrueTypeCollection(file);
                    try {
                        TrueTypeFont fontByName = trueTypeCollection.getFontByName(str);
                        if (fontByName != null) {
                            return (OpenTypeFont) fontByName;
                        }
                        trueTypeCollection.close();
                        throw new IOException("Font " + str + " not found in " + file);
                    } catch (IOException e10) {
                        e10.getMessage();
                        trueTypeCollection.close();
                        return null;
                    }
                }
                OpenTypeFont parse = new OTFParser(false, true).parse(file);
                if (PDFBoxConfig.isDebugEnabled()) {
                    file.toString();
                }
                return parse;
            } catch (IOException unused) {
                Objects.toString(file);
                return null;
            }
        }

        private TrueTypeFont getTrueTypeFont(String str, File file) {
            try {
                TrueTypeFont readTrueTypeFont = readTrueTypeFont(str, file);
                if (PDFBoxConfig.isDebugEnabled()) {
                    Objects.toString(file);
                }
                return readTrueTypeFont;
            } catch (IOException unused) {
                Objects.toString(file);
                return null;
            }
        }

        private Type1Font getType1Font(String str, File file) {
            Throwable th2;
            FileInputStream fileInputStream;
            try {
                try {
                    fileInputStream = new FileInputStream(file);
                } catch (IOException unused) {
                    fileInputStream = null;
                } catch (Throwable th3) {
                    th2 = th3;
                    IOUtils.closeQuietly(null);
                    throw th2;
                }
                try {
                    Type1Font createWithPFB = Type1Font.createWithPFB(fileInputStream);
                    if (PDFBoxConfig.isDebugEnabled()) {
                        Objects.toString(file);
                    }
                    IOUtils.closeQuietly(fileInputStream);
                    return createWithPFB;
                } catch (IOException unused2) {
                    Objects.toString(file);
                    IOUtils.closeQuietly(fileInputStream);
                    return null;
                }
            } catch (Throwable th4) {
                th2 = th4;
                IOUtils.closeQuietly(null);
                throw th2;
            }
        }

        private TrueTypeFont readTrueTypeFont(String str, File file) {
            if (file.getName().toLowerCase().endsWith(".ttc")) {
                TrueTypeCollection trueTypeCollection = new TrueTypeCollection(file);
                try {
                    TrueTypeFont fontByName = trueTypeCollection.getFontByName(str);
                    if (fontByName != null) {
                        return fontByName;
                    }
                    trueTypeCollection.close();
                    throw new IOException("Font " + str + " not found in " + file);
                } catch (IOException e10) {
                    trueTypeCollection.close();
                    throw e10;
                }
            }
            return new TTFParser(false, true).parse(file);
        }

        @Override // com.tom_roush.pdfbox.pdmodel.font.FontInfo
        public CIDSystemInfo getCIDSystemInfo() {
            return this.cidSystemInfo;
        }

        @Override // com.tom_roush.pdfbox.pdmodel.font.FontInfo
        public int getCodePageRange1() {
            return this.ulCodePageRange1;
        }

        @Override // com.tom_roush.pdfbox.pdmodel.font.FontInfo
        public int getCodePageRange2() {
            return this.ulCodePageRange2;
        }

        @Override // com.tom_roush.pdfbox.pdmodel.font.FontInfo
        public int getFamilyClass() {
            return this.sFamilyClass;
        }

        @Override // com.tom_roush.pdfbox.pdmodel.font.FontInfo
        public synchronized FontBoxFont getFont() {
            FontBoxFont type1Font;
            FontBoxFont font = this.parent.cache.getFont(this);
            if (font != null) {
                return font;
            }
            int i10 = AnonymousClass2.$SwitchMap$com$tom_roush$pdfbox$pdmodel$font$FontFormat[this.format.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        type1Font = getOTFFont(this.postScriptName, this.file);
                    } else {
                        throw new RuntimeException("can't happen");
                    }
                } else {
                    type1Font = getTrueTypeFont(this.postScriptName, this.file);
                }
            } else {
                type1Font = getType1Font(this.postScriptName, this.file);
            }
            if (type1Font != null) {
                this.parent.cache.addFont(this, type1Font);
            }
            return type1Font;
        }

        @Override // com.tom_roush.pdfbox.pdmodel.font.FontInfo
        public FontFormat getFormat() {
            return this.format;
        }

        @Override // com.tom_roush.pdfbox.pdmodel.font.FontInfo
        public int getMacStyle() {
            return this.macStyle;
        }

        @Override // com.tom_roush.pdfbox.pdmodel.font.FontInfo
        public PDPanoseClassification getPanose() {
            return this.panose;
        }

        @Override // com.tom_roush.pdfbox.pdmodel.font.FontInfo
        public String getPostScriptName() {
            return this.postScriptName;
        }

        @Override // com.tom_roush.pdfbox.pdmodel.font.FontInfo
        public int getWeightClass() {
            return this.usWeightClass;
        }

        @Override // com.tom_roush.pdfbox.pdmodel.font.FontInfo
        public String toString() {
            return super.toString() + " " + this.file;
        }

        private FSFontInfo(File file, FontFormat fontFormat, String str, CIDSystemInfo cIDSystemInfo, int i10, int i11, int i12, int i13, int i14, byte[] bArr, FileSystemFontProvider fileSystemFontProvider) {
            this.file = file;
            this.format = fontFormat;
            this.postScriptName = str;
            this.cidSystemInfo = cIDSystemInfo;
            this.usWeightClass = i10;
            this.sFamilyClass = i11;
            this.ulCodePageRange1 = i12;
            this.ulCodePageRange2 = i13;
            this.macStyle = i14;
            this.panose = bArr != null ? new PDPanoseClassification(bArr) : null;
            this.parent = fileSystemFontProvider;
        }
    }

    /* loaded from: classes2.dex */
    public static final class FSIgnored extends FSFontInfo {
        public /* synthetic */ FSIgnored(File file, FontFormat fontFormat, String str, int i10) {
            this(file, fontFormat, str);
        }

        private FSIgnored(File file, FontFormat fontFormat, String str) {
            super(file, fontFormat, str, null, 0, 0, 0, 0, 0, null, null, 0);
        }
    }

    public FileSystemFontProvider(FontCache fontCache) {
        this.cache = fontCache;
        if (PDFBoxConfig.getFontLoadLevel() == PDFBoxConfig.FontLoadLevel.NONE) {
            return;
        }
        if (PDFBoxConfig.getFontLoadLevel() == PDFBoxConfig.FontLoadLevel.MINIMUM) {
            try {
                addTrueTypeFont(new File("/system/fonts/DroidSans.ttf"));
                addTrueTypeFont(new File("/system/fonts/DroidSans-Bold.ttf"));
                addTrueTypeFont(new File("/system/fonts/DroidSansMono.ttf"));
                return;
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
        try {
            PDFBoxConfig.isDebugEnabled();
            List<URI> find = new FontFileFinder().find();
            ArrayList arrayList = new ArrayList(find.size());
            for (URI uri : find) {
                arrayList.add(new File(uri));
            }
            if (PDFBoxConfig.isDebugEnabled()) {
                arrayList.size();
            }
            List<FSFontInfo> loadDiskCache = loadDiskCache(arrayList);
            if (loadDiskCache != null && !loadDiskCache.isEmpty()) {
                this.fontInfoList.addAll(loadDiskCache);
                return;
            }
            scanFonts(arrayList);
            saveDiskCache();
            this.fontInfoList.size();
        } catch (AccessControlException unused) {
        }
    }

    private void addTrueTypeCollection(final File file) {
        TrueTypeCollection trueTypeCollection = null;
        try {
            try {
                TrueTypeCollection trueTypeCollection2 = new TrueTypeCollection(file);
                try {
                    trueTypeCollection2.processAllFonts(new TrueTypeCollection.TrueTypeFontProcessor() { // from class: com.tom_roush.pdfbox.pdmodel.font.FileSystemFontProvider.1
                        @Override // com.tom_roush.fontbox.ttf.TrueTypeCollection.TrueTypeFontProcessor
                        public void process(TrueTypeFont trueTypeFont) {
                            FileSystemFontProvider.this.addTrueTypeFontImpl(trueTypeFont, file);
                        }
                    });
                    trueTypeCollection2.close();
                } catch (IOException unused) {
                    trueTypeCollection = trueTypeCollection2;
                    Objects.toString(file);
                    if (trueTypeCollection != null) {
                        trueTypeCollection.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    trueTypeCollection = trueTypeCollection2;
                    if (trueTypeCollection != null) {
                        trueTypeCollection.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException unused2) {
        }
    }

    private void addTrueTypeFont(File file) {
        try {
            if (file.getPath().toLowerCase().endsWith(".otf")) {
                addTrueTypeFontImpl(new OTFParser(false, true).parse(file), file);
            } else {
                addTrueTypeFontImpl(new TTFParser(false, true).parse(file), file);
            }
        } catch (IOException unused) {
            Objects.toString(file);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrueTypeFontImpl(TrueTypeFont trueTypeFont, File file) {
        File file2;
        int i10;
        int i11;
        byte[] bArr;
        int i12;
        int i13;
        CIDSystemInfo cIDSystemInfo;
        NamingTable naming;
        FileSystemFontProvider fileSystemFontProvider = this;
        try {
            try {
                if (trueTypeFont.getName() != null && trueTypeFont.getName().contains("|")) {
                    fileSystemFontProvider.fontInfoList.add(new FSIgnored(file, FontFormat.TTF, "*skippipeinname*", 0));
                    trueTypeFont.getName();
                    Objects.toString(file);
                } else {
                    try {
                        if (trueTypeFont.getName() != null) {
                            if (trueTypeFont.getHeader() == null) {
                                fileSystemFontProvider.fontInfoList.add(new FSIgnored(file, FontFormat.TTF, trueTypeFont.getName(), 0));
                                trueTypeFont.close();
                                return;
                            }
                            int macStyle = trueTypeFont.getHeader().getMacStyle();
                            OS2WindowsMetricsTable oS2Windows = trueTypeFont.getOS2Windows();
                            CIDSystemInfo cIDSystemInfo2 = null;
                            if (oS2Windows != null) {
                                int familyClass = oS2Windows.getFamilyClass();
                                int weightClass = oS2Windows.getWeightClass();
                                int codePageRange1 = (int) oS2Windows.getCodePageRange1();
                                int codePageRange2 = (int) oS2Windows.getCodePageRange2();
                                bArr = oS2Windows.getPanose();
                                i12 = codePageRange1;
                                i13 = codePageRange2;
                                i11 = familyClass;
                                i10 = weightClass;
                            } else {
                                i10 = -1;
                                i11 = -1;
                                bArr = null;
                                i12 = 0;
                                i13 = 0;
                            }
                            if (trueTypeFont instanceof OpenTypeFont) {
                                try {
                                    if (((OpenTypeFont) trueTypeFont).isPostScript()) {
                                        CFFFont font = ((OpenTypeFont) trueTypeFont).getCFF().getFont();
                                        if (font instanceof CFFCIDFont) {
                                            CFFCIDFont cFFCIDFont = (CFFCIDFont) font;
                                            cIDSystemInfo = new CIDSystemInfo(cFFCIDFont.getRegistry(), cFFCIDFont.getOrdering(), cFFCIDFont.getSupplement());
                                        } else {
                                            cIDSystemInfo = null;
                                        }
                                        fileSystemFontProvider.fontInfoList.add(new FSFontInfo(file, FontFormat.OTF, trueTypeFont.getName(), cIDSystemInfo, i10, i11, i12, i13, macStyle, bArr, this, 0));
                                        if (PDFBoxConfig.isDebugEnabled() && (naming = trueTypeFont.getNaming()) != null) {
                                            naming.getPostScriptName();
                                            naming.getFontFamily();
                                            naming.getFontSubFamily();
                                        }
                                    }
                                } catch (IOException unused) {
                                    fileSystemFontProvider = this;
                                    file2 = file;
                                    fileSystemFontProvider.fontInfoList.add(new FSIgnored(file2, FontFormat.TTF, "*skipexception*", 0));
                                    Objects.toString(file);
                                    trueTypeFont.close();
                                } catch (Throwable th2) {
                                    th = th2;
                                    trueTypeFont.close();
                                    throw th;
                                }
                            }
                            if (trueTypeFont.getTableMap().containsKey("gcid")) {
                                byte[] tableBytes = trueTypeFont.getTableBytes(trueTypeFont.getTableMap().get("gcid"));
                                Charset charset = Charsets.US_ASCII;
                                String str = new String(tableBytes, 10, 64, charset);
                                String substring = str.substring(0, str.indexOf(0));
                                String str2 = new String(tableBytes, 76, 64, charset);
                                cIDSystemInfo2 = new CIDSystemInfo(substring, str2.substring(0, str2.indexOf(0)), tableBytes[141] & 255 & (tableBytes[140] << 8));
                            }
                            this.fontInfoList.add(new FSFontInfo(file, FontFormat.TTF, trueTypeFont.getName(), cIDSystemInfo2, i10, i11, i12, i13, macStyle, bArr, this, 0));
                            if (PDFBoxConfig.isDebugEnabled()) {
                                naming.getPostScriptName();
                                naming.getFontFamily();
                                naming.getFontSubFamily();
                            }
                        } else {
                            file2 = file;
                            try {
                                fileSystemFontProvider.fontInfoList.add(new FSIgnored(file2, FontFormat.TTF, "*skipnoname*", 0));
                                Objects.toString(file);
                            } catch (IOException unused2) {
                                fileSystemFontProvider.fontInfoList.add(new FSIgnored(file2, FontFormat.TTF, "*skipexception*", 0));
                                Objects.toString(file);
                                trueTypeFont.close();
                            }
                        }
                    } catch (IOException unused3) {
                    }
                }
            } catch (IOException unused4) {
                file2 = file;
            }
            trueTypeFont.close();
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void addType1Font(File file) {
        Type1Font createWithPFB;
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            try {
                createWithPFB = Type1Font.createWithPFB(fileInputStream);
            } catch (IOException unused) {
                Objects.toString(file);
            }
            if (createWithPFB.getName() == null) {
                this.fontInfoList.add(new FSIgnored(file, FontFormat.PFB, "*skipnoname*", 0));
                Objects.toString(file);
            } else if (createWithPFB.getName().contains("|")) {
                this.fontInfoList.add(new FSIgnored(file, FontFormat.PFB, "*skippipeinname*", 0));
                createWithPFB.getName();
                Objects.toString(file);
            } else {
                this.fontInfoList.add(new FSFontInfo(file, FontFormat.PFB, createWithPFB.getName(), null, -1, -1, 0, 0, -1, null, this, 0));
                if (PDFBoxConfig.isDebugEnabled()) {
                    createWithPFB.getName();
                    createWithPFB.getFamilyName();
                    createWithPFB.getWeight();
                }
            }
        } finally {
            fileInputStream.close();
        }
    }

    private File getDiskCacheFile() {
        String property = System.getProperty("pdfbox.fontcache");
        if ((property == null || !new File(property).isDirectory() || !new File(property).canWrite()) && ((property = System.getProperty("user.home")) == null || !new File(property).isDirectory() || !new File(property).canWrite())) {
            property = System.getProperty("java.io.tmpdir");
        }
        return new File(property, ".pdfbox.cache");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0143 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0144 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List<com.tom_roush.pdfbox.pdmodel.font.FileSystemFontProvider.FSFontInfo> loadDiskCache(java.util.List<java.io.File> r22) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdmodel.font.FileSystemFontProvider.loadDiskCache(java.util.List):java.util.List");
    }

    private void saveDiskCache() {
        BufferedWriter bufferedWriter;
        BufferedWriter bufferedWriter2 = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(getDiskCacheFile()));
        } catch (IOException unused) {
        } catch (SecurityException unused2) {
            IOUtils.closeQuietly(null);
            return;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            for (FSFontInfo fSFontInfo : this.fontInfoList) {
                bufferedWriter.write(fSFontInfo.postScriptName.trim());
                bufferedWriter.write("|");
                bufferedWriter.write(fSFontInfo.format.toString());
                bufferedWriter.write("|");
                if (fSFontInfo.cidSystemInfo != null) {
                    bufferedWriter.write(fSFontInfo.cidSystemInfo.getRegistry() + '-' + fSFontInfo.cidSystemInfo.getOrdering() + '-' + fSFontInfo.cidSystemInfo.getSupplement());
                }
                bufferedWriter.write("|");
                if (fSFontInfo.usWeightClass > -1) {
                    bufferedWriter.write(Integer.toHexString(fSFontInfo.usWeightClass));
                }
                bufferedWriter.write("|");
                if (fSFontInfo.sFamilyClass > -1) {
                    bufferedWriter.write(Integer.toHexString(fSFontInfo.sFamilyClass));
                }
                bufferedWriter.write("|");
                bufferedWriter.write(Integer.toHexString(fSFontInfo.ulCodePageRange1));
                bufferedWriter.write("|");
                bufferedWriter.write(Integer.toHexString(fSFontInfo.ulCodePageRange2));
                bufferedWriter.write("|");
                if (fSFontInfo.macStyle > -1) {
                    bufferedWriter.write(Integer.toHexString(fSFontInfo.macStyle));
                }
                bufferedWriter.write("|");
                if (fSFontInfo.panose != null) {
                    byte[] bytes = fSFontInfo.panose.getBytes();
                    for (int i10 = 0; i10 < 10; i10++) {
                        String hexString = Integer.toHexString(bytes[i10]);
                        if (hexString.length() == 1) {
                            bufferedWriter.write(48);
                        }
                        bufferedWriter.write(hexString);
                    }
                }
                bufferedWriter.write("|");
                bufferedWriter.write(fSFontInfo.file.getAbsolutePath());
                bufferedWriter.newLine();
            }
            IOUtils.closeQuietly(bufferedWriter);
        } catch (IOException unused3) {
            bufferedWriter2 = bufferedWriter;
            IOUtils.closeQuietly(bufferedWriter2);
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter2 = bufferedWriter;
            IOUtils.closeQuietly(bufferedWriter2);
            throw th;
        }
    }

    private void scanFonts(List<File> list) {
        String lowerCase;
        for (File file : list) {
            try {
                lowerCase = file.getPath().toLowerCase();
            } catch (IOException unused) {
                file.getPath();
            }
            if (!lowerCase.endsWith(".ttf") && !lowerCase.endsWith(".otf")) {
                if (!lowerCase.endsWith(".ttc") && !lowerCase.endsWith(".otc")) {
                    if (lowerCase.endsWith(".pfb")) {
                        addType1Font(file);
                    }
                }
                addTrueTypeCollection(file);
            }
            addTrueTypeFont(file);
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.FontProvider
    public List<? extends FontInfo> getFontInfo() {
        return this.fontInfoList;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.FontProvider
    public String toDebugString() {
        StringBuilder sb2 = new StringBuilder();
        for (FSFontInfo fSFontInfo : this.fontInfoList) {
            sb2.append(fSFontInfo.getFormat());
            sb2.append(": ");
            sb2.append(fSFontInfo.getPostScriptName());
            sb2.append(": ");
            sb2.append(fSFontInfo.file.getPath());
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
