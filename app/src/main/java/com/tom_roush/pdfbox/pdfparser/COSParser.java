package com.tom_roush.pdfbox.pdfparser;

import a0.a;
import a6.h;
import androidx.appcompat.view.menu.d;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSDocument;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNull;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.cos.COSObjectKey;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.io.IOUtils;
import com.tom_roush.pdfbox.io.RandomAccessRead;
import com.tom_roush.pdfbox.pdfparser.XrefTrailerResolver;
import com.tom_roush.pdfbox.pdmodel.encryption.AccessPermission;
import com.tom_roush.pdfbox.pdmodel.encryption.DecryptionMaterial;
import com.tom_roush.pdfbox.pdmodel.encryption.PDEncryption;
import com.tom_roush.pdfbox.pdmodel.encryption.PublicKeyDecryptionMaterial;
import com.tom_roush.pdfbox.pdmodel.encryption.SecurityHandler;
import com.tom_roush.pdfbox.pdmodel.encryption.StandardDecryptionMaterial;
import com.tom_roush.pdfbox.util.Charsets;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* loaded from: classes2.dex */
public class COSParser extends BaseParser {
    private static final int DEFAULT_TRAIL_BYTECOUNT = 2048;
    private static final String FDF_DEFAULT_VERSION = "1.0";
    private static final String FDF_HEADER = "%FDF-";
    private static final long MINIMUM_SEARCH_OFFSET = 6;
    private static final String PDF_DEFAULT_VERSION = "1.4";
    private static final String PDF_HEADER = "%PDF-";
    private static final int STREAMCOPYBUFLEN = 8192;
    private static final int STRMBUFLEN = 2048;
    public static final String SYSPROP_EOFLOOKUPRANGE = "com.tom_roush.pdfbox.pdfparser.nonSequentialPDFParser.eofLookupRange";
    public static final String SYSPROP_PARSEMINIMAL = "com.tom_roush.pdfbox.pdfparser.nonSequentialPDFParser.parseMinimal";
    public static final String TMP_FILE_PREFIX = "tmpPDF";
    private static final int X = 120;
    private AccessPermission accessPermission;
    private Map<COSObjectKey, Long> bfSearchCOSObjectKeyOffsets;
    private List<Long> bfSearchXRefStreamsOffsets;
    private List<Long> bfSearchXRefTablesOffsets;
    private PDEncryption encryption;
    protected long fileLen;
    protected boolean initialParseDone;
    private boolean isLenient;
    private String keyAlias;
    private InputStream keyStoreInputStream;
    private Long lastEOFMarker;
    private String password;
    private int readTrailBytes;
    protected SecurityHandler securityHandler;
    protected final RandomAccessRead source;
    private final byte[] streamCopyBuf;
    private final byte[] strmBuf;
    private long trailerOffset;
    private boolean trailerWasRebuild;
    protected XrefTrailerResolver xrefTrailerResolver;
    private static final char[] XREF_TABLE = {'x', 'r', 'e', 'f'};
    private static final char[] XREF_STREAM = {PackagingURIHelper.FORWARD_SLASH_CHAR, 'X', 'R', 'e', 'f'};
    private static final char[] STARTXREF = {'s', 't', 'a', 'r', 't', 'x', 'r', 'e', 'f'};
    private static final byte[] ENDSTREAM = {101, 110, 100, 115, 116, 114, 101, 97, 109};
    private static final byte[] ENDOBJ = {101, 110, 100, 111, 98, 106};
    protected static final char[] EOF_MARKER = {'%', '%', 'E', 'O', 'F'};
    protected static final char[] OBJ_MARKER = {'o', 'b', 'j'};
    private static final char[] TRAILER_MARKER = {'t', 'r', 'a', 'i', 'l', 'e', 'r'};
    private static final char[] OBJ_STREAM = {PackagingURIHelper.FORWARD_SLASH_CHAR, 'O', 'b', 'j', 'S', 't', 'm'};

    public COSParser(RandomAccessRead randomAccessRead) {
        super(new RandomAccessSource(randomAccessRead));
        this.strmBuf = new byte[2048];
        this.keyStoreInputStream = null;
        this.password = "";
        this.keyAlias = null;
        this.isLenient = true;
        this.initialParseDone = false;
        this.trailerWasRebuild = false;
        this.bfSearchCOSObjectKeyOffsets = null;
        this.lastEOFMarker = null;
        this.bfSearchXRefTablesOffsets = null;
        this.bfSearchXRefStreamsOffsets = null;
        this.encryption = null;
        this.securityHandler = null;
        this.readTrailBytes = 2048;
        this.xrefTrailerResolver = new XrefTrailerResolver();
        this.streamCopyBuf = new byte[8192];
        this.source = randomAccessRead;
    }

    private void addExcludedToList(COSName[] cOSNameArr, COSDictionary cOSDictionary, Set<Long> set) {
        if (cOSNameArr != null) {
            for (COSName cOSName : cOSNameArr) {
                COSBase item = cOSDictionary.getItem(cOSName);
                if (item instanceof COSObject) {
                    set.add(Long.valueOf(getObjectId((COSObject) item)));
                }
            }
        }
    }

    private void addNewToList(Queue<COSBase> queue, Collection<COSBase> collection, Set<Long> set) {
        for (COSBase cOSBase : collection) {
            addNewToList(queue, cOSBase, set);
        }
    }

    private void bfSearchForLastEOFMarker() {
        if (this.lastEOFMarker == null) {
            long position = this.source.getPosition();
            this.source.seek(MINIMUM_SEARCH_OFFSET);
            while (!this.source.isEOF()) {
                if (isString(EOF_MARKER)) {
                    long position2 = this.source.getPosition();
                    this.source.seek(5 + position2);
                    try {
                        skipSpaces();
                        if (!isString(XREF_TABLE)) {
                            readObjectNumber();
                            readGenerationNumber();
                        }
                    } catch (IOException unused) {
                        this.lastEOFMarker = Long.valueOf(position2);
                    }
                }
                this.source.read();
            }
            this.source.seek(position);
            if (this.lastEOFMarker == null) {
                this.lastEOFMarker = Long.MAX_VALUE;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x01d3, code lost:
        if (r5.longValue() <= r12.longValue()) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00dd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void bfSearchForObjStreams() {
        /*
            Method dump skipped, instructions count: 527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdfparser.COSParser.bfSearchForObjStreams():void");
    }

    private void bfSearchForObjects() {
        if (this.bfSearchCOSObjectKeyOffsets == null) {
            bfSearchForLastEOFMarker();
            this.bfSearchCOSObjectKeyOffsets = new HashMap();
            long position = this.source.getPosition();
            char[] charArray = "ndo".toCharArray();
            char[] charArray2 = "bj".toCharArray();
            long j10 = Long.MIN_VALUE;
            int i10 = Integer.MIN_VALUE;
            long j11 = MINIMUM_SEARCH_OFFSET;
            boolean z10 = false;
            long j12 = Long.MIN_VALUE;
            do {
                this.source.seek(j11);
                int read = this.source.read();
                j11++;
                if (isWhitespace(read) && isString(OBJ_MARKER)) {
                    long j13 = j11 - 2;
                    this.source.seek(j13);
                    int peek = this.source.peek();
                    if (BaseParser.isDigit(peek)) {
                        int i11 = peek - 48;
                        long j14 = j13 - 1;
                        this.source.seek(j14);
                        if (isWhitespace()) {
                            while (j14 > MINIMUM_SEARCH_OFFSET && isWhitespace()) {
                                j14--;
                                this.source.seek(j14);
                            }
                            boolean z11 = false;
                            while (j14 > MINIMUM_SEARCH_OFFSET && isDigit()) {
                                j14--;
                                this.source.seek(j14);
                                z11 = true;
                            }
                            if (z11) {
                                this.source.read();
                                long readObjectNumber = readObjectNumber();
                                if (j12 > 0) {
                                    this.bfSearchCOSObjectKeyOffsets.put(new COSObjectKey(j10, i10), Long.valueOf(j12));
                                }
                                j12 = j14 + 1;
                                j11 += OBJ_MARKER.length - 1;
                                i10 = i11;
                                j10 = readObjectNumber;
                                z10 = false;
                            }
                        }
                    }
                } else if (read == 101 && isString(charArray)) {
                    j11 += charArray.length;
                    this.source.seek(j11);
                    if (!this.source.isEOF()) {
                        if (isString(charArray2)) {
                            j11 += charArray2.length;
                        }
                    }
                    z10 = true;
                }
                if (j11 >= this.lastEOFMarker.longValue()) {
                    break;
                }
            } while (!this.source.isEOF());
            if ((this.lastEOFMarker.longValue() < Long.MAX_VALUE || z10) && j12 > 0) {
                this.bfSearchCOSObjectKeyOffsets.put(new COSObjectKey(j10, i10), Long.valueOf(j12));
            }
            this.source.seek(position);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0092, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean bfSearchForTrailer(com.tom_roush.pdfbox.cos.COSDictionary r12) {
        /*
            r11 = this;
            com.tom_roush.pdfbox.io.RandomAccessRead r0 = r11.source
            long r0 = r0.getPosition()
            com.tom_roush.pdfbox.io.RandomAccessRead r2 = r11.source
            r3 = 6
            r2.seek(r3)
        Ld:
            com.tom_roush.pdfbox.io.RandomAccessRead r2 = r11.source
            boolean r2 = r2.isEOF()
            r3 = 0
            if (r2 != 0) goto L9a
            char[] r2 = com.tom_roush.pdfbox.pdfparser.COSParser.TRAILER_MARKER
            boolean r4 = r11.isString(r2)
            if (r4 == 0) goto L93
            com.tom_roush.pdfbox.io.RandomAccessRead r4 = r11.source
            long r5 = r4.getPosition()
            int r2 = r2.length
            long r7 = (long) r2
            long r5 = r5 + r7
            r4.seek(r5)
            r11.skipSpaces()     // Catch: java.io.IOException -> Ld
            com.tom_roush.pdfbox.cos.COSDictionary r2 = r11.parseCOSDictionary()     // Catch: java.io.IOException -> Ld
            com.tom_roush.pdfbox.cos.COSName r4 = com.tom_roush.pdfbox.cos.COSName.ROOT     // Catch: java.io.IOException -> Ld
            com.tom_roush.pdfbox.cos.COSObject r5 = r2.getCOSObject(r4)     // Catch: java.io.IOException -> Ld
            r6 = 1
            if (r5 == 0) goto L48
            com.tom_roush.pdfbox.cos.COSDictionary r7 = r11.retrieveCOSDictionary(r5)     // Catch: java.io.IOException -> Ld
            if (r7 == 0) goto L48
            boolean r7 = r11.isCatalog(r7)     // Catch: java.io.IOException -> Ld
            if (r7 == 0) goto L48
            r7 = r6
            goto L49
        L48:
            r7 = r3
        L49:
            com.tom_roush.pdfbox.cos.COSName r8 = com.tom_roush.pdfbox.cos.COSName.INFO     // Catch: java.io.IOException -> Ld
            com.tom_roush.pdfbox.cos.COSObject r9 = r2.getCOSObject(r8)     // Catch: java.io.IOException -> Ld
            if (r9 == 0) goto L5e
            com.tom_roush.pdfbox.cos.COSDictionary r10 = r11.retrieveCOSDictionary(r9)     // Catch: java.io.IOException -> Ld
            if (r10 == 0) goto L5e
            boolean r10 = r11.isInfo(r10)     // Catch: java.io.IOException -> Ld
            if (r10 == 0) goto L5e
            r3 = r6
        L5e:
            if (r7 == 0) goto L93
            if (r3 == 0) goto L93
            r12.setItem(r4, r5)     // Catch: java.io.IOException -> Ld
            r12.setItem(r8, r9)     // Catch: java.io.IOException -> Ld
            com.tom_roush.pdfbox.cos.COSName r3 = com.tom_roush.pdfbox.cos.COSName.ENCRYPT     // Catch: java.io.IOException -> Ld
            boolean r4 = r2.containsKey(r3)     // Catch: java.io.IOException -> Ld
            if (r4 == 0) goto L7f
            com.tom_roush.pdfbox.cos.COSObject r4 = r2.getCOSObject(r3)     // Catch: java.io.IOException -> Ld
            if (r4 == 0) goto L7f
            com.tom_roush.pdfbox.cos.COSDictionary r5 = r11.retrieveCOSDictionary(r4)     // Catch: java.io.IOException -> Ld
            if (r5 == 0) goto L7f
            r12.setItem(r3, r4)     // Catch: java.io.IOException -> Ld
        L7f:
            com.tom_roush.pdfbox.cos.COSName r3 = com.tom_roush.pdfbox.cos.COSName.ID     // Catch: java.io.IOException -> Ld
            boolean r4 = r2.containsKey(r3)     // Catch: java.io.IOException -> Ld
            if (r4 == 0) goto L92
            com.tom_roush.pdfbox.cos.COSBase r2 = r2.getItem(r3)     // Catch: java.io.IOException -> Ld
            boolean r4 = r2 instanceof com.tom_roush.pdfbox.cos.COSArray     // Catch: java.io.IOException -> Ld
            if (r4 == 0) goto L92
            r12.setItem(r3, r2)     // Catch: java.io.IOException -> Ld
        L92:
            return r6
        L93:
            com.tom_roush.pdfbox.io.RandomAccessRead r2 = r11.source
            r2.read()
            goto Ld
        L9a:
            com.tom_roush.pdfbox.io.RandomAccessRead r12 = r11.source
            r12.seek(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdfparser.COSParser.bfSearchForTrailer(com.tom_roush.pdfbox.cos.COSDictionary):boolean");
    }

    private long bfSearchForXRef(long j10, boolean z10) {
        long j11;
        long j12;
        List<Long> list;
        if (!z10) {
            bfSearchForXRefTables();
        }
        bfSearchForXRefStreams();
        if (!z10 && (list = this.bfSearchXRefTablesOffsets) != null) {
            j11 = searchNearestValue(list, j10);
        } else {
            j11 = -1;
        }
        List<Long> list2 = this.bfSearchXRefStreamsOffsets;
        if (list2 != null) {
            j12 = searchNearestValue(list2, j10);
        } else {
            j12 = -1;
        }
        int i10 = (j11 > (-1L) ? 1 : (j11 == (-1L) ? 0 : -1));
        if (i10 > 0 && j12 > -1) {
            if (Math.abs(j10 - j11) > Math.abs(j10 - j12)) {
                this.bfSearchXRefStreamsOffsets.remove(Long.valueOf(j12));
                return j12;
            }
            this.bfSearchXRefTablesOffsets.remove(Long.valueOf(j11));
            return j11;
        } else if (i10 > 0) {
            this.bfSearchXRefTablesOffsets.remove(Long.valueOf(j11));
            return j11;
        } else if (j12 <= -1) {
            return -1L;
        } else {
            this.bfSearchXRefStreamsOffsets.remove(Long.valueOf(j12));
            return j12;
        }
    }

    private void bfSearchForXRefStreams() {
        if (this.bfSearchXRefStreamsOffsets == null) {
            this.bfSearchXRefStreamsOffsets = new ArrayList();
            long position = this.source.getPosition();
            this.source.seek(MINIMUM_SEARCH_OFFSET);
            char[] charArray = " obj".toCharArray();
            while (!this.source.isEOF()) {
                if (isString(XREF_STREAM)) {
                    long position2 = this.source.getPosition();
                    boolean z10 = false;
                    long j10 = -1;
                    for (int i10 = 1; i10 < 40 && !z10; i10++) {
                        long j11 = position2 - (i10 * 10);
                        if (j11 > 0) {
                            this.source.seek(j11);
                            int i11 = 0;
                            while (true) {
                                if (i11 >= 10) {
                                    break;
                                } else if (isString(charArray)) {
                                    long j12 = j11 - 1;
                                    this.source.seek(j12);
                                    if (BaseParser.isDigit(this.source.peek())) {
                                        long j13 = j12 - 1;
                                        this.source.seek(j13);
                                        if (isSpace()) {
                                            long j14 = j13 - 1;
                                            this.source.seek(j14);
                                            int i12 = 0;
                                            while (j14 > MINIMUM_SEARCH_OFFSET && isDigit()) {
                                                j14--;
                                                this.source.seek(j14);
                                                i12++;
                                            }
                                            if (i12 > 0) {
                                                this.source.read();
                                                j10 = this.source.getPosition();
                                            }
                                        }
                                    }
                                    z10 = true;
                                } else {
                                    j11++;
                                    this.source.read();
                                    i11++;
                                }
                            }
                        }
                    }
                    if (j10 > -1) {
                        this.bfSearchXRefStreamsOffsets.add(Long.valueOf(j10));
                    }
                    this.source.seek(position2 + 5);
                }
                this.source.read();
            }
            this.source.seek(position);
        }
    }

    private void bfSearchForXRefTables() {
        if (this.bfSearchXRefTablesOffsets == null) {
            this.bfSearchXRefTablesOffsets = new ArrayList();
            long position = this.source.getPosition();
            this.source.seek(MINIMUM_SEARCH_OFFSET);
            while (!this.source.isEOF()) {
                if (isString(XREF_TABLE)) {
                    long position2 = this.source.getPosition();
                    this.source.seek(position2 - 1);
                    if (isWhitespace()) {
                        this.bfSearchXRefTablesOffsets.add(Long.valueOf(position2));
                    }
                    this.source.seek(position2 + 4);
                }
                this.source.read();
            }
            this.source.seek(position);
        }
    }

    private long calculateXRefFixedOffset(long j10, boolean z10) {
        if (j10 < 0) {
            return 0L;
        }
        long bfSearchForXRef = bfSearchForXRef(j10, z10);
        if (bfSearchForXRef <= -1) {
            return 0L;
        }
        return bfSearchForXRef;
    }

    private int checkPagesDictionary(COSDictionary cOSDictionary, Set<COSObject> set) {
        COSBase dictionaryObject = cOSDictionary.getDictionaryObject(COSName.KIDS);
        int i10 = 0;
        if (dictionaryObject instanceof COSArray) {
            COSArray cOSArray = (COSArray) dictionaryObject;
            for (COSBase cOSBase : cOSArray.toList()) {
                if (cOSBase instanceof COSObject) {
                    COSObject cOSObject = (COSObject) cOSBase;
                    if (!set.contains(cOSObject)) {
                        COSBase object = cOSObject.getObject();
                        if (object != null && !object.equals(COSNull.NULL)) {
                            if (object instanceof COSDictionary) {
                                COSDictionary cOSDictionary2 = (COSDictionary) object;
                                COSName cOSName = cOSDictionary2.getCOSName(COSName.TYPE);
                                if (COSName.PAGES.equals(cOSName)) {
                                    set.add(cOSObject);
                                    i10 += checkPagesDictionary(cOSDictionary2, set);
                                } else if (COSName.PAGE.equals(cOSName)) {
                                    i10++;
                                }
                            }
                        } else {
                            Objects.toString(cOSBase);
                            cOSArray.remove(cOSBase);
                        }
                    }
                }
                cOSArray.remove(cOSBase);
            }
        }
        cOSDictionary.setInt(COSName.COUNT, i10);
        return i10;
    }

    private long checkXRefOffset(long j10) {
        if (!this.isLenient) {
            return j10;
        }
        this.source.seek(j10);
        skipSpaces();
        if (this.source.peek() == 120 && isString(XREF_TABLE)) {
            return j10;
        }
        if (j10 > 0) {
            if (checkXRefStreamOffset(j10)) {
                return j10;
            }
            return calculateXRefFixedOffset(j10, false);
        }
        return -1L;
    }

    private boolean checkXRefStreamOffset(long j10) {
        if (!this.isLenient || j10 == 0) {
            return true;
        }
        this.source.seek(j10 - 1);
        if (isWhitespace(this.source.read())) {
            skipSpaces();
            if (isDigit()) {
                try {
                    readObjectNumber();
                    readGenerationNumber();
                    readExpectedString(OBJ_MARKER, true);
                    COSDictionary parseCOSDictionary = parseCOSDictionary();
                    this.source.seek(j10);
                    if ("XRef".equals(parseCOSDictionary.getNameAsString(COSName.TYPE))) {
                        return true;
                    }
                    return false;
                } catch (IOException unused) {
                    this.source.seek(j10);
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    private void checkXrefOffsets() {
        if (!this.isLenient) {
            return;
        }
        Map<COSObjectKey, Long> xrefTable = this.xrefTrailerResolver.getXrefTable();
        if (!validateXrefOffsets(xrefTable)) {
            bfSearchForObjects();
            Map<COSObjectKey, Long> map = this.bfSearchCOSObjectKeyOffsets;
            if (map != null && !map.isEmpty()) {
                xrefTable.clear();
                xrefTable.putAll(this.bfSearchCOSObjectKeyOffsets);
            }
        }
    }

    private COSObject compareCOSObjects(COSObject cOSObject, Long l10, COSObject cOSObject2, Long l11) {
        if (cOSObject2 != null) {
            if (cOSObject2.getObjectNumber() == cOSObject.getObjectNumber()) {
                if (cOSObject2.getGenerationNumber() >= cOSObject.getGenerationNumber()) {
                    return cOSObject2;
                }
                return cOSObject;
            } else if (l11 == null || l10.longValue() <= l11.longValue()) {
                return cOSObject2;
            } else {
                return cOSObject;
            }
        }
        return cOSObject;
    }

    private COSObjectKey findObjectKey(COSObjectKey cOSObjectKey, long j10) {
        if (j10 < MINIMUM_SEARCH_OFFSET) {
            return null;
        }
        try {
            this.source.seek(j10);
            if (cOSObjectKey.getNumber() == readObjectNumber()) {
                int readGenerationNumber = readGenerationNumber();
                readExpectedString(OBJ_MARKER, true);
                if (readGenerationNumber == cOSObjectKey.getGeneration()) {
                    return cOSObjectKey;
                }
                if (this.isLenient && readGenerationNumber > cOSObjectKey.getGeneration()) {
                    return new COSObjectKey(cOSObjectKey.getNumber(), readGenerationNumber);
                }
            }
        } catch (IOException unused) {
        }
        return null;
    }

    private COSNumber getLength(COSBase cOSBase, COSName cOSName) {
        if (cOSBase == null) {
            return null;
        }
        if (cOSBase instanceof COSNumber) {
            return (COSNumber) cOSBase;
        }
        if (cOSBase instanceof COSObject) {
            COSObject cOSObject = (COSObject) cOSBase;
            COSBase object = cOSObject.getObject();
            if (object == null) {
                long position = this.source.getPosition();
                parseObjectDynamically(cOSObject, COSName.OBJ_STM.equals(cOSName));
                this.source.seek(position);
                object = cOSObject.getObject();
            }
            if (object != null) {
                if (COSNull.NULL == object) {
                    cOSObject.getObjectNumber();
                    cOSObject.getGenerationNumber();
                    return null;
                } else if (object instanceof COSNumber) {
                    return (COSNumber) object;
                } else {
                    throw new IOException("Wrong type of referenced length object " + cOSObject + ": " + object.getClass().getSimpleName());
                }
            }
            throw new IOException("Length object content was not read.");
        }
        throw new IOException("Wrong type of length object: ".concat(cOSBase.getClass().getSimpleName()));
    }

    private long getObjectId(COSObject cOSObject) {
        return (cOSObject.getObjectNumber() << 32) | cOSObject.getGenerationNumber();
    }

    private boolean isInfo(COSDictionary cOSDictionary) {
        if (cOSDictionary.containsKey(COSName.PARENT) || cOSDictionary.containsKey(COSName.A) || cOSDictionary.containsKey(COSName.DEST)) {
            return false;
        }
        if (!cOSDictionary.containsKey(COSName.MOD_DATE) && !cOSDictionary.containsKey(COSName.TITLE) && !cOSDictionary.containsKey(COSName.AUTHOR) && !cOSDictionary.containsKey(COSName.SUBJECT) && !cOSDictionary.containsKey(COSName.KEYWORDS) && !cOSDictionary.containsKey(COSName.CREATOR) && !cOSDictionary.containsKey(COSName.PRODUCER) && !cOSDictionary.containsKey(COSName.CREATION_DATE)) {
            return false;
        }
        return true;
    }

    private boolean isString(byte[] bArr) {
        if (this.source.peek() == bArr[0]) {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            int read = this.source.read(bArr2, 0, length);
            while (read < length) {
                int read2 = this.source.read(bArr2, read, length - read);
                if (read2 < 0) {
                    break;
                }
                read += read2;
            }
            boolean equals = Arrays.equals(bArr, bArr2);
            this.source.rewind(read);
            return equals;
        }
        return false;
    }

    private void parseDictionaryRecursive(COSObject cOSObject) {
        parseObjectDynamically(cOSObject, true);
        if (cOSObject.getObject() instanceof COSDictionary) {
            for (COSBase cOSBase : ((COSDictionary) cOSObject.getObject()).getValues()) {
                if (cOSBase instanceof COSObject) {
                    COSObject cOSObject2 = (COSObject) cOSBase;
                    if (cOSObject2.getObject() == null) {
                        parseDictionaryRecursive(cOSObject2);
                    }
                }
            }
            return;
        }
        throw new IOException("Dictionary object expected at offset " + this.source.getPosition());
    }

    private void parseFileObject(Long l10, COSObjectKey cOSObjectKey, COSObject cOSObject) {
        COSBase cOSBase;
        this.source.seek(l10.longValue());
        long readObjectNumber = readObjectNumber();
        int readGenerationNumber = readGenerationNumber();
        readExpectedString(OBJ_MARKER, true);
        if (readObjectNumber == cOSObjectKey.getNumber() && readGenerationNumber == cOSObjectKey.getGeneration()) {
            skipSpaces();
            COSBase parseDirObject = parseDirObject();
            String readString = readString();
            if (readString.equals("stream")) {
                this.source.rewind(readString.getBytes(Charsets.ISO_8859_1).length);
                if (parseDirObject instanceof COSDictionary) {
                    COSStream parseCOSStream = parseCOSStream((COSDictionary) parseDirObject);
                    SecurityHandler securityHandler = this.securityHandler;
                    if (securityHandler != null) {
                        securityHandler.decryptStream(parseCOSStream, cOSObjectKey.getNumber(), cOSObjectKey.getGeneration());
                    }
                    skipSpaces();
                    readString = readLine();
                    cOSBase = parseCOSStream;
                    if (!readString.startsWith("endobj")) {
                        cOSBase = parseCOSStream;
                        if (readString.startsWith("endstream")) {
                            readString = readString.substring(9).trim();
                            cOSBase = parseCOSStream;
                            if (readString.length() == 0) {
                                readString = readLine();
                                cOSBase = parseCOSStream;
                            }
                        }
                    }
                } else {
                    throw new IOException("Stream not preceded by dictionary (offset: " + l10 + ").");
                }
            } else {
                SecurityHandler securityHandler2 = this.securityHandler;
                cOSBase = parseDirObject;
                if (securityHandler2 != null) {
                    securityHandler2.decrypt(parseDirObject, cOSObjectKey.getNumber(), cOSObjectKey.getGeneration());
                    cOSBase = parseDirObject;
                }
            }
            cOSObject.setObject(cOSBase);
            if (!readString.startsWith("endobj") && !this.isLenient) {
                throw new IOException("Object (" + readObjectNumber + ":" + readGenerationNumber + ") at offset " + l10 + " does not end with 'endobj' but with '" + readString + OperatorName.SHOW_TEXT_LINE);
            }
            return;
        }
        throw new IOException("XREF for " + cOSObjectKey.getNumber() + ":" + cOSObjectKey.getGeneration() + " points to wrong object: " + readObjectNumber + ":" + readGenerationNumber + " at offset " + l10);
    }

    private boolean parseHeader(String str, String str2) {
        String readLine = readLine();
        if (!readLine.contains(str)) {
            readLine = readLine();
            while (!readLine.contains(str) && (readLine.length() <= 0 || !Character.isDigit(readLine.charAt(0)))) {
                readLine = readLine();
            }
        }
        if (!readLine.contains(str)) {
            this.source.seek(0L);
            return false;
        }
        int indexOf = readLine.indexOf(str);
        if (indexOf > 0) {
            readLine = readLine.substring(indexOf);
        }
        if (readLine.startsWith(str)) {
            if (!readLine.matches(str + "\\d.\\d")) {
                if (readLine.length() < str.length() + 3) {
                    readLine = h.c(str, str2);
                } else {
                    String str3 = readLine.substring(str.length() + 3, readLine.length()) + "\n";
                    readLine = readLine.substring(0, str.length() + 3);
                    this.source.rewind(str3.getBytes(Charsets.ISO_8859_1).length);
                }
            }
        }
        float f10 = -1.0f;
        try {
            String[] split = readLine.split("-");
            if (split.length == 2) {
                f10 = Float.parseFloat(split[1]);
            }
        } catch (NumberFormatException unused) {
        }
        if (f10 < 0.0f) {
            if (this.isLenient) {
                f10 = 1.7f;
            } else {
                throw new IOException(a.h("Error getting header version: ", readLine));
            }
        }
        this.document.setVersion(f10);
        this.source.seek(0L);
        return true;
    }

    private void parseObjectStream(int i10) {
        COSBase parseObjectDynamically = parseObjectDynamically(i10, 0, true);
        if (parseObjectDynamically instanceof COSStream) {
            try {
                PDFObjectStreamParser pDFObjectStreamParser = new PDFObjectStreamParser((COSStream) parseObjectDynamically, this.document);
                try {
                    pDFObjectStreamParser.parse();
                    for (COSObject cOSObject : pDFObjectStreamParser.getObjects()) {
                        COSObjectKey cOSObjectKey = new COSObjectKey(cOSObject);
                        Long l10 = this.xrefTrailerResolver.getXrefTable().get(cOSObjectKey);
                        if (l10 != null && l10.longValue() == (-i10)) {
                            this.document.getObjectFromPool(cOSObjectKey).setObject(cOSObject.getObject());
                        }
                    }
                } catch (IOException e10) {
                    if (this.isLenient) {
                        return;
                    }
                    throw e10;
                }
            } catch (IOException e11) {
                if (this.isLenient) {
                    return;
                }
                throw e11;
            }
        }
    }

    private long parseStartXref() {
        if (isString(STARTXREF)) {
            readString();
            skipSpaces();
            return readLong();
        }
        return -1L;
    }

    private boolean parseTrailer() {
        this.trailerOffset = this.source.getPosition();
        if (this.isLenient) {
            int peek = this.source.peek();
            while (peek != 116 && BaseParser.isDigit(peek)) {
                this.source.getPosition();
                readLine();
                peek = this.source.peek();
            }
        }
        if (this.source.peek() != 116) {
            return false;
        }
        long position = this.source.getPosition();
        String readLine = readLine();
        if (!readLine.trim().equals("trailer")) {
            if (!readLine.startsWith("trailer")) {
                return false;
            }
            this.source.seek(position + 7);
        }
        skipSpaces();
        this.xrefTrailerResolver.setTrailer(parseCOSDictionary());
        skipSpaces();
        return true;
    }

    private long parseXrefObjStream(long j10, boolean z10) {
        long readObjectNumber = readObjectNumber();
        this.document.setHighestXRefObjectNumber(Math.max(this.document.getHighestXRefObjectNumber(), readObjectNumber));
        readGenerationNumber();
        readExpectedString(OBJ_MARKER, true);
        COSDictionary parseCOSDictionary = parseCOSDictionary();
        COSStream parseCOSStream = parseCOSStream(parseCOSDictionary);
        parseXrefStream(parseCOSStream, j10, z10);
        parseCOSStream.close();
        return parseCOSDictionary.getLong(COSName.PREV);
    }

    private void parseXrefStream(COSStream cOSStream, long j10, boolean z10) {
        if (z10) {
            this.xrefTrailerResolver.nextXrefObj(j10, XrefTrailerResolver.XRefType.STREAM);
            this.xrefTrailerResolver.setTrailer(cOSStream);
        }
        new PDFXrefStreamParser(cOSStream, this.document, this.xrefTrailerResolver).parse();
    }

    private void prepareDecryption() {
        COSBase item;
        DecryptionMaterial standardDecryptionMaterial;
        if (this.encryption == null && (item = this.document.getTrailer().getItem(COSName.ENCRYPT)) != null && !(item instanceof COSNull)) {
            if (item instanceof COSObject) {
                parseDictionaryRecursive((COSObject) item);
            }
            try {
                try {
                    this.encryption = new PDEncryption(this.document.getEncryptionDictionary());
                    if (this.keyStoreInputStream != null) {
                        KeyStore keyStore = KeyStore.getInstance("PKCS12");
                        keyStore.load(this.keyStoreInputStream, this.password.toCharArray());
                        standardDecryptionMaterial = new PublicKeyDecryptionMaterial(keyStore, this.keyAlias, this.password);
                    } else {
                        standardDecryptionMaterial = new StandardDecryptionMaterial(this.password);
                    }
                    SecurityHandler securityHandler = this.encryption.getSecurityHandler();
                    this.securityHandler = securityHandler;
                    securityHandler.prepareForDecryption(this.encryption, this.document.getDocumentID(), standardDecryptionMaterial);
                    this.accessPermission = this.securityHandler.getCurrentAccessPermission();
                } catch (IOException e10) {
                    throw e10;
                } catch (Exception e11) {
                    throw new IOException("Error (" + e11.getClass().getSimpleName() + ") while creating security handler for decryption", e11);
                }
            } finally {
                InputStream inputStream = this.keyStoreInputStream;
                if (inputStream != null) {
                    IOUtils.closeQuietly(inputStream);
                }
            }
        }
    }

    private void readUntilEndStream(OutputStream outputStream) {
        int i10;
        byte b10;
        byte[] bArr = ENDSTREAM;
        int i11 = 0;
        while (true) {
            int read = this.source.read(this.strmBuf, i11, 2048 - i11);
            if (read <= 0) {
                break;
            }
            int i12 = read + i11;
            int i13 = i12 - 5;
            int i14 = i11;
            while (true) {
                if (i11 >= i12) {
                    break;
                }
                int i15 = i11 + 5;
                if (i14 == 0 && i15 < i13 && ((b10 = this.strmBuf[i15]) > 116 || b10 < 97)) {
                    i11 = i15;
                } else {
                    byte b11 = this.strmBuf[i11];
                    if (b11 == bArr[i14]) {
                        i14++;
                        if (i14 == bArr.length) {
                            i11++;
                            break;
                        }
                    } else {
                        if (i14 == 3) {
                            bArr = ENDOBJ;
                            if (b11 == bArr[i14]) {
                                i14++;
                            }
                        }
                        if (b11 == 101) {
                            i10 = 1;
                        } else if (b11 == 110 && i14 == 7) {
                            i10 = 2;
                        } else {
                            i10 = 0;
                        }
                        i14 = i10;
                        bArr = ENDSTREAM;
                    }
                }
                i11++;
            }
            int max = Math.max(0, i11 - i14);
            if (max > 0) {
                outputStream.write(this.strmBuf, 0, max);
            }
            if (i14 == bArr.length) {
                this.source.rewind(i12 - max);
                break;
            } else {
                System.arraycopy(bArr, 0, this.strmBuf, 0, i14);
                i11 = i14;
            }
        }
        outputStream.flush();
    }

    private void readValidStream(OutputStream outputStream, COSNumber cOSNumber) {
        int i10;
        long longValue = cOSNumber.longValue();
        while (longValue > 0) {
            if (longValue > 8192) {
                i10 = 8192;
            } else {
                i10 = (int) longValue;
            }
            int read = this.source.read(this.streamCopyBuf, 0, i10);
            if (read > 0) {
                outputStream.write(this.streamCopyBuf, 0, read);
                longValue -= read;
            } else {
                throw new IOException("read error at offset " + this.source.getPosition() + ": expected " + i10 + " bytes, but read() returns " + read);
            }
        }
    }

    private COSDictionary retrieveCOSDictionary(COSObject cOSObject) {
        COSObjectKey cOSObjectKey = new COSObjectKey(cOSObject);
        Long l10 = this.bfSearchCOSObjectKeyOffsets.get(cOSObjectKey);
        if (l10 != null) {
            long position = this.source.getPosition();
            COSDictionary retrieveCOSDictionary = retrieveCOSDictionary(cOSObjectKey, l10.longValue());
            this.source.seek(position);
            return retrieveCOSDictionary;
        }
        return null;
    }

    private boolean searchForTrailerItems(COSDictionary cOSDictionary) {
        COSObject objectFromPool;
        COSObject cOSObject = null;
        COSObject cOSObject2 = null;
        Long l10 = null;
        Long l11 = null;
        for (Map.Entry<COSObjectKey, Long> entry : this.bfSearchCOSObjectKeyOffsets.entrySet()) {
            COSDictionary retrieveCOSDictionary = retrieveCOSDictionary(entry.getKey(), entry.getValue().longValue());
            if (retrieveCOSDictionary != null) {
                if (isCatalog(retrieveCOSDictionary)) {
                    COSObject objectFromPool2 = this.document.getObjectFromPool(entry.getKey());
                    cOSObject = compareCOSObjects(objectFromPool2, entry.getValue(), cOSObject, l10);
                    if (cOSObject == objectFromPool2) {
                        l10 = entry.getValue();
                    }
                } else if (isInfo(retrieveCOSDictionary) && (cOSObject2 = compareCOSObjects((objectFromPool = this.document.getObjectFromPool(entry.getKey())), entry.getValue(), cOSObject2, l11)) == objectFromPool) {
                    l11 = entry.getValue();
                }
            }
        }
        if (cOSObject != null) {
            cOSDictionary.setItem(COSName.ROOT, (COSBase) cOSObject);
        }
        if (cOSObject2 != null) {
            cOSDictionary.setItem(COSName.INFO, (COSBase) cOSObject2);
        }
        if (cOSObject != null) {
            return true;
        }
        return false;
    }

    private long searchNearestValue(List<Long> list, long j10) {
        int size = list.size();
        Long l10 = null;
        int i10 = -1;
        for (int i11 = 0; i11 < size; i11++) {
            long longValue = j10 - list.get(i11).longValue();
            if (l10 == null || Math.abs(l10.longValue()) > Math.abs(longValue)) {
                l10 = Long.valueOf(longValue);
                i10 = i11;
            }
        }
        if (i10 > -1) {
            return list.get(i10).longValue();
        }
        return -1L;
    }

    private boolean validateStreamLength(long j10) {
        long position = this.source.getPosition();
        long j11 = j10 + position;
        if (j11 > this.fileLen) {
            return false;
        }
        this.source.seek(j11);
        skipSpaces();
        boolean isString = isString(ENDSTREAM);
        this.source.seek(position);
        return isString;
    }

    private boolean validateXrefOffsets(Map<COSObjectKey, Long> map) {
        if (map == null) {
            return true;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<COSObjectKey, Long> entry : map.entrySet()) {
            COSObjectKey key = entry.getKey();
            Long value = entry.getValue();
            if (value != null && value.longValue() >= 0) {
                COSObjectKey findObjectKey = findObjectKey(key, value.longValue());
                if (findObjectKey == null) {
                    Objects.toString(key);
                    return false;
                } else if (findObjectKey != key) {
                    hashMap.put(key, findObjectKey);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            map.put((COSObjectKey) entry2.getValue(), map.remove(entry2.getKey()));
        }
        return true;
    }

    public void checkPages(COSDictionary cOSDictionary) {
        if (this.trailerWasRebuild && cOSDictionary != null) {
            COSBase dictionaryObject = cOSDictionary.getDictionaryObject(COSName.PAGES);
            if (dictionaryObject instanceof COSDictionary) {
                checkPagesDictionary((COSDictionary) dictionaryObject, new HashSet());
            }
        }
    }

    public AccessPermission getAccessPermission() {
        if (this.document != null) {
            return this.accessPermission;
        }
        throw new IOException("You must parse the document first before calling getAccessPermission()");
    }

    public COSDocument getDocument() {
        COSDocument cOSDocument = this.document;
        if (cOSDocument != null) {
            return cOSDocument;
        }
        throw new IOException("You must parse the document first before calling getDocument()");
    }

    public PDEncryption getEncryption() {
        if (this.document != null) {
            return this.encryption;
        }
        throw new IOException("You must parse the document first before calling getEncryption()");
    }

    public final long getStartxrefOffset() {
        try {
            long j10 = this.fileLen;
            int i10 = this.readTrailBytes;
            if (j10 < i10) {
                i10 = (int) j10;
            }
            byte[] bArr = new byte[i10];
            long j11 = j10 - i10;
            this.source.seek(j11);
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i10 - i11;
                int read = this.source.read(bArr, i11, i12);
                if (read >= 1) {
                    i11 += read;
                } else {
                    throw new IOException("No more bytes to read for trailing buffer, but expected: " + i12);
                }
            }
            this.source.seek(0L);
            char[] cArr = EOF_MARKER;
            int lastIndexOf = lastIndexOf(cArr, bArr, i10);
            if (lastIndexOf < 0) {
                if (this.isLenient) {
                    new String(cArr);
                } else {
                    throw new IOException("Missing end of file marker '" + new String(cArr) + OperatorName.SHOW_TEXT_LINE);
                }
            } else {
                i10 = lastIndexOf;
            }
            int lastIndexOf2 = lastIndexOf(STARTXREF, bArr, i10);
            if (lastIndexOf2 >= 0) {
                return j11 + lastIndexOf2;
            }
            throw new IOException("Missing 'startxref' marker.");
        } catch (Throwable th2) {
            this.source.seek(0L);
            throw th2;
        }
    }

    public boolean isCatalog(COSDictionary cOSDictionary) {
        return COSName.CATALOG.equals(cOSDictionary.getCOSName(COSName.TYPE));
    }

    public boolean isLenient() {
        return this.isLenient;
    }

    public int lastIndexOf(char[] cArr, byte[] bArr, int i10) {
        int length = cArr.length - 1;
        char c = cArr[length];
        while (true) {
            int i11 = length;
            while (true) {
                i10--;
                if (i10 < 0) {
                    return -1;
                }
                if (bArr[i10] == c) {
                    i11--;
                    if (i11 < 0) {
                        return i10;
                    }
                    c = cArr[i11];
                } else if (i11 < length) {
                    break;
                }
            }
            c = cArr[length];
        }
    }

    public COSStream parseCOSStream(COSDictionary cOSDictionary) {
        COSStream createCOSStream = this.document.createCOSStream(cOSDictionary);
        readString();
        skipWhiteSpaces();
        COSName cOSName = COSName.LENGTH;
        COSNumber length = getLength(cOSDictionary.getItem(cOSName), cOSDictionary.getCOSName(COSName.TYPE));
        if (length == null) {
            if (this.isLenient) {
                this.source.getPosition();
            } else {
                throw new IOException("Missing length for stream.");
            }
        }
        if (length != null && validateStreamLength(length.longValue())) {
            OutputStream createRawOutputStream = createCOSStream.createRawOutputStream();
            try {
                readValidStream(createRawOutputStream, length);
                createRawOutputStream.close();
                createCOSStream.setItem(cOSName, (COSBase) length);
            } catch (Throwable th2) {
                createRawOutputStream.close();
                createCOSStream.setItem(COSName.LENGTH, (COSBase) length);
                throw th2;
            }
        } else {
            OutputStream createRawOutputStream2 = createCOSStream.createRawOutputStream();
            try {
                readUntilEndStream(new EndstreamOutputStream(createRawOutputStream2));
                createRawOutputStream2.close();
                if (length != null) {
                    createCOSStream.setItem(cOSName, (COSBase) length);
                }
            } catch (Throwable th3) {
                createRawOutputStream2.close();
                if (length != null) {
                    createCOSStream.setItem(COSName.LENGTH, (COSBase) length);
                }
                throw th3;
            }
        }
        String readString = readString();
        if (readString.equals("endobj") && this.isLenient) {
            this.source.getPosition();
            this.source.rewind(ENDOBJ.length);
        } else if (readString.length() > 9 && this.isLenient && readString.startsWith("endstream")) {
            this.source.getPosition();
            this.source.rewind(readString.substring(9).getBytes(Charsets.ISO_8859_1).length);
        } else if (!readString.equals("endstream")) {
            StringBuilder g10 = b.a.g("Error reading stream, expected='endstream' actual='", readString, "' at offset ");
            g10.append(this.source.getPosition());
            throw new IOException(g10.toString());
        }
        return createCOSStream;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0169, code lost:
        throw new java.io.IOException(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017b, code lost:
        if (r1.isEmpty() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x017e, code lost:
        r12 = ((java.util.List) r1.remove(r1.firstKey())).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0190, code lost:
        if (r12.hasNext() == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0192, code lost:
        r4 = (com.tom_roush.pdfbox.cos.COSObject) r12.next();
        r5 = parseObjectDynamically(r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x019c, code lost:
        if (r5 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019e, code lost:
        r4.setObject(r5);
        addNewToList(r0, r5, r3);
        r2.add(java.lang.Long.valueOf(getObjectId(r4)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void parseDictObjects(com.tom_roush.pdfbox.cos.COSDictionary r12, com.tom_roush.pdfbox.cos.COSName... r13) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdfparser.COSParser.parseDictObjects(com.tom_roush.pdfbox.cos.COSDictionary, com.tom_roush.pdfbox.cos.COSName[]):void");
    }

    public boolean parseFDFHeader() {
        return parseHeader(FDF_HEADER, "1.0");
    }

    public final COSBase parseObjectDynamically(COSObject cOSObject, boolean z10) {
        return parseObjectDynamically(cOSObject.getObjectNumber(), cOSObject.getGenerationNumber(), z10);
    }

    public boolean parsePDFHeader() {
        return parseHeader(PDF_HEADER, PDF_DEFAULT_VERSION);
    }

    public COSBase parseTrailerValuesDynamically(COSDictionary cOSDictionary) {
        for (COSBase cOSBase : cOSDictionary.getValues()) {
            if (cOSBase instanceof COSObject) {
                parseObjectDynamically((COSObject) cOSBase, false);
            }
        }
        COSObject cOSObject = cOSDictionary.getCOSObject(COSName.ROOT);
        if (cOSObject != null) {
            return cOSObject.getObject();
        }
        throw new IOException("Missing root object specification in trailer.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c5, code lost:
        throw new java.io.IOException("Expected trailer object at offset " + r17.source.getPosition());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.tom_roush.pdfbox.cos.COSDictionary parseXref(long r18) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdfparser.COSParser.parseXref(long):com.tom_roush.pdfbox.cos.COSDictionary");
    }

    public boolean parseXrefTable(long j10) {
        if (this.source.peek() != 120 || !readString().trim().equals("xref")) {
            return false;
        }
        String readString = readString();
        this.source.rewind(readString.getBytes(Charsets.ISO_8859_1).length);
        this.xrefTrailerResolver.nextXrefObj(j10, XrefTrailerResolver.XRefType.TABLE);
        if (readString.startsWith("trailer")) {
            return false;
        }
        do {
            String[] split = readLine().split("\\s");
            if (split.length != 2) {
                return false;
            }
            try {
                long parseLong = Long.parseLong(split[0]);
                int parseInt = Integer.parseInt(split[1]);
                skipSpaces();
                for (int i10 = 0; i10 < parseInt && !this.source.isEOF() && !isEndOfName((char) this.source.peek()) && this.source.peek() != 116; i10++) {
                    String[] split2 = readLine().split("\\s");
                    if (split2.length < 3) {
                        break;
                    }
                    if (split2[split2.length - 1].equals("n")) {
                        try {
                            long parseLong2 = Long.parseLong(split2[0]);
                            if (parseLong2 > 0) {
                                this.xrefTrailerResolver.setXRef(new COSObjectKey(parseLong, Integer.parseInt(split2[1])), parseLong2);
                            }
                        } catch (NumberFormatException e10) {
                            throw new IOException(e10);
                        }
                    } else if (!split2[2].equals("f")) {
                        throw new IOException(d.c("Corrupt XRefTable Entry - ObjID:", parseLong));
                    }
                    parseLong++;
                    skipSpaces();
                }
                skipSpaces();
            } catch (NumberFormatException unused) {
                return false;
            }
        } while (isDigit());
        return true;
    }

    public final COSDictionary rebuildTrailer() {
        COSDictionary cOSDictionary;
        boolean z10;
        bfSearchForObjects();
        if (this.bfSearchCOSObjectKeyOffsets != null) {
            this.xrefTrailerResolver.reset();
            this.xrefTrailerResolver.nextXrefObj(0L, XrefTrailerResolver.XRefType.TABLE);
            for (Map.Entry<COSObjectKey, Long> entry : this.bfSearchCOSObjectKeyOffsets.entrySet()) {
                this.xrefTrailerResolver.setXRef(entry.getKey(), entry.getValue().longValue());
            }
            this.xrefTrailerResolver.setStartxref(0L);
            cOSDictionary = this.xrefTrailerResolver.getTrailer();
            getDocument().setTrailer(cOSDictionary);
            if (!bfSearchForTrailer(cOSDictionary) && !searchForTrailerItems(cOSDictionary)) {
                bfSearchForObjStreams();
                searchForTrailerItems(cOSDictionary);
                z10 = true;
            } else {
                z10 = false;
            }
            prepareDecryption();
            if (!z10) {
                bfSearchForObjStreams();
            }
        } else {
            cOSDictionary = null;
        }
        this.trailerWasRebuild = true;
        return cOSDictionary;
    }

    public COSDictionary retrieveTrailer() {
        boolean z10;
        COSDictionary cOSDictionary = null;
        try {
            long startxrefOffset = getStartxrefOffset();
            if (startxrefOffset > -1) {
                cOSDictionary = parseXref(startxrefOffset);
                z10 = false;
            } else {
                z10 = isLenient();
            }
        } catch (IOException e10) {
            if (isLenient()) {
                z10 = true;
            } else {
                throw e10;
            }
        }
        if (cOSDictionary != null && cOSDictionary.getItem(COSName.ROOT) == null) {
            z10 = isLenient();
        }
        if (z10) {
            return rebuildTrailer();
        }
        prepareDecryption();
        Map<COSObjectKey, Long> map = this.bfSearchCOSObjectKeyOffsets;
        if (map != null && !map.isEmpty()) {
            bfSearchForObjStreams();
            return cOSDictionary;
        }
        return cOSDictionary;
    }

    public void setEOFLookupRange(int i10) {
        if (i10 > 15) {
            this.readTrailBytes = i10;
        }
    }

    public void setLenient(boolean z10) {
        if (!this.initialParseDone) {
            this.isLenient = z10;
            return;
        }
        throw new IllegalArgumentException("Cannot change leniency after parsing");
    }

    private void addNewToList(Queue<COSBase> queue, COSBase cOSBase, Set<Long> set) {
        if (cOSBase instanceof COSObject) {
            if (set.add(Long.valueOf(getObjectId((COSObject) cOSBase)))) {
                queue.add(cOSBase);
            }
        } else if ((cOSBase instanceof COSDictionary) || (cOSBase instanceof COSArray)) {
            queue.add(cOSBase);
        }
    }

    public COSBase parseObjectDynamically(long j10, int i10, boolean z10) {
        Map<COSObjectKey, Long> map;
        COSObjectKey cOSObjectKey = new COSObjectKey(j10, i10);
        COSObject objectFromPool = this.document.getObjectFromPool(cOSObjectKey);
        if (objectFromPool.getObject() == null) {
            Long l10 = this.document.getXrefTable().get(cOSObjectKey);
            if (l10 == null && this.isLenient && (map = this.bfSearchCOSObjectKeyOffsets) != null && (l10 = map.get(cOSObjectKey)) != null) {
                cOSObjectKey.toString();
                this.document.getXrefTable().put(cOSObjectKey, l10);
            }
            if (z10 && (l10 == null || l10.longValue() <= 0)) {
                throw new IOException("Object must be defined and must not be compressed object: " + cOSObjectKey.getNumber() + ":" + cOSObjectKey.getGeneration());
            }
            if (l10 == null && this.isLenient && this.bfSearchCOSObjectKeyOffsets == null) {
                bfSearchForObjects();
                Map<COSObjectKey, Long> map2 = this.bfSearchCOSObjectKeyOffsets;
                if (map2 != null && !map2.isEmpty()) {
                    Map<COSObjectKey, Long> xrefTable = this.document.getXrefTable();
                    for (Map.Entry<COSObjectKey, Long> entry : this.bfSearchCOSObjectKeyOffsets.entrySet()) {
                        COSObjectKey key = entry.getKey();
                        if (!xrefTable.containsKey(key)) {
                            xrefTable.put(key, entry.getValue());
                        }
                    }
                    l10 = xrefTable.get(cOSObjectKey);
                }
            }
            if (l10 == null) {
                objectFromPool.setObject(COSNull.NULL);
            } else if (l10.longValue() > 0) {
                parseFileObject(l10, cOSObjectKey, objectFromPool);
            } else {
                parseObjectStream((int) (-l10.longValue()));
            }
        }
        return objectFromPool.getObject();
    }

    private COSDictionary retrieveCOSDictionary(COSObjectKey cOSObjectKey, long j10) {
        if (j10 < 0) {
            COSObject objectFromPool = this.document.getObjectFromPool(cOSObjectKey);
            if (objectFromPool.getObject() == null) {
                parseObjectStream((int) (-j10));
            }
            COSBase object = objectFromPool.getObject();
            if (object instanceof COSDictionary) {
                return (COSDictionary) object;
            }
            return null;
        }
        this.source.seek(j10);
        readObjectNumber();
        readGenerationNumber();
        readExpectedString(OBJ_MARKER, true);
        if (this.source.peek() != 60) {
            return null;
        }
        try {
            return parseCOSDictionary();
        } catch (IOException unused) {
            Objects.toString(cOSObjectKey);
            return null;
        }
    }

    private boolean isString(char[] cArr) {
        long position = this.source.getPosition();
        int length = cArr.length;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                z10 = true;
                break;
            }
            if (this.source.read() != cArr[i10]) {
                break;
            }
            i10++;
        }
        this.source.seek(position);
        return z10;
    }

    public COSParser(RandomAccessRead randomAccessRead, String str, InputStream inputStream, String str2) {
        super(new RandomAccessSource(randomAccessRead));
        this.strmBuf = new byte[2048];
        this.keyStoreInputStream = null;
        this.password = "";
        this.keyAlias = null;
        this.isLenient = true;
        this.initialParseDone = false;
        this.trailerWasRebuild = false;
        this.bfSearchCOSObjectKeyOffsets = null;
        this.lastEOFMarker = null;
        this.bfSearchXRefTablesOffsets = null;
        this.bfSearchXRefStreamsOffsets = null;
        this.encryption = null;
        this.securityHandler = null;
        this.readTrailBytes = 2048;
        this.xrefTrailerResolver = new XrefTrailerResolver();
        this.streamCopyBuf = new byte[8192];
        this.source = randomAccessRead;
        this.password = str;
        this.keyAlias = str2;
        this.keyStoreInputStream = inputStream;
    }
}
